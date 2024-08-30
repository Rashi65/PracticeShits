import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Email> emails=new ArrayList<>();
	     emails.add(new Email("recipient1@example.com", "sender1@example.com","Subject 1", "Body 1"));
	     emails.add(new Email("recipient2@example.com", "sender1@example.com","Subject 1", "Body 1"));
	     emails.add(new Email("recipient2@example.com", "sender1@example.com","Subject 1", "Body 1"));
	     emails.add(new Email("recipient3@example.com", "sender1@example.com","Subject 1", "Body 1"));
		EmailProcessor e=new EmailProcessor();
		e.printBatches(emails);

	}
	
	public static void printBatches(List<Email> emails) {
		Map<String, List<Email>> batches = new HashMap<>();
	       for (Email email : emails) {
	           String to = email.getTo();
	           if (batches.containsKey(to)) {
	               batches.put(to, new ArrayList<>());
	           }
	           batches.get(to).add(email);
	       }
	       for (Map.Entry<String, List<Email>> entry : batches.entrySet()) {
	           System.out.println("Batch for " + entry.getKey() + ":");
	           for (Email email : entry.getValue()) {
	               System.out.println(email);
	           }
	           System.out.println();
	       }
	   }
}

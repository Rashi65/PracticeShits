
public class RemoveOccurrences {

	public static String removeOccurrences(String s,String part) {
		
		if(s.contains(part)) {
		
			s=s.replaceAll(part, "");
			
		}
		return s;
	}
	
	public static void main(String args[]) {
		String s="dababc", part="abc";
		String g=removeOccurrences(s, part);
		System.out.println(g);
	}
}

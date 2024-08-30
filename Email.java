
public class Email {	
	    public String getTo() {
		return to;
	}
	private void setTo(String to) {
		this.to = to;
	}
	private String getFrom() {
		return from;
	}
	private void setFrom(String from) {
		this.from = from;
	}
	private String getSubject() {
		return subject;
	}
	private void setSubject(String subject) {
		this.subject = subject;
	}
	private String getBody() {
		return body;
	}
	private void setBody(String body) {
		this.body = body;
	}
		private String to;
	    private String from;
	    private String subject;
	    private String body;
	public Email() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Email [to=" + to + ", from=" + from + ", subject=" + subject + ", body=" + body + "]";
	}
	public Email(String to, String from, String subject, String body) {
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.body = body;
	}
	
   
}

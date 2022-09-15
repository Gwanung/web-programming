package quiz;

public class Board {
	
	private String register;
	private String subject;
	private String content;
	private String passwd;
	
	public Board(String register, String subject, String content, String passwd) {
		super();
		this.register = register;
		this.subject = subject;
		this.content = content;
		this.passwd = passwd;
	}
	
	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "Board [register=" + register + ", subject=" + subject + ", content=" + content + ", passwd=" + passwd
				+ "]";
	}
}

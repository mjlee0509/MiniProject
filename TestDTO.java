package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
	
	private String id;
	private String password;
	private String nick;
	private String myType;
	private String testDate;
	private long myPoint;
	
	public TestDTO() {
		this.testDate = DTF.format(LocalDateTime.now());
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public long getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(long myPoint) {
		this.myPoint = myPoint;
	}
}

package miniProject;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
	private static DecimalFormat df = new DecimalFormat("0000");
	private static String guest = "guest";
	private static int num = 0;

	private String id;
	private String password;
	private String nick;
	private String myType;
	private String joinDate;
	private long myPoint;
	
	
	public TestDTO() {
		this.joinDate = DTF.format(LocalDateTime.now());
		this.id = guest + "#" + df.format(num++);
	}

	public String getId() {
		return id;
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
	
	@Override
	public String toString() {
		return id + "\t\t" + nick + "\t\t" + joinDate; 
	}
	
	public void print() {
		System.out.println(id + "\t\t" + nick + "\t\t" + joinDate);
	}

}

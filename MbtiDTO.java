package miniProject;

public class MbtiDTO extends TestDTO{
	private int question01;
	private int question02;
	private int question03;
	private int question04;
	private int question05;
	private int question06;
	private int question07;
	private int question08;
	private int question09;
	private int question10;
	private int question11;
	private int question12;

	private int eiScore;
	private int nsScore;
	private int ftScore;
	private int jpScore;

	private String eiResult;
	private String nsResult;
	private String ftResult;
	private String jpResult;

	private String yourType;

	public MbtiDTO() {

	}

	public int getQuestion01() {
		return question01;
	}

	public void setQuestion01(int question01) {
		this.question01 = question01;
		this.eiScore = question01 + question02 + question03;
	}

	public int getQuestion02() {
		return question02;
	}

	public void setQuestion02(int question02) {
		this.question02 = question02;
		this.eiScore = question01 + question02 + question03;
	}

	public int getQuestion03() {
		return question03;
	}

	public void setQuestion03(int question03) {
		this.question03 = question03;
		this.eiScore = question01 + question02 + question03;
	}

	public int getQuestion04() {
		return question04;
	}

	public void setQuestion04(int question04) {
		this.question04 = question04;
		this.nsScore = question04 + question05 + question06;
	}

	public int getQuestion05() {
		return question05;
	}

	public void setQuestion05(int question05) {
		this.question05 = question05;
		this.nsScore = question04 + question05 + question06;
	}

	public int getQuestion06() {
		return question06;
	}

	public void setQuestion06(int question06) {
		this.question06 = question06;
		this.nsScore = question04 + question05 + question06;
	}

	public int getQuestion07() {
		return question07;
	}

	public void setQuestion07(int question07) {
		this.question07 = question07;
		this.ftScore = question07 + question08 + question09;
	}

	public int getQuestion08() {
		return question08;
	}

	public void setQuestion08(int question08) {
		this.question08 = question08;
		this.ftScore = question07 + question08 + question09;
	}

	public int getQuestion09() {
		return question09;
	}

	public void setQuestion09(int question09) {
		this.question09 = question09;
		this.ftScore = question07 + question08 + question09;
	}

	public int getQuestion10() {
		return question10;
	}

	public void setQuestion10(int question10) {
		this.question10 = question10;
		this.jpScore = question10 + question11 + question12;
	}

	public int getQuestion11() {
		return question11;
	}

	public void setQuestion11(int question11) {
		this.question11 = question11;
		this.jpScore = question10 + question11 + question12;
	}

	public int getQuestion12() {
		return question12;
	}

	public void setQuestion12(int question12) {
		this.question12 = question12;
		this.jpScore = question10 + question11 + question12;
	}

	public int getEiScore() {
		return eiScore;
	}


	public int getNsScore() {
		return nsScore;
	}


	public int getFtScore() {
		return ftScore;
	}

	
	public int getJpScore() {
		return jpScore;
	}


	public String getEiResult() {
		return eiResult;
	}

	public void setEiResult() {
		if (eiScore >= 2) {
			this.eiResult = "E";
		} else {
			this.eiResult = "I";
		}
	}

	public String getNsResult() {
		return nsResult;
	}

	public void setNsResult() {
		if (nsScore >= 2) {
			this.nsResult = "N";
		} else {
			this.nsResult = "S";
		}

	}

	public String getFtResult() {
		return ftResult;
	}

	public void setFtResult() {
		if (ftScore >= 2) {
			this.ftResult = "F";
		} else {
			this.ftResult = "T";
		}
	}

	public String getJpResult() {
		return jpResult;
	}

	public void setJpResult() {
		if (jpScore >= 2) {
			this.jpResult = "J";
		} else {
			this.jpResult = "P";
		}
	}

	public String getYourType() {
		String str = eiResult + nsResult + ftResult + jpResult;
		return str;
	}
	
	

}

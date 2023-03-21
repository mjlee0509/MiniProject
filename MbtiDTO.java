package miniProject;

public class MbtiDTO {
	
	private int eiResult = 0;
	private int nsResult = 0;
	private int ftResult = 0;
	private int jpResult = 0;
	
	String ei = (eiResult >= 2)? "E" : "I";
	String ns = (nsResult >= 2)? "N" : "S";
	String ft = (ftResult >= 2)? "F" : "T";
	String jp = (jpResult >= 2)? "J" : "P";

	
	public int getEiResult() {
		return eiResult;
	}
	public int getNsResult() {
		return nsResult;
	}
	public int getFtResult() {
		return ftResult;
	}
	public int getJpResult() {
		return jpResult;
	}	
}

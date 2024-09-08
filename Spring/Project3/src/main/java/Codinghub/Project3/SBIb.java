package Codinghub.Project3;

public class SBIb {
	int code;
	@Override
	public String toString() {
		return "SBIb [code=" + code + ", branch=" + branch + "]";
	}
	String branch;
	public SBIb(int code, String branch) {
		super();
		this.code = code;
		this.branch = branch;
	}
	
}

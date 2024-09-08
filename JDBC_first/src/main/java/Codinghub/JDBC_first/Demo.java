package Codinghub.JDBC_first;

public class Demo {
int S_NO;
String FULLNAME;
int ROLL_NO;
public int getS_NO() {
	return S_NO;
}
public void setS_NO(int s_NO) {
	S_NO = s_NO;
}
public String getFULLNAME() {
	return FULLNAME;
}
public void setFULLNAME(String fULLNAME) {
	FULLNAME = fULLNAME;
}
public int getROLL_NO() {
	return ROLL_NO;
}
public void setROLL_NO(int rOLL_NO) {
	ROLL_NO = rOLL_NO;
}
@Override
public String toString() {
	return "Demo [S_NO=" + S_NO + ", FULLNAME=" + FULLNAME + ", ROLL_NO=" + ROLL_NO + "]";
}


}

package cLOrderTest;

public class CLOrderTest {
	public static void main(String arg[]){
		Directory objDir_1 = new Directory("Dir1");
		Directory objDir_2 = new Directory("Dir2");
		FileSysUtil objFSysUtil = new FileSysUtil();
		
		//Thread A
		new Member(objDir_1, objDir_2, objFSysUtil);
		
		//Thread B
		new Member(objDir_2, objDir_1, objFSysUtil);
	}
}

package core;
class QQQQ{
	public boolean login(String email,String pass) {
		System.out.println("call in QQQQ class");
		return true;
	}
}
public class P029_Function {
	public static void main(String[] args) {
		QQQQ q = new QQQQ();
		boolean res =  q.login();
		System.out.println(res);
	}
}

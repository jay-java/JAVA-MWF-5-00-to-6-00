package core;
abstract class RBI{
	abstract public void HL();
	abstract public void PL();
	public static void repoRate() {
		System.out.println("repo rate +-4%");
	}
	public void call() {
		System.out.println("call in abstract class");
	}
}
class HDFC extends RBI{
	public void HL() {
		System.out.println("HDFC HL : 7%");
	}
	public void PL() {
		System.out.println("HDFC PL 8%");
	}
	
}
class SBI extends RBI{
	public void HL() {
		System.out.println("SBI HL : 8%");
	}
	public void PL() {
		System.out.println("SBI PL 9%");
	}
	
}
class JAVA extends RBI{
	public void HL() {
		System.out.println("JAVA HL : 9%");
	}
	public void PL() {
		System.out.println("JAVA PL 10%");
	}
	
}
public class P014_Abstraction {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.HL();
		h.PL();
		h.repoRate();
		HDFC.repoRate();
		SBI s=  new SBI();
		s.HL();
		s.PL();
		SBI.repoRate();
		JAVA j = new JAVA();
		j.HL();
		j.PL();
		JAVA.repoRate();
	}
}

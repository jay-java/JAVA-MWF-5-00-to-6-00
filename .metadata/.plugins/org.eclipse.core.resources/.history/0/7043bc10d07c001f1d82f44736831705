package core;

public class P020_Thread {
	public static void main(String[] args) {
		Thread t =new Thread();
		System.out.println(t.currentThread());
		t.setName("Mythread");
		System.out.println(t);
		for(int i =1;i<=5;i++) {
			try {
				System.out.println(t+" : "+i);
				t.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

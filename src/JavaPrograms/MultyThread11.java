package JavaPrograms;



class Hii extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
}

class Helloo extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
}

public class MultyThread11 {
	public static void main(String[] args) {
		Hii hObj=new Hii();
		Helloo obj= new Helloo();
		
		hObj.start();
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			
		}
		obj.start();
	}

}


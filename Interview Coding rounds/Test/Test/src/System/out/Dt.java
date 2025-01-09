package System.out;

public class Dt {

	public static void main(String[] args) {
		nT nT = new nT();
		nT.setDaemon(true);
		nT.start();
		System.out.println("Comp");
	}

}

class nT extends Thread{
	public void run() {
		for(int i = 0; i<500;i++) {
			System.out.println(i);
		}
	}
}
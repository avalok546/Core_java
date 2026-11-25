package thread;

public class HelloThread extends Thread {
	// threds ka use hum ek hi tym pr multiple task ko perform krne ke liye krte he
	// is concept ko multithreading kehte he

	// 2 tpye se thread bna sakte he
	// 1st Thread class ka use krke
	// 2nd Runable interface ko oimplement krke
	// Belong to java.lang package

	// jb hum jaVA ME theread object create krte he to object creation se lekr
	// execution tk ek
	// ek process hoti he jisko thread life cycle klehte he
	// NEW Thread create hua
	// RUNNABLE Thread ready hai
	// BLOCKED Lock ka wait
	// WAITING Kisi action ka wait
	// TIMED_WAITING Fixed time ka wait
	// TERMINATED Thread complete

	// Create → Start → Execute → Wait (if required) → Complete

	private String name;

	public HelloThread(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <5; i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		super.run();
	}

}

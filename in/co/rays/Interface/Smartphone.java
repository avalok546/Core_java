package in.co.rays.Interface;

public class Smartphone implements Music, camera, Gpu {
	public void play() {
		System.out.println("Music is playing");
	}

	public void pause() {
		System.out.println("Music is paused");
	}

	public void stop() {
		System.out.println("Music is stopped");
	}

	public void click() {
		System.out.println("Camera clicked");
	}

	public void recordvideo() {
		System.out.println("Recording video");
	}

	public void process() {
		System.out.println("GPU processing");
	}

	public void display() {
		System.out.println("Displaying on screen");
	}

}

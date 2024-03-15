package threads;

import view.Main;

public class FrogThread extends Thread {

	private int maxDistance;
	private int maxJumpSize;
	
	public FrogThread() {
		super();
	}

	public FrogThread(int maxDistance, int maxJumpSize) {
		this.maxDistance = maxDistance;
		this.maxJumpSize = maxJumpSize;
	}
	
	@Override
	public void run() {
		while(maxDistance > 0) {
			performJump();
		}
		int position = Main.position;
		Main.position++;
		System.out.println("\u001B[33m" + this + " finished in position " + position + "\u001B[0m");
		Main.classification[position - 1] = this.toString();
		
	}
	
	private void performJump() {
		int jump = (int) (Math.random() * maxJumpSize);
		maxDistance -= jump;
		System.out.printf("%s: jumped %dm, %dm remaining\n", this, jump, (maxDistance < 0 ? 0 : maxDistance));
	}
	
	@Override
	public String toString() {
		return this.getName().replace("Thread-", "Frog ");
	}
	
}

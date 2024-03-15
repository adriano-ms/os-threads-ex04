package view;

import threads.FrogThread;

public class Main {

	public static int position = 1;
	public static String[] classification;

	public static void main(String[] args) {

		int frogsNumber = 5;
		int maxDistance = 1000;
		int maxJumpSize = 10;
		classification = new String[frogsNumber];

		for (int i = 0; i < frogsNumber; i++)
			new FrogThread(maxDistance, maxJumpSize).start();

		while (position <= frogsNumber)
			System.out.print("");

		System.out.println("\nClassification:");
		for (int i = 0; i < frogsNumber; i++)
			System.out.println((i + 1) + "º: " + classification[i]);

	}

}

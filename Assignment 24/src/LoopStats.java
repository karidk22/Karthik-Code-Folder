//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import java.util.Scanner;

public class LoopStats {
	private int start, stop, beg, end;
	Scanner scanner = new Scanner(System.in);

	public LoopStats(int beg, int end) {
	}

	public void setNums(int beg, int end) {
		System.out.println("Please enter a beginning number: ");
		beg = scanner.nextInt();
		System.out.println("Please enter an ending number: ");
		end = scanner.nextInt();

	}

	public int getEvenCount() {

		int evenCount=0;
		while (start % beg == 0 && start % end == 0) {
			evenCount++;
		}
		return evenCount;
	}

	public int getOddCount() {

		int oddCount=0;
		while (stop % beg == 1 && stop % end == 1) {
			oddCount++;
		}
		return oddCount;
	}

	public int getTotal() {
		int total=0;
		while (total < stop) {
			total++;
		}
		return total;
	}
	
	public String toString() {
		return start + " " + stop;
	}
}
public class LoopStats {
	private int start, stop;

	public LoopStats() {
		start = 0;
		stop = 0;
	}

	public LoopStats(int beg, int end) {
		setNums(beg, end);
	}

	public void setNums(int beg, int end) {
		start = beg;
		stop = end;
	}

	public int getEvenCount() {
		int evenCount = 0;
		for (int i = start; i <= stop; i++) {
			if (i % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}

	public int getOddCount() {
		int oddCount = 0;
		for (int i = start; i <= stop; i++) {
			if (i % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount;
	}

	public int getTotal() {
		int total = 0;
		for (int i = start; i <= stop; i++) {
			total = total + i;
		}
		return total;
	}

	public void Print() {
		System.out.println("Even Count: " + getEvenCount());
		System.out.println("Odd Count: " + getOddCount());
		System.out.println("Total: " + getTotal());
	}

	

}
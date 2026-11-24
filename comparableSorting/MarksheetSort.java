package comparableSorting;

public class MarksheetSort implements Comparable<MarksheetSort> {
	// its a sorting method for primary key uniqe key
	// it use CompareTo() method for sorting
	// o for no sorting
	// 1 for accendind
	// -1 for decending
	private int roll_num;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;

	public MarksheetSort(int roll_num, String name, int physics, int chemistry, int maths) {
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	@Override
	public int compareTo(MarksheetSort m) {
		
		return this.roll_num - m.roll_num;
	}
	public String toString() {
		return "roll_num: " + roll_num + " name: " + name ;
	}

}

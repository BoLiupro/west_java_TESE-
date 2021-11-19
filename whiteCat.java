package TEST_2_1;

public class whiteCat extends cat {
	protected double price=150;
	
	public whiteCat(String name, int age, String sex) {
		super(name, age, sex);
	}

	@Override
	public String toString() {
		String details="";
		details+="\nname is "+name;
		details+="\nwhite cat";
		details+="\nage is "+age;
		details+="\nsex is "+sex;
		details+="\nprice is "+price;
		return details;
	}
}
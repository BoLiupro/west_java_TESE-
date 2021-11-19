package TEST_2_1;

public class blackCat extends cat {

	public blackCat(String name, int age, String sex) {
		super(name, age, sex);
	}

	double price =350;
	
	@Override
	public String toString() {
		String details="";
		details+="\nname is "+name;
		details+="\nblack cat";
		details+="\nage is "+age;
		details+="\nsex is "+sex;
		details+="\nprice is "+price;
		return details;
	}

}

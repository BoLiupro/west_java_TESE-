package TEST_2_1;

public  class orangeCat extends cat{
	protected boolean isFat;
	protected double price=200;
	
	public orangeCat(String name, int age, String sex,boolean isFat) {
		super(name, age, sex);
		this.isFat=isFat;
	}

	@Override
	public String toString() {
		String details="";
		details+="\nname is "+name;
		details+="\norange cat";
		details+="\nage is "+age;
		details+="\nsex is "+sex;
		details+="\nprice is "+price;
		details+="\nis fat? "+isFat;
		return details;
	}
	
	
}
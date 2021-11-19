package TEST_2_1;

abstract class cat {
	protected String name;
	protected int age;
	protected String sex;
	protected double price;
	
	
	public cat(String name,int age, String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public abstract String toString();
}



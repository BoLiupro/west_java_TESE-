package TEST_2_1;
import java.time.LocalDate;

public class customer {
	protected String name;
	protected int rua;
	protected LocalDate date=LocalDate.now();
	
	
	public customer(String name, int rua) {
		this.name=name;
		this.rua=rua;//number of rua
		this.date=date;
	}
	
	public String toString() {
		String details="";
		details+="name is "+name;
		details+="\ntimes of rua are "+rua;
		details+="\ndate is "+date;
		return details;
	}
	
}

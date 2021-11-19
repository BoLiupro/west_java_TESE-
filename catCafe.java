package TEST_2_1;

public interface catCafe {
	
	public void buyCat(cat cat) throws insufficientBalanceException;
	public void serveCustomer(customer customer) throws catNotFoundException;
	public void close();

}

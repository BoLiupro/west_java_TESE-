package TEST_2_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class myCatCafe implements catCafe {

	public double balance;
	public cat ruaCat;
	public ArrayList<cat> cats = new ArrayList<>();//arraylist of cats
	public ArrayList<customer> customers = new ArrayList<>();//arraylist of customers
	
	public myCatCafe(double balance, ArrayList<cat> cats) {//constructor
		this.balance=balance;
		this.cats=cats;
	}
	
	//get cat message-------------------------------------------------------------
	public void getCatMsg(cat cat) {
		if(cat instanceof orangeCat) {
			cat=(orangeCat) cat;
			System.out.println("====================\n"+cat.toString());
		}else if(cat instanceof blackCat) {
			cat=new blackCat(cat.name,cat.age,cat.sex);//转型
			System.out.println("====================\n"+cat.toString());
		}else if(cat instanceof whiteCat) {
			cat=(whiteCat) cat;
			System.out.println("====================\n"+cat.toString());
		}
			
	}
	
	//buy cat-------------------------------------------------------------
	@Override
	public void buyCat(cat cat) throws insufficientBalanceException  {
		if(cat instanceof orangeCat) {
			orangeCat cat1=(orangeCat) cat;
			if(balance>=cat1.price) {
				cats.add(cat1);
				this.balance-=cat1.price;//success purchase
			}else {//exception
				throw new insufficientBalanceException();
			}
		}else if(cat instanceof blackCat) {
			blackCat cat1=(blackCat) cat;
			if(balance>=cat1.price) {
				cats.add(cat1);
				this.balance-=cat1.price;//sucess purchase
			}else {//exception
				throw new insufficientBalanceException();
			}
		}else if(cat instanceof whiteCat) {
			whiteCat cat1=(whiteCat) cat;
			if(balance>=cat1.price) {
				cats.add(cat1);
				this.balance-=cat1.price;//sucess purchase
			}else {//exception
				throw new insufficientBalanceException();
			}
		}
	}

	
	//serve customer-------------------------------------------------------------
	@Override
	public void serveCustomer(customer customer) throws catNotFoundException{
		customers.add(customer);
		if(cats.size()==0) {
			throw new catNotFoundException();
		}else {
			balance+=customer.rua*15;
			Random rand=new Random();
			int randIndex=rand.nextInt(cats.size());
			ruaCat=cats.get(randIndex);
			System.out.println(customer.name+" rua 的猫咪是 "+ruaCat.toString()+"\n");
		}
	}
	
	//close-------------------------------------------------------------------------
	@Override
	public void close() {
		System.out.println("\nthe cat cafe is closed! \n ==========customers are============");
		double profit=0;
		for(customer i:customers) {
			if(i.date.isEqual(LocalDate.now())) {
				System.out.println(i.toString());
				profit+=i.rua*15;
				System.out.println("=============================");
			}
		}
		System.out.println("==========the profit is=============\n "+profit);
		
	}
	
}

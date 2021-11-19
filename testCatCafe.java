package TEST_2_1;

import java.util.ArrayList;

public class testCatCafe {
	public static void main(String[] args) throws insufficientBalanceException, catNotFoundException {
		//-----------------set cats---------------------------------------------
		orangeCat A=new orangeCat("A", 1, "boy",true);
		blackCat B=new blackCat("B",2,"girl");
		orangeCat C=new orangeCat("C",3,"boy",false);
		blackCat D=new blackCat("D",4,"girl");
		whiteCat E=new whiteCat("E",1,"boy");
		
		//-----------------initialize ArrayList of cats---------------------------------------
		ArrayList<cat> cats= new ArrayList<cat>();
		cats.add(A);
		cats.add(B);
		
		
		//-----------------initialize myCC------------------------------------------
		myCatCafe myCC=new myCatCafe(1000.00,cats);
		
		
		//-----------------get cat message-------------------------------------
		myCC.getCatMsg(A);
		myCC.getCatMsg(B);
		
		//-----------------buy cat---------------------------------------------
		
		//myCC.balance=0;
		//to check the insufficientBalanceException
		
		myCC.buyCat(C);
		System.out.println(myCC.balance);
		myCC.buyCat(D);
		System.out.println(myCC.balance);
		myCC.buyCat(E);
		System.out.println(myCC.balance);
		
		//-----------------show cats in ArrayList------------------------------
		System.out.println("============there are the cats========\n"+cats.toString());
		
		//-----------------serve customer----------------------------------------
		
		//cats.clear();
		//to check the catNotFoundException
		
		customer peter=new customer("peter", 2);
		customer jack=new customer("jack", 3);
		myCC.serveCustomer(jack);
		myCC.serveCustomer(peter);
		System.out.println(myCC.balance);
		
		
		//----------------close---------------------------------------------------
		myCC.close();
		
		
	}
}

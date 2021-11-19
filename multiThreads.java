package TEST_2_3;

import java.util.concurrent.locks.LockSupport;

public class multiThreads {
	public static void main(String[] args) {
		int [] ar1= {1,3,5,7,9};
		int [] ar2= {2,4,6,8,10};
		multiThreads(ar1,ar2);
		
		System.out.println(rightAddress("1249237461@qq.com"));
		System.out.println(rightAddress("BO.Liu@mumail.ie"));
		System.out.println(rightAddress("1249237461googlemail"));
	}
	
	//multiThreads
	static Thread t1=null;
	static Thread t2=null;
	public static void multiThreads(int [] ar1,int[] ar2) {
		
		 t1 = new Thread() {
            @Override
            public void run() {
                for (int i : ar1) {
                    System.out.println(i); //先打印t1
                    LockSupport.unpark(t2); //start t2
                    LockSupport.park(t1); // stop t1
                }
            }
        };
        
         t2 = new Thread(){
            @Override
            public void run() {
                for (int i : ar2) {
                    LockSupport.park(t2); //stop t2
                    System.out.println(i); //print 
                    LockSupport.unpark(t1); //start t1
                }
            }
        };
        
        // start the multiThreads t1&t2
        t2.start();
        t1.start();
	}

	//regularExpression
	public static boolean rightAddress(String address) {
		String form="[a-z A-Z 0-9]+\\.?[a-z A-Z 0-9]+\\@\\D+\\.\\D+";
		if(address.matches(form)){
			return true;
		}else {
			return false;
		}
	}
}

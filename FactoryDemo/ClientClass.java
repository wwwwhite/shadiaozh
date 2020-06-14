package FactoryDemo;

import pro.Myfruit;
import pro.Apple;
import pro.Banana;
import pro.MyfruitStore;

public class ClientClass {
	public static void main(String[] args) {
		//FactoryA factory=new FactoryA();
		//Factory factory=(Factory)XMLUtil.getBean();
	   // Fruit fruit=factory.CreateFruit();
		//Fruit fruit=factory.CreateFruit("A");
		//fruit.eat();
		Myfruit fru1=new Apple();
		Myfruit fru2=new Banana();
		MyfruitStore mfs1=MyfruitStore.Getfruitstore();
		mfs1.Add(1, fru1);
		mfs1.Add(2, fru2);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyfruitStore mfs2=MyfruitStore.Getfruitstore();
		System.out.println(mfs1==mfs2);
		/*MyfruitStore.Add(1,fru1);
		MyfruitStore.Add(2,fru2);
		MyfruitStore.Add(3,new Apple());
		MyfruitStore.Add(4,new Banana());
		Myfruit fru=(Myfruit)MyfruitStore.Get(1);
		Myfruit frs=(Myfruit)MyfruitStore.Get(3);
		*/
		//System.out.println(fru);
		
		//Myfruit fru2=fru1;
	    //Myfruit fru2= (Banana)fru1.clone();
		//System.out.println(fru1);
		//System.out.println(fru2);
		
	}
         public String factory(String fruitname)
         { if(fruitname.equals("Apple"))
        	 return "Apple";
           if(fruitname.equals("Banana"))
        	   return "Banana";
		   return null;   
         }
}

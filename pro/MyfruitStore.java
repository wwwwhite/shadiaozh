package pro;

import java.util.Hashtable;

public class MyfruitStore {
    
	//private static Hashtable fruittable=new Hashtable<Integer,Myfruit>();
	private static MyfruitStore fruitStore=null;
	private static Hashtable fruittable=null;
	private MyfruitStore()
	{fruittable=new Hashtable<Integer,Myfruit>();
		
	}
	public static MyfruitStore Getfruitstore()
	{
		if(fruitStore==null)
	{
		fruitStore=new MyfruitStore();
	}
		return fruitStore;
		
	}
    public static void  Add(Integer key,Myfruit fruit)
    { fruittable.put(key,fruit);

	}
    public static Myfruit Get(Integer key)
    {
	Myfruit fruit=(Myfruit)fruittable.get(key);
	//return (Myfruit)fruit.clone();
	return fruit;
	}
    }

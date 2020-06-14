package Vis;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
private ArrayList list=new ArrayList();
public void accept(AVisitor visitor)
{
Iterator i=list.iterator();
while(i.hasNext())
		{
	((IProduct)i.next()).accept(visitor);
		}

}
public void addProduct(IProduct product) {
	// TODO Auto-generated method stub
	list.add(product);	
}
public void removeProduct(IProduct product) {
	// TODO Auto-generated method stub
	list.remove(product);
}

}

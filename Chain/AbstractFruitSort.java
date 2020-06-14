package Chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
private int weight;
protected ArrayList<String>fruitBox;
private AbstractFruitSort nextFruitSort;

public void getFruitBox()
{
	System.out.println("Weight:"+weight);
	System.out.println("¸öÊý:"+fruitBox.size());
	for(String t:fruitBox)
		{
		System.out.println(t+",");
		}
 System.out.println(" ");	
}
public AbstractFruitSort(int weight)
{
	this.weight=weight;
	fruitBox=new ArrayList<String>();}

public void setNextSort(AbstractFruitSort nextFruitSort)
{
	this.nextFruitSort=nextFruitSort;
}
public void senFruit(int weight,String fruit)
{
if (this.weight==weight)
	pushBox(fruit);
else
	if(nextFruitSort!=null)
		nextFruitSort.senFruit(weight, fruit);
}
protected abstract void pushBox(String fruit);
}

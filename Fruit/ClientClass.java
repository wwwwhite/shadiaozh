package Fruit;

public class ClientClass {
public static void main(String[] args) 
{
	Factory factory=new Factory();
	Fruit fruit=factory.CreatFruit("A");
	fruit.eat();
}
String factory(String fruitname)
{
	if(fruitname.equals("Apple"))
		return "Apple";
	if(fruitname.equals("Banana"))
		return "Banana";
	return null;
	}
}

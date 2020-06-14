package Vis;

import FactoryDemo.XMLUtil;

public class Client {
public static void main(String[] args) {
	IProduct b1=new Book();
	IProduct b2=new Book();
	IProduct a1=new Apple();
	AVisitor visitor;
	BuyBasket basket=new BuyBasket();
	basket.addProduct(b1);
	basket.removeProduct(a1);
	basket.addProduct(b2);
	
	visitor=(AVisitor)XMLUtil.getBean();
	visitor.setName("уехЩ");
	basket.accept(visitor);
}
}

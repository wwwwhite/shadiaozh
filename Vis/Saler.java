package Vis;

public class Saler extends AVisitor {

	public void visit(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("收营员"+name+"给苹果过秤，然后计算其价格");
	}

	public void visit(Book book) {
		// TODO Auto-generated method stub
		System.out.println("收营员"+name+"直接计算书的价格");
	}

}

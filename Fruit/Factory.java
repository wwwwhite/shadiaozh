package Fruit;

public class Factory {
  //构造了一个水果工厂
    public Fruit CreatFruit(String Kind){
        if(Kind.equals("A"))
        	return new Apple();
        if(Kind.equals("B"))
        	return new Banana();
    	return null;
    }

}

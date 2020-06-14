package Dec;

public class Fruit extends Decorating {

    public void Show(){ 
    System.out.println("Cake Blank");
            }

    public String PutFruit(){
    	System.out.println("Add Fruit....");
        return null;
          }

    public Fruit(IBirthdayCake birthdaycake) {
    super(birthdaycake);
    }
                            

}

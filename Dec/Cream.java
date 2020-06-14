package Dec;

public class Cream extends Decorating {

    public void Show(){
        
    }

    public  void PutCream(){
        System.out.println("Add Cream...");
    }

    public Cream(IBirthdayCake birthdaycake){
    	super(birthdaycake);
    }

}

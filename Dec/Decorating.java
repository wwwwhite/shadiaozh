package Dec;

public class Decorating implements IBirthdayCake {
private IBirthdayCake birthdaycake;
    public  Decorating(IBirthdayCake birthdaycake){
    	this.birthdaycake=birthdaycake;
    }

    public void Show(){
    	birthdaycake.Show();
        
    }

}

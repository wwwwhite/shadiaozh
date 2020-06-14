package Ada;

import pro.Myfruit;
public class Adapter extends OldJuice implements InrewJuice {

    public String newPort(Myfruit fruit1, Myfruit fruit2){
       String str=onePort(fruit1);
       str+=onePort(fruit2);
    	return null;
    }

}

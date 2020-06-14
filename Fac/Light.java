package Fac;

public class Light {
private String position;
public Light(String position)
{
this.position=position;	
}
public void on()
{
System.out.println(this.position+"¿ªµÆ");
}
public void off()
{
	System.out.println(this.position+"¹ØµÆ");}
}

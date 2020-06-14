package str;

public class Clinet {
public static void main(String[] args) {
	Chef chef=new Chef();
	ICutFruit cut=new MultiBlade();
	chef.SetCutMethod(cut);
	chef.CutFruit("Ёхвс");
}
}

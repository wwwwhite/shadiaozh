package Fly;

public class OnePiece extends APiece {

	public OnePiece(String inkind) {
		super(inkind);
		// TODO Auto-generated constructor stub
	}

	public void Play(int x,int y)
	{
        System.out.println("把"+inkind+"子放在+("+x+","+y+")的位置");
	}

}

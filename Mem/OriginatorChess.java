package Mem;

public class OriginatorChess {
 private MementoChess memchess;
 public OriginatorChess(MementoChess mem)
 {
	 this.memchess=mem;
 }
 public void SetX(int x)
 {
	 memchess.setX(x);
 }
 public void SetY(int y)
 {
	 memchess.setY(y);
 }
 public MementoChess SavetoMemento()
 {
	return new MementoChess(memchess.getLabel(),
			memchess.getX(),
			memchess.getY());
 }
 public void Restore(MementoChess mem)
 {
	 this.memchess.setLabel();
	 this.memchess.setX(mem.getX());
	 this.memchess.setY(mem.getY());
 }
 public void show()
 {
	 System.out.println("µ±Ç°Æå×Ó×´Ì¬:"+memchess.getLabel()+"("+memchess.getX()+","+memchess.getY()+")");
 }
}

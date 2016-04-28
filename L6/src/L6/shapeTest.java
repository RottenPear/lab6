package L6;

public class shapeTest {
	 shapeTest(){};
	 public void start(){
		 Shape[] ary=new Shape[3];
		 ary[0]= new Circle(3);
		 ary[1]=new Rectangle(4,5);
		 ary[2]=new Triangle(3,4,5);
		 processShape();
	 }
	 public static void main(String[] args){
		 shapeTest tst=new shapeTest();
		 tst.start();
	 }
	 public void processShape(){
		 Circle c=new Circle(3);
		 Rectangle r=new Rectangle(3,4);
		 Triangle t=new Triangle(3,4,5);
		 c.printInfo();
		 r.printInfo();
		 r.drawRectangle();
		 t.printInfo();
	 }
	
}

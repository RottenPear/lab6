package L6;

public abstract class Rectangle extends Shape{
	private double width;
	private double height;
	public double getWidth(){
		return width;
	}
	public void setWidth(double w){
		width=w;
	}
	public double getheight(){
		return height;
	}
	public void setheight(double h){
		height=h;
	}
	public double calculateArea(){
		return width*height;
	}
	public double calculatePerimeter(){
		return 2*(width+height);
	}
	public void drawRectangle(){
		for(int a=0;a<height;a++){
			for(int b=0;b<width;b++){
				System.out.print("คั");
			}
		}
	}
	public void printInfo(){
		System.out.println("Width : "+width);
		System.out.println("Height : "+height);
		System.out.println("Area : "+calculateArea());
		System.out.println("Perimeter : "+calculatePerimeter());
	}
}

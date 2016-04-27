package L6;

public class Circle extends Shape {
		double radius;
		final double PI = 3.14;
		
		public Circle(double radius){
			this.radius = radius;
		}
		
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		public double calculateArea(){
			return PI*radius*radius;
		}
		
		public double calculatePerimeter(){
			return 2*PI*radius;
		}
		
		public void printInfo(){
			System.out.println("Radius : "+radius);
			System.out.println("Area : "+calculateArea());
			System.out.println("Perimeter : "+calculatePerimeter());
		}
}

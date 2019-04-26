
public class AbstractShapeClass {
	public static void main(String [] args) {
		Rectangle rec = new Rectangle();
		rec.setLength(2);
		rec.setWidth(3);
		double areaRec = rec.area();
		System.out.println(areaRec);
	}
}

abstract class Shape{
	public abstract double area();
}

class Rectangle extends Shape{
	private double length, width;
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override  // @关键字，用于把关键字和值传递给编译器，更精确的控制编译器的动作
	public double area() {
		return length*width;
	}
}
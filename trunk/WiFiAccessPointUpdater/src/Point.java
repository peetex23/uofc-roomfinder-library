public class Point {
	public double x;
	public double y;
	public double z;

	public Point(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "x: " + x + "y: " + y + "z: " + z;
	}

}

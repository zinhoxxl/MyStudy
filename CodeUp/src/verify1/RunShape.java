package verify1;

public class RunShape {

	public static void main(String[] args) {

		Shape[] sArr = { new Circle(), new Rectangle(), new Triangle() };
		for (Shape shape : sArr) {
			shape.draw();
		}
	}

}

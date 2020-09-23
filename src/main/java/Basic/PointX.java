package Basic;

public class PointX implements Shape {

	public PointX() {
		System.out.println("PointX() 생성자");
	}
	
	
	
	@Override
	public String make() {
		return "X를 만들다";
	}

	@Override
	public String delete() {
		return "X를 지우다";
	}

}

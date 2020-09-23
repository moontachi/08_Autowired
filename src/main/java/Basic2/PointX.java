package Basic2;

import org.springframework.stereotype.Component;

@Component("PointX")
//객체 만들 때 사용하는 어노테이션
//Shape PointX = new PointX(); 와 같은말
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

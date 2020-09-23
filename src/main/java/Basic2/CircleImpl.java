package Basic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myCircleImpl")
public class CircleImpl implements Circle {
	@Autowired
	//Shape 자식이 자동으로 들어온다.
	@Qualifier("PointX")
	//참조변수를 넣는다 @Component("PointX") 지정
	Shape pointx;
	int x;
	int y;
	int radius;
	
	
	
	public Shape getPointx() {
		return pointx;
	}

//	public void setPointx(Shape pointx) {
//		this.pointx = pointx;
//		System.out.println("setPointx(Shape pointx)");
//	}


	public CircleImpl() {
		System.out.println("CircleImpl() 생성자");
	}
	
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public String make() {
		return pointx.make();
	}

}

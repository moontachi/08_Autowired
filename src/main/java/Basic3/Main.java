package Basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredExam2.xml");
		//ApplicationContext context = new GenericXmlApplicationContext("AutowiredExam2.xml");
		Person per = (Person)context.getBean("Consumer");
		per.setName("윤아");
		System.out.println(per.getName());
		per.setAge(30);
		System.out.println(per.getAge());
		System.out.println(per.personDrive());
	}
	

}


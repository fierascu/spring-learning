package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutowiringdemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(AutowiringdemoApplication.class, args);
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    Employee emp = context.getBean("employee", Employee.class);
    emp.setEid(101);
    emp.setEname("Spring");
    emp.showEployeeDetails();
  }
}
package ramadevi.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
public static void main(String[] args) 
{
ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
EmpDao e = (EmpDao)ctx.getBean("edao");
Employee emp = new Employee();
emp.setId(104);
emp.setName("devi");
emp.setCmp("dell");
e.save(emp);
//e.update(emp);
//e.delete(emp);
System.out.println("nice");
}

}

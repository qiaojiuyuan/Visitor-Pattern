import java.util.ArrayList;
import java.util.List;

public class ClientMain {

	public static void main(String[] args) {
		for (Employee emp : mockEmployee()) {
			emp.accept(new Visitor());
		}
	}
	
	public static List<Employee> mockEmployee(){
		List<Employee> empList = new ArrayList<>();
		CommonEmployee zhangsan = new CommonEmployee();
		zhangsan.setName("张三");
		zhangsan.setSalary(8000);
		zhangsan.setSex(Employee.MALE);
		zhangsan.setJob("业务员");
		empList.add(zhangsan);
		CommonEmployee lisi = new CommonEmployee();
		lisi.setName("李四");
		lisi.setSalary(5000);
		lisi.setJob("销售");
		lisi.setSex(Employee.FEMALE);
		empList.add(lisi);
		Manager wangwu = new Manager();
		wangwu.setName("王五");
		wangwu.setSalary(15000);
		wangwu.setPerformance("业绩很好");
		wangwu.setSex(Employee.FEMALE);
		empList.add(wangwu);
		return empList;
	}
}

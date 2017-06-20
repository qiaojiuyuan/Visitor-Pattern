
public class Visitor implements IVisitor{

	/**
	 * 打印普通员工报表
	 */
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
	}
	
	/**
	 * 打印经理报表
	 */
	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}
	
	private String getBasicInfo(Employee employee) {
		String info = "姓名:"+employee.getName()+"\t";
		info = info + "性别" + employee.getSex()+"\t";
		info = info + "薪水:" + employee.getSalary() + "\t";
		return info;
	}
	
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "业绩:	"+manager.getPerformance()+"\t";
		return basicInfo + otherInfo;
	}
	
	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "工作:"+commonEmployee.getJob()+"\t";
		return basicInfo + otherInfo;
	}
}

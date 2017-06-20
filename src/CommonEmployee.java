
public class CommonEmployee extends Employee{

	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	/**
	 * 设置访问者
	 */
	@Override
	public void accept(IVisitor visitor) {
		//利用重载，调用不同的方法
		visitor.visit(this);
	}
}

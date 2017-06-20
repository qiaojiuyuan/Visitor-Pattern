/**
 * 员工抽象类
 * @author qiaojy
 *
 */
public abstract class Employee {

	public final static int MALE = 0;//代表男性
	public final static int FEMALE = 1;//代表女生
	
	private String name;
	private int salary;
	private int sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public static int getMale() {
		return MALE;
	}
	public static int getFemale() {
		return FEMALE;
	}
	/**
	 * 设置访问者
	 * @param visitor
	 */
	public abstract void accept(IVisitor visitor);
}

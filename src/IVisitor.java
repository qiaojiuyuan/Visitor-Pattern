/**
 * 访问者接口
 * @author qiaojy
 *
 */
public interface IVisitor {

	public void visit(CommonEmployee commonEmployee);
	public void visit(Manager manager);
}

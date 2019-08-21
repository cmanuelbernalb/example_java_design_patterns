package visitorTest;

public interface Order {
	public void accept(OrderVisitor v);
}

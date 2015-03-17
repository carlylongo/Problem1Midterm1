package Problem1;

public class Person {
	protected String name;
	protected String address;
	protected int phoneNumber;
	protected String email;

	@Override
	public String toString() {
		return (this.getClass().getName() + " " + name);
	}
}

package Problem1;

public class Student extends Person{
	private int classStatus;
	@Override
	public String toString() {
		return (this.getClass().getName() + " " + name);
	}
	

}

package GenericCollection.sec04;

public class Box <T>{
	private T tObj;
	public void set(T tobj) {
		this.tObj = tobj;
	}
	public T get() {
		return this.tObj;
	}
}

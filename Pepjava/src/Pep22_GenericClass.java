class DemoGeneric<S,I>
{
	S s;
	I i;
	public DemoGeneric(S s,I i) {
		super();
		this.s = s;
		this.i = i;
	}
	public S getS() {
		return s;
	}
	public I getI() {
		return i;
	}
	
}

public class Pep22_GenericClass {

	public static void main(String[] args) {
		DemoGeneric<Boolean,Integer> d=new DemoGeneric<Boolean,Integer>(true,312);
		DemoGeneric<String,Double> d1=new DemoGeneric<String,Double>("Hello",312.77);
		System.out.println(d.getS());
		System.out.println(d.getI());
		System.out.println(d1.getS());
		System.out.println(d1.getI());
		
		
	}

}

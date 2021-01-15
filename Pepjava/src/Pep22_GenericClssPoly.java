import java.util.ArrayList;
import java.util.List;

class Animal
{}
class Dog extends Animal
{}
class Puppy extends Dog
{}

public class Pep22_GenericClssPoly {
	public void display(List<? extends Animal> obg)
	{
		System.out.println("HEllo Animal Class!!!!!!!!");
	}
	public static void main(String[] args) {
		Pep22_GenericClssPoly pg=new Pep22_GenericClssPoly();
		List<Dog> li=new ArrayList<Dog>();
		pg.display(li);
		
		

	}

}
//(List<? extends Animal> obg) it does not allow to add new object.
//(List<?> obg) It will allow

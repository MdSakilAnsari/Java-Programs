import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DempPredicate {
	public List<Pep25_Predicated> display(List<Pep25_Predicated> li,Predicate<Pep25_Predicated> p){
		return li.parallelStream().filter(p).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Pep25_Predicated> li=new ArrayList<Pep25_Predicated>();
		li.add(new Pep25_Predicated("A",34,22000));
		li.add(new Pep25_Predicated("B",39,12000));
		li.add(new Pep25_Predicated("C",24,62000));
		li.add(new Pep25_Predicated("D",54,72000));
		li.add(new Pep25_Predicated("F",14,32500));
		DempPredicate d=new DempPredicate();
		List<Pep25_Predicated> li1=d.display(li,e->e.getSalary()<50000);
		for(Pep25_Predicated e1:li1)
			System.out.println(e1);
		double tsalary=li.stream().collect(Collectors.summingDouble(e->e.getSalary()));
			System.out.println(tsalary);
		List<String> names=li.stream().map(e->e.getName()).collect(Collectors.toList());
		names.forEach(System.out::println);

	}

}

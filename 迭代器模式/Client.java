package µü´úÆ÷Ä£Ê½;

public class Client {
	public static void main(String[] args) {
		Aggregate agg = new ConcreteAggregate();
		agg.add("HP");
		agg.add("Lenovo");
		agg.add("Ailens");
		agg.add("TCL");
		Iterator it = agg.getIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(it.next());
	}
}

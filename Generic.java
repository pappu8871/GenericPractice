package om.practice.generic;

public class GenericUC3 {

public static void main(String[] args) {

	String[] s = {"Apple", "Peach", "Banana"}; 
	toPrint(s);
	System.out.println("Maximum String value is:");
	System.out.println(max(s));

}
public static <E extends Comparable<E>> E max(E... elements) {
	E max = elements[0];
	for (E element : elements) {
		if (element.compareTo(max) > 0) {
			max = element;
		}
	}
	return max;
}

private static <E> void toPrint(E[] a) {

	for (E i:a) {
		System.out.println(i);  
	}
}
}

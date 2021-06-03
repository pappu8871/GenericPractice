package om.practice.generic;

public class RefactorUC1 {
	
	public static void main(String[] args) {
		Integer[] a = {1, 2, 3}; 
		String[] s = {"Apple", "Peach", "Banana"};
		Float[] f = {(float) 1.20, (float) 5.40, (float) 2.02}; 
		

		toPrint(a);
		toPrint(s);
		toPrint(f);
		
		System.out.println("maximum Value of Integer");
		System.out.println(max(a));
		
		System.out.println("Maximum  value of String is:");
		System.out.println(max(s));
	
		System.out.println("Maximum Float value is:");
		System.out.println(max(f));
		
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



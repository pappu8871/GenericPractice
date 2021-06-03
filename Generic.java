package om.practice.generic;

public class GenericUC2 {
	public static void main(String[] args) {

		Float[] f = {(float) 1.20, (float) 5.40, (float) 2.02}; 
		toPrint(f);
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
	
	private static <E> void toPrint(E[] a) {

		for (E i:a) {
			System.out.println(i);  
		}
	}

}

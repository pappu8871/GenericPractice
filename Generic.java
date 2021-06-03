package om.practice.generic;

public class GenericUC4 
{

	public static void main(String[] args){

		System.out.println(max(4, 8, 6));
		System.out.println(max("Apples", "Peach", "Banana"));
		System.out.println(max(1.4, 2.5, 6.5));
		System.out.println(max('h','j','d'));
	}

	public static <E extends Comparable<E>> E max(E a, E b,E c) {
		E max =a;
		if (b.compareTo(max) >0)
			max = b;
		if (c.compareTo(max)>0)
			max= c;

		return max;	
	}
	private static <E> void toPrint(E[] a) {

		for (E i:a) {
			System.out.println(i);  
		}
	}
}

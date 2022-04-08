package lab4;
import lab4.sortlist.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("List with repetition:");
   		SortedIntegerList a = new SortedIntegerList(true);
   		a.add(3);
   		a.add(2);
   		a.add(100);
   		a.add(35);
   		a.add(-10);
   		a.add(20);
   		a.add(3);
   		a.add(2);
   		a.add(5);
   		a.add(6);
   		a.add(7);
   		System.out.println(a);
   		System.out.println("Remove 2 -10 3");
   		a.remove(2);
   		a.remove(-10);
   		a.remove(3);
   		System.out.println(a);


   		System.out.println("List without repetition:");
   		SortedIntegerList b = new SortedIntegerList(false);
   		b.add(8);
   		b.add(7);
   		b.add(6);
   		b.add(5);
   		b.add(4);
   		b.add(3);
   		b.add(2);
   		b.add(1);
   		b.add(2);
   		b.add(4);
   		b.add(5);
   		System.out.println(b);


   		System.out.println("Equals check:");
   		System.out.println("List a: " + a + "\n" + "List b: " + b);
   		System.out.println(a.equals(b));
   		a.remove(20);
   		a.remove(35);
   		a.remove(100);
   		b.remove(1);
   		b.remove(2);
   		b.remove(3);
   		b.remove(4);
   		b.remove(8);
   		System.out.println("List a: " + a + "\n" + "List b: " + b);
   		System.out.println(a.equals(b));

   		System.out.println("List c:");
   		SortedIntegerList c = new SortedIntegerList(true);
   		c.add(3);
   		c.add(2);
   		c.add(100);
   		c.add(35);
   		c.add(-10);
   		c.add(20);
   		c.add(3);
   		c.add(2);
   		c.add(5);
   		c.add(6);
   		c.add(7);
   		System.out.println(a);
   		System.out.println("Great than 2 in list c:");
   		System.out.println(c.getGreatThan(2));
   		System.out.println("Great than 7 in list c:");
   		System.out.println(c.getGreatThan(7));
   }
}
package lab4.sortlist;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class SortedIntegerList {
	LinkedList<Integer> list;
	boolean repetitions;

	public SortedIntegerList(boolean i) {
		this.list = new LinkedList<Integer>();
		this.repetitions = i;
	}

	public final void add(int value) {
		ListIterator<Integer> iter = this.list.listIterator();
		while (iter.hasNext()) {
			int element = iter.next();
			if (value == element && this.repetitions == false) {
				return;
			} else if (value <= element) {
				iter.previous();
				iter.add(value);
				iter.next();
				return;
			}
		}
		this.list.addLast(value);
	}

	public final void remove(int value) {
		boolean flag = false;
		for (Iterator<Integer> iter = this.list.iterator(); iter.hasNext(); ) {
			int element = iter.next();
			if (element == value) {
				flag = true;
				iter.remove();

			}
			if (element != value && flag ==true) {
				return;
			}
		}
	}

  public boolean equals(Object tmp) {
  	if(tmp instanceof SortedIntegerList) {
    	return ((this.toString()).equals(tmp.toString())); 
    	}
  	return false;
  }
  
 	public final String toString(){
    StringBuilder str = new StringBuilder();  
    boolean flag = false;
    for(int number : this.list){
        str.append(number);
        str.append(", ");
        flag = true;
    }
    if (flag == true) {
    	str.deleteCharAt(str.length()-2);
    }
    return str.toString();
  	}


public final SortedIntegerList getGreatThan(int value) {
	SortedIntegerList tmp = new SortedIntegerList(this.repetitions);
	for (Iterator<Integer> iter = this.list.iterator(); iter.hasNext(); ) {
		int element = iter.next();
		if (element > value) {
			tmp.add(element);
		}
	}
	return tmp;
	}
}
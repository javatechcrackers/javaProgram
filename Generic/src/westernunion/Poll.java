package westernunion;

import java.util.LinkedList;

class MyStruct<E> {
	   private LinkedList<E> list = new LinkedList<E>();
	   public void add(E item) {
	      list.addLast(item);
	   }
	   public E remove() {
	      return list.poll();
	   }
	   public boolean hasItems() {
	      return !list.isEmpty();
	   }
	   public int size() {
	      return list.size();
	   }
	   public void addItems(MyStruct<? extends E> q) {
	      while (q.hasItems()) list.addLast(q.remove());
	   }
	}
import java.util.*;
import java.lang.Math.*;

class Shift {
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
    if (k == 0) {
        return head;
    }
    else {
      // temp: for calculating total length and getting to the point to start changing pointers
      // temphead:  for iterating through and setting the last element's next parameter to head
      // newhead: keep track of the new head
      int size = 1;
      LinkedList temp = head;
      //calculate total length
      while (temp.next != null) {
        size++;
        temp = temp.next;
      }
      // for loop for setting pointers
      temp = head;
			if (k % size == 0) {
				return head;
			}
			int limit;
			if (k > 0) {
				limit = size - (k % size);
			} else {
				limit = (Math.abs(k) % size);
			}
      for (int i = 1; i < limit; i++) {
        temp = temp.next;
      }
      LinkedList temphead = temp.next;
      LinkedList newhead = temp.next;

      temp.next = null;

      while (temphead.next != null) {
        temphead = temphead.next;
      }
      temphead.next = head;
      return newhead;
    }
  }
	
	static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }
  }


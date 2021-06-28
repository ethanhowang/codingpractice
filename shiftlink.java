import java.util.*;


class Shift {
  public LinkedList shiftLinkedList(LinkedList head, int k) {
    // Write your code here.

    //checking for base cases
    if (k == 0) {
        return head;
    }
    /*iterating k times (when k is positive)
     set last linkedlist's next parameter to head
     set second to last next parameter to null
     set last linkedlist as the head

     you cannot determine the length of the linked list, unless you iterate through

     positive case
 
     1) determine the length of the linkedlist
     2) take length - k - 1 number of steps to find the linkedlist, and set its next to temp variable
     3) set its next to null
     4) go down temp list to check until null, set that next parameter equal to head
     5) return temp
     flaws: does not take into account negative; does not take into account k > length of entire linkedlist

     */
    else if (k > 0) {
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
      for (int i = 0; i < size - (k + 1); i++) {
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
		
    return null;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }

  public static void main(String[] args) {
    Shift test = new Shift(); 
    LinkedList param = new LinkedList(0);
    LinkedList headparam = param;
    int[] data = new int[]{1, 2, 3, 4, 5};
    for (int i : data) {
        LinkedList toadd = new LinkedList(i);
        param.next = toadd;
        param = param.next;

    }
    LinkedList result = test.shiftLinkedList(headparam, 2);
    while (result != null) {
      System.out.println(result.value);
      result = result.next;
    }
  }
}

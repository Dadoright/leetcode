package AddTwoNumbersLinkedList;
public class AddTwoNumbersLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode LN1 = new ListNode();
        ListNode Returning = LN1;
        int carry = 0;
        int x=0,y=0;

        //ListNode temp1 = new ListNode(l1.val);

        while(l1!=null || l2!=null){
            
            x = (l1!=null)?l1.val:0;
            y = (l2!=null)?l2.val:0;

            if(x+y+carry >= 10){
                LN1.val = (x+y+LN1.val) %10;
                carry = 1;
            }
            else{
                LN1.val = x+y+LN1.val;
                carry = 0;
            }
            if(l1!=null){
            l1 = l1.next;}
            if(l2!=null){
            l2 = l2.next;}
            //LN1.next = (carry == 1) ? new ListNode(carry):new ListNode();
            if(carry == 1){
                LN1.next = new ListNode(carry);
            }
            else{
                LN1.next = new ListNode();
            }
            LN1 = LN1.next;
        };
        return Returning;
    }

    public static void printList(ListNode ln){
        System.out.println("The List is: ");
        while(ln!=null){
            System.out.print(ln.val+" ");
            ln = ln.next;
        }
        System.out.println(" ");
    }
    
    public static void main(String []args){
        ListNode l1 = new ListNode();
        ListNode l12 = new ListNode();
        ListNode l13 = new ListNode();
        ListNode l14 = new ListNode();
        ListNode l15 = new ListNode();
        ListNode l16 = new ListNode();
        //ListNode l17 = new ListNode();
        //ListNode l18 = new ListNode();

        l1.val = 5;
        l1.next = l12;
        l12.val = 3;
        l12.next = l13;
        l13.val = 7;
        l13.next = l14;
        l14.val = 9;
        l14.next = l15;
        l15.val = 2;
        l15.next = l16;
        l16.val = 0;
        //l16.next = l17;
        //l17.val = 1;
        //l17.next = l18;
        //l18.val = 9;
        
        

        ListNode l2 = new ListNode();
        ListNode l22 = new ListNode();
        ListNode l23 = new ListNode();
        ListNode l24 = new ListNode();

        l2.val = 3;
        l2.next = l22;
        l22.val = 8;
        l22.next = l23;
        l23.val = 4;
        l23.next = l24;
        l24.val = 0;

        ListNode l3 = addTwoNumbers(l1,l2);
        printList(l1);
        printList(l2);
        printList(l3);


    }
}


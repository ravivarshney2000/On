public class SortOn {

    public static Node sortList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        Node zeroD = new Node(0);
        Node oneD = new Node(0);
        Node twoD = new Node(0);


        Node zero = zeroD, one = oneD, two = twoD;

        Node curr = head;
        while (curr!=null)
        {
            if (curr.data == 0)
            {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            }
            else if (curr.data == 1)
            {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            }
            else
            {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
        zero.next = (oneD.next!=null)
                ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;

        head = zeroD.next;
        return head;
    }


    public static Node newNode(int data)
    {

        Node newNode = new Node(data);
        newNode.next = null;
        return newNode;
    }

    public static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        System.out.println(" Linked List Before Sorting");
                printList(head);
        head = sortList(head);
        System.out.println("\nLinked List After Sorting");
                printList(head);
    }
}

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
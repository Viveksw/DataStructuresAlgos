import java.util.HashSet;

public class LinkedList {

    private Node head;
    private class Node{
        int data;
        Node next;
    }

    public LinkedList() {

    }

    public Node getHead(){
        return head;
    }

    public Node getLastNode(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp;
    }
    public void addNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;

        while(tempNode.next!=null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    public void printList(){
        Node node = getHead();
        if(node == null)
        {
            System.out.println("list is empty");
            return;
        }

        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public void addLoopList(){
        Node node = getLastNode();
        node.next = head.next.next;
    }

    public boolean checkLoop(){
        Node slowPointer = head;
        Node fastPointer = head;
        while(fastPointer.next!=null){
            slowPointer = slowPointer.next;
       //     if(fastPointer.next!=null)
                fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) {
                System.out.println("loop detected");
                return true;
            }
        }
        return false;
    }

    public void deleteDups(){
        HashSet<Integer> set = new HashSet<>();
        Node current = getHead();
        Node prev = null;
        while(current!=null){
            if(set.contains(current.data)){
                prev.next = current.next;
                System.out.print("\nduplicate found:"+current.data + " ");
            }

            else{
                set.add(current.data);
                prev = current;
            }
            current = current.next;

        }
    }

    public void printFromIndex(int index){
        Node node = getHead();
        LinkedList list = new LinkedList();
        int count = 0;
        while(count<=index){
            node = node.next;
            count++;
        }
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
}

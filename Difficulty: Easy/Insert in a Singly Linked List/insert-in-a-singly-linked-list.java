/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        
        if(pos<1) return head;
        
        Node newNode = new Node(val);
        
        //insert at start
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        
        Node curr = head;
        
        //insert at middle
        for(int i = 1; i < pos - 1 && curr!=null ; i++){
            curr = curr.next;
        }
        
        if(curr.next == null) return head;
        
        newNode.next = curr.next;
        curr.next = newNode;
        
        return head;
        
        
        
    }
}
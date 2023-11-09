/*class Node{
    int val;
    Node next;
    Node prev;
    Node(int x){
    	val = x; 
    	next = null;
    	prev = null;
    }
}*/

static Node insertNode(Node head, int position, int value){
 if(position == 1) {
        Node newNode = new Node(value);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
    Node temp = head;
    int pos = 1;
    Node pre = null;
    boolean isDone = false;
    while(temp != null){
        if(pos == position){
            Node newNode = new Node(value);
            if(pre != null) pre.next = newNode;
            newNode.prev = pre;
            newNode.next = temp;
            temp.prev = newNode;
            isDone = true;
            break;
        }
        pre = temp;
        temp = temp.next;
        pos++;
    }
    if(!isDone){
        Node newNode = new Node(value);
        pre.next = newNode;
        newNode.prev = pre;
    }
    return head;
}
    
static Node deleteNode(Node head, int position){
    if(position == 1) {
        head = head.next;
        head.prev = null;
        return head;
    }
    int pos = 1;
    Node temp = head;
    Node pre = null;
    while( temp != null ){
        if(pos == position){
            Node nex = temp.next;
            pre.next = nex;
            if(nex != null) nex.prev = pre;
            break;
        }
        pos++;
        pre = temp;
        temp = temp.next;
    }
    return head;
}

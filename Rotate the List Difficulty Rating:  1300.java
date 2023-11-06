/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/
static int count( Node root ){
    int c = 0;
    Node temp = root;
    
    while( temp != null ){
        c++;
        temp = temp.next;
    }
    return c;
    
}
static Node rotateRight(Node head, int R){
    
    if( R == 0 ) return head;
    
    int n = count( head );
    
    Node temp = head;
    
    Node pre = null;
    
    int i = 1;
    
    while( i <= n - R ){
        
        pre = temp;
        
        temp = temp.next;
        
        i++;
        
    }
    
    pre.next = null;
    
    Node ans = temp;
    
    while( temp != null ){
        pre = temp;
        temp = temp.next;
    }
    
    pre.next = head;
    
    return ans;
    
}

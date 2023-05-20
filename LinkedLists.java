class LinkedLists{
    Node head = null ;
    int size = 0;
    class Node{
        int data;
        Node next;
        Node(int data){
           this.data = data;
           this.next = null;

        }
    }

    public void addFirst(int data) {
        Node newNode =new Node(data);
        if(head==null){
            head = newNode ;
        }else{
            newNode.next = head;
            head = newNode ;
        }
        size++ ;
    }
    public void addLast(int data) {
        Node newNode =new Node(data);
        if(head==null){
            head = newNode ;
        }else{
            Node pre  = head;
            // Node temp = pre.next;
            while(pre.next!=null){
                pre = pre.next;
                
            }
            pre.next = newNode;
            
        }
        size++ ;
    }
    public void printList() {
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data + "=>");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        
        // list.printList();
        System.out.println(list.size);
        
    }
}



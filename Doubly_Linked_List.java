public class Doubly_Linked_List {
    private Node head;
    private Node tail;

    public Doubly_Linked_List() {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int length(){
        var tmp=head;
        if (isEmpty()) return 0;
        int count=1;
        while(tmp.getNext()!=null){
            tmp=tmp.getNext();
            count++;
        }
        return count;
    }
    public void insertFirst(int value) {
        Node newestNode=new Node (value, null, head);
        if (head!=null) {
            head.setPrevious(newestNode);
        }
        else{
            tail=newestNode;
        }
        head=newestNode;

    }
    public void insertLast(int value) {
        if (isEmpty()){
            insertFirst(value);
            return;
        }
        Node newestnode= new Node (value, null, null);
        tail.setNext(newestnode);
        newestnode.setPrevious(tail);
        tail=newestnode;

        }
    public void insertIndex(int value, int index){
        var newestnode=new Node (value,null,null);
        var tmp=head;
        if (isEmpty() || index==0) {
            insertFirst(value);
            return;
        }
        if (index==(length())){
            insertLast(value);
            return;
        }
        for(int i=0; i<index; i++) {
            tmp = tmp.getNext();
        }
        newestnode.setNext(tmp.getNext());
        newestnode.setPrevious(tmp);
        tmp.getNext().setPrevious(newestnode);
        tmp.setNext(newestnode);

    }
    public void deleteLast(){
        if (isEmpty()) return;
        tail=tail.getPrevious();
        if (tail!=null) tail.setNext(null);
        else{
            head=null;
        }
        return;
    }
    public void DeleteFromEnd(int n){
        if (isEmpty()) return;
        var tmp=tail;
        for(int i=0; i<n; i++) {
            tmp = tmp.getPrevious();
        }
        if (tmp==head){
            var s=head.getNext();
            head.getNext().setPrevious(null);
            head=s;
            return;
        }
        if (tmp==tail){
            deleteLast();
            return;
        }
        tmp.getPrevious().setNext(tmp.getNext().getNext());
        tmp.getNext().setPrevious(tmp.getPrevious().getPrevious());
        tmp.setNext(null);
        tmp.setPrevious(null);
        return;
    }
    public boolean IsPalindrome(){
        if (isEmpty()) return true;
        var tmp=head;
        int count=1;
        if (tmp.getNext()==null) return true;
        while(tmp!=tail){
            tmp=tmp.getNext();
            count+=1;

        }
        if(count%2==0) return false; // in case the doubly-linked list is even which means it fails
        int split=count/2;
        var tmphead=head;
        var tmptail=tail;
        int checking=0;
        while(checking!=split){
            if (tmphead.getValue()!=tmptail.getValue()) return false;
            tmphead=tmphead.getNext();
            tmptail=tmptail.getPrevious();
            checking++;
        }
        return true;
    }
    public void display() {
        if (isEmpty()){
            System.out.println("Empty List");
            return;
        }
        var s=head;
        while(s!=null){
            System.out.println(s.getValue()+" ");
            s=s.getNext();
        }
    }

    }


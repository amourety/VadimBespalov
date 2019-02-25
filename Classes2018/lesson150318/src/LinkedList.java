/**
 * Created by amour on 15.03.2018.
 */
public class LinkedList<K,V> {
    private Node head;
    private Node tail;
    private int size;



    public Node getHead() {
        return head;
    }
    public void set(K key, V value, int index){
        if (size == 1){
            head = new Node(key,value);
            tail = head;
        }else {
            Node node = get(index);
            Node newNode = new Node(key, value);
            if (index >= 1) {
                get(index - 1).next = newNode;
            }
            newNode.next = node.next;
            newNode.key = node.key;
            newNode.value = node.value;

        }
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    class Node {
        K key;
        V value;
        Node next;
        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    public void add(K key, V value) {
        Node newNode = new Node(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.size++;
    }
    public Node get(int index) {
        int element = 0;
        Node answer = head;
        while(element != index){
            element++;
            answer = answer.next;
        }
        return answer;
    }
    public void print(){
        System.out.println();
        System.out.print(this.get(0).key + "-->");
        Node current = head;
        int i = 1;
        while(current != tail){
            System.out.print(this.get(i).key + "-->");
            i++;
        }
        System.out.print(this.get(i-1).key);
        System.out.println();
    }

}

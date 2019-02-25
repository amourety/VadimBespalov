import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Created by amour on 05.03.2018.
 */
public class GraphicPic implements Iterable{

    private String name;
    private String sortedString;
    private Node head;
    private Node tail;
    private int size;



    private class Node{
        Segment segment;
        Node next;
        public Node(Segment f){
            this.segment = f;
        }
    }

    public GraphicPic(){
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.name = "DEFAULT";
        this.sortedString = "";
    }

    public GraphicPic(String fileName){
        try {
            this.head = null;
            this.tail = null;
            this.size = 0;
            this.name = fileName;
            this.sortedString = "";
            Scanner fileScanner = new Scanner(new File(fileName));
            String[] splitString;
            String s;
            while(fileScanner.hasNextLine()){
                s = fileScanner.nextLine();
                splitString = s.split("\\s+");
                add(new Segment(Double.parseDouble(splitString[0]),
                        Double.parseDouble(splitString[1]),Double.parseDouble(splitString[2]),
                        Double.parseDouble(splitString[3])));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("файла нет");
        }
    }


    public void show() {
        System.out.println(sortedString + " " + name + " GRAPHIC PIC:");
        System.out.println();
        for(int i = 0; i < this.getSize(); i++){
            System.out.println(i+1 + ". Segment (" + this.get(i).getX1() + "," + this.get(i).getY1() + ")...("
                    + this.get(i).getX2() + "," + this.get(i).getY2() + ") LENGTH: " + this.get(i).getLength());
        }
        System.out.println();
    }
    public Segment get(int index) {
        int element = 0;
        Node answer = head;
        while(element != index){
            element++;
            answer = answer.next;
        }
        return answer.segment;
    }

    //проверяет, нету ли заданного отрезка (вспомогательный метод)

    public boolean checking(Segment f){
        if (this.size == 0){
            return true;
        }
        for(int i = 0; i < this.size; i++){
            Segment segment = get(i);
            if ((f.getX1() == segment.getX1()) && (f.getY1() == segment.getY1()) &&
                    (f.getY2() == segment.getY2()) && (f.getX2() == segment.getX2())){
                return false;
            }

        }
        return true;
    }

    public void add(Segment f) {
        Node newNode = new Node(f);
        if(checking(f)){
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            this.size++;
        }
        else {
            System.out.println("Нельзя добавить!!!");
            System.out.println("Такой уже есть : " + "(" + f.getX1() + "," + f.getY1() + ")...("
                    + f.getX2() + "," + f.getY2() + ") LENGTH: " + f.getLength());
        }
    }


    public GraphicPic angleList() {
        Segment s;
        GraphicPic result = new GraphicPic();
        result.setName("ANGLE");
        for(int i = 0; i < this.size; i++){
            s = this.get(i);
            double tan = Math.abs(s.getX1()-s.getX2())/ Math.abs(s.getY1()-s.getY2());
            double tan2 = Math.abs(s.getY1()-s.getY2())/ Math.abs(s.getX1()-s.getX2());

            //45 градусов
            if(tan == 1){
                result.add(s);
            }
            //30 градусов
            if((tan < 0.60086061902 &&
                    tan > 0.55430905145) || (tan2 < 0.60086061902 &&
                    tan2 > 0.55430905145)  ) {
                result.add(s);
            }
        }
        if(this.getSortedString().equals("SORTED")){
            result.setSortedString("SORTED");
        }
        result.setName("ANGLE");
        return result;
    }


    public GraphicPic lengthList(int a, int b) {
        GraphicPic result = new GraphicPic();
        result.setName("LENGTH");
        if (a <= b) {
            for (int i = 0; i < this.size; i++) {
                if (this.get(i).getLength() <= b && this.get(i).getLength() >= a) {
                    result.add(this.get(i));
                }
            }
        }
        else{
            int temp = a;
            a = b;
            b = temp;
            this.lengthList(a,b);
        }
        result.setName("LENGTH[" + a +"," + b + "]");
        if(this.getSortedString().equals("SORTED")){
            result.setSortedString("SORTED");
        }
        return result;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortedString() {
        return sortedString;
    }

    public void setSortedString(String sortedString) {
        this.sortedString = sortedString;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Iterator iterator() {
        return new GraphicPicIterator();
    }
    private class GraphicPicIterator implements Iterator {
        private int currentIndex;
        private Node currentNode;

        GraphicPicIterator (){
            this.currentIndex = 0;
            this.currentNode = head;
        }
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Segment next() {
            currentIndex++;
            Segment value = currentNode.segment;
            currentNode = currentNode.next;
            return value;
        }
    }
    public static GraphicPic merge(GraphicPic sort1, GraphicPic sort2){
        GraphicPic sorted = new GraphicPic();
        Iterator iterator1 = sort1.iterator();
        Iterator iterator2 = sort2.iterator();
        Segment element1, element2;
        element1 = element2 = null;
        while(sorted.size != (sort1.size + sort2.size)) {
            element1 = (element1 == null) ? iterator1.hasNext() ? (Segment) iterator1.next() : null : element1;
            element2 = (element2 == null) ? iterator2.hasNext() ? (Segment)iterator2.next() : null : element2;
            if (element1 == null || element2 == null) {
                iterator1 = element1 == null ? iterator2 : iterator1;
                element1 = element1 == null ? element2 : element1;
                if (element1 != null) {
                    sorted.add(element1);
                    element1 = element2 = null;
                }
            } else {
                if (element1.compareTo(element2) < 0) {
                    sorted.add(element1);
                    element1 = null;
                } else {
                    sorted.add(element2);
                    element2 = null;
                }
            }
        }
        return sorted;
    }

    public GraphicPic sort() {
        GraphicPic[] stacks = new GraphicPic[32];
        Node current = this.head;
        int count = -1;
        for (int i = 0; i < 32; i++)
            stacks[i] = new GraphicPic();
        while(current != null){
            while(count > 0 && stacks[count].size == stacks[count - 1].size && stacks[count].size != 0) {
                stacks[count - 1] = merge(stacks[count], stacks[count - 1]);
                stacks[count--] = new GraphicPic();
            }
            stacks[++count].add(current.segment);
            current = current.next;
        }
        for (int i = count; i > 0; i--)
            stacks[i - 1] = merge(stacks[i], stacks[i - 1]);
        stacks[0].setSortedString("SORTED");
        return stacks[0];
    }
}

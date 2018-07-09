import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        BiDirectional<Integer> myList = new BiDirectional<>();

        myList.addLast(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);
        myList.addFirst(5);
        myList.addLast(6);
        myList.addLast(7);
        myList.addLast(8);

        myList.addByIndex(null, 4);
        System.out.println("------adding------");
        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());


        System.out.println("-----remove element by entity (6)--------");
        myList.remove(6);
        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());

        System.out.println("-------remove first two elements------");
        myList.removeFirst();
        myList.removeFirst();
        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());

        System.out.println("-----remove last two elements----");
        myList.removeLast();
        myList.removeLast();
        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());

        System.out.println("--------add by index three times (1) and two times (4)-----");
        myList.addByIndex(0,1);
        myList.addByIndex(0,1);
        myList.addByIndex(0,1);
        myList.addByIndex(0,4);
        myList.addByIndex(0,4);

        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());
        System.out.println("----------add by index (6)");
        myList.addByIndex(-1,6);

        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());


        System.out.println("\n--------del by index(3,3,5)-----------");
        myList.removeByIndex(3);
        myList.removeByIndex(3);

        myList.printAll();
        System.out.println("\n");
        myList.removeByIndex(5);
        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());

        System.out.println("\n--------arr revers-----------");
        myList.printAllRevers();

        System.out.println("\n----------clear all array---------");
        myList.removeByIndex(0);
        myList.removeByIndex(0);
        myList.removeByIndex(0);
        myList.removeByIndex(0);
        myList.removeByIndex(0);
        myList.removeByIndex(0);

        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());


        System.out.println("\n----------add new elements---------");

        myList.addLast(1);
        myList.addLast(1);
        myList.addFirst(2);
        myList.addFirst(2);
//        myList.addLast(1);
//        myList.printAll();
        System.out.printf(" size %d \n",myList.getSize());

        myList.printAllRevers();



    }
}

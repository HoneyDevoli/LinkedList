import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        BiDirectional<Integer> kek = new BiDirectional<>();

        kek.addLast(1);
        kek.addFirst(2);
        kek.addFirst(3);
        kek.addFirst(4);
        kek.addFirst(5);
        kek.addLast(6);
        kek.addLast(7);
        kek.addLast(8);
        System.out.println("------adding------");
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());


        System.out.println("-----remove element by entity (4)--------");
        kek.remove(4);
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());

        System.out.println("-------remove first two elements------");
        kek.removeFirst();
        kek.removeFirst();
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());

        System.out.println("-----remove last two elements----");
        kek.removeLast();
        kek.removeLast();
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());

        System.out.println("--------add by index (1)-----");
        kek.addByIndex(0,1);
        kek.addByIndex(0,1);
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());


        System.out.println("\n--------del by index(3,3)-----------");
        kek.removeByIndex(3);
        kek.removeByIndex(3);
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());

        System.out.println("\n--------arr revers-----------");
        kek.printAllRevers();

        System.out.println("\n-------------------");
        kek.removeByIndex(0);
        kek.removeByIndex(0);
        kek.removeByIndex(0);

        System.out.printf(" size %d \n",kek.getSize());

        kek.addLast(1);
        kek.addLast(1);
        kek.addFirst(2);
        kek.addFirst(2);
        kek.addLast(1);
        kek.printAll();
        System.out.printf(" size %d \n",kek.getSize());

        kek.printAllRevers();



    }
}

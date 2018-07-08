public class BiDirectional<T> {

    private Node<T> first;
    private Node<T> last;
    private int count;

    public BiDirectional() {
    }

    public T remove(T t) {
        if(last.getT().equals(t)){
            return removeLast();
        } else if(first.getT().equals(t)){
            return removeFirst();
        } else {
            Node<T> currentNode = first;
            while (currentNode != null) {
                if (currentNode.getT().equals(t)) {
                    Node previousNode = currentNode.getPrevious();
                    previousNode.setNext(currentNode.getNext());

                    count--;
                    return currentNode.getT();
                }
                currentNode = currentNode.getNext();
            }
        }
        return  null;
    }

    public T removeByIndex(int index) {
        if (index == 0) return removeFirst();
        else if (index == count - 1) return removeLast();
        else {
            if (index >= count) return null;

            int currentIndex = 0;
            Node<T> currentNode = first;
            while (currentNode != null) {
                if (currentIndex == index) {

                    Node prevNode = currentNode.getPrevious();
                    Node nextNode = currentNode.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrevious(prevNode);

                    count--;
                    return currentNode.getT();
                }
                currentIndex++;
                currentNode = currentNode.getNext();
            }
        }
        return null;
    }

    public void addFirst(T t){
        count++;
        if(first == null){
            first = new Node<>();
            first.setT(t);

            last = first;
        } else{
            Node newNode = new Node();
            newNode.setT(t);
            newNode.setNext(first);
            first.setPrevious(newNode);

            first = newNode;
        }
    }

    public void addLast(T t){
        count++;
        if(last == null){
            last = new Node<>();
            last.setT(t);

            first = last;
        } else {
            Node newNode = new Node();
            newNode.setT(t);
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public T removeFirst() {
        if(first!=null) {
            Node<T> delNode = first;
            first = first.getNext();
            if(first != null) first.setPrevious(null);
            else last = null;


            count--;
            return delNode.getT();
        } else return null;
    }

    public T removeLast() {
        if(last != null) {
            Node<T> delNode = last;
            last = last.getPrevious();
            last.setNext(null);

            count--;
            return delNode.getT();
        } else return null;
    }


    public void addByIndex(T t, int index) {

        if(index == 0) addFirst(t);
        else if(index == count-1) addLast(t);
        else {
            int currentIndex = 0;
            Node<T> currentNode = first;
            while (currentNode != null) {
                if (currentIndex > count - 1) break;

                if (currentIndex == index) {
                    Node<T> newNode = new Node();
                    Node previousNode = currentNode.getPrevious();

                    newNode.setT(t);
                    newNode.setNext(currentNode);
                    newNode.setPrevious(previousNode);

                    if (previousNode != null) previousNode.setNext(newNode);
                    currentNode.setPrevious(newNode);
                    count++;
                }
                currentNode = currentNode.getNext();
                currentIndex++;
            }
        }
    }


    public int getSize() {
        return count;
    }

    public T getLast(){
        if(last != null) {
            return last.getT();
        }
        return null;
    }

    public T getFirst(){
        if(first != null) {
            return first.getT();
        }
        return null;
    }

    public void printAll(){
        Node currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.getT());
            currentNode = currentNode.getNext();
        }
    }

    public void printAllRevers(){
        Node currentNode = last;
        while (currentNode != null) {
            System.out.print(currentNode.getT());
            currentNode = currentNode.getPrevious();
        }
    }

}


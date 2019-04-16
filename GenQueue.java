public class GenQueue<T> {
    private GenQueueBox<T> head;
    private GenQueueBox<T> tail;
    private int size;

    public void push (T item) {
        GenQueueBox box = new GenQueueBox();
        box.setItem(item);
        if (head == null) {
            head = box;
        } else {
            tail.setNext(box);
        }
        tail = box;
        size ++;
    }

    public T pull() {
        if (size == 0) {
            return null;
        }
        T item = head.getItem();
        head = head.getNext();
        if (head == null) {
            tail = null; // нужно переопределить хвост в случае, если в очереди был всего один элемент!
        }
        size --;
        return item;
    }

    public int getSize() {
        return size;
    }

    public T getByInd(int index) {
        if (size == 0 || index >= size || index < 0) {
            return null;
        }
        GenQueueBox<T> current = head;
        int position = 0;
        while (position < index) {
            current = current.getNext();
            position ++;
        }
        return current.getItem();
    }

    private class GenQueueBox<T> {
        private T item;
        private GenQueueBox<T> next;

        public T getItem(){
            return item;
        }
        public void setItem(T item){
            this.item = item;
        }
        public GenQueueBox<T> getNext() {
            return next;
        }
        public void setNext(GenQueueBox<T> next) {
            this.next = next;
        }
    }
}
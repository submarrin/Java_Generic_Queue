public class GenQueueTest {
    public static void main (String[] args) {
        GenQueue<String> queue = new GenQueue<String>();
           for (int i = 0; i < 10; i++) {
               queue.push("Строка: " + i);
           }
        for (int i=0; i<queue.getSize(); i++)
        {
            String s = queue.getByInd(i);
            System.out.println(s);
            System.out.println("Размер очереди:" + queue.getSize());
        }
    }
}

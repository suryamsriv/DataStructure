import java.util.Arrays;

public class PriorityQueue {
    private int front;
    private int rear;
    private int[] array = new int[5];
    private int count;

    public void add(int item) {

    }

    public void pEnqueue(int item) {
        if(count == array.length)
            throw new IllegalStateException();
        int i = shiftItems(item);
        array[i] = item;
        count++;
    }

    public int remove() {
        if(count == 0) 
            throw new IllegalStateException();

        return array[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public int shiftItems(int item) {
        int i;
        for(i=count-1; i>=0;i--) {
            if(array[i] > item) 
                array[i + 1] = array[i];
            else
                break;
        }
        return i+1;
    }
}

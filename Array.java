public class Array {
    private int numbers[];
    private int count;
    
    public Array(int length) {
        this.numbers = new int[length];
    }

    public void print() {
        for(int i=0; i<count; i++)
            System.out.println(numbers[i]);
    }
    
    public void insert(int newNum) {
        if(numbers.length == count) {
            int newItems[] = new int[count * 2];

            for(int i=0; i<count; i++) 
                newItems[i] = numbers[i];

            numbers = newItems;
        }
        numbers[count++] = newNum;
        
    }
    
    public int indexOf(int num) {
        for(int i=0; i<numbers.length; i++) {
            if( numbers[i] == num)
                return i;
        }
        return -1;
    }

    public void removeAt(int index) {

        if(index < 0 || index >= count) 
            throw new IllegalArgumentException();
        
            for(int i=index; i<count; i++) {
                numbers[i] = numbers[i+1];
            
            count--;
        }
    }

}

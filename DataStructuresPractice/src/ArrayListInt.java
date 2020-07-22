import java.util.ArrayList;
import java.util.List;

public class ArrayListInt {
    private int [] data;
    private int size;
    private int capacity;
    public ArrayListInt() {
        capacity = 4;
        data = new int[capacity];
    }

    public void add(int number){
        if(size<capacity) {
            data[size] = number;
            size++;
            return;
        }
        capacity = (int)(capacity+(capacity*0.75));
        int[] newData = new int[capacity];

        for(int count=0;count<size;count++){
            newData[count] = data[count];
        }
        newData[size] = number;
        size++;
        data = newData;
    }

    void printArrayListInt(){
        for(int count=0;count<size();count++){
            System.out.print(data[count] + " ");
        }
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

}

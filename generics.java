import java.util.*;
public class generics<T>{
private Object[] data;
private static final int DEFAULT_SIZE = 10;
private int size = 0;

public generics(){
this.data = new Object[DEFAULT_SIZE];
}

public void add(T element) {
if (isFull()) {
resize();
}
data[size++] = element;
}

private boolean isFull() {
return size == data.length;
}

private void resize() {
Object[] temp = new Object[data.length * 2];
for (int i = 0; i < data.length; i++) {
temp[i] = data[i];
}
data = temp;
}

public T remove() {
@SuppressWarnings("unchecked")
T removed = (T) data[--size];
return removed;
}

    public static void main(String[] args) {
        generics <String>gen=new generics<>();
        gen.add("nnk");
        gen.add("nk");
        for(int i=0;i<DEFAULT_SIZE;i++){
            System.out.print(Arrays.toString(args));
        }
    }
}


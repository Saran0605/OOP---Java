package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size  == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for (int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public void set(int index, int value){

        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(6);
//        System.out.println(list.remove());
//        System.out.println(list);
CustomGenericArrayList<Integer> li = new CustomGenericArrayList<>();
li.add(45);


    }

}

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack {
    private int capacity = 5;
    int[] mystack_array;
    int used_size = 0;

    public MyStack(){
        mystack_array = new int[capacity];
    }

    //加入
    public void push(int e){
        if(used_size==0){
            mystack_array[used_size] = e;
            used_size++;
            return;
        }else{
            check_if_outof_capacity();
            mystack_array[used_size] = e;
            used_size++;
        }
    }

    private void check_if_outof_capacity() {
        if(size()==capacity+1){
            mystack_array = Arrays.copyOf(mystack_array,capacity*2);
            capacity*=2;
            return;
        }else{
            return;
        }
    }

    //删除
    public void pop(){
        if(used_size==0){
            System.out.println("array is empty already");
            return;
        }
        used_size--;
    }

    //拿到最上面
    public int peek(){
        if(used_size==0){
            System.out.println("array is empty already");
            return 0;
        }
        return mystack_array[used_size-1];
    }

    //获取长度
    public int size(){
        return used_size;
    }
}


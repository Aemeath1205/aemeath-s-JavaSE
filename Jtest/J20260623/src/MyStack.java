import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int count = 0;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(empty()){
            queue1.offer(x);
            count++;
            return;
        }else{
            if(queue1.isEmpty()){
                queue2.offer(x);
                count++;
            }else{
                queue1.offer(x);
                count++;
            }
        }
    }
    
    public int pop() {
        int tmp = 0;
        if(empty()){
            return -1;
        }
        if(queue1.isEmpty()){
            int tmpcount = count;
            while(tmpcount!=1){
                queue1.offer(queue2.poll());
                tmpcount--;
            }
            tmp = queue2.peek();
            queue2.poll();
            count--;
        }else if(queue2.isEmpty()){
            int tmpcount = count;
            while(tmpcount!=1){
                queue2.offer(queue1.poll());
                tmpcount--;
            }
            tmp = queue1.peek();
            queue1.poll();
            count--;
        }
        return tmp;
    }
    
    public int top() {
        int tmp = 0;
        if(empty()){
            return -1;
        }
        if(queue1.isEmpty()){
            int tmpcount = count;
            while(tmpcount!=1){
                queue1.offer(queue2.poll());
                tmpcount--;
            }
            tmp = queue2.peek();
            queue1.offer(queue2.poll());
        }else if(queue2.isEmpty()){
            int tmpcount = count;
            while(tmpcount!=1){
                queue2.offer(queue1.poll());
                tmpcount--;
            }
            tmp = queue1.peek();
            queue2.offer(queue1.poll());
        }
        return tmp;
    }
    
    public boolean empty() {
        if(queue2.isEmpty()&&queue1.isEmpty()){
            return true;
        }
        return false;
    }
}
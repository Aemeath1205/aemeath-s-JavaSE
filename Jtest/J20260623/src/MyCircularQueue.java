class MyCircularQueue {
    int[] array;
    int front = 0;
    int rear = 0;
    int usedsize = 0;

    public MyCircularQueue(int k) {
        array = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
//            System.out.println("the array is full right now");
            return false;
        }
        if(isEmpty()){
            array[rear] = value;
            rear = (rear+1)%array.length;
            usedsize++;
        }else{
            array[rear] = value;
            rear = (rear+1)%array.length;
            usedsize++;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        array[front] = 0;
        front = (front+1)%array.length;
        usedsize--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return array[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(rear==0){
            return array[array.length-1];
        }
        return array[rear-1];
    }
    
    public boolean isEmpty() {
        if(usedsize==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(usedsize==array.length){
            return true;
        }
        return false;
    }
}

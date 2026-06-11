import java.util.Scanner;

import static javax.swing.GroupLayout.DEFAULT_SIZE;

public class MyArraylist implements IList {
    int capacity = Constant.DEFAULT_SIZE;
    int[] data = new int[capacity];
    int usedsize = 0;

    @Override//先检查数组是否已经放满，若没放满，则直接加在数组最后，若已放满，则询问是否扩容（y/n）
    public void add(int data) {
        if(checkwhetheroutofcapacity()){
            if(askwhetherneedtoexpandcapacity()){
                expandcapacity();
                this.data[usedsize] = data;
                usedsize++;
            }else{
                throw new OutOfCapacity("数组已满，且你没有同意扩容");
            }
        }else{
            this.data[usedsize] = data;
            usedsize++;
        }
    }

    @Override//先检查数组是否已经放满，若没放满，则直接加在数组最后，若已放满，则询问是否扩容（y/n）
    public void add(int pos, int data) {
        if (checkwhetheroutofcapacity()) {
            if (askwhetherneedtoexpandcapacity()) {
                expandcapacity();
                for(int i = usedsize-1; i >= pos ; i--){
                    this.data[i+1] = this.data[i];
                }
                this.data[usedsize] = data;
                usedsize++;
            }else{
                throw new OutOfCapacity("数组已满，且你没有同意扩容");
            }
        } else {
            for(int i = usedsize-1; i >= pos ; i--){
                this.data[i+1] = this.data[i];
            }
            this.data[usedsize] = data;
            usedsize++;
        }
    }

    @Override
    public boolean contains(int toFind) {
        for(int i = 0;i < usedsize;i++){
            if(this.data[i] == toFind){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(int toFind) {
        for(int i = 0;i < usedsize;i++){
            if(this.data[i] == toFind){
                return i;
            }
        }
        System.out.println("没有找到你要的数组成员");
        return -1;
    }

    @Override
    public int get(int pos) {
        if(pos < 0 || pos >= usedsize){
            throw new uservisitmemberillega("你访问的数组成员不合法");
        }else{
            return this.data[pos];
        }
    }

    @Override
    public void set(int pos, int value) {
        if(pos < 0 || pos >= usedsize){
            throw new uservisitmemberillega("你访问的数组成员不合法");
        }else{
            this.data[pos] = value;
        }
    }

    @Override
    public void remove(int toRemove) {
        if(toRemove < 0 || indexOf(toRemove)>= usedsize){
            throw new uservisitmemberillega("你访问的数组成员不合法");
        }else{
            if(indexOf(toRemove)<0){
                throw new uservisitmemberillega("没找到你要移除的数据");
            }else{
                for(int i = indexOf(toRemove);i <usedsize;i++){
                    this.data[i] = this.data[i+1];
                }
                usedsize--;
            }
        }
    }

    @Override
    public int size() {
        return usedsize;
    }

    @Override
    public void clear() {
        for(int i = 0;i < usedsize;i++){
            this.data[i] = 0;
        }
        usedsize = 0;
    }

    @Override
    public void display() {
        for(int i = 0;i < usedsize;i++){
            System.out.print(this.data[i] + " ");
        }
    }

    //检查当前数组是否已满
    private boolean checkwhetheroutofcapacity(){
        if(usedsize == capacity){
            System.out.println("当前数组已满");
            return true;
        }else{
            return false;
        }
    }

    //询问在数组已满的条件下，是否要扩容
    private boolean askwhetherneedtoexpandcapacity(){
        System.out.println("是否需要扩容（y/n）");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice){
            case "y":
                return true;
                case "n":
                    return false;
                    default:
                        return false;
        }
    }

    //扩容程序(一次扩容量是2倍)
    private void expandcapacity(){
        capacity *= 2;
        int[] newdata = new int[capacity];
        for(int i = 0; i < capacity/2; i++){
            newdata[i] = data[i];
        }
        data = newdata;
    }
}
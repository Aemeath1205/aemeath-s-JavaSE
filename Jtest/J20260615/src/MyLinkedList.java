public class MyLinkedList implements CommonLinkedList {
    EachElementOfMyLinkedList head;
    EachElementOfMyLinkedList last;



    @Override
    public void add(int toadd) {
        if(head == null){
            EachElementOfMyLinkedList newelement = new EachElementOfMyLinkedList(toadd);
            head = newelement;
            return;
        }
        EachElementOfMyLinkedList tmp = head;
        while(tmp.next_address != null){
            tmp = tmp.next_address;
        }
        EachElementOfMyLinkedList newelement = new EachElementOfMyLinkedList(toadd);
        tmp.next_address = newelement;
        return;
    }

    public void add(int index,int toadd){
        EachElementOfMyLinkedList newelement = new EachElementOfMyLinkedList(toadd);
        if(index == 0){
            if(head == null){
                head = newelement;
                return;
            }else if(head != null){
                newelement.next_address = head;
                head = newelement;
                return;
            }
        }else{
            int num = getsize();
            if(index+1 == getsize()){
                EachElementOfMyLinkedList tmp = head;
                while(tmp.next_address != null){
                    tmp = tmp.next_address;
                }
                tmp.next_address = newelement;
            }else if(index+1<getsize()&&index>0){
                int count = 0;
                EachElementOfMyLinkedList tofind = tofindtmpbyindex(index);
                EachElementOfMyLinkedList tofind1 = tofind.next_address;
                newelement.next_address = tofind1;
                tofind.next_address = newelement;
            }else{
                throw new indewException("数组下标不合法");
            }
            return;
        }
    }

    @Override
    public boolean ifcontains(int key) {
        EachElementOfMyLinkedList tmp = head;
        while(tmp != null){
            if(tmp.elemnt==key){
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int key) {
        EachElementOfMyLinkedList tmp = head;
        while(tmp != null){
            if(tmp.next_address.elemnt==key&&tmp.next_address.next_address!=null){
                tmp.next_address = tmp.next_address.next_address;
                System.out.println("remove successfully");
                return;
            }
            if(tmp.next_address.elemnt==key&&tmp.next_address.next_address ==null){
                tmp.next_address = null;
                System.out.println("remove successfully");
            }
        }
        System.out.println("the element you want remove not found");
        return;
    }

    @Override
    public void removeAllKey(int key) {
        EachElementOfMyLinkedList tmp = head;
        while(tmp.next_address != null){
            if(tmp.next_address.elemnt == key){
                tmp.next_address = tmp.next_address.next_address;
            }else{
                tmp = tmp.next_address;
            }
        }
        while(head.elemnt==key){
            head = head.next_address;
        }
        return;
    }

    @Override
    public int getsize() {
       EachElementOfMyLinkedList tmp = head;
       int count = 0;
       while(tmp!=null){
           tmp = tmp.next_address;
           count++;
       }
       return count;
    }

    @Override
    public void display() {
        EachElementOfMyLinkedList tmp = head;
        while(head != null){
            System.out.print(tmp.elemnt+" ");
            if(tmp.next_address != null){
                tmp = tmp.next_address;
            }else if(tmp.next_address == null){
                break;
            }
        }
        System.out.println();
    }

    @Override
    public void clear() {
        head = null;
    }

    private EachElementOfMyLinkedList tofindtmpbyindex(int index){
        int count = 0;
        EachElementOfMyLinkedList tmp = head;
        while(count < index-1){
            tmp = tmp.next_address;
            count++;
        }
        return tmp;
    }
}

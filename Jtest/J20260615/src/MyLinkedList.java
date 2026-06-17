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

//    单链表的逆置
    public void reverse(){
        if(head == null || head.next_address == null){
            return;
        }
        EachElementOfMyLinkedList tmp1 = head;
        EachElementOfMyLinkedList tmp2 = head.next_address;
        EachElementOfMyLinkedList beforethetmp1 = null;
        while(tmp1 != null){
            if(tmp1==head){
                tmp1.next_address = null;
                beforethetmp1 =tmp1;
                tmp1 = tmp2;
                tmp2 = tmp2.next_address;
            }else{
                tmp1.next_address = beforethetmp1;
                beforethetmp1 = tmp1;
                if(tmp2 == null){
                    break;
                }
                tmp1 = tmp2;
                tmp2 = tmp2.next_address;
            }
        }
        head = tmp1;
    }
//    获取链表的中间节点
    public EachElementOfMyLinkedList getmiddleoflist(){
        if(head==null){
            return head;
        }
        EachElementOfMyLinkedList slow = head;
        EachElementOfMyLinkedList fast = head;
        while(fast.next_address != null){
            slow = slow.next_address;
            if(fast.next_address.next_address != null){
                fast = fast.next_address.next_address;
            }else{
                break;
            }
        }
        return slow;
    }

//    获取链表倒数第K个节点
    public EachElementOfMyLinkedList getlastkelement(int k){
        EachElementOfMyLinkedList slow = head;
        EachElementOfMyLinkedList fast = head;
        if(k>getsize()||k<=0){
            System.out.println("k is illeagl");
            return null;
        }
        for(int i = 0;i<k;i++){
            fast = fast.next_address;
        }
        while(fast != null){
            slow = slow.next_address;
            fast = fast.next_address;
        }
        return slow;
    }

//    判定链表是否是回文
    public boolean checkifhuiwen(){
        EachElementOfMyLinkedList mid = getmiddleoflist();
        MyLinkedList newone = new MyLinkedList();
        EachElementOfMyLinkedList tmp = this.head;
        newone.head = mid;
        newone.reverse();
        EachElementOfMyLinkedList tmp2 = newone.head;

        while(tmp2!=null){
            if(tmp2.elemnt != tmp.elemnt){
                return false;
            }else{
                if(tmp.next_address == tmp2){
                    return true;
                }
                tmp2 = tmp2.next_address;
                tmp = tmp.next_address;
            }
        }
        return true;
    }
}




























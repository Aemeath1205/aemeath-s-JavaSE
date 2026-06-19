public class MyLinkedList implements CommonLinkedList{
    OneElementOfMyLinkedList head = null;
    OneElementOfMyLinkedList end = null;

    @Override
    public void addFirst(int data) {
        OneElementOfMyLinkedList newone = new OneElementOfMyLinkedList(data);
        if(head == null){
            head = newone;
            end = newone;
            return;
        }else{
            newone.next_address = head;
            head.pre_address = newone;
            head = newone;
            return;
        }
    }

    @Override
    public void addLast(int data) {
        OneElementOfMyLinkedList newone = new OneElementOfMyLinkedList(data);
        if(head==null && end==null){
            head = newone;
            end = newone;
            return;
        }else{
            end.next_address = newone;
            newone.pre_address = end;
            end = newone;
            return;
        }
    }

    @Override
    public void addIndex(int index, int data) {
        OneElementOfMyLinkedList newone = new OneElementOfMyLinkedList(data);
        if(check_if_index_legal(index)==false){
            System.out.println("index is illegal,failed to add!");
            return;
        }else{
            OneElementOfMyLinkedList goal = find_goal_by_index(index);
            newone.pre_address = goal.pre_address;
            newone.next_address = goal;
            goal.pre_address.next_address = newone;
            goal.pre_address = newone;
        }
    }

    private OneElementOfMyLinkedList find_goal_by_index(int index) {
        OneElementOfMyLinkedList tmphead = head;
        while(index!=0){
            index--;
            tmphead = tmphead.next_address;
        }
        return tmphead;
    }

    private boolean check_if_index_legal(int index) {
        if(index<0||index+1>size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean contains(int key) {
        OneElementOfMyLinkedList tmphead = head;
        while(tmphead != null){
            if(tmphead.val==key){
                return true;
            }
            tmphead = tmphead.next_address;
        }
        return false;
    }

    @Override
    public void remove(int key) {
        OneElementOfMyLinkedList tmphead = head;
        while(tmphead!=null){
            if(tmphead.val==key){
                tmphead.pre_address.next_address = tmphead.next_address;
                tmphead.next_address.pre_address = tmphead.pre_address;
                tmphead = tmphead.next_address;
                return;
            }else{
                tmphead = tmphead.next_address;
            }
        }
        return;
    }

    @Override
    public void removeAllKey(int key) {
        OneElementOfMyLinkedList tmphead = head;
        while(tmphead!=null){
            if(tmphead.val==key){
               if(tmphead!=end){
                   tmphead.pre_address.next_address = tmphead.next_address;
                   tmphead.next_address.pre_address = tmphead.pre_address;
                   tmphead = tmphead.next_address;
               }else{
                   tmphead.pre_address.next_address = null;
                   tmphead = null;
               }
            }else{
                tmphead = tmphead.next_address;
            }
        }
        return;
    }

    @Override
    public int size() {
        OneElementOfMyLinkedList tmphead = head;
        int count = 0;
        while(tmphead!=null){
            count++;
            tmphead = tmphead.next_address;
        }
        return count;
    }

    @Override
    public void display() {
        OneElementOfMyLinkedList tmphead = this.head;
        while(tmphead!=null){
            System.out.print(tmphead.val+" ");
            tmphead = tmphead.next_address;
        }
        return;
    }

    @Override
    public void clear() {
        OneElementOfMyLinkedList tmphead = head;
        while(tmphead!=null){
            tmphead = tmphead.next_address;
            if(tmphead == null){
                break;
            }
//            tmphead.pre_address.val = 0;
            tmphead.pre_address.next_address = null;
            tmphead.pre_address.pre_address = null;
        }
        this.head = null;
        this.end = null;
        return;
    }
}

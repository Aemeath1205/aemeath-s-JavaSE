public class Test {
   public void main() {

        MyLinkedList linkedList = new MyLinkedList();
        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.display();
//        linkedList.add(2);
//       System.out.println(linkedList.checkifhuiwen());
//        linkedList2.add(1);
//        linkedList2.add(3);
//        linkedList2.add(4);
//        linkedList.display();
//        linkedList.add(2,3);
//        linkedList.getlastkelement(1);
//        linkedList.display();
//        EachElementOfMyLinkedList tmp = combinetwolist(linkedList.head,linkedList2.head);
//        MyLinkedList newone = new MyLinkedList();
//        newone.head = tmp;
//        newone.display();
    }

//    合并两个有序链表
    public EachElementOfMyLinkedList combinetwolist (EachElementOfMyLinkedList list1,EachElementOfMyLinkedList list2) {
        if (list1 == null && list2 != null) {
            return list2;
        }
        if(list1 != null&&list2 == null){
            return list1;
        }
        EachElementOfMyLinkedList tmp1 = list1;
        EachElementOfMyLinkedList tmp2 = list2;
        EachElementOfMyLinkedList newhead = null;
        EachElementOfMyLinkedList tmp3 = newhead;
        while(tmp1!=null&&tmp2!=null){
            if(tmp1.elemnt <= tmp2.elemnt){
                if(newhead==null){
                    newhead = tmp1;
                    tmp3 = newhead;
                    tmp1 = tmp1.next_address;
                }else{
                    tmp3.next_address = tmp1;
                    tmp3 = tmp3.next_address;
                    tmp1 = tmp1.next_address;
                }
            }else{
                if(newhead ==null){
                    newhead = tmp2;
                    tmp3 = newhead;
                    tmp2 = tmp2.next_address;
                }else{
                    tmp3.next_address = tmp2;
                    tmp3 = tmp3.next_address;
                    tmp2 = tmp2.next_address;
                }
            }
        }
        if (tmp1 == null && tmp2 != null) {
            tmp3.next_address = tmp2;
        }
        if (tmp2 == null && tmp1 != null) {
            tmp3.next_address = tmp1;
        }
        return newhead;
    }
}


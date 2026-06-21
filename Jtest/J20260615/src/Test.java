public class Test {
   public void main() {

        MyLinkedList linkedList = new MyLinkedList();
        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.head.next_address.next_address.next_address.next_address.next_address = linkedList.head.next_address;
        System.out.println(find_begin_of_rol(linkedList).elemnt);
//       linkedList2.add(1);
//       linkedList2.add(5);
//       linkedList2.add(7);
//       linkedList2.add(2);
//       linkedList2.add(9);
//       linkedList2.add(2);
//
//       linkedList2.head.next_address = linkedList.head.next_address;
//       System.out.println(if_list_has_rol(linkedList));
//        linkedList.display();
//        linkedList.adapt_list_by_x(3);
//        linkedList.display();
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
//    求环的入口点
    public EachElementOfMyLinkedList find_begin_of_rol(MyLinkedList list){
        EachElementOfMyLinkedList fasthead = list.head;
        EachElementOfMyLinkedList slowhead = list.head;
        EachElementOfMyLinkedList tmp = null;
        while(fasthead.next_address.next_address!=null){
            fasthead = fasthead.next_address.next_address;
            slowhead = slowhead.next_address;
            if(slowhead==fasthead){
                tmp = slowhead;
                break;
            }
        }
        slowhead = list.head;
        while(true){
            slowhead = slowhead.next_address;
            tmp = tmp.next_address;
            if(slowhead==tmp){
                return slowhead;
            }
        }
    }
//    判断链表带环
    public boolean if_list_has_rol(MyLinkedList list){
       EachElementOfMyLinkedList fasthead = list.head;
       EachElementOfMyLinkedList slowhead = list.head;
       while(fasthead.next_address.next_address!=null){
           fasthead = fasthead.next_address.next_address;
           slowhead = slowhead.next_address;
           if(slowhead==fasthead){
               return true;
           }
       }
       return false;
    }




//    判定链表相交
    public boolean if_two_list_has_bump(MyLinkedList fist,MyLinkedList second){
       EachElementOfMyLinkedList head1 = fist.head;
       EachElementOfMyLinkedList tmphead1 = head1;
       EachElementOfMyLinkedList head2 = second.head;
       EachElementOfMyLinkedList tmphead2 = head2;
       int count1 = 0;
       int count2 = 0;
       while(tmphead1!=null){
           count1++;
           tmphead1 = tmphead1.next_address;
       }
       while(tmphead2!=null){
           count2++;
           tmphead2 = tmphead2.next_address;
       }

       int tmp = 0;
       if(count1>count2) {
           tmp = count1 - count2;
           while(tmp!=0){
               tmp--;
               tmphead1 = tmphead1.next_address;
           }
       }else{
           tmp  =count2 - count1;
           while(tmp!=0){
               tmp--;
               tmphead2 = tmphead2.next_address;
           }
       }
        tmphead1 = head1;
        tmphead2 = head2;
       while(tmphead2.next_address!=null){
           if(tmphead1==tmphead2){
               return true;
           }
           tmphead1 = tmphead1.next_address;
           tmphead2 = tmphead2.next_address;
       }
       return false;
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


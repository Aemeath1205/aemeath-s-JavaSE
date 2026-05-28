package demo5;

import java.util.Comparator;

public class namecompare  implements Comparator<Student> {
//    public namecompare(String name,int score){
//        super(name,score);
//    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score < o2.score){
            return -1;
        }
        else if(o1.score > o2.score){
            return 1;
        }
        return 0;
    }
}

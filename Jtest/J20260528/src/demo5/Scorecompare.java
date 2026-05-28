package demo5;

public class Scorecompare extends Student implements Comparable<Scorecompare>{
    public Scorecompare(String name,int score){
        super(name,score);
    }
    @Override
    public int compareTo(Scorecompare o) {
        return this.score - o.score;
    }

    @Override
    public String toString() {
        return "Scorecompare{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

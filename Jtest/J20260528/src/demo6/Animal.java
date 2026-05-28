package demo6;

public class Animal implements Cloneable{
    @Override
    public Animal clone() {
        Animal o = null;
        try {
            o = (Animal)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}

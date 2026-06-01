package demo1;

public class test {
    public void add(int a){
        try{
            if(a==0){
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
            System.out.println(a);
        }finally{
            System.out.println(a);
        }
    }
    public void main() {
        add(0);
    }
}

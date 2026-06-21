import java.util.Stack;

public class Test {
    void main() {
//        System.out.println(if_legal("[]()[}"));
//        int[] a = new int[]{1,2,3,4};
//        int[] b = new int[]{3,1,2,4};
//        System.out.println(if_two_way_legal(a,b));
        System.out.println(serve_polan("21+3*"));
    }
    public int serve_polan(String s){
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int tmp = 0;
        while(index<s.length()){
            int a= s.charAt(index)-'0';
            if(s.charAt(index)=='+'||s.charAt(index)=='*'||s.charAt(index)=='/'||s.charAt(index)=='-'){
                int c = stack.pop();
                int b = stack.pop();
                if(s.charAt(index)=='+'){
                    tmp = b+c;
                    stack.push(tmp);
                }else if(s.charAt(index)=='*'){
                    tmp = b*c;
                    stack.push(tmp);

                }else if(s.charAt(index)=='/'){
                    tmp = b/c;
                    stack.push(tmp);

                }else{
                    tmp = b-c;
                    stack.push(tmp);

                }
            }else{
                stack.push(a);
            }
            index++;
        }
        return stack.peek();
    }

    public boolean if_two_way_legal(int[] a,int[] b) {
        int index_a = 0;
        int index_b = 0;
        int length_a = a.length;
        int length_b = b.length;
        Stack<Integer> stack = new Stack<>();
        while (index_b <length_b ) {
            if (stack.empty() || b[index_b] != stack.peek()) {
                if(index_a==length_a){
                    return false;
                }else{
                    stack.push(a[index_a]);
                    index_a++;
//                    length_a--;
                }
            }else{
                stack.pop();
                index_b++;
//                length_b--;
            }

        }
        return true;
    }


    public boolean if_legal(String s){
        Stack<Character> stack1 = new Stack<>();
        int index_s = 0;
//        int usedsize_stack = 0;
        int length = s.length();
        while(length!=0){
            char c = s.charAt(index_s);
            if(c=='{'||c=='('||c=='['){
                stack1.push(c);
                length--;
                index_s++;
//                usedsize_stack++;
            }else{
                if(stack1.empty()){
                    return false;
                }else{
                    if(c=='}'){
                        if(stack1.peek()=='{') {
                            length--;
                            index_s++;
                            stack1.pop();
                        }else{
                            return false;
                        }
                    }
                    if(c==')'){
                        if(stack1.peek()=='(') {
                            length--;
                            index_s++;
                            stack1.pop();

                        }else{
                            return false;
                        }
                    }
                    if(c==']'){
                        if(stack1.peek()=='[') {
                            length--;
                            index_s++;
                            stack1.pop();

                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

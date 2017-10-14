import java.util.Stack;

/**
 * Created by nikhil on 22-09-2017.
 */
public class StackUsingArray {

    int top;
    int a[] = new int[5];

    boolean isEmpty(){

        if(top <0){
            return true;
        }
        else
            return false;
//        return (top <0);
    }
   StackUsingArray(){
       top =-1;
   }
    boolean push(int x){

        if(top >= a.length){
            System.out.println("Overflow");
            return false;
        }
        else{
            a[++top] =x;
            return true;

        }
    }

    int pop(){

        if(top <0){
            System.out.println("Underflow");
            return 0;
        }
        else{
            int x = a[top];
            top --;
            return x;
        }
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }

}

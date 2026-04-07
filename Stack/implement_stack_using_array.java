import java.util.*;
class Stack{
    int[] arr;
    int top;
    int capacity;

    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        arr[top++]=x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
}
class implement_stack_using_array{
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: "+s.peek());
        System.out.println("popped: "+s.pop());
        System.out.println("Top after pop: "+s.peek());
    }
}
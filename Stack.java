class Stack{
    private int[] stack;
    private int top;
    private int capacity;
    public Stack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public boolean isFull(){
        if(top == capacity - 1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }
    public void push(int value){
        if(!isFull()){
            top = top + 1;
            stack[top] = value;
            System.out.println("Inserted " + value);
        }
        else{
            System.out.println("Can not push overflow condition because stack is full");
        }
    }
    public int peek(){
        if(!isEmpty()){
            return stack[top];    
        }
        System.out.println("Stack is empty");
        System.exit(-1);
        return -1;
    }
    public int pop(){
        if(!isEmpty()){
            return stack[top--];
        }
        System.out.println("Can not pop underflow condition because stack is empty");
        System.exit(-1);
        return -1;
    }
}
public class Main{
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.push(6);
		stack.push(7);
		stack.push(2);
		stack.push(1);
		int top = stack.peek();
		System.out.println(top);
		stack.push(4);
		int pop = stack.pop();
		System.out.println(pop);
		top = stack.peek();
		System.out.println(top);
	}
}

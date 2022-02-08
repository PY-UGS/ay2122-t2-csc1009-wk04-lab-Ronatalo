public class StackOfIntegers {

    private int[] elements;
    private int size;

    public StackOfIntegers(){
        elements  = new int[16];
        size = -1;
    }

    public StackOfIntegers(int capacity){
        elements = new int[capacity];
        size = -1;
    }

    public boolean empty(){
        if(size == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        return elements[size];
    }

    public void push(int value){
        size ++;
        elements[size] = value;

    }

    public int pop(){ 
        int results = elements[size];
        size--;
        return results;
    }

    public int getSize(){
        return size;
    }


    public static void main(String args[]){
        StackOfIntegers stack = new StackOfIntegers();

        for(int i =0; i < 10; i++){
            stack.push(i);
        }

        while (!stack.empty()){
            System.out.println(stack.pop() + " ");
        }
            
        
    }
}

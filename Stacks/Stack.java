package Stacks;

public class Stack <V> {
    private int maxSize;
    private int top;
    private V arr[];

    /*
    Java does not allow generic type arrays. So we have used an
    array of Object type and type-casted it to the generic type V.
    This type-casting is unsafe and produces a warning.
    Comment out the line below and execute again to see the warning.
    */
    @SuppressWarnings("unchecked")
    public Stack(int max_size) {
        this.maxSize = max_size;
        this.top = -1; //initially when stack is empty
        arr = (V[]) new Object[max_size];//type casting Object[] to V[]
    }
    public int getCapacity() {
        return maxSize;
    }

}
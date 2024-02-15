
class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        if (i > this.length) return -1;
        return this.arr[i];

    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        // push to end
        if (this.length == this.capacity) {
            this.resize();
        }
        this.arr[length - 1] = n;
    }

    public int popback() {
        // decrem length by 1, return element popped back
        this.length --;
        return this.arr[this.length];
    }

    private void resize() {
        // create a new array with double the capacity
        this.capacity *= 2;
        int[] new_arr = new int[this.capacity];
        
        // copy old array to new one
        for (int i = 0; i < this.length; i++) {
            new_arr[i] = this.arr[i];
            this.arr = new_arr;
        } 
    }

    public int getSize() {
        // num of elements inserted
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

/*
 * https://www.youtube.com/watch?v=xT70mHdAM74
 * init an array with given capacity
 * save capacity, which may change
 * which solves the getCapacity func; return the capacity
 * 
 */
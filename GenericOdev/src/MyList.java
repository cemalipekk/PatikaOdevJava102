public class MyList<T> {

    private Object[] array;
    private int capacity = 10, index = 0;


    public MyList() {
        this.array = new Object[this.capacity];

    }

    public int size() {
        int count = 0;
        for (Object i : array) {
            if (i != null) {
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return array.length;
    }


    public void add(T data) {
        if (this.index == array.length) {
            increaseCapacity();
        }

        array[this.index++] = data;

    }

    public void increaseCapacity() {
        Object[] tempArray = new Object[this.getCapacity() * 2];


        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];

        }
        this.array = tempArray;
    }

    public Object get(int index) {
        if (this.index > this.size()) {
            return null;
        }
        return array[index];
    }

    public Object remove(int index) {
        if (index >= this.array.length || index < 0)
            return null;

        Object value = this.array[index];

        while (this.array.length - 1 != index) {
            this.array[index] = this.array[++index];
        }
        this.array[index] = null;

        this.index--;
        if ((this.index >= this.capacity) && (this.index <= (this.array.length / 2)))
            decreaseArrayCapacity();

        // silinen değeri döndür
        return value;

    }

    private void decreaseArrayCapacity() {
        Object[] tempArray = new Object[this.getCapacity() / 2];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }

        this.array = tempArray;
    }

    public void set(int index, T data) {
        this.array[index] = data;
    }

    public String toString() {
        int count = 0;
        String print = "[";
        String virgul = ", ";

        for (Object object : this.array) {
            if (object != null) {
                count++;
            }
            if (object == null) {
                continue;
            }

            print += count != this.size() ? object + ", " : object;
        }
        print += "]";
        return print.trim();
    }

    public int indexOf(T Data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {

        int i = this.getCapacity() - 1;
        while (i > 0) {
            if (data == this.get(i))
                return i;
            i--;
        }

        return -1;
    }

    public boolean isEmpty() {
        int count = 0;
        for (Object object : array) {
            if (object != null)
                count++;
        }
        return count == 0;
    }

    public Object[] toArray() {
        Object[] tempArray = new Object[this.getCapacity()];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        this.index = 0;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> list = new MyList<>();
        for (int i = start; i < finish; i++) {
            list.add((T) get(i));
        }
        return list;
    }

    boolean contains(T data) {
        if (indexOf(data) == -1) {
            return false;
        }
        return true;
    }
}

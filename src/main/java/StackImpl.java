public class StackImpl<T> implements Stack<T> {

    T[] data;
    public StackImpl(int i) {
        this.data = (T[])new Object[i];
    }

    @Override
    public void push(T value) throws FullStackException {

    }

    @Override
    public T pop() throws EmptyStackException {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

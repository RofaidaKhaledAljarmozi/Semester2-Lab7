//public class ArrayStack<E>implements Stack<E> {
//
// static final int CAPACITY=10;
// private int t=-1;
// E[]data;
// public ArrayStack(int c)
// {
//   data=(E[])new Object[c];
//
// }
// public ArrayStack()
// {
//     this(CAPACITY);
// }
//
//    @Override
//    public boolean isEmpty() {
//        return t==-1;
//    }
//
//    @Override
//    public int size() {
//        return t+1;
//    }
//
//    @Override
//    public E top() {
//     if (isEmpty())return null;
//        return data[t];
//    }
//
//    @Override
//    public void push(E e) {
//if (size()==data.length)
//    throw new IllegalStateException("Stack is Full");
//
//data[++t]=e;
//    }
//
//    @Override
//    public E pop() {
//        if (isEmpty())return null;
//        E deleted=data[t];
//        data[t]=null;
//        t--;
//        return deleted;
//    }
//

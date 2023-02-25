public class TestStack {
    public static void main(String[] args) {
//        ArrayStack<Integer>s= new ArrayStack<>(2);
//        System.out.println(s.isEmpty());
//        System.out.println(s.size());
//        s.push(10);
//        s.push(20);
//

//        ArrayStack <Integer> s=new ArrayStack<>(10);
//        for (int i = 1; i <=10 ; i++) {
//            if(i%3!=0) s.push(i*2);
//            else s.pop();
//        }


        LinkedStack <Integer>s=new LinkedStack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.size());
        s.removeAll();
        System.out.println(s.size());
//        System.out.println(s.popbottom());
    }
}

class OuterClass{
    int x = 10;

    class InnerClass{
        public int innerMethod(){
            return x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.innerMethod());

    }
}
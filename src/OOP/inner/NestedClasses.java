package OOP.inner;

class OuterClass{
    int num = 10;

    class InnerClass{
        int num = 5;
    }
}





public class NestedClasses {
    public static void main(String[] args) {

        OuterClass outerclass = new OuterClass();
        System.out.println("OuterClass value: " + outerclass.num);

        OuterClass.InnerClass innerClass = outerclass.new InnerClass();
        System.out.println("InnerClass value: " + innerClass.num);
    }
}

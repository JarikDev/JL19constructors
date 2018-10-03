public class ConstructorExample {
    int i = 234;

    ConstructorExample(String s, int i) {
        this.i = i;
        System.out.println(s);
        System.out.println(i);
    }

    void constructorExample(String s, int i) {
        this.i = i;
        System.out.println(s);
        System.out.println(i);
    }
    void constructorExample(String s) {
                 System.out.println(s);
      }
    void constructorExample(int i) {
        System.out.println(i);
    }
}

class Run {
    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("Hello world !!!", 1243);
        System.out.println(constructorExample.i);
        constructorExample.constructorExample("Hi", 12345);
        constructorExample.constructorExample("HI HI HI");
        constructorExample.constructorExample(9815298);
    }
}
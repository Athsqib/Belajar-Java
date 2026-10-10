package package1;

import package2.Asub;
import package2.C;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.showFromA();
        System.out.println();

        new B().showFromB(a);
        System.out.println();

        Asub asub = new Asub();
        asub.showFromA();
        asub.showFromAsub();
        System.out.println();

        new C().showFromC(a);
    }
}

package package2;

import package1.A;

public class Asub extends A {
    public void showFromAsub() {
        System.out.println("Inside class Asub (subclass, OTHER package):");
        System.out.println("  public     -> " + publicField    + "  (OK)");
        System.out.println("  protected  -> " + protectedField + "  (OK - inherited from A)");
        System.out.println("  default    -> [ACCESS DENIED] not visible here - would cause a compile error");
        System.out.println("  private    -> [ACCESS DENIED] not visible here - would cause a compile error");
    }
}

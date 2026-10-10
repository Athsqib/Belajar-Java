package package2;

import package1.A;

public class C {
    public void showFromC(A a) {
        System.out.println("Inside class C (OTHER package, NOT a subclass):");
        System.out.println("  public     -> " + a.publicField + "  (OK)");
        System.out.println("  protected  -> [ACCESS DENIED] not visible here - would cause a compile error");
        System.out.println("  default    -> [ACCESS DENIED] not visible here - would cause a compile error");
        System.out.println("  private    -> [ACCESS DENIED] not visible here - would cause a compile error");
    }
}

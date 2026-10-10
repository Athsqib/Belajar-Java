package package1;

public class B {
    public void showFromB(A a) {
        System.out.println("Inside class B (same package, NOT a subclass):");
        System.out.println("  public     -> " + a.publicField    + "  (OK)");
        System.out.println("  protected  -> " + a.protectedField + "  (OK - same package)");
        System.out.println("  default    -> " + a.defaultField   + "  (OK - same package)");
        System.out.println("  private    -> [ACCESS DENIED] not visible here - would cause a compile error");
    }
}

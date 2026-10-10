package package1;

public class A {
    public    String publicField    = "public";
    protected String protectedField = "protected";
              String defaultField   = "default";
    private final   String privateField   = "private";

    public void showFromA() {
        System.out.println("Inside class A (same class):");
        System.out.println("  public     -> " + publicField    + "  (OK)");
        System.out.println("  protected  -> " + protectedField + "  (OK)");
        System.out.println("  default    -> " + defaultField   + "  (OK)");
        System.out.println("  private    -> " + privateField   + "  (OK)");
    }
}

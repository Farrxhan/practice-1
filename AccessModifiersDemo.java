
class AccessModifiersExample {
    public String publicField = "This is a public field";
    private String privateField = "This is a private field";
    protected String protectedField = "This is a protected field";
    String defaultField = "This is a default (package-private) field";

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method");
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

       
        System.out.println("Accessing public members:");
        System.out.println("Public Field: " + example.publicField);
        example.publicMethod();

       
        System.out.println("\nAccessing default members:");
        System.out.println("Default Field: " + example.defaultField);
        example.defaultMethod();

        
        System.out.println("\nAccessing protected members:");
        System.out.println("Protected Field: " + example.protectedField);
        example.protectedMethod();

      
    }
}

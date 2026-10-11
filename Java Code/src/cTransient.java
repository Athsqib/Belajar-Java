import java.io.Serializable;

public class cTransient {
    public class User implements Serializable{
        String name;
        transient String password;

        public void sayHello(){
            System.out.println("Hi "+name);
        }

        public void getPassword(){
            System.out.println("Your password is "+password);
        }
    }
}

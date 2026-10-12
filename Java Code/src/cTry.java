public class cTry {
    public static void main(String[] args){
        try {
            int myInt = Integer.parseInt("Stick");
            System.out.println(myInt+" adalah angka");
        }
        catch (NumberFormatException e){
            System.out.println("Exception loh ya XD");
        }
        finally {
            System.out.println("Masuk block finally!");
        }
        System.out.println("Program selesai :]");
    }
}

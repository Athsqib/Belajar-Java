public class cIfElseAndBreak {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if ((i+1) % 7 == 0) {
                break;
            } else if (i % 2 == 0){
                System.out.println("Muncul");
                continue;
            }
            else {
                System.out.println("Lolos");
            }
            System.out.println("Biar continue kepake");
        }
    }
}

public class HasilUjian1 {
    public static void main(String[] args){
        int nilai1 = 8;
        int nilai2 = 7;
        int nilai3 = 5;
        float rata_rata = (float)(nilai1 + nilai2 + nilai3)/3;
        if(rata_rata<5){
            System.out.println("Tidak Lulus");
        }
        System.out.println("Nilai Rata-Rata = "+rata_rata);
    }
}

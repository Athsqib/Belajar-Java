public class HasilUjian3 {
    public static void main(String[] args){
        int nilai1 = 8;
        int nilai2 = 7;
        int nilai3 = 5;
        float rata_rata = (float)(nilai1 + nilai2 + nilai3)/3;
        switch((int)rata_rata){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Tidak Lulus");
                break;
            case 5:
                System.out.println("Ikut ujian perbaikan");
            default:
                System.out.println("Lulus");
                break;
        }
        System.out.println("Nilai Rata_Rata = "+ rata_rata);
    }
}

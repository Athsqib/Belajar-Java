public class cSwitch {
    public static void main(String[] args) {
        String day = "Senin";

        switch (day) {
            case "Senin" -> System.out.println("Hari ini hari Senin");
            case "Selasa" -> System.out.println("Hari ini hari Selasa");
            case "Rabu" -> System.out.println("Hari ini hari Rabu");
            case "Kamis" -> System.out.println("Hari ini hari Kamis");
            case "Jumat" -> System.out.println("Hari ini hari Jumat");
            case "Sabtu" -> System.out.println("Hari ini hari Sabtu");
            case "Minggu" -> System.out.println("Hari ini gari Minggu");
            default -> throw new AssertionError();
        }
    }
}

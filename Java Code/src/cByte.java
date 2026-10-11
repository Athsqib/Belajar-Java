public class cByte {
    public static class contohByte{
        protected byte nilai = 100;
        public byte getByte(){
            return nilai;
        }
    }

    public static void main(String[] args){
        contohByte cb = new contohByte();
        System.out.println(cb.getByte());
    }
}

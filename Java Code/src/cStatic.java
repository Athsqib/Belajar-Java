public class cStatic{
    public static class Friend{
        String name;
        static int numberOfFriend;

        public Friend(){
            this ("Fred");
            numberOfFriend++;
        }

        public Friend(String name) {
            this.name = name;
            numberOfFriend++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Friend friend1 = new Friend("Sandika");
        Friend friend2 = new Friend("Salwa");
        Friend friend3 = new Friend("Syafiq");
        Friend friend4 = new Friend("Hasbi");

        Friend[] kelompok = {friend1,friend2,friend3,friend4};

        System.out.println("You have "+Friend.numberOfFriend+" friends!");

        for (int i = 0; i < kelompok.length; i++){
            System.out.println((i+1)+". "+kelompok[i].getName());
        }
    }
}
public class cSuper {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return this.name + "\n" + this.age;
        }
    }

    public static class Hero extends Person {
        String power;

        Hero(String name, int age, String power) {
            super(name, age);
            this.power = power;
        }

        @Override
        public String toString() {
            return super.toString() + "\n" + this.power;
        }
    }

    public static void main(String[] args) {
        Hero hero1 = new Hero("Spiderman", 23, "Spider Power");
        Hero hero2 = new Hero("Batman", 42, "Money");

        System.out.println(hero1.toString());
        System.out.println();
        System.out.println(hero2.toString());
    }
}
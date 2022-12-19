public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("_____ Задача 1 _____");
        int[] mas1 = new int[3];
        mas1[0] = 1;
        mas1[1] = 2;
        mas1[2] = 3;

        double[] mas2 = {1.57, 7.654, 9.986};

        char[] mas3 = {'\u20bd', '\u0024', '\u20ac'};
    }

    public static void task2() {
        System.out.println("_____ Задача 2 _____");
        int[] mas1 = new int[3];
        mas1[0] = 1;
        mas1[1] = 2;
        mas1[2] = 3;
        System.out.print(mas1[0] + ", ");
        System.out.print(mas1[1] + ", ");
        System.out.println(mas1[2]);

        double[] mas2 = {1.57, 7.654, 9.986};
        System.out.print(mas2[0] + ", ");
        System.out.print(mas2[1] + ", ");
        System.out.println(mas2[2]);

        char[] mas3 = {'\u20bd', '\u0024', '\u20ac'};
        System.out.print(mas3[0] + ", ");
        System.out.print(mas3[1] + ", ");
        System.out.println(mas3[2]);
    }

    public static void task3() {
        System.out.println("_____ Задача 3 _____");

        int[] mas1 = new int[3];
        mas1[0] = 1;
        mas1[1] = 2;
        mas1[2] = 3;
        for (int i = 2; i > 0; i--) {
            System.out.print(mas1[i] + ", ");
        }
        System.out.println(mas1[0]);

        double[] mas2 = {1.57, 7.654, 9.986};
        for (int i = 2; i > 0; i--) {
            System.out.print(mas2[i] + ", ");
        }
        System.out.println(mas2[0]);

        char[] mas3 = {'\u20bd', '\u0024', '\u20ac'};
        for (int i = 2; i > 0; i--) {
            System.out.print(mas3[i] + ", ");
        }
        System.out.println(mas3[0]);
    }

    public static void task4() {
        System.out.println("_____ Задача 4 _____");
        int[] mass1 = new int[3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 != 0) {
                System.out.print(mass1[i] + 1 + ", ");
            } else {
                System.out.print(mass1[i] + ", ");
            }
        }
        System.out.println(" ");
    }


}
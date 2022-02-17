package Working;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = in.nextLine();
        System.out.print("Введите второе число: ");
        b = in.nextInt();
        Integer c = Integer.valueOf(a);
        int Max = Math.max(b,c);
        System.out.println("Большее число: " + Max);
        double Min = Math.min(b, c);
        System.out.println("Меньшее число: " + Min);
    }
}

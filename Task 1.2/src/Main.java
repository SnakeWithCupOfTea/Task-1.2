//Написать программу, которая выводит на экран в строку 20 целых
//случайных чисел от 1 до 100, потом в столбец 10 дробных
// от 25 до 75 и затем выводит в строку через пробел символы
//строки "Съешь ещё этих мягких французских булок, да выпей же чаю".

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());
        String num1 = "";

         for (int i = 0; i < 20; i++) {
             int rndto100 = rnd.nextInt(100-0);
             num1=num1+Integer.toString(rndto100)+" ";
         }
        System.out.println(num1);
        for (int i = 0; i < 10; i++) {
            double num2 = rnd.nextInt(75-25);
            System.out.println(num2);
        }

        int k=1;
        StringBuffer sb = new StringBuffer("Съешь ещё этих мягких французских булок, да выпей же чаю");
        int d=sb.length();
        for (int i=1; i<d;i++ ){
            sb.insert(k, " ");
            k=k+2;
        }
        System.out.println(sb);
    }

}

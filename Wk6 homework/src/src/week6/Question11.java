package src.week6;

public class Question11 {
    public static void main(String[] args) {
        for (int b = 1; b <=10; b++)
        for (int i = 1; i <=10; i++) {
            int self_multiply=b*i;
            System.out.println(b + " x " + i + " = " + self_multiply);
                 }
        AnotherWay Object = new AnotherWay ();
        Object.particularNumber();
    }
}
class AnotherWay{
   public void particularNumber() {
        int c = 8;
        for (int j = 1; j <=10; j++) {
            int multiply = c*j;
            System.out.println (c + " x " + j + " = " + multiply);

        }
    }
}

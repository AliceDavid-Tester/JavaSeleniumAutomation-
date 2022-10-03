package day2;

public class Operators {

    public static void main(String[] args) {
        int i=10;
        int j=20;
        int sum =10+20;

        short k =12345;
        double l = 44.5;
        double sub = k-l; // here need to be double not short

        float m = 78.6f;
        long n = 1234564444;
        float div=m/n;
        float mult=m*n;
        int mod=sum%i;

        System.out.println("Addition= "+sum);
        System.out.println("Addition= "+i+j);
        System.out.println("Subtraction= "+sub);
        System.out.println("Division= "+div);
        System.out.println("Multiplication= "+mult);
        System.out.println("Modulas= "+mod);
    }
    }


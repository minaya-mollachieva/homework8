import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Задание 1");

        int[] m1 = new int[3];
        m1[0] = 1;
        m1[1] = 2;
        m1[2] = 3;

        double[] m2 = {1.57, 7.654, 9.986};
        boolean[] m3 = new boolean[3];
        m3[0] = true;
        m3[1] = true;
        m3[2] = false;



            System.out.println("Задание 2");

        for (int i = 0; i < m1.length; i++) {
            if (i != m1.length - 1) {
                System.out.print(m1[i] + ", ");
            } else {
                System.out.print(m1[i]);
            }}
        System.out.println();
            for (int i = 0; i < m2.length; i++) {
                if (i != m2.length - 1) {
                    System.out.print(m2[i] + ", ");
                } else {
                    System.out.print(m2[i]);
                }}
        System.out.println();
        for (int i = 0; i < m3.length; i++) {
            if (i != m3.length - 1) {
                System.out.print(m3[i] + ", ");
            } else {
                System.out.print(m3[i]);
            }
        }
        System.out.println();
            System.out.println("Задание 3");

        for (int i = m1.length-1;i>=0; i--) {
            if (i !=0) {
                System.out.print(m1[i] + ", ");
            } else {
                System.out.print(m1[i]);
            }}
        System.out.println();
        for (int i = m2.length-1;i>=0; i--) {
            if (i != 0) {
                System.out.print(m2[i] + ", ");
            } else {
                System.out.print(m2[i]);
            }}
        System.out.println();
        for (int i = m3.length-1;i>=0; i--) {
            if (i !=0) {
                System.out.print(m3[i] + ", ");
            } else {
                System.out.print(m3[i]);
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < m1.length; i++) {
            if (m1[i]%2!=0) {
                m1[i]=m1[i]+1;
                System.out.println(Arrays.toString(m1));

            }
    }
    }
}
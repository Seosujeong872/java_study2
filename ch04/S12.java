package ch04;

public class S12 {
    public static void main(String[] args) {
        // for,while 문을 이용해서 별찍기
        // "*****" X "*" O
        // "*".repeat(count:3);

        // 1
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5; i++) {
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println("*");

        }

        // 2
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {

        System.out.print("*");
        if(i>0)System.out.print("*");
        if(i>1)System.out.print("*");
        if(i>2)System.out.print("*");
        if(i>3)System.out.print("*");
        System.out.println();

        }
        for (int i = 1; i < 6; i++) {
        System.out.println("*".repeat(i));

        }

        // 3
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >0; i--) {
        System.out.println("*".repeat(i));

        }

        // 4
        // *****
        //  ***
        //   *
        System.out.println("4번문제");
        for (int i = 1; i < 4; i++) {
            if (i == 1) {
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            } else if (i == 2) {
                System.out.print(" ");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("");
            } else {
                System.out.print(" ");
                System.out.print(" ");
                System.out.print("*");
                System.out.print("");
                System.out.println("");
            }
        }

        // 5
        // *****
        // * *
        // * *
        // * *
        // *****
        for (int i = 1; i < 6; i++) {
            if (i >= 2 && i <= 4) {
                System.out.print("*");
                System.out.print(" ");
                System.out.print(" ");
                System.out.print(" ");
                System.out.println("*");
            } else {
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.print("*");
                System.out.println("*");
            }
        }

    }

}

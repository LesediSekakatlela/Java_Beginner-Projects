/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author admin
 */
// Demonstrate the switch 
public class Nobreak {

    public static void main(String[] args) {
        int i;
        char ch1 = 'A';
        char ch2 = 'B';

        for (i = 0; i <= 5; i++) {

//            switch (i) {
//                case 0:
//                    System.out.println("i is less than one");
//                case 1:
//                    System.out.println("i is less than two");
//                case 2:
//                    System.out.println("i is less than three");
//                case 3:
//                    System.out.println("i is less than four");
//                case 4:
//                    System.out.println("i is less than five");
//            }
//            System.out.println();
//        }
//            switch (i) {
//                case 1:
//                case 2:
//                case 3: System.out.println("i is one, two or three");
//                    break;
//                case 4: System.out.println("i is four");
//                    break;
//            }
            switch (ch1) {
                case 'A':
                    System.out.println("This A is part of outer switch.");
                     {
                        switch (ch2) {
                            case 'A':
                                System.out.println("This A is part of inner switch");
                                break;
                            case 'B': //...
                        }
                    }
                    break;

                case 'B': //...
            }
        }
    }
}

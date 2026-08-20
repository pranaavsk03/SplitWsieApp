package app;
import java.util.Scanner;

public class LabProgram {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(17.0 / 5);
        System.out.println((int) 17 / 5);
        System.out.println(17 % 5);
        int choice = 2;
        System.out.println(choice == 2);
        System.out.println(choice != 2);
        System.out.println(choice >= 1 && choice <= 3);
        for (int a=1;a<=5;a++)
        {
            System.out.println(a);
        }
        while(true)
        {
            int i=5;
            System.out.println(i);
            if(i==0)
            {
                break;
            }

        }

//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            int c = sc.nextInt();
//            if (c == 1)
//            {
//                System.out.println("choice 1");
//            }
//            else if (c == 2)
//            {
//                System.out.println("choice 2");
//            } else if (c == 3)
//            {
//                break;
//            } else
//            {
//                System.out.println("Input in invalid");
//            }
//        }
        while (true) {

            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("choice 1");
                }
                case 2: {
                    System.out.println("choice 2");
                }
                case 3: {
                    break;
                }
                default: {
                    System.out.println("Input in invalid");
                }
            }
        }
    }

    }



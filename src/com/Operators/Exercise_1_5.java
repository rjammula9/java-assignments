package com.Operators;

import java.util.Scanner;

public class Exercise_1_5 {

    public static void main(String[] args) {
        String name;
        int x;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Enter the Name:");
        for (x = 0; x < name.length(); x++) {
            if (x == 0 && name.charAt(x) != ' ') {
                printPattern(name.charAt(x));
            } else if (name.charAt(x) == ' ' && x + 1 < name.length() && name.charAt(x + 1) != ' ') {
                printPattern(name.charAt(x + 1));
            }
        }

    }
       public static void printPattern(char character)
        {
            switch (character) {
                case 'A':
                    printA();
                    break;
                case 'B':
                    printB();
                    break;
                case 'C':
                    printC();
                    break;
                case 'D':
                    printD();
                    break;
                case 'E':
                    printE();
                    break;
                case 'F':
                    printF();
                    break;
                case 'G':
                    printG();
                    break;
                case 'H':
                    printH();
                    break;
                case 'I':
                    printI();
                    break;
                case 'J':
                    printJ();
                    break;
                case 'K':
                    printK();
                    break;
                case 'L':
                    printL();
                    break;
                case 'M':
                    printM();
                    break;
                case 'N':
                    printN();
                    break;
                case 'O':
                    printO();
                    break;
                case 'P':
                    printP();
                    break;
                case 'Q':
                    printQ();
                    break;
                case 'R':
                    printR();
                    break;
                case 'S':
                    printS();
                    break;
                case 'T':
                    printT();
                    break;
                case 'U':
                    printU();
                    break;
                case 'V':
                    printV();
                    break;
                case 'W':
                    printW();
                    break;
                case 'X':
                    printX();
                    break;
                case 'Y':
                    printY();
                    break;
                case 'Z':
                    printZ();
                    break;
                default:
                    System.out.println("Not a valid letter.");
            }
        }
        public static void printA(){
            System.out.println();
            System.out.println("  A  ");
            System.out.println(" A A ");
            System.out.println("AAAAA");
            System.out.println("A   A");
            System.out.println("A   A");

        }
        public static void printB(){
            System.out.println();
            System.out.println("BBBBB");
            System.out.println("B  B ");
            System.out.println("BB   ");
            System.out.println("B   B ");
            System.out.println("BBBBB");

        }
        public static void printC(){
            System.out.println();
            System.out.println("   CC");
            System.out.println("  C  ");
            System.out.println(" C   ");
            System.out.println("  C  ");
            System.out.println("   CC");

        }
        public static void printD(){
            System.out.println();
            System.out.println("DDDD");
            System.out.println("D   D");
            System.out.println("D   D");
            System.out.println("D   D");
            System.out.println("DDDD");

        }
        public static void printE(){
            System.out.println();
            System.out.println("EEEEE");
            System.out.println("E ");
            System.out.println("EEEEE");
            System.out.println("E");
            System.out.println("EEEEE");

        }
        public static void printF(){
            System.out.println();
            System.out.println("FFFFF");
            System.out.println("F    ");
            System.out.println("FFFFF");
            System.out.println("F    ");
            System.out.println("F    ");

        }
        public static void printG(){
            System.out.println();
            System.out.println("   GG");
            System.out.println("  G  ");
            System.out.println(" GGGG");
            System.out.println("  G G");
            System.out.println("  GGG");

        }
        public  static void printH(){
            System.out.println();
            System.out.println("H   H");
            System.out.println("H   H");
            System.out.println("HHHHH");
            System.out.println("H   H");
            System.out.println("H   H");

        }
    public static void printI(){
            System.out.println();
            System.out.println("IIIII");
            System.out.println("I   I");
            System.out.println("IIIII");
            System.out.println("I   I");
            System.out.println("IIIII");

        }
    public static void printJ(){
            System.out.println();
            System.out.println("    J");
            System.out.println("    J");
            System.out.println("    J");
            System.out.println("J   J");
            System.out.println(" JJJ ");

        }
    public static void printK(){
            System.out.println();
            System.out.println("K    ");
            System.out.println("K K  ");
            System.out.println("K    ");
            System.out.println("K K  ");
            System.out.println("K   K");

        }

    public static void printL(){
            System.out.println();
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("L    ");
            System.out.println("LLLLL");

        }
    public static void printM(){
            System.out.println();
            System.out.println("M   M");
            System.out.println("MM MM");
            System.out.println("M M M");
            System.out.println("M    M");
            System.out.println("M    M");

        }
    public static void printN(){
            System.out.println();
            System.out.println("N   N");
            System.out.println("NN  N");
            System.out.println("N N N");
            System.out.println("N  NN");
            System.out.println("N  NN");

        }
    public static void printO(){
            System.out.println();
            System.out.println(" OOO ");
            System.out.println(" O O ");
            System.out.println(" O O ");
            System.out.println(" O O ");
            System.out.println(" OOO ");

        }
    public static void printP(){
            System.out.println();
            System.out.println("PPPPP");
            System.out.println("P   P");
            System.out.println("PP   ");
            System.out.println("P    ");
            System.out.println("P    ");

        }
    public static void printQ(){
            System.out.println();
            System.out.println(" QQQ ");
            System.out.println(" Q Q ");
            System.out.println(" QQQ ");
            System.out.println(" Q QQ");
            System.out.println(" QQQQ");

        }
    public static void printR(){
            System.out.println();
            System.out.println("RRRRR");
            System.out.println("R   R");
            System.out.println("RR   ");
            System.out.println("R  R ");
            System.out.println("R   R");

        }
    public static void printS(){
            System.out.println();
            System.out.println("  SSS");
            System.out.println(" S   ");
            System.out.println("  S  ");
            System.out.println("   S ");
            System.out.println(" SSS ");

        }
    public static void printT(){
            System.out.println();
            System.out.println("TTTTT");
            System.out.println("  T  ");
            System.out.println("  T  ");
            System.out.println("  T  ");
            System.out.println("  T  ");

        }
    public static void printU(){
            System.out.println();
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println("U   U");
            System.out.println(" UUU ");

        }
    public static void printV(){
            System.out.println();
            System.out.println("V   V");
            System.out.println(" V V ");
            System.out.println("  V  ");
            System.out.println("  V  ");
            System.out.println("  V  ");

        }
    public static void printW(){
            System.out.println();
            System.out.println("W    W");
            System.out.println("WW WW");
            System.out.println("W W W");
            System.out.println("W W W");
            System.out.println("W W W");

        }
    public static void printX(){
            System.out.println();
            System.out.println("X   X");
            System.out.println(" X X ");
            System.out.println("  X  ");
            System.out.println(" X X ");
            System.out.println("X   X");

        }
    public static void printY(){
            System.out.println();
            System.out.println("Y   Y");
            System.out.println(" Y  Y ");
            System.out.println("  Y  ");
            System.out.println("  Y  ");
            System.out.println("  Y  ");

        }
    public static void printZ(){
            System.out.println();
            System.out.println("ZZZZZ");
            System.out.println("   Z ");
            System.out.println("  Z  ");
            System.out.println(" Z   ");
            System.out.println("ZZZZZ");

        }



}

package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scan = new Scanner(System.in);
        double Nummer = 0;
        double HigherNum = 0;
        int i = 1;
        do {
            System.out.print("Number " + i + ": ");
            Nummer = scan.nextDouble();
            i++;
            if (Nummer > HigherNum) {
                HigherNum = Nummer;
            } else if (Nummer <= 0 && HigherNum == 0) {
                System.out.println("No number entered.");
                return;
            }
        } while (Nummer > 0);
        System.out.printf("The largest number is %.2f" + System.lineSeparator(), HigherNum);
    }

    //todo Task 2
    public void stairs() {
        Scanner scan = new Scanner(System.in);
        int Zeilen = 0;
        int Nummer = 1;
        System.out.print("n: ");
        Zeilen = scan.nextInt();
        if (Zeilen > 0) {
            for (int i = 1; i < (Zeilen + 1); i++) {
                //System.out.print(Nummer + " ");
                for (int j = 1; j < (i + 1); j++) {
                    System.out.print(Nummer + " ");
                    Nummer++;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid() {
        final int ROWS = 6;
        int k = 0;
        for (int i = 1; i < (ROWS + 1); i++, k = 0) {
            for (int j = 1; j < ((ROWS + 1 - i)); j++) {
                System.out.print(" ");
            }
            for (; k != 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() { //Pyramide einmal nach oben einmal nach unten
        Scanner scan = new Scanner(System.in);
        int k = 0;
        int l = 0;
        System.out.print("h: ");
        int h = scan.nextInt();
        int rows = h/2; // Haelfte oben Haelfte unten
        System.out.print("c: ");
        int c = scan.next().charAt(0);
        if((h%2) != 0){
            for (int i = 1; i < rows+2; i++, k = 0) {
                for (int j = 1; j < ((rows + 2 - i)); j++) {
                    System.out.print(" ");
                }
                int zeichen = i * 2 - 1;
                l = zeichen/2 * (-1);
                for (;k != 2 * i - 1; k++) {
                    System.out.print(""+(char) (c-Math.abs(l))); //Math.abs damit l nicht negativ wird
                    l++;
                }
                System.out.println("");
            }

            rows = 1;
            int m = 1;
            for(int i = 1; i < ((h/2)+1); i++){
                for (int z = 0; m>=(rows) && z < m; z++){
                    System.out.print(" ");
                }
                m++;
                int zeichen = h - rows*2;
                l = zeichen/2 * (-1);
                for (int x = zeichen ; x<=zeichen && x != 0; x--) {
                    System.out.print(""+(char) (c-Math.abs(l)));
                    l++;
                }
                rows++;
                System.out.print("\n");
            }
        }
        else{
            System.out.println("Invalid number!");
        }
}

    //todo Task 5
    public void marks(){
        Scanner scan = new Scanner(System.in);
        int Note = 0;
        int NotenAddiert = 0;
        int i = 1;
        int fuenfer = 0;
        double average = 0.0;
        do{
            System.out.print("Mark " + i + ": ");
            Note = scan.nextInt();
            if(Note < 0 || Note > 5){
                System.out.println("Invalid mark!");
            }
            else if(Note == 5){
                i++;
                fuenfer++;
                NotenAddiert += Note;
            }
            else{
                i++;
                NotenAddiert += Note;
            }
        }while(Note != 0);

        if(NotenAddiert == 0){
            average = 0.00;
        }

        else{
            average = ((double)NotenAddiert)/((double)(i-2));
        }
        System.out.printf("Average: %.2f" + System.lineSeparator(), average); // -2 weil er zaehlt die erste und letzte mit
        System.out.println("Negative marks: " + fuenfer);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scan = new Scanner(System.in);
        int nummer = 0;
        int iteration = 0;
        int temp = 0;
      //  int kontrolle = 0;
      //  int speicher = 0;
        int i = 1;
        System.out.print("n: ");
        nummer = scan.nextInt();
     //   speicher = nummer;
        for(;;) {
            while (nummer > 0) {
                // nummer = speicher;
                iteration = nummer % 10;
                temp += (iteration * iteration);
                nummer /= 10;
            }
            nummer = temp;
            temp = 0;
            if(nummer == 1){
                System.out.println("Happy number!");
                break;
            }
            else if(nummer == 4){
                System.out.println("Sad number!");
                break;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        //exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        //exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
       // exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        //exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        //exercise2.happyNumbers();
    }
}
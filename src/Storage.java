import java.util.*;

public class Storage {
    Scanner scan = new Scanner(System.in);

    //sign array
    public static char[][] store;

    //set all values in the array to '-'
    public static void storageIni() {
        store = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                store[i][j] = '-';
            }
        }
    }

    //test and change the value in the array which the user inputs to 'x'
    public void input() {

        int a = scan.nextInt();
        int b = scan.nextInt();
        if ((a >= 1 && a < 3) && (b >= 1 && b <= 3)) {
            if (store[a - 1][b - 1] == 'x' || store[a - 1][b - 1] == 'o') {
                System.out.println("Try another field!");
                input();
            } else {
                store[a - 1][b - 1] = 'x';
            }
        }else{
            System.out.println("The value for each number must be between 1 and 3! Please try again!");
            input();
        }
    }

    //change the value in the array which the pc inputs to 'o'
    public void inputPc() {
        int a = 1 + (int) (Math.random() * ((3 - 1) + 1));
        int b = 1 + (int) (Math.random() * ((3 - 1) + 1));

        if (store[a - 1][b - 1] == 'x' || store[a - 1][b - 1] == 'o') {
            System.out.println("Try another field!");
            inputPc();
        } else {
            store[a - 1][b - 1] = 'o';
        }
    }
}
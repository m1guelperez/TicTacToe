import java.util.*;

public class Main {
    public static void main(String[] args) {

        Storage save = new Storage();
        Draw draw = new Draw();

        draw.drawIni();
        while(Winner.end) {
            System.out.println("Zahlen eingeben: ");

            //Check if the board is full via boolean true means not full and false means full
            if(Winner.checkArray()==false){
                System.out.println("The board is full, try again!");
                break;
            }
            save.input();
            draw.draw();
            Winner.testAll();
            if(Winner.checkArray()==false) {
                System.out.println("The board is full, try again!");
                break;
            }
            save.inputPc();
            draw.draw();
            Winner.testAll();
        }
    }
}

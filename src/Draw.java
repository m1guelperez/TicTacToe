public class Draw {

    //Initialize array and start board
    public void drawIni() {
        Storage.storageIni();
        for (int i = 0; i < 3; i++) {
            System.out.println(" ----- ----- -----");
            for (int j = 0; j < 3; j++) {
                System.out.print("|  " + Storage.store[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println(" ----- ----- -----");
    }

    //Draw the field with the updated array values entries!
    public void draw() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" ----- ----- -----");
            for (int j = 0; j < 3; j++) {
                System.out.print("|  " + Storage.store[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println(" ----- ----- -----");
    }
}

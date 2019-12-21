public class Winner {


    static boolean end = true; //used in the main method for the while loop

    public static void winLine() {
        for (int i = 0; i < 3; i++) {
            int winVariable = 0;
            for (int j = 0; j < 3; j++) {
                if (Storage.store[i][j] == 'x') {
                    winVariable++;
                    if (winVariable == 3) {
                        System.out.println("Player won!");
                        end = false;
                        break;
                    }
                } else if (Storage.store[i][j] == 'o') {
                    winVariable--;
                    if (winVariable == -3) {
                        System.out.println("Pc won!");
                        end = false;
                        break;
                    }
                }
            }
        }
    }

    public static void winColumn() {
        for (int j = 0; j < 3; j++) {
            int winVariable = 0;
            for (int i = 0; i < 3; i++) {
                if (Storage.store[i][j] == 'x') {
                    winVariable++;
                    if (winVariable == 3) {
                        System.out.println("Player won!");
                        end = false;
                        break;
                    }
                } else if (Storage.store[i][j] == 'o') {
                    winVariable--;
                    if (winVariable == -3) {
                        System.out.println("Pc won!");
                        end = false;
                        break;
                    }
                }
            }
        }
    }

    //Entry [0][0] till [2][2] diagonal
    public static void winDiagonal1() {
        int winVariable = 0;
        for (int i = 0; i < 3; i++) {
            if (Storage.store[i][i] == 'x') {
                winVariable++;
                if (winVariable == 3) {
                    System.out.println("Player won!");
                    end = false;
                    break;
                }
            } else if (Storage.store[i][i] == 'o') {
                winVariable--;
                if (winVariable == -3) {
                    System.out.println("Pc won!");
                    end = false;
                    break;
                }
            }
        }
    }

    //Entry [2][1] till [1][2] diagonal
    public static void winDiagonal2() {
        int winVariable = 0;
        for (int i = 0; i < 3; i++) {
            if (Storage.store[i][2 - i] == 'x') {
                winVariable++;
                if (winVariable == 3) {
                    System.out.println("Player won!");
                    end = false;
                    break;
                }
            } else if (Storage.store[i][2 - i] == 'o') {
                winVariable--;
                if (winVariable == -3) {
                    System.out.println("Pc won!");
                    end = false;
                    break;
                }
            }
        }
    }

    //Check if the board is full via boolean true means not full and false means full

    public static boolean checkArray() {
        int boardFull = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Storage.store[i][j] != '-') {
                    boardFull++;
                    if (boardFull == 9) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void testAll(){
        winLine();
        winColumn();
        winDiagonal1();
        winDiagonal2();
    }
}
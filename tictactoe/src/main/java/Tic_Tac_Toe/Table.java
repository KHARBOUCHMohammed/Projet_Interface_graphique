package Tic_Tac_Toe;


import java.util.ArrayList;
import java.util.List;

public class Table {
    List<Joueur> Players= new ArrayList<Joueur>();
    int[][] matrixGamge = new int[3][3];
    public int movesCounter = 0;//
    public Boolean finish=false;

    public Table(ArrayList<Joueur> players) {
        super();
        this.Players = players;

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                this.matrixGamge[i][j]=0;
            }
        }

    }

    public List<Joueur> getPlayers() {
        return Players;
    }

    public void setPlayers(List<Joueur> players) {
        Players = players;
    }

    public int[][] getMatrixGamge() {
        return matrixGamge;
    }

    public void setMatrixGamge(int[][] matrixGamge) {
        this.matrixGamge = matrixGamge;
    }

    public int getMovesCounter() {
        return movesCounter;
    }

    public void setMovesCounter(int movesCounter) {
        this.movesCounter = movesCounter;
    }

    public void setChoice(Integer field, int value) {
        Integer matrixValue = null;
        if (value == 1) {
            matrixValue = -1;
        } else if (value == 0) {
            matrixValue = 1;
        }
        matrixGamge[field % 3][field / 3] = matrixValue;
        movesCounter++;
    }

    public boolean checkBoard() {
        int sumDiagonal1 = 0;
        int sumDiagonalInvers = 0;
        int sumColumns = 0;
        int sumRows = 0;

        for (int i = 0; i < 3; i++) {
            sumDiagonal1 += matrixGamge[i][i];
        }
        for (int i = 0; i < 3; i++) {
            sumDiagonalInvers += matrixGamge[i][2 - i];
        }
        if (Math.abs(sumDiagonal1) == 3 || Math.abs(sumDiagonalInvers) == 3) {
            return true;
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <= 2; j++) {
                sumColumns += matrixGamge[j][i];
                sumRows += matrixGamge[i][j];

            }
            if (Math.abs(sumColumns) == 3 || Math.abs(sumRows) == 3) {
                return true;
            } else {
                sumColumns = 0;
                sumRows = 0;
            }
        }
        return false;
    }
}

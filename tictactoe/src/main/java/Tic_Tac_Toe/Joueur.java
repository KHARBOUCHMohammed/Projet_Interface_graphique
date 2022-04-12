package Tic_Tac_Toe;

public class Joueur
{

    private int id;
    private String Name;
    private Boolean ai=false;
    private Boolean winner=false;
    public Boolean myTour=false;
    private int sign;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Boolean getAi() {
        return ai;
    }
    public void setAi(Boolean ai) {
        this.ai = ai;
    }
    public Boolean getWin() {
        return winner;
    }
    public void setWinner(Boolean winner) {
        this.winner = winner;
    }
    public int getSign() {
        return sign;
    }
    public void setSign(int symbole) {
        this.sign = symbole;
    }

}

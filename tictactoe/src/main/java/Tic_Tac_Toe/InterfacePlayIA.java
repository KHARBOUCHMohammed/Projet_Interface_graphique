package Tic_Tac_Toe;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterfacePlayIA {


    @FXML
    private Button quitte;
    @FXML
    private Button retou;
    @FXML
    private Button rejoue;


    Table Table;
    Main gameScene ;
    Table game;
    int parg;

    private Button play ;


    @FXML
    private Label joueur1;

    @FXML
    private TextField partieG,time;

    @FXML
    private Button btn1 ;
    @FXML
    private Button btn2 ;
    @FXML
    private Button btn3 ;
    @FXML
    private Button btn4 ;
    @FXML
    private Button btn5 ;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7 ;
    @FXML
    private Button btn8 ;
    @FXML
    private Button btn9 ;


    @FXML
    private ImageView imageview1 ;
    @FXML
    private ImageView imageview2 ;


    ArrayList<Button> liste = new ArrayList<Button>();


    double[] inputs;
    double[] output;

    boolean[] visited=new boolean[9];

    int indice=0;

    Double[] outputTrie = new Double[9];





    public void initialize(){

//        imageview1.getStyleClass().add("imageviewiconM");
//        imageview2.getStyleClass().add("imageviewiconR");
        joueur1.setText(NamePlayerForAI.NomJoueur1);
        liste.add(btn1);
        liste.add(btn2);
        liste.add(btn3);
        liste.add(btn4);
        liste.add(btn5);
        liste.add(btn6);
        liste.add(btn7);
        liste.add(btn8);
        liste.add(btn9);

        for(int i=0;i<9;i++){
            visited[i]=false;
        }

        Joueur humain1= new Joueur();
        Joueur computer=new Joueur();
        humain1.setSign(1);
        computer.setSign(0);
        humain1.myTour=true;
        ArrayList<Joueur> players = new ArrayList<Joueur>(2);
        players.add(humain1);
        players.add(computer);
        game = new Table(players);

        game.finish=false;

        inputs = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        output = PremiereInterface.m.forwardPropagation(inputs);

        for (int i=0; i < output.length; i++) {
            outputTrie[i] = output[i];
        }
        Arrays.sort(outputTrie, Collections.reverseOrder());

        System.out.println("Tableau trié\n");
        for (double entier : outputTrie) {
            System.out.println("nombre: " + entier);
        }



    }
    public void jouer(ActionEvent actionEvent) throws IOException {
        Button btn  = (Button) actionEvent.getSource();
        if(game.finish!=true) {
            btn.setText("X");
            btn.setDisable(true);
            btn.setStyle("-fx-font: 50 arial;-fx-text-fill: red;");
            visited[Integer.parseInt(btn.getId())-1]=true;
            if(visited[indice] && indice<outputTrie.length){
                for(int i=0;i<output.length;i++){
                    if(!visited[i]){
                        indice=i;
                    }
                }
            }
            if(!visited[indice]){
                for(Button btn0 :liste){
                    if((Integer.parseInt(btn0.getId())-1)==indice){
                        btn0.setText("O");
                        btn0.setDisable(true);
                        btn0.setStyle("-fx-font: 50 arial;-fx-text-fill: green;");
                        visited[indice]=true;

                    }
                }


            }
            if (game.checkBoard() == true) {

                game.finish = true;
                parg++;

            }

            String b1 = btn1.getText();
            String b2 = btn2.getText();
            String b3 = btn3.getText();

            String b4 = btn4.getText();
            String b5 = btn5.getText();
            String b6 = btn6.getText();

            String b7 = btn7.getText();
            String b8 = btn8.getText();
            String b9 = btn9.getText();

            if(b6.equals("X") && b8.equals("X") && b7.equals("X")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("##36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();

            }

            if(b9.equals("X") && b1.equals("X") && b4.equals("X")) {
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("##36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();
            }

            if(b5.equals("X") && b2.equals("X") && b3.equals("X")) {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;

                reussite();
            }

            if(b6.equals("X") && b1.equals("X") && b3.equals("X")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();
            }

            if(b5.equals("X") && b1.equals("X") && b7.equals("X")) {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();
            }
            if(b6.equals("X") && b9.equals("X") && b5.equals("X")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();
            }


            if(b8.equals("X") && b1.equals("X") && b2.equals("X")) {
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();
            }

            if(b7.equals("X") && b4.equals("X") && b3.equals("X")) {
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("##36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayerForAI.NomJoueur1;
                reussite();
            }
            // Computer O CODING


            if(b6.equals("O") && b8.equals("O") && b7.equals("O")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();

            }

            if(b9.equals("O") && b1.equals("O") && b4.equals("O")) {
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }

            if(b5.equals("O") && b2.equals("O") && b3.equals("O")) {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }

            if(b6.equals("O") && b9.equals("O") && b5.equals("O")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }

            if(b8.equals("O") && b1.equals("O") && b2.equals("O")) {
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }
            if(b7.equals("O") && b4.equals("O") && b3.equals("O")) {
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }


            if(b6.equals("O") && b1.equals("O") && b3.equals("O")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }

            if(b5.equals("O") && b1.equals("O") && b7.equals("O")) {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win="Computer";
                reussite();
            }

        }

    }
    public void reussite() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("reussite.fxml"));
        Stage stage = new Stage();
        stage.setTitle("");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);




    }


    public void rejouer(ActionEvent actionEvent) throws IOException {
//        URL url = new File("InterfacePlayIA.fxml").toURI().toURL();
//        Parent view2 = FXMLLoader.load(url);
//
//        Scene scene2 = new Scene(view2);
//
//        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//        window.setScene(scene2);
//        window.setTitle("Morpion");
//
//        window.show();
//        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();


//        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlayIA.fxml"));
//        Stage stage = new Stage();
//        stage.setTitle("playing IA");
//        Scene scene=new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//        stage.setResizable(false);

        Parent root= FXMLLoader.load(getClass().getResource("InterfacePlayIA.fxml"));
        Stage window=(Stage) rejoue.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }





    public void retour(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        Stage window=(Stage) retou.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));

    }



}


package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
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

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;

import Tic_Tac_Toe.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;





public class InterfacePlay {




//    Table Table;
//    HelloApplication gameScene ;
//    Table game;
//    int parg;
//
//    private Button play ;
//
//
//    @FXML
//    private TextField partieG,time;
//    @FXML
//    private Button btn1 ;
//    @FXML
//    private Button btn2 ;
//    @FXML
//    private Button btn3 ;
//    @FXML
//    private Button btn4 ;
//    @FXML
//    private Button btn5 ;
//    @FXML
//    private Button btn6;
//    @FXML
//    private Button btn7 ;
//    @FXML
//    private Button btn8 ;
//    @FXML
//    private Button btn9 ;
//
//    @FXML
//    private Button quiter;
//
//    private TextField pgc;
//
//    @FXML
//    Button b3,b4;
//
//    @FXML
//    Label joueur1,joueur2;
//
//    int startTime = (int) System.currentTimeMillis();
//    LocalTime time1=LocalTime.now();
//    double startTime1 = System.currentTimeMillis();
//    String duration;
//    @FXML
//    private Button rester;
//    @FXML
//    private Button Quitter;
//
//    @FXML
//    private ImageView imageview1;
//
//
//    @FXML
//    private ImageView imageview2;
//
//
//    public void initialize() throws Exception {
//
//        Joueur humain1= new Joueur();
//        Joueur humain2=new Joueur();
//        humain1.setSymbole(1);
//        humain2.setSymbole(0);
//        humain1.myTour=true;
//        ArrayList<Joueur> players = new ArrayList<Joueur>(2);
//        players.add(humain1);
//        players.add(humain2);
//        //game = new Table(players);
//        System.out.println(NamePlayer.NomJoueur1);
//        joueur1.setText(NamePlayer.NomJoueur1);
//        imageview1.getStyleClass().add("imageviewiconF");
//        imageview2.getStyleClass().add("imageviewiconM");
//    }
//
//    @FXML
//    public void quiter(ActionEvent actionEvent) throws IOException {
//        URL url = new File("src/App/vues/Alert.fxml").toURI().toURL();
//        Parent root = FXMLLoader.load(url);
//        Stage stage = new Stage();
//        stage.setTitle("Tic Tac Toe");
//        Scene scene=new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//
//
//
//
//
//    @FXML
//    void back(ActionEvent event) throws IOException {
//        ((Node)(event.getSource())).getScene().getWindow().hide();
//
//    }
//
//    @FXML
//    void rejouer(ActionEvent event) throws IOException {
//
//        URL url = new File("src/App/vues/InterfacePlay.fxml").toURI().toURL();
//        Parent view2 = FXMLLoader.load(url);
//
//        Scene scene2 = new Scene(view2);
//
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//        window.setScene(scene2);
//        window.setTitle("Morpion");
//
//        window.show();
//        ((Node)(event.getSource())).getScene().getWindow().hide();
//
//    }
//
//
//
//
//    @FXML
//    public void jouer(ActionEvent event) throws IOException {
//
//
//        Button btn  = (Button) event.getSource();

        //Gets the button clicked
//        if(game.finish!=true) {
//            if(game.getPlayers().get(0).myTour==true) {
//                btn1.setDisable(true);
//                btn.setText("X");
//                btn.setStyle("-fx-font: 50 arial;-fx-text-fill: white;");
//                game.getPlayers().get(0).myTour=false;
//                game.getPlayers().get(1).myTour=true;
//                if(game.checkBoard()==true) {
//
//                    game.finish=true;
//                    parg++;
//
//                }
//            }
//            else if(game.getPlayers().get(1).myTour==true) {
//                btn.setText("O");
//                btn.setStyle("-fx-font: 50 arial; -fx-text-fill: Black;");
//                btn.setDisable(true);
//                game.getPlayers().get(0).myTour=true;
//                game.getPlayers().get(1).myTour=false;
//                if(game.checkBoard()==true) {
//                    game.finish=true;
//
//                    parg++;

}

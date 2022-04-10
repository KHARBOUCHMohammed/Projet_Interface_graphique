package Tic_Tac_Toe;

import ai.MultiLayerPerceptron;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HelloController {

    @FXML
    private RadioButton easyCheck;

    @FXML
    private RadioButton hardCheck;

    @FXML
    private ToggleButton withFriend;

    @FXML
    private ToggleButton withComputer;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Menu menu;

    @FXML
    private Text text;

    @FXML
    private ImageView imageView;

    @FXML
    private ImageView imageView1;


    String[] difficileSplit ;

    String[] facileSplit;

    String source = "resources/config.txt";

    public static MultiLayerPerceptron m;

    public void initialize(){

        ToggleGroup group=new ToggleGroup();
        ToggleGroup group2=new ToggleGroup();
        easyCheck.setToggleGroup(group);
        hardCheck.setToggleGroup(group);

        withFriend.setToggleGroup(group2);
        withComputer.setToggleGroup(group2);

    }



    public static double lr;
    public static int h, l;

    public static double getLr() {
        return lr;
    }

    public void setLr(double lr) {
        this.lr = lr;
    }

    public static int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public static int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void onClickContinue(ActionEvent actionEvent) throws IOException {
        String fileModelEasy;
        String fileModelHard;
        int size=9;

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedReader r = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
        String facile = r.readLine();
        String difficile = r.readLine();
       if(withComputer.isSelected()){
          //  if(easyCheck.isSelected()){
                facileSplit = facile.split(":");
                double lrf = Double.parseDouble(facileSplit[2]);
                int hf = Integer.parseInt(facileSplit[1]);
                int lf= Integer.parseInt(facileSplit[3]);
                setH(hf);
                setL(lf);
                setLr(lrf);
                fileModelEasy="mlp_"+lrf+"_"+hf+"_"+lf+".srl";
                String path="resources/models/"+fileModelEasy;
                if(new File(path).exists()){
                    m=MultiLayerPerceptron.load(path);
                 //   LaunchGame();
                }else{
                    LearningIA();
                }
            }else if(withFriend.isSelected()) {

                difficileSplit = difficile.split(":");

                double lrd = Double.parseDouble(difficileSplit[2]);
                int hd = Integer.parseInt(difficileSplit[1]);
                int ld = Integer.parseInt(difficileSplit[3]);
                setH(hd);
                setLr(lrd);
                setL(ld);

                fileModelHard="mlp_"+lrd+"_"+hd+"_"+ld+".srl";
                String path="resources/models/"+fileModelHard;
                if(new File(path).exists()){
                    m=MultiLayerPerceptron.load(path);
                  //  LaunchGame();

                }else{
                    LearningIA();
                }
            }

            bis.close();

        }
//        if(withFriend.isSelected() && (hardCheck.isSelected() || easyCheck.isSelected())){
//            URL url = new File("src/App/vues/NamePlayer.fxml").toURI().toURL();
//            Parent root = FXMLLoader.load(url);
//            Stage stage = new Stage();
//            stage.setTitle("Play time");
//            Scene scene=new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//            stage.setResizable(false);
//
//        }

//    }
    public void LearningIA() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("learningIA.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Apprentissage");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }





    public void ListeModele(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListeModele.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Model's list");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public void Configuration(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("ConfigAI.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Model's list");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }


}

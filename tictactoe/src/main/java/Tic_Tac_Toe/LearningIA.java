package Tic_Tac_Toe;
//
//import ai.Coup;
//import ai.MultiLayerPerceptron;
//import ai.SigmoidalTransferFunction;
//import ai.Test;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.concurrent.Task;
//import javafx.concurrent.WorkerStateEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.ProgressBar;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.HashMap;
//import static Tic_Tac_Toe.HelloController.*;
//
//public class LearningIA {
//
//    @FXML
//    public TextField textField;
//
//    @FXML
//    public ProgressBar progressBar;
//
//
//    private Task<Double> task;
//    public static Thread thread;
//    static int l=2, h=4;
//    static double lr=0.3; //lr=learning rate
//
//
//
//    int epochs;
//    MultiLayerPerceptron net;
//
//    @FXML
//    public void initialize() throws InterruptedException, IOException{
//        try {
//            System.out.println();
//            System.out.println("START TRAINING ...");
//            System.out.println();
//            int size=9;
//            //
//            //            int[] layers = new int[]{ size, 128, 128, size };
//
//            int[] layers = new int[l+2];/*----------*/
//
//            layers[0] = size ;
//            for (int i = 0; i < l; i++) {
//                layers[i+1] = h ;
//            }
//            layers[layers.length-1] = size ;
//            //
//            double error = 0.0 ;
//            this.net = new MultiLayerPerceptron(layers, lr, new SigmoidalTransferFunction());
//            this.epochs = 1000000;
//            System.out.println("---");
//            System.out.println("Load data ...");
//            HashMap<Integer, Coup> mapTrain = Test.loadCoupsFromFile("./resources/train_dev_test/train.txt");
//            HashMap<Integer, Coup> mapDev = Test.loadCoupsFromFile("./resources/train_dev_test/dev.txt");
//            HashMap<Integer, Coup> mapTest = Test.loadCoupsFromFile("./resources/train_dev_test/test.txt");
//            System.out.println("---");
//
//            //Intialiser les progress Bars
//            progressBar.progressProperty().unbind();
//            progressBar.setProgress(0);
//
//
//            //Création de la tâche et sa liaison avec la progress Bar
//            task=getTask(mapTrain);
//
//            progressBar.progressProperty().bind(task.progressProperty());
//
//
//            //Ecouteur
//            task.messageProperty().addListener(new ChangeListener<String>() {
//                @Override
//                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
//                    textField.setText(t1);
//                }
//            });
//
//
//            //TRAINING ...
//            task.setOnFailed(e -> { System.out.println("task failed"); });
//            task.setOnSucceeded(e -> { System.out.println("task succeeded");
//
//                Parent root = null;
//                try {
//                    root = FXMLLoader.load(getClass().getResource("StartGameIA.fxml"));
//                } catch (IOException e1) {
//                    // TODO Auto-generated catch block
//                    e1.printStackTrace();
//                }
//                Stage stage=new Stage();
//                stage.setTitle("Jouer contre l'IA");
//                stage.setScene(new Scene(root));
//                stage.setResizable(false);
//                stage.show();
//
//            });
//            System.out.println("Learning completed!");
//
//            //return net ;
//            thread=new Thread(this.task);
//            thread.start();
//            //Save
//            net.save("resources/models/"+"mlp_"+lr+"_"+h+"_"+l+".srl");
//            net.save("resources/models/"+"mlp_"+lr+"_"+h+"_"+l+".srl");
//        }
//        catch (Exception e) {
//            System.out.println("Test.learn()");
//            e.printStackTrace();
//            System.exit(-1);
//        }
//
//        //return null ;
//    }
//
//
//    private Task<Double> getTask(HashMap<Integer, Coup> mapTrain) {
//        return new Task<Double>() {
//            @Override
//            protected Double call() throws Exception {
//                double error = 0.0;
//                System.out.println("" + (epochs / 100));
//                for (int i = 0; i < epochs; i++) {
//                    Coup c = null;
//                    while (c == null)
//                        c = mapTrain.get((int) (Math.round(Math.random() * mapTrain.size())));
//                    error += net.backPropagate(c.in, c.out);
//                    if (i % (epochs / 100) == 0) {
//                        System.out.println("Error at step " + i + " is " + (error / (double) i));
//                        updateMessage("Error at step " + i + " is " + (error / (double) i));
//                    }
//                    updateProgress(i,epochs);
//
//                }
//                error /= epochs;
//                if (epochs < 0){
//                    updateMessage("Error is " + error);
//                }
//                return error;
//            }
//        };
//    }
//
//
//
//
//}





import ai.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static Tic_Tac_Toe.PremiereInterface.*;

public class LearningIA {



    @FXML
    public TextField textField;

    @FXML
    public ProgressBar progressBar;


    private Task<Double> task;
    MultiLayerPerceptron net;
    int epochs;
    public static Thread thread;
    URL url = null;

    @FXML
    public void initialize() throws InterruptedException, IOException {

        try {

            int size = 9;


            int[] layers = new int[getL()+2];
            layers[0]=size;
            for (int i=0;i<getL();i++){
                layers[i+1]=getH();
            }
            layers[layers.length-1]=size;
            //
            double error = 0.0;
            this.net = new MultiLayerPerceptron(layers, getLr(), new SigmoidalTransferFunction());
            this.epochs = 10000;


            HashMap<Integer, Coup> mapTrain = Test.loadCoupsFromFile("./resources/train_dev_test/train.txt");


            HashMap<Integer, Coup> mapDev = Test.loadCoupsFromFile("./resources/train_dev_test/dev.txt");


            HashMap<Integer, Coup> mapTest = Test.loadCoupsFromFile("./resources/train_dev_test/test.txt");


            progressBar.progressProperty().unbind();
            progressBar.setProgress(0);

            task=getTask(mapTrain);

            progressBar.progressProperty().bind(task.progressProperty());



            task.messageProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    textField.setText(t1);
                }
            });
            task.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
                @Override
                public void handle(WorkerStateEvent workerStateEvent) {

                    textField.getScene().getWindow().hide();


                }
            });

            thread=new Thread(this.task);
            thread.start();
            String file="mlp_"+getLr()+"_"+getH()+"_"+getL()+".srl";
            net.save("resources/models/"+file);


        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
            System.exit(-1);
        }




    }

    public Task<Double> getTask(HashMap<Integer, Coup> mapTrain) {
        return new Task<Double>() {
            @Override
            protected Double call() throws Exception {

                double error = 0.0;
                int unPour = epochs / 100;
                System.out.println("" + unPour);

                for (int i = 0; i < epochs; i++) {
                    Coup c = null;
                    while (c == null)
                        c = mapTrain.get((int) (Math.round(Math.random() * mapTrain.size())));

                    error += net.backPropagate(c.in, c.out);

                    if (i % unPour == 0) {

                        System.out.println("Error at step " + i + " is " + (error / (double) i));
                        updateMessage("Error at step " + i + " is " + (error / (double) i));
                    }
                    updateProgress(i,epochs);
                }


                error /= epochs;
                if (epochs < 0){
                    updateMessage("Error is " + error);
                }
                return error;
            }

        };
    }


}
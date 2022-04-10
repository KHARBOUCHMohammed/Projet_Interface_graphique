package Tic_Tac_Toe;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.File;

public class ListeModele {

    private SimpleStringProperty liste;
    public int filecount = 0;
    public int dircount = 0;
    private Boolean recursivePath = false;

    @FXML
    public ListView<String> tabl;

    @FXML
    public Button b2;



    public void initialize() {

        b2.setDisable(true);
        tabl.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                b2.setDisable(false);

            }

        });
        String dir= "resources/models";
        File file = new File(dir);
        File[] files = file.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory() == true) {
                    this.dircount++;
                } else {

                    ObservableList<String> items = tabl.getItems();
                    String a=files[i].getName();
                    items.add(a);
                    this.filecount++;

                }



            }
        }
    }




    public void SupprimerModels(ActionEvent event) {
        int index = tabl.getSelectionModel().getSelectedIndex();
        String a=tabl.getItems().get(index);

        File file2 = new File("resources/models/"+a);
        tabl.getItems().removeAll(tabl.getSelectionModel().getSelectedItems());
        if(file2.delete()){
            System.out.println(file2.getName() + " est supprimé.");
        }else{
            System.out.println("Opération de suppression echouée");
        }

    }



}
package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;

   @FXML
   private ListView<String> listMessages;

   @FXML
   private ListView<String> listContacts;

   @FXML
   public void addText(){
        String word = textField.getText ();
        listMessages.getItems().add(word);
        textField.setText ("");
   }

   ObservableList<String> myContacts = FXCollections.observableArrayList ("Мария", "Петр", "Виктор", "Ирина");
   @FXML
   public void initialize (){
       listContacts.setItems (myContacts);
       textField.setText ("Введите сообщение");

   }











//
//
//

//    @FXML
//    public void init2 (){
//   textField.setText ("Hello");
//    }


//    @FXML
//    public void addText(ActionEvent event){
//        System.out.println (1);
////        String word = textField.getText ();
////        if (word.isEmpty ()) {
////            listView.getItems().add(word);
////        }
////        textField.setText ("");
//    }




}

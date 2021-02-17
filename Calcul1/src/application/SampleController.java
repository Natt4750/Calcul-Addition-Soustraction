package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField txt2;

    @FXML
    private Button btna;

    @FXML
    private Button btns;

    @FXML
    private TextField txt1;

    @FXML
    private Label lbl1;

    int N1;
    int N2;
    int result;
    int result2;

    
    //operations 
    @FXML
    void Addition()
    {
            try
                {
            N1 = Integer.parseInt(txt1.getText());
            N2 = Integer.parseInt(txt2.getText());
                } catch (NumberFormatException e)
                {
                    Alert alert=new Alert(AlertType.ERROR);
                    alert.setHeaderText("Attention - Erreur");
                    alert.setTitle("Erreur");
                    alert.setContentText("Tu dois ecrire un nombre");
                    alert.show();
                }
            result = N1 + N2;
            lbl1.setText(Integer.toString(result));
    }

    @FXML
    void Soustraction()
    {
            try
                {
            N1 = Integer.parseInt(txt1.getText());
            N2 = Integer.parseInt(txt2.getText());
                } catch (NumberFormatException e)
                {
                    Alert alert=new Alert(AlertType.ERROR);
                    alert.setHeaderText("Attention - Erreur");
                    alert.setTitle("Erreur");
                    alert.setContentText("Tu dois ecrire un nombre");
                    alert.show();
                }
            result2 = N1 - N2;
            lbl1.setText(Integer.toString(result2));

    }




}
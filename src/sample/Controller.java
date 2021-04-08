package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class Controller {
    public TextField tekst;
    public Label promjena;
    public Label broj;

    int sumaCifara(int n){
        int x;
        int y=0;
      while(n>0){
          x=n%10;
          n=n/10;
          y=y+x;
          x=0;
      }
      return y;
    };

    public void ok(ActionEvent actionEvent) {
        int n;
        if(tekst.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Upozorenje");
            alert.setHeaderText(null);
            alert.setContentText("Morate unijeti broj!");

            alert.showAndWait();
        }
            if(tekst.getText().matches("[a-zA-Z]+")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Upozorenje");
                alert.setHeaderText(null);
                alert.setContentText("Morate unijeti broj!");

                alert.showAndWait();
            } else {
                int[] niz = new int[500];
                n= Integer.parseInt(tekst.getText());
                int j=0;
                for(int i=1; i<=n;i++){
                    if(i%sumaCifara(i)==0) {
                        niz[i] = i;
                        j++;
                    }
                }
                /*promjena.setText("Brojevi koji su djeljiviv sa sumom svojih cifara su: ");*/
                String tekst = "";
                for(int i=0;i<n;i++){
                    if(niz[i]!=0)
                        tekst=tekst+" "+niz[i];
                    broj.setText(String.valueOf(tekst));
                    promjena.setText("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
                }

            }

    }
}

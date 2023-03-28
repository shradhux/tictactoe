package morpion.morpion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Jeu {

    @FXML
    private Button btnAA;

    @FXML
    private Button btnAB;

    @FXML
    private Button btnAC;

    @FXML
    private Button btnBA;

    @FXML
    private Button btnBB;

    @FXML
    private Button btnBC;

    @FXML
    private Button btnCA;

    @FXML
    private Button btnCB;

    @FXML
    private Button btnCC;

    @FXML
    private Label joueurCourant;

    private String joueur1;

    private String joueur2;

    private int compteur;

    public Jeu(String j1, String j2) {
        this.joueur1 = j1;
        this.joueur2 = j2;
        this.compteur = 0;


    }


    @FXML
    void placerDans(ActionEvent event) {
        Button maSource = (Button) event.getSource();


        if (this.compteur % 2 == 0) {

            this.joueurCourant.setText(joueur1);
            maSource.setText("X");
        } else {
            maSource.setText("O");
            this.joueurCourant.setText(joueur2);
        }

        compteur++;

try {


        if (
            // Les lignes
                (this.btnAA.getText().equals("X") && this.btnAB.getText().equals("X") && this.btnAC.getText().equals("X"))
                        || (this.btnBA.getText().equals("X") && this.btnBB.getText().equals("X") && this.btnBC.getText().equals("X"))
                        || (this.btnCA.getText().equals("X") && this.btnCB.getText().equals("X") && this.btnCC.getText().equals("X"))
                        || (this.btnAA.getText().equals("X") && this.btnBA.getText().equals("X") && this.btnCA.getText().equals("X"))
                        || (this.btnAB.getText().equals("X") && this.btnBB.getText().equals("X") && this.btnCB.getText().equals("X"))
                        || (this.btnAC.getText().equals("X") && this.btnBC.getText().equals("X") && this.btnCC.getText().equals("X"))
                        // les diagonales
                        || (this.btnAA.getText().equals("X") && this.btnBB.getText().equals("X") && this.btnCC.getText().equals("X"))
                        || (this.btnCA.getText().equals("X") && this.btnBB.getText().equals("X") && this.btnAC.getText().equals("X"))) {


            HelloApplication.changeScene("hello-view");

        } else if (
            // Les lignes
                (this.btnAA.getText().equals("O") && this.btnAB.getText().equals("O") && this.btnAC.getText().equals("O"))
                        || (this.btnBA.getText().equals("O") && this.btnBB.getText().equals("O") && this.btnBC.getText().equals("O"))
                        || (this.btnCA.getText().equals("O") && this.btnCB.getText().equals("O") && this.btnCC.getText().equals("O"))
                        || (this.btnAA.getText().equals("O") && this.btnBA.getText().equals("O") && this.btnCA.getText().equals("O"))
                        || (this.btnAB.getText().equals("O") && this.btnBB.getText().equals("O") && this.btnCB.getText().equals("O"))
                        || (this.btnAC.getText().equals("O") && this.btnBC.getText().equals("O") && this.btnCC.getText().equals("O"))
                        // les diagonales
                        || (this.btnAA.getText().equals("O") && this.btnBB.getText().equals("O") && this.btnCC.getText().equals("O"))
                        || (this.btnCA.getText().equals("O") && this.btnBB.getText().equals("O") && this.btnAC.getText().equals("O"))) {

            HelloApplication.changeScene("hello-view");
        }
} catch (Exception e) {
    throw new RuntimeException(e);
}

    }
}

package view.management.menu.addmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddMenuPageController {

    @FXML
    private TableColumn<?, ?> ingredientsNameCol;

    @FXML
    private ComboBox<?> listOfIngredientsCb;

    @FXML
    private TextField menuNameTf;

    @FXML
    private TextField menuPriceTf;

    @FXML
    private TableColumn<?, ?> qtyCol;

    @FXML
    private TextField quantityTf;

    @FXML
    private TableView<?> table;

    @FXML
    void addOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void submitOnAction(ActionEvent event) {

    }

}

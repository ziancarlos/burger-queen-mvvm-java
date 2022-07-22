package view.management.menu.editmenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EditMenuController {

    @FXML
    private TableColumn<?, ?> gramsColl;

    @FXML
    private TableColumn<?, ?> ingredientsNameCol;

    @FXML
    private ComboBox<?> listOfIngredientsCb;

    @FXML
    private ComboBox<?> menuAvalCb;

    @FXML
    private TextField menuNameTf;

    @FXML
    private TextField menuPriceTf;

    @FXML
    private TextField quantityInGramsTf;

    @FXML
    private TableView<?> table;

    @FXML
    void addOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void editOnAction(ActionEvent event) {

    }

}

package view.management.purchasing.editpurchasing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EditPurchasingController {

    @FXML
    private ComboBox<?> ingredientsCb;

    @FXML
    private TableColumn<?, ?> ingredientsNameCol;

    @FXML
    private TableColumn<?, ?> priceCol;

    @FXML
    private TextField priceTf;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TextField restockQtyTf;

    @FXML
    private TextField supplierNameTf;

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
    void purchaseOnAction(ActionEvent event) {

    }

}

package view.customer.orderconfirmation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class OrderConfirmationPageController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button doneBtn;

    @FXML
    private TableColumn<?, ?> menuNameCol;

    @FXML
    private Text orderText;

    @FXML
    private TableColumn<?, ?> priceCol;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableView<?> table;

    @FXML
    private Text totalText;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void cancelOnAction(ActionEvent event) {

    }

}

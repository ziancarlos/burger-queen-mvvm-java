package view.customer.orderconfirmation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class OrderConfirmationController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button cancelBtn;

    @FXML
    private ListView<?> detailLv;

    @FXML
    private TextField discountCodeTf;

    @FXML
    private TableColumn<?, ?> menuNameCol;

    @FXML
    private Button orderBtn;

    @FXML
    private Text orderText;

    @FXML
    private TableColumn<?, ?> priceCol;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableView<?> table;

    @FXML
    void applyOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void cancelOnAction(ActionEvent event) {

    }

    @FXML
    void orderOnAction(ActionEvent event) {

    }

}

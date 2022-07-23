package view.management.paymentrequest.paymentrequestedit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class PaymentRequestEditController {

    @FXML
    private Text cashReceivedText;

    @FXML
    private ListView<?> detailLv;

    @FXML
    private ComboBox<?> menuCb;

    @FXML
    private TableColumn<?, ?> menuIdCol;

    @FXML
    private TableColumn<?, ?> menuNameCol;

    @FXML
    private TableColumn<?, ?> priceCol;

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
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void editOnAction(ActionEvent event) {

    }

}

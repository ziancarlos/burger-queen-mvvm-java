package view.management.paymentrequest.paymentrequestdetail;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class PaymentRequestDetailController {

    @FXML
    private Text cashReceivedText;

    @FXML
    private ListView<?> detailLv;

    @FXML
    private ComboBox<?> paymentTypeCb;

    @FXML
    private TextField recievedCashTf;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void manageOnAction(ActionEvent event) {

    }

    @FXML
    void paidOnAction(ActionEvent event) {

    }

}

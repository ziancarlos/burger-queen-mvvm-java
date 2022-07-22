package view.management.servedrequest.servedrequestdetail;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class ServedRequestDetailController {

    @FXML
    private Text informationText;

    @FXML
    private TableColumn<?, ?> menuIdCol;

    @FXML
    private TableColumn<?, ?> menuIdCol1;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void servedOnAction(ActionEvent event) {

    }

}

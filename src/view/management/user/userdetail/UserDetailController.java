package view.management.user.userdetail;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class UserDetailController {

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private Text fullNameText;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private ListView<?> lv;

    @FXML
    private TableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void detailOnAction(ActionEvent event) {

    }

}

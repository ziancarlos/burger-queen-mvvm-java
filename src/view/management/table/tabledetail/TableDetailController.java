package view.management.table.tabledetail;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class TableDetailController {

    @FXML
    private TableColumn<?, ?> customerCol;

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private ListView<?> lv;

    @FXML
    private Text tableDetail;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}

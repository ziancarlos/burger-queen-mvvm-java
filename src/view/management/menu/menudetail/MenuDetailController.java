package view.management.menu.menudetail;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class MenuDetailController {

    @FXML
    private TableColumn<?, ?> ingredientNameCol;

    @FXML
    private TableColumn<?, ?> ingredientsIdCol;

    @FXML
    private TableColumn<?, ?> ingredientsQuantity;

    @FXML
    private Text menuNameText;

    @FXML
    private TableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}

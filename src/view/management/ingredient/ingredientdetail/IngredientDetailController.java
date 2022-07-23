package view.management.ingredient.ingredientdetail;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class IngredientDetailController {

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private ListView<?> lv;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}

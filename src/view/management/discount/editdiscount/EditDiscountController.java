package view.management.discount.editdiscount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EditDiscountController {

    @FXML
    private TextField codeTf;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private ComboBox<?> valueCb;

    @FXML
    private TextField valueTf;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void editOnAction(ActionEvent event) {

    }

}

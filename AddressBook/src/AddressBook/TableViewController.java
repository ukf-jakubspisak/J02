package AddressBook;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class TableViewController {
    public TableColumn firstNameColumn;
    public TableColumn lastNameColumn;
    @FXML private TableView<Student> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;

    @FXML
    protected void addStudent(ActionEvent event) {
        ObservableList<Student> data = tableView.getItems();
        data.add(new Student(firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()
        ));

        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }


    public void removePerson() {
        Student selected = tableView.getSelectionModel().getSelectedItem();
        tableView.getItems().remove(selected);
    }
}

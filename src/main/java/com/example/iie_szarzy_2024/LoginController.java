package com.example.iie_szarzy_2024;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void loginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Tutaj można umieścić logikę weryfikacji użytkownika
        if (username.equals("admin") && password.equals("admin")) {
            // Przykładowa weryfikacja - gdy dane logowania są poprawne
            messageLabel.setText("Zalogowano pomyślnie!");
            // Tutaj można przenieść do kolejnego widoku aplikacji
        } else {
            messageLabel.setText("Błędne dane logowania.");
        }
    }
}

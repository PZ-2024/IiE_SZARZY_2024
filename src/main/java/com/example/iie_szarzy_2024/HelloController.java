package com.example.iie_szarzy_2024;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Witamy w naszej aplikacji sklepu szarych!");
    }
}
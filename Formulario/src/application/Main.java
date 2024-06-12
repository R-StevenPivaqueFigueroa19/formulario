package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear el GridPane y establecer el espacio entre elementos
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));

        // Configurar las restricciones de tamaño de las columnas
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setHgrow(Priority.NEVER);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        // Crear y agregar los controles a la cuadrícula
        Label buttonLabel = new Label("Button:");
        Button button = new Button("Button");
        grid.add(buttonLabel, 0, 0);
        grid.add(button, 1, 0);

        Label checkBoxLabel = new Label("CheckBox:");
        CheckBox checkBox = new CheckBox("CheckBox");
        grid.add(checkBoxLabel, 0, 1);
        grid.add(checkBox, 1, 1);

        Label hyperlinkLabel = new Label("Hyperlink:");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        grid.add(hyperlinkLabel, 0, 2);
        grid.add(hyperlink, 1, 2);

        Label toggleButtonLabel = new Label("ToggleButton:");
        ToggleButton toggleButton = new ToggleButton("ToggleButton");
        grid.add(toggleButtonLabel, 0, 3);
        grid.add(toggleButton, 1, 3);

        Label radioButtonLabel = new Label("RadioButton:");
        RadioButton radioButton = new RadioButton("RadioButton");
        grid.add(radioButtonLabel, 0, 4);
        grid.add(radioButton, 1, 4);

        Label labelLabel = new Label("Label:");
        Label label = new Label("Label");
        grid.add(labelLabel, 0, 5);
        grid.add(label, 1, 5);

        Label textFieldLabel = new Label("TextField:");
        TextField textField = new TextField("some text...");
        grid.add(textFieldLabel, 0, 6);
        grid.add(textField, 1, 6);

        Label passwordFieldLabel = new Label("PasswordField:");
        PasswordField passwordField = new PasswordField();
        passwordField.setText("password");
        grid.add(passwordFieldLabel, 0, 7);
        grid.add(passwordField, 1, 7);

        Label textAreaLabel = new Label("TextArea:");
        TextArea textArea = new TextArea("This is very long text that will wrap to several lines.");
        textArea.setWrapText(true);
        textArea.setPrefRowCount(3);
        grid.add(textAreaLabel, 0, 8);
        grid.add(textArea, 1, 8);

        Label progressIndicatorLabel = new Label("ProgressIndicator:");
        ProgressIndicator progressIndicator = new ProgressIndicator(0.49);
        grid.add(progressIndicatorLabel, 0, 9);
        grid.add(progressIndicator, 1, 9);

        Label progressBarLabel = new Label("ProgressBar:");
        ProgressBar progressBar = new ProgressBar(0.49);
        grid.add(progressBarLabel, 0, 10);
        grid.add(progressBar, 1, 10);

        Label sliderLabel = new Label("Slider:");
        Slider slider = new Slider(0, 100, 49);
        grid.add(sliderLabel, 0, 11);
        grid.add(slider, 1, 11);

        // Crear la escena y agregar la cuadrícula a ella
        Scene scene = new Scene(grid, 400, 500);

        // Configurar el escenario principal
        primaryStage.setTitle("formulario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


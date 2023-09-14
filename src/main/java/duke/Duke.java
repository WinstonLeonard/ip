package duke;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Duke
 */
public class Duke extends Application {
    private Ui ui;
    private Storage storage;
    private TaskList tasks;

    /**
     * @param filePath The file path of the txt document to read and write from.
     */
    public Duke(String filePath) {

    }

    /**
     * Old constructor
     */
    public Duke() {
        String filePath = "../ip/src/main/data/duke.txt";
        tasks = new TaskList();
        storage = new Storage(filePath, tasks);
        storage.startStorage();
        ui = new Ui(tasks);
    }
    public static void main(String[] args) throws EmptyDescriptionException, InvalidCommandException,
            NotANumberException {
        //Duke duke = new Duke("../ip/src/main/data/duke.txt");
    }

    /**
     * Iteration 2:
     * Creates two dialog boxes, one echoing user input and the other containing Duke's reply and then appends them to
     * the dialog container. Clears the user input after processing.
     */
    @Override
    public void start(Stage stage) {

        //Window window = new Window(stage, storage, ui);

        Window.setParameters(stage, storage, ui);

        Window.initializeWindow();

        Window.formatWindow();

        Window.addUserInput();

        Window.welcomeMessage();

    }

}

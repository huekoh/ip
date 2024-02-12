import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataManager {

    public static void DataManager() {
        try {
            String projectPath = System.getProperty("user.dir");
            java.nio.file.Path filePath = java.nio.file.Paths.get(projectPath, "src",
                    "main", "resources", "data", "bmo_data.txt");
            boolean isFileExists = java.nio.file.Files.exists(filePath);
            if (!isFileExists) {
                Files.createDirectories(filePath.getParent());
                Files.createFile(filePath);
                System.out.println("Info: Data file not found. Created a new file.");
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to load data. " + e.getMessage());
        }
    }

    public static String loadData() {
        try {
            String projectPath = System.getProperty("user.dir");
            java.nio.file.Path filePath = java.nio.file.Paths.get(projectPath, "src",
                    "main", "resources", "data", "bmo_data.txt");
            return Files.readString(filePath);
        } catch (IOException e) {
            System.out.println("Error: Unable to load data. " + e.getMessage());
        }
    }

    public static void saveData(String content) {
        try {
            String projectPath = System.getProperty("user.dir");
            Path filePath = Paths.get(projectPath, "src", "main", "resources", "data", "bmo_data.txt");

            Files.createDirectories(filePath.getParent());
            Files.write(filePath, content.getBytes());
            System.out.println("Tasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to save data. " + e.getMessage());
        }
    }
}
package UtilityPkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;
    private final String propertyFilePath = "src/test/config.properties"; // Path to your file

    public String ConfigReader(String key) {
        try (FileInputStream fis = new FileInputStream(propertyFilePath)) {
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Could not read the config file: " + e.getMessage());
        }
        return properties.getProperty(key);
    }

//    public String getPropertyValues(String key) {
//        return properties.getProperty(key);
//    }
}

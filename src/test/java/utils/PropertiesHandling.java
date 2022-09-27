package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHandling {
    static String projectPath = System.getProperty("user.dir");
    static String propertiesFilePath = "/src/test/resources/config.properties/";
    static String googleHomepageUrl;

    public static String getGoogleHomepageUrl() {
        getProperties();
        return googleHomepageUrl;
    }

    public static void getProperties() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream(projectPath + propertiesFilePath);
            properties.load(inputStream);
            googleHomepageUrl  = properties.getProperty("googleHomepageUrl");
            System.out.println(googleHomepageUrl);

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

    }
}

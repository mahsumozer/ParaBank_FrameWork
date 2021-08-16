package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

   static Properties properties;

    public static void readProperties(String filePath){
        try {
            FileInputStream fis=new FileInputStream(filePath);
            properties=new Properties();
            properties.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getPropertiesValue(String key){
       return properties.getProperty(key);

    }
}

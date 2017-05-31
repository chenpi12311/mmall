import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by cpppp on 17-5-26.
 */
public class Test {

    @org.junit.Test
    public void testProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(Test.class.getClassLoader().getResourceAsStream("mmall.properties"));
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements())
        {
            Object s = enumeration.nextElement();
            System.out.println(properties.getProperty(s.toString()));
        }

    }

}

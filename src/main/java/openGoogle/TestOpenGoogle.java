package openGoogle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestOpenGoogle {
    @Test
    public void testGoogle(){
        WebDriverManager.edgedriver().setup();
        EdgeDriver edge = new EdgeDriver();
        edge.get("https://www.google.com/");
    }
}

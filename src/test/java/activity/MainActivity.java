package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addEventButton;
    public Button searchEventButton;

    public MainActivity() {
        addEventButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Nuevo evento\"]"));
        searchEventButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Buscar\"]"));

    }

}

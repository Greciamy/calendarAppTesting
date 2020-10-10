package activity;

import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class SearchActivity {

    public TextBox searchTextEvent;
    public Label textEvent;

    public SearchActivity() {
        searchTextEvent = new TextBox(By.id("com.simplemobiletools.calendar:id/search_src_text"));
    }

    public String isFoundByText(String text) throws MalformedURLException {
        textEvent = new Label(By.xpath("//android.widget.TextView[@text='" + text + "']"));
        return textEvent.getText();
    }
}

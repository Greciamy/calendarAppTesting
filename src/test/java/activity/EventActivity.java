package activity;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class EventActivity {

    public TextBox titleEvent;
    public TextBox descriptionEvent;
    public Button allDayEvent;
    public Button reminderEventButton;
    public Button eventTypeButton;
    public Button saveEventButton;

    public EventActivity() {
        titleEvent = new TextBox(By.id("com.simplemobiletools.calendar:id/event_title"));
        descriptionEvent = new TextBox(By.id("com.simplemobiletools.calendar:id/event_description"));
        allDayEvent = new Button(By.id("com.simplemobiletools.calendar:id/event_all_day"));
        reminderEventButton = new Button(By.id("com.simplemobiletools.calendar:id/event_reminder_1"));
        eventTypeButton = new Button(By.id("com.simplemobiletools.calendar:id/event_type_color"));
        saveEventButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Guardar\"]\n"));
    }
}

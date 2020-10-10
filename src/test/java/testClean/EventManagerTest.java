package testClean;

import activity.EventActivity;
import activity.MainActivity;
import activity.SearchActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class EventManagerTest {

    @Test
    public void verifyCreateEvent() throws MalformedURLException {
        MainActivity mainActivity = new MainActivity();
        EventActivity eventActivity = new EventActivity();
        String eventName = "Special event";
        String eventDescription = "Special event";


        mainActivity.addEventButton.click();
        eventActivity.titleEvent.type(eventName);
        eventActivity.descriptionEvent.type(eventDescription);
        eventActivity.allDayEvent.click();
        eventActivity.saveEventButton.click();
        mainActivity.searchEventButton.click();
        SearchActivity searchActivity = new SearchActivity();
        searchActivity.searchTextEvent.type(eventName);
        Assert.assertEquals("Error | Tarea no encontrada ", eventName,searchActivity.isFoundByText(eventName));

    }
}

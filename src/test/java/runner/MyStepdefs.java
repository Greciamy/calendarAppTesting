package runner;

import activity.EventActivity;
import activity.MainActivity;
import activity.SearchActivity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.net.MalformedURLException;

public class MyStepdefs {

    MainActivity mainActivity = new MainActivity();
    EventActivity eventActivity = new EventActivity();

    @Given("^I have opened my calendar app$")
    public void iHaveOpenedMyCalendarApp() {
    }

    @When("^I click add button$")
    public void iClickAddButton() throws MalformedURLException {
        mainActivity.addEventButton.click();
    }

    @And("^I type '(.*)' in title textbox in calendar activity$")
    public void iTypeImportantEventInTitleTextboxInCalendarActivity(String value) throws MalformedURLException {
        eventActivity.titleEvent.type(value);
    }

    @And("^I type '(.*)' in description textbox in calendar activity$")
    public void iTypeDayIsBusyInDescriptionTextboxInCalendarActivity(String value) throws MalformedURLException {
        eventActivity.descriptionEvent.type(value);
    }

    @And("^I check the event for the all day in calendar activity$")
    public void iCheckTheEventForTheAllDayInCalendarActivity() throws MalformedURLException {
        eventActivity.allDayEvent.click();
    }

    @And("^I click on the save button in calendar activity$")
    public void iClickOnTheSaveButtonInCalendarActivity() throws MalformedURLException {
        eventActivity.saveEventButton.click();
    }

    @Then("^I search '(.*)' event to verify if it is created$")
    public void iSearchImportantEventToVerifyIfIsCreated(String eventName) throws MalformedURLException {
        mainActivity.searchEventButton.click();
        SearchActivity searchActivity = new SearchActivity();
        searchActivity.searchTextEvent.type(eventName);
        Assert.assertEquals("Error | Tarea no encontrada ", eventName,searchActivity.isFoundByText(eventName));
    }

}

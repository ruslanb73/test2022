package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")
    public WebElement searchId;

    @FindBy(css = "#cwos")
    public WebElement results;



    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void search (String text){
        searchInput.sendKeys(text, Keys.ENTER);
    }
}

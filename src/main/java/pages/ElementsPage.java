package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class ElementsPage {

    @FindBy(xpath = "//div[.='(']")
    public WebElement searchskobkaL;

    @FindBy(xpath = "//div[.='1']")
    public WebElement search1;

    @FindBy(xpath = "//div[.='+']")
    public WebElement searchplus;

    @FindBy(xpath = "//div[.='2']")
    public WebElement search2;

    @FindBy(xpath = "//div[.=')']")
    public WebElement searchskobkaP;

    @FindBy(xpath = "//div[.='×']")
    public WebElement searchsumnojenie;

    @FindBy(xpath = "//div[.='3']")
    public WebElement search3;

    @FindBy(xpath = "//div[.='−']")
    public WebElement searchminus;

    @FindBy(xpath = "//div[.='4']")
    public WebElement search4;

    @FindBy(xpath = "//div[.='0']")
    public WebElement search0;

    @FindBy(xpath = "//div[.='÷']")
    public WebElement searchdelenie;

    @FindBy(xpath = "//div[.='5']")
    public WebElement search5;

    @FindBy(xpath = "//div[.='=']")
    public WebElement searchrovno;

    @FindBy(xpath = "//div[.='6']")
    public WebElement search6;

    @FindBy(xpath = "//div[.='sin']")
    public WebElement searchsin;





    public ElementsPage(WebDriver driver) {
        initElements(driver, this);
    }
}

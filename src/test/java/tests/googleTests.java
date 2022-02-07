package tests;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.ElementsPage;
import pages.SearchPage;

import javax.swing.text.html.parser.Element;

import static org.junit.jupiter.api.Assertions.*;

public class googleTests {

   private static WebDriver driver;
   private static SearchPage searchPage;
   private static ElementsPage elementsPage;

   @BeforeAll
   public static void init(){
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("start-maximized");
      driver = new ChromeDriver(options);
      searchPage = new SearchPage(driver);
      elementsPage = new ElementsPage(driver);
   }
   @BeforeEach
   public void setup(){
      driver.get("http://google.com");
   }
@Test
@DisplayName("Проверка операций с целыми числами")
   public void test1() {
   searchPage.search("Калькулятор");
   elementsPage.searchskobkaL.click();
   elementsPage.search1.click();
   elementsPage.searchplus.click();
   elementsPage.search2.click();
   elementsPage.searchskobkaP.click();
   elementsPage.searchsumnojenie.click();
   elementsPage.search3.click();
   elementsPage.searchminus.click();
   elementsPage.search4.click();
   elementsPage.search0.click();
   elementsPage.searchdelenie.click();
   elementsPage.search5.click();
   elementsPage.searchrovno.click();
   assertAll(
           () -> assertEquals("1", searchPage.results.getText()),
           () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.searchId.getText())
);


}
@Test
@DisplayName("Проверка деления на ноль")
   public void test2() {
   searchPage.search("Калькулятор");
   elementsPage.search6.click();
   elementsPage.searchdelenie.click();
   elementsPage.search0.click();
   elementsPage.searchrovno.click();
   assertAll(
           () -> assertEquals("Infinity", searchPage.results.getText()),
           () -> assertEquals("6 ÷ 0 =", searchPage.searchId.getText())
           );
}
   @Test
   @DisplayName("Проверка ошибки при отсутствии значения")
public void test3() {
      searchPage.search("Калькулятор");
      elementsPage.searchsin.click();
      elementsPage.searchrovno.click();
      assertAll(
              () -> assertEquals("Error", searchPage.results.getText()),
              () -> assertEquals("sin() =", searchPage.searchId.getText())
      );

   }
@AfterAll
   public static void teardown() {
driver.quit();
}

}

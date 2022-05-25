package Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Booking
{
    WebDriver driver;
    WebDriverWait wait;

    public Booking(WebDriver driver) throws InterruptedException
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//A[@class='ebMYO Ra _S z _Z w o v _Y Wh k _T ddFHE'])[1]")
    WebElement hotel;
    public void clickHotelsTab()
    {
        hotel.click();
    }

    @FindBy(xpath = "//A[@class='bPaPP w z _S _F Wc Wh Q B- _G bpubK']") WebElement searchBox;
    public void clickSearchField(String country)
    {
        searchBox.sendKeys(country);
    }

    @FindBy(xpath = "//*[@id=\"typeahead_results\"]/a[1]") WebElement Swiss;
    public void selectLocation()
    {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"typeahead_results\"]/a[1]")));
        Swiss.click();
    }

    @FindBy(xpath = "//*[@id=\"PERSISTENT_TRIP_SEARCH_BAR\"]/div[1]/div/div/div[1]/button[1]/div") WebElement checkIn;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[4]") WebElement startDate;
    public void selectStartDate()
    {
        startDate.click();
    }
    //@FindBy(css = "body#BODY_BLOCK_JQUERY_REFLOW div:nth-child(1) > div.nZEkx.notranslate > div:nth-child(3) > div:nth-child(5)") WebElement startd;
    @FindBy(xpath = "//*[@id=\"PERSISTENT_TRIP_SEARCH_BAR\"]/div[1]/div[1]/div/div[1]/button[2]/div") WebElement checkOut;
    @FindBy(xpath = "//div[@aria-label='Fri May 27 2022']") WebElement endDate;
    public void selectEndDate()
    {
        endDate.click();
    }
    @FindBy(xpath = "//*[@id=\"PERSISTENT_TRIP_SEARCH_BAR\"]/div[1]/div[1]/div/div[2]/button/div") WebElement Guests;

    @FindBy(xpath = "(//BUTTON[@class='zvitC'])[4]") WebElement add;
    public void addNumberofChildren()
    {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//BUTTON[@class='zvitC'])[4]")));
        add.click();
    }

    @FindBy(xpath = "//SPAN[@class='fIJrv'][text()='Age']") WebElement childDD;
    @FindBy(xpath = "//SPAN[@class='fIJrv'][text()='1']") WebElement ddIndex;
    public void selectAge()
    {
        childDD.click();
        ddIndex.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Update')]") WebElement UpdateB;
    public void Update()
    {
        UpdateB.click();
    }
    @FindBy(xpath = "//LABEL[@for='checkbox_17']") WebElement hotC;
    public void selectClass()
    {
        hotC.click();
    }

    @FindBy(xpath = "(//DIV[@class='info-col'])[1]") WebElement hotelCard;
    @FindBy(xpath = "(//DIV[@class='listing_title'])[1]") WebElement hotelName;
    public String selectHotel()
    {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='info-col'])[1]")));

        String Hotel_Name =  hotelName.getText();
        return Hotel_Name;
    }

//    public void SelectHotel(String name) throws InterruptedException
//    {
//        wait = new WebDriverWait(this.driver, 30);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div[1]/a")));
//        hotel.click();
//        searchBox.sendKeys(name);
//        Thread.sleep(2000);
//        Swiss.click();
//        //System.out.println("Location has been selected");
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //checkIn.click();
//        //checkIn.sendKeys("0505022");
//        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#typeahead_results a.bPaPP.w.z._S._F.Wc.Wh.Q.B-._G.bpubK > div.faliU > div.WlYyy.cPsXC.dTqpp")));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        startDate.click();
//        //System.out.println("Check-In date has been selected");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //checkOut.click();
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//DIV[@class='fgeHy Vt Z1 '][text()='21']")));
//        endDate.click();
//        Thread.sleep(5000);
//        //System.out.println("Check-Out date has been selected");
//        //Guests.click();
//        //System.out.println("Guests button has been clicked");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//BUTTON[@class='zvitC'])[4]")));
//        add.click();
//        //System.out.println("Successfully added a child");
//        childDD.click();
//        ddIndex.click();
//        UpdateB.click();
//        //System.out.println("Updated the Guests section YO!!");
//
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("scroll(0, 550);");
//
//        Thread.sleep(2000);
//
//        hotC.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//DIV[@class='info-col'])[1]")));
//        //System.out.println("Found YO!");
//
//       String Hotel_Name =  hotelName.getText();
//
//       System.out.println("Hotel name is: " + Hotel_Name);
//
//
//    }

}

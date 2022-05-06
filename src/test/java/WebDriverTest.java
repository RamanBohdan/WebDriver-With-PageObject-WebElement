import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    private static WebDriver webDriver;
    private final static String WebUrl = "http://svyatoslav.biz/testlab/wt";
    private final static String INPUT_NAME_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
    private final static String INPUT_HEIGHT_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
    private final static String INPUT_WEIGHT_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
    private final static String INPUT_GENDER_MALE_MAN_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
    private final static String INPUT_GENDER_MALE_WOMEN_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
    private final static String PRESS_BUTTON_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";


    @BeforeAll
    public static void beforeAll() {
        webDriver = new ChromeDriver();
    }


    // тест проходит
    @Test
    public void testInputHeight50() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Name");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_WOMEN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    @Test
    public void testInputHeight49() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Name");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("49");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_WOMEN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    // тест не проходит
    @Disabled
    @Test
    public void testInputHeight301() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("301");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    @Disabled
    @Test
    public void testInputHeight150() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("150");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_WOMEN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    @Disabled
    @Test
    public void testInputHeight300() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("300");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //   тест не проходит
    @Disabled
    @Test
    public void testInputHeight_10() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("-10");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    // тест не проходит
    @Disabled
    @Test
    public void testInputHeight0() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("0");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест не проходит
    @Disabled
    @Test
    public void testInputHeight1000000() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("1000000");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // Если вес начинается c цифры,а дальше идут буквы, символы и прочие- тест проходит при условии попадания в дивпазон!!!!!!!!!!!!!!
    @Disabled
    @Test
    public void testInputHeight_a() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("140a");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputHeight_A() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("A");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест не проходит
    @Disabled
    @Test
    public void testInputHeight_() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("-");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputHeight_a1A() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("a*1A");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    @Disabled
    @Test
    public void testInputHeight_$() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("$&");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputHeightNull() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputHeightSpace() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys(" ");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест проходит
    @Disabled
    @Test
    public void testInputWeight3() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("3");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //  тест проходит
    @Disabled
    @Test
    public void testInputWeight500() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("500");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест проходит
    @Disabled
    @Test
    public void testInputWeight250() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("250");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест не проходит
    @Disabled
    @Test
    public void testInputWeight2() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("2");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputWeight501() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("501");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //  тест не проходит
    @Disabled
    @Test
    public void testInputWeight10000000() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("1000000");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputWeight_100() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("-100");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест не проходит
    @Disabled
    @Test
    public void testInputWeight_0() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("0");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputWeightNull() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("3");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    // // тест не проходит
    @Disabled
    @Test
    public void testInputWeigh__() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys(" ");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputWeight_a() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("aaa");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    // тест не проходит
    @Disabled
    @Test
    public void testInputWeight_AA() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("AA");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    // тест не проходит
    @Disabled
    @Test
    public void testInputWeight_aA() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("aF");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // Если вес начинается c буквы, символа и прочего, а дальше идут цифры- тест не проходит!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Disabled
    @Test
    public void testInputWeight_11AAqq() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("%;11");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();
        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputWeight$() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("*&*");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест проходит
    @Disabled
    @Test
    public void testInputName() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("NAME");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест не проходит
    @Disabled
    @Test
    public void testInputNameNothing() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест проходит
    @Disabled
    @Test
    public void testInputName$() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("%$");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputNameSpace() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys(" ");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест не проходит
    @Disabled
    @Test
    public void testInputNameZero() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("0");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест проходит с двумя нулями в отличии от отдного нуля.
    @Disabled
    @Test
    public void testInputNameDoubleZero() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("00");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест проходит, подставляя пробел и ноль
    @Disabled
    @Test
    public void testInputNameSpaceAdnZero() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys(" 0");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест проходит
    @Disabled
    @Test
    public void testInputNameUnderscore() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("-");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест проходит
    @Disabled
    @Test
    public void testInputNameNull() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("-");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    //тест проходит
    @Disabled
    @Test
    public void testInputGenderMaleMan() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Name");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_MAN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }

    //тест проходит
    @Disabled
    @Test
    public void testInputGenderMaleWomen() throws InterruptedException {
        webDriver.get(WebUrl);

        webDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Name");
        webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("180");
        webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("66");
        webDriver.findElement(By.xpath(INPUT_GENDER_MALE_WOMEN_XPATH)).click();
        webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH)).click();

        Thread.sleep(3000);
    }


    // тест непроходит
    @Disabled
    @Test
    public void testInputGenderNotMale() throws InterruptedException {
        webDriver.get(WebUrl);

        WebElement inputName = webDriver.findElement(By.xpath(INPUT_NAME_XPATH));
        WebElement inputHeight = webDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH));
        WebElement inputWeight = webDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH));
        WebElement pressButton = webDriver.findElement(By.xpath(PRESS_BUTTON_XPATH));

        inputName.sendKeys("Name");
        inputHeight.sendKeys("180");
        inputWeight.sendKeys("66");
        pressButton.click();

        Thread.sleep(3000);
    }

    @AfterAll
    public static void tearDown() {

        webDriver.quit();
    }
}


// 42теста
/**
* @author: arpit.khatri
*
*/
package tests.web.web;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.WsStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.Validator;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


 

public class Asda extends WebDriverTestCase {

    private QAFExtendedWebDriver driver;

     @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        
            driver = getDriver();
        
    }

    @Test
    public void AsdaTest() throws Exception {
    
                 driver.get("http://www.google.com"); 
                 CommonStep.clear("text.search"); 
                 CommonStep.sendKeys("hello","text.search"); 
                 driver.findElement("form.tsf").waitForEnabled(); 
                 driver.findElement("form.tsf").submit(); 
                 driver.findElement("link.news").waitForEnabled(); 
                 CommonStep.click("link.news"); 
    }

}

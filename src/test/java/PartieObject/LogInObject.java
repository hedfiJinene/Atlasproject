package PartieObject;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;

public class LogInObject {
		static WebDriver driver;

		//creation d'un constructeur
		public LogInObject (WebDriver driver ) {
			LogInObject.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//Identification des élements
		@FindBy(how=How.XPATH, using="/html/body/div/div/div/div/div/div/div[4]/form/div/div[1]/div/div/div/div[3]/input")
		public static WebElement mail ;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div/div[4]/form/div/div[2]/div[1]/div/div/div[3]/input")
		public static WebElement password ;
		@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div/div/div[4]/form/div/div[2]/button")
		public static WebElement btn_login ;
        @FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/aside/ul/li[1]/a/span")
        public static WebElement dashboard;
        
        //Déclaration des méthodes
    	
    		public void saisirUrl(String args) {
    			driver.navigate().to(args);
    		}
    	
    	public void saisirMail(String arg) {
    		mail.sendKeys(arg);
    	}
    	public void saisirMdp(String arg) {
    		password.sendKeys(arg);
    	}
    	public void Cliquelogin() {
    		btn_login.click();
    	}
    	public void CliqueDashboard() {
    		dashboard.click();
    		
    		
    	}
    	public void Vérifier_URL(String url_attendue) {
    		
    		String url_attendue1 = "https://atlas.digitrends.pro/dashboard";
    	 String url_obtenue = driver.getCurrentUrl();
    	   System.out.println("URL obtenue : " + url_obtenue);
    	   Assert.assertEquals(url_attendue1, url_obtenue);
    	   
    		}
    			}

		

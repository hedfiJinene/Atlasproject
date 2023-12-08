package PartieObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AjoutRoleObject {
	static WebDriver driver;
	public  AjoutRoleObject (WebDriver driver ) {
		 AjoutRoleObject.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/aside/ul/li[6]/a/span")
	public static WebElement role;
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/div[1]/main/div/div/div[2]/div[2]/div[2]/button[1]")
	public static WebElement add_role ;
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[16]/div[2]/div/div[3]/div[1]/div/div/div[1]/div/div[3]/input")
	public static WebElement nom_role;
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[16]/div[2]/div/div[3]/div[2]/div/div/div/div")
	public static WebElement permission;
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[16]/div[2]/div/div[3]/div[3]/button[1]/span[3]")
	public static WebElement save;
	
}

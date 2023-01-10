package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.CucumberBaseClass;

public class CasesPage extends CucumberBaseClass{
	
	//finds the btn_Cases
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Cases')]")
	public static WebElement btn_Cases;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Case')]")
	public static WebElement btn_NewCase;
	
	////input[@type='text' and @name='title']
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @name='title']")
	public static WebElement edit_CaseTitle;
	
	@FindBy(how = How.XPATH, using = "//textarea[@name='description']")
	public static WebElement edit_CaseDescription;
	
	////input[@name='version']
	@FindBy(how = How.XPATH, using = "//input[@name='version']")
	public static WebElement edit_version;
	
	//input[@type='checkbox' and @name='overwrite' and @value='true']
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox' and @name='overwrite' and @value='true']")
	public static WebElement checkbox_overwrite;
	
	//select[@name='directory_id']
	@FindBy(how = How.XPATH, using = "//select[@name='directory_id']")
	public static WebElement dropdown_directoryId;
	
	//input[@type='submit' and @value='Save']
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value='Save']")
	public static WebElement btn_Save;
	
	////input[@type='file' and @name='file']
	@FindBy(how = How.XPATH, using = "//input[@type='file' and @name='file']")
	public static WebElement btn_UploadFile;
	
	

}

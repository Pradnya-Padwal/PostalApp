package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropdownSelection;

public class RegisterPost extends BaseClass {
	@FindBy(xpath="//input[@title='User ID']")
	WebElement userid;
	
	@FindBy(xpath="//select[@title='Title']")
	WebElement fnamedropdwn;
	
	@FindBy(xpath="//input[@title='First Name']")
	WebElement fname;
	
	@FindBy(xpath="//input[@aria-label='Last Name']")
	WebElement lname;
	
	@FindBy(xpath="//select[@title='Hint Question']")
	WebElement hintque;
	
	@FindBy(xpath="//input[@aria-label='Hint Answer']")
	WebElement hintans;
	
	@FindBy(xpath="//input[@aria-label='Address Line 1']")
	WebElement add1;
	
	@FindBy(xpath="//input[@aria-label='Address line 2']")
	WebElement add2;
	
	@FindBy(xpath="//input[@aria-label='Address line 3']")
	WebElement add3;
	

	@FindBy(xpath="//select[@title='Country']")
	WebElement country;
	

	@FindBy(xpath="//select[@title='State']")
	WebElement state;
	

	@FindBy(xpath="//select[@title='City / District']")
	WebElement city;
	

	@FindBy(xpath="//input[@title='Pincode']")
	WebElement pin;
	

	@FindBy(xpath="//input[@aria-label='Email']")
	WebElement emailid;
	

	@FindBy(xpath="//input[@title='Mobile']")
	WebElement mobileno;
	

	@FindBy(xpath="//label[text()='eNewsLetter']")
	WebElement enews;
	

	@FindBy(xpath="//input[@title='Cancel']")
	WebElement cancelbtn;



public RegisterPost()
		{
			PageFactory.initElements(driver,this);
		}

public void registerFunctionality(String uid, String fnmdrp, String fistname,
		String lastname, String hinque, String hinans, String address1,
		String address2, String address3, String contry, String stat,
		String cty, String pincode, String emaild, String mob)
		
{
	userid.sendKeys(uid);
	DropdownSelection.SelectVisibleText(fnamedropdwn, fnmdrp);
	fname.sendKeys(fistname);
	
	lname.sendKeys(lastname);
	DropdownSelection.SelectVisibleText(hintque, hinque);
	hintans.sendKeys(hinans);
	
	add1.sendKeys(address1);
	add2.sendKeys(address2);
	add3.sendKeys(address3);
	
	DropdownSelection.SelectVisibleText(country, contry);
	DropdownSelection.SelectVisibleText(state, stat);
	DropdownSelection.SelectVisibleText(city, cty);
	
	pin.sendKeys(pincode);
	
	emailid.sendKeys(emaild);
	
	mobileno.sendKeys(mob);
	
	


	
	
	
	

}

}

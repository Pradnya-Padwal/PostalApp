package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropdownSelection extends BaseClass {
	
	public static void SelectVisibleText(WebElement wb, String value)
	{
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}

}

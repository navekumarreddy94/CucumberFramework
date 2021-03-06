package ImplementedClassLib;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import interfaceLib.IDropdown;

public class DropdownControl implements IDropdown{
	
	private Select getDropdown(WebElement element){
		Select select = new Select(element);
		
		return select;
	}

	@Override
	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {

		getDropdown(element).selectByVisibleText(visibleText);
		
	}

	@Override
	public void selectViaValue(WebElement element, String value) throws Exception {
		getDropdown(element).selectByValue(value);
		
	}

	@Override
	public void selectViaIndex(WebElement element, int index) throws Exception {
		getDropdown(element).selectByIndex(index);
		
	}

	@Override
	public boolean isMultiple(WebElement element) throws Exception {
		boolean status = getDropdown(element).isMultiple();
		return status;
	}

	@Override
	public List<WebElement> getAllOptions(WebElement element) throws Exception {
		
		List<WebElement> allOptions = getDropdown(element).getOptions();
		return allOptions;
	}

	@Override
	public List<WebElement> getAllSelectedOptions(WebElement element) throws Exception {
		List<WebElement> allSelectedOptions = getDropdown(element).getAllSelectedOptions();
		return allSelectedOptions;
	}

	@Override
	public WebElement getFirstSelectedOption(WebElement element) throws Exception {
		
		return getDropdown(element).getFirstSelectedOption();
	}

}

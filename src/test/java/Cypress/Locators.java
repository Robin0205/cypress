package Cypress;

public class Locators {
	
	/*-----------------LOCATORS IN CYPRESS-------------------
	 * Css selector  is the only locator which is supported by cypress
	 * Xpath locator also supported by cypress  but we need to add cypress xapth locator
	 * cy.get(locator)
	 * 
	 * 
	 * if we mention this command in support file ///<refrence type="cypress/"> we can directly use the cypress related methods
	 * 
	 * when ever we do any changes in test script like chaning the action in the step or changing the locators then saving the
	 * file will automatically execute once
	 * Time travel caoncept is more helpful in cypress by seeing the time travel concept  we can understand at what step 
	 * which activity has done.
	 * 
	 * 
	 * npm install -D cypress-xpath  -----------we need to add this command in terminal of ( vs code ) to add cypress xpath plugin,so that
	 * we can locate the elements by using xpath also.
	 * 
	 * 
	 * As like to get access of all the cypress related methods we are adding  /// <reference type="cypress"/> this in command.js file
	 * same way we need to add this commnad in commands.js file to locate elemts with xpath /// <reference types="cypress-xpath" />
	 * Along with this we have add one more command called require ('cypress-xpath') command in e2e.js file
	 * 
	 * 
	 * when we locate the elements we eill use cy.get but when we are locating the elements by using xpath we have to use
	 * cy.xpath(); in the place of get (xpath) should be repalced.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

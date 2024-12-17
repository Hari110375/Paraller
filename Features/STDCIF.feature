

Feature: Validate End to End Customer Maintenance Screen


@Regression
Scenario: Validation the end to end_STDCIF
Given launch the application and Validation the_STDCIF
Then click on new button and click the populate button_STDCIF
Then enter full name and short name_STDCIF
Then click on  customer category_STDCIF
Then enter address1 and country and nationality_STDCIF
Then enter the gender and birth country and DateOfBirth and Language _STDCIF
Then click on additional tab and enter the Loaction and media and misSTDCIF
And save the record_STDCIF
Then user logout from  maker_CustomerMaintenance

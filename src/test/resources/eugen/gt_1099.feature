#Auto generated Octane revision tag
@TID1099REV0.2.0
Feature: gt
	Scenario: gt1
		Given 22
		When 22
		Then 33

	Scenario Outline: gt2
		Given <param1> 
		When  <param2>  
		Then  <param3>  

	Examples:
		| param1 | param2 | param3 |
		| a      | 1      | 3      |
		| b      | 2      | 4      |

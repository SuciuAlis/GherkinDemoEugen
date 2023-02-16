#Auto generated Octane revision tag
@TID1001REV0.2.0
Feature: test1
	Scenario: test1
		Given ddd
		When fff
		Then ggg

	Scenario Outline: outline test
		Given <param1> 
		When  <param2>  
		Then  <param3>  

	Examples:
		| param1 | param2 | param3 |
		| a      | 1      | 3      |
		| b      | 2      | 4      |

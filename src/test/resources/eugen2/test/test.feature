Feature: Feature to test
Scenario: As a client user I want to add products to my cart and see the total price
Given a client user on the dashboard page of the application
When a client adds a product to the cart
Then the product is added to his card
And the special rules at the given moment are applied
And the total price show the right amount of money, taking in consideration the discounts from the special rules
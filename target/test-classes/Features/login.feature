Feature: Acceptance testing.
  In order to buy the product verify that tobi page is loading and able to login and able to select a product and add it to cart
  
Scenario Outline: User Verify With Valid Login Credential
Given user launch chrome browser
Then user enters url
When user enters "<username>" and "<password>" valid credential
And user click login button

Examples:
|username                   |password     |
|jasminejosecool@gmail.com  |jasmine234   |

Scenario Outline: User Search for a Product and Add it to Cart
Then user click search link
When user enter "<search>" search product
When user click search button
Then user select product
Then user choose size and add product to cart
Then user click to view cart

Examples:
|search |
|Jackets|
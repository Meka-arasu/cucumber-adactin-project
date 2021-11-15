Feature: checking the booking funtionality of the adactin hotel application.
Scenario: User checking the login page using valid username and password
Given : User launch the application
When User enters the valid username in the username field
And user enters the valid password
Then :user clicks on the login button

Scenario: user enter the details to search hotel
Given : user enters the details
When :user enters the location
And : user enters the hotels
And : user enters the roomtype
And :user enters the roomcount
And : user enters the checkindate
And : user enters the checkoutdate
And : user enters the Adults
And : user enters the Children
And : user enters  the submitbutton
And : user clicks the radio button
Then : user clicks continue for payment

Scenario: User enters the payment details and confirms booking
Given : User enters the user details and payment details
When : user enters firstname
And : user enters lastname
And : user enters address
And : user enters creditcardno
And : user enters creditcardtype
And : user enters expirymonth
And : user enters expiryyear
And : user enters cvv
And : user booked hotel 
And : user clicks my_itinerary
Then :  user booked and logouts



 






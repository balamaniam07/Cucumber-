Feature: Hotel Booking In Adactin Application

Scenario: User Login In The Web Application
Given user Lanuch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Scenario: User Search Hotel In The Web Application
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Number Of Adults Per Room
And user Select The Childern Per Room
Then user Click The Search Button And It Navigates To Select Hotel Page

Scenario: User Select Hotel In The Web Application
When user Click The Radio Button
Then user Click On Continue Button

Scenario: User Book A Hotel In The Web Application
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Billing Address In The Billing Address Field
And user Enter The Credit Card Number In The Credit Card No Field
And user Select The Credit Card Type
And user Select The Expire Month In The Select Month Field
And user Select The Expire Year In The Select Year Field
And user Enter The CVV Number
Then click The Book Now Button And It Navigates To The Booking Confirmation Page

Scenario: user Can View The Booking Confirmation And Logout In The Web Application
Then user Click The Logout Button
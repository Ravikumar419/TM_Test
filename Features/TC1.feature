#Author: rpendyala19@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
 
Feature: UI Spec
#@tag1
  Scenario: should list different request types, end points
  	Given I want to launch application url "https://reqres.in/" in Chrome browser
    Then I want to verify Request type Get with Endpoint as List Users
    And I want to verify on Request type Get with Endpoint as Single User
    And I want to verify on Request type Get with Endpoint as Single User Not Found
    And I want to verify on Request type Get with Endpoint as List Resource
    And I want to verify on Request type Get with Endpoint as Single Resource
		And I want to verify on Request type Post with Endpoint as Create
		And I want to verify on Request type Put with Endpoint as Update
		And I want to verify on Request type Patch with Endpoint as Update
		And I want to verify on Request type Delete with Endpoint as Delete
		And I want to verify on Request type Post with Endpoint as Register Successful
		And I want to verify on Request type Post with Endpoint as Register Unsuccessful
		And I want to verify on Request type Post with Endpoint as Login Successful
		And I want to verify on Request type Post with Endpoint as Delayed Response
		
  #@tag2
 Scenario: should display ‘sample request and response’ details after selecting a specific option.
  	Given I want to launch application url "https://reqres.in/" in Chrome browser
    Then I want to Select or Click “GET SINGLE USER NOT FOUND”
    And I want to verify on Request as /api/users/23 and Response as Response 404 {}

Scenario: Should contain a button to navigate to support page
  	Given I want to launch application url "https://reqres.in/" in Chrome browser
  	Then I want to verify button to navigate to support page is displayed

Scenario: Should contain a button to navigate to support page
  	Given I want to launch application url "https://reqres.in/" in Chrome browser
  	When I Click on Support ReqRes button to navigate to support page

Scenario: Should list options for one-time & monthly support
  	Given I want to launch application url "https://reqres.in/" in Chrome browser
  	When I Click on Support ReqRes button to navigate to support page
  	Then I am able to see One Time Payment option
  	And I am able to see One Time Payment option Monthly Support Option

Scenario: Should provide Upgrade details
  	Given I want to launch application url "https://reqres.in/" in Chrome browser
  	Then I am able to see One Time Payment option
  	And I am able to see Upgrade button



    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

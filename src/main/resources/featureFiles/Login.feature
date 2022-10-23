Feature: To verify the Negative Scenario of Facebook
Scenario: By Providing the invaild Credentails


#Given User launch the FaceBook <url>
Given User launch the FaceBook
When  User provides the invalid un and pwd
#When  User provides the invalid <UserName> and <Password>
And User click on Login button
Then User should be able to login in FaceBook
And Should get the Error Message


#Examples:
#|url |UserName | Password |
#|"http://www.facebook.com"|"vvmbvbv"|"hfhhf"|
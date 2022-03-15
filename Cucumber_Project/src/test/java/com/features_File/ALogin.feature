Feature: Booking In Adactin Application

@run
Scenario:Login
	Given User Launch The Application
	When User Enter The Username In Username Field
	And User Enter The Password In Password Field
	Then User click On The Login Button And It Navigate To Search Hotel

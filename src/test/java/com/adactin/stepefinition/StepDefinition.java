package com.adactin.stepefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public static  WebDriver driver = TestRunner.driver;
	
	@Given("^user Lanuch The Adactin Application$")
	public void user_Lanuch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("balamaniam");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("7XJU25");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select a = new Select(location);
		a.selectByValue("Sydney");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
	Select b = new Select(hotels);
	b.selectByValue("Hotel Creek");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select c = new Select(roomtype);
		c.selectByIndex(2);
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement roomnumb = driver.findElement(By.id("room_nos"));
		Select d = new Select(roomnumb);
		d.selectByIndex(3);
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		WebElement pickupdate = driver.findElement(By.id("datepick_in"));
		pickupdate.clear();
		pickupdate.sendKeys("25/07/2023");
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		WebElement pickoutdate = driver.findElement(By.id("datepick_out"));
		pickoutdate.clear();	
		pickoutdate.sendKeys("27/07/2023");
	}

	@When("^user Select The Number Of Adults Per Room$")
	public void user_Select_The_Number_Of_Adults_Per_Room() throws Throwable {
		WebElement adultperroom = driver.findElement(By.id("adult_room"));
		Select e = new Select(adultperroom);
		e.selectByIndex(2);
	}

	@When("^user Select The Childern Per Room$")
	public void user_Select_The_Childern_Per_Room() throws Throwable {
		WebElement childperroom = driver.findElement(By.id("child_room"));
		Select f = new Select(childperroom);
		f.selectByIndex(3);
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
		WebElement select1 = driver.findElement(By.id("radiobutton_0"));
		select1.click();
	}

	@Then("^user Click On Continue Button$")
	public void user_Click_On_Continue_Button() throws Throwable {
		WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
		Thread.sleep(3000);
		}
	
	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Balasubramaniam");
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("A.A.K");
		}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("12/21, marina beach, chennai-41");
	}

	@When("^user Enter The Credit Card Number In The Credit Card No Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_No_Field() throws Throwable {
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("1234 5678 9101 1234");
	}
	
	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select g = new Select(cardtype);
		g.selectByIndex(2);
	}


	@When("^user Select The Expire Month In The Select Month Field$")
	public void user_Select_The_Expire_Month_In_The_Select_Month_Field() throws Throwable {
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select h = new Select(expmonth);
		h.selectByIndex(4);
	}

	@When("^user Select The Expire Year In The Select Year Field$")
	public void user_Select_The_Expire_Year_In_The_Select_Year_Field() throws Throwable {
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select i = new Select(expyear);
		i.selectByValue("2029");
	}
    
	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		WebElement cvvnumber = driver.findElement(By.id("cc_cvv"));
		cvvnumber.sendKeys("123");
		}
	
	@Then("^click The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {

		Thread.sleep(5000);
		WebElement logout1 = driver.findElement(By.xpath("//input[@value='Logout']"));
		logout1.click();
	}


}

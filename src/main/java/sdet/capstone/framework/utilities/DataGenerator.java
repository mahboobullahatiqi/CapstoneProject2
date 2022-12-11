package sdet.capstone.framework.utilities;

import com.github.javafaker.Faker;

public class DataGenerator {
	
	public static String addressGenerator (String input) {
		Faker faker = new Faker();
		String output = "";
		
		if(input.equalsIgnoreCase("United States")) {
			output = faker.address().country();
		} else if (input.equalsIgnoreCase("fullNameValue")) {
			output = faker.name().firstName();		
		} else if (input.equalsIgnoreCase("phoneNumberValue")) {
			output = faker.phoneNumber().cellPhone();
		} else if (input.equalsIgnoreCase("streeetAddressValue")) {
			output = faker.address().streetAddress();
		} else if (input.equalsIgnoreCase("aptValue")) {
			output = faker.address().secondaryAddress();
		} else if (input.equalsIgnoreCase("cityValue")) {
			output = faker.address().city();
		} else if (input.equalsIgnoreCase("stateValue")) {
			output = faker.address().state();
		} else if (input.equalsIgnoreCase("zipCodeValue")) {
			output = faker.address().zipCode();
		} 
		return output;
		
	}
      public static void main (String[]args) {
    	  System.out.println(addressGenerator("countryValue"));
    	  System.out.println(addressGenerator("fullNameValue"));
    	  System.out.println(addressGenerator("phoneNumberValue"));
    	  System.out.println(addressGenerator("streeetAddressValue"));
    	  System.out.println(addressGenerator("cityValue"));
    	  System.out.println(addressGenerator("stateValue"));
    	  System.out.println(addressGenerator("zipCodeValue"));
      }
}

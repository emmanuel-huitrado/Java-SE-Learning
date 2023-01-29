package coe.unosquare.javaocp.challenges.coreapi.service;

import coe.unosquare.javaocp.challenges.coreapi.model.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationService {

    public UserRegistrationService() {
    }

    public boolean registerUser(User user){
        return true;
    }
/*
UniqueID must be conformed by:
- Initial letter of the last name +
- First vowel found on the last name +
- First 2 letters of the first name +
- Last 2 digits of the DoB Year +
- 2 digits for the month +
- 2 digits for the day +
- the string provided by the UniqueSequenceGeneratorService
 */
    private StringBuilder uniqueIdGenerator(User user){
        StringBuilder uniqueId = new StringBuilder();
        String remove
        Pattern pattern = Pattern.compile("[AEIOUaeiou]");

        uniqueId.append(user.getLastName().charAt(0))
                .append(pattern.matcher(user.getLastName()).group())
                .append(user.getFirstName().substring(0,2))
                        .append(user.getDateOfBirth().substring())

        System.out.println(vowel);


        return uniqueId;
    }
}

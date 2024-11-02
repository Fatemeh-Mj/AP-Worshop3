import java.util.*;
public class PhoneNumber {
    private String countryCode;
    private String number;
    public void setCountryCode (String cc)
    {
        countryCode = cc;
    }
    public void setNumber (String num)
    {
        number = num;
    }
    @Override
    public String toString ()
    {
        String phoneNum;
        phoneNum = "(" + countryCode + ") " + number;
        return phoneNum;
    }
}
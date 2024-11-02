import java.util.*;
public class Address {
    private String zipCode = "-";
    private String country = "-";
    private String city = "-";
    public void setZipCode (String zc)
    {
        this.zipCode = zc;
    }
    public String getZipCode ()
    {
        return zipCode;
    }

    public void setCountry (String count)
    {
        this.country = count;
    }
    public String getCountry ()
    {
        return country;
    }
    public void setCity (String cit)
    {
        this.city = cit;
    }
    public String getCity()
    {
        return city;
    }

    @Override
    public String toString ()
    {
        String address;
        address = zipCode + " - " + country + " - " + city;
        return address;
    }
}
package Pgo4exec;

public class Address {


    private String country, city, postCode, street, streetNumber;
//   streetNumber - can be with letter  - for. ex. 86A or 16d

    public String createAddress(String country) {
        this.country = country;
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        this.country = country;
        this.city = city;
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, String postCode) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
        return String.format("Country: %s, City: %s, PostCode: %s", country, city, postCode);
    }

    public String createAddress(String country, String city, String postCode, String street) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        return String.format("Country: %s, City: %s, PostCode: %s, Street: %s", country, city, postCode, street);
    }

    public String createAddress(String country, String city, String postCode, String street, String streetNumber) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.streetNumber = streetNumber;
        return String.format("Country: %s, City: %s, PostCode: %s, Street: %s, Street Number: %s", country, city, postCode, street, streetNumber);
    }
}

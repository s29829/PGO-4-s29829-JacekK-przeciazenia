package Tests;

import Pgo4exec.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestAddress {


    Address address = new Address();

    @Test
    void testAddressWithCountry() {
        Assertions.assertEquals(address.createAddress("Poland"), "Country: Poland");
    }

    @Test
    void testAddressWithCountryAndCity() {
        Assertions.assertEquals(address.createAddress("Poland", "Warszawa"), "Country: Poland, City: Warszawa");
    }

    @Test
    void testAddressWithCountryAndCityAndPostalCode() {
        Assertions.assertEquals(address.createAddress("Poland", "Warszawa","02-222"), "Country: Poland, City: Warszawa, PostCode: 02-222");
    }

    @Test
    void testAddressWithCountryAndCityAndPostalCodeAndSteet() {
        Assertions.assertEquals(address.createAddress("Poland", "Warszawa","02-222","Koszykowa"), "Country: Poland, City: Warszawa, PostCode: 02-222, Street: Koszykowa");
    }

    @Test
    void testAddressWithCountryAndCityAndPostalCodeAndSteetAndStreetNumber() {

        Assertions.assertEquals(address.createAddress("Poland", "Warszawa", "02-222", "Koszykowa","86A"), "Country: Poland, City: Warszawa, PostCode: 02-222, Street: Koszykowa, Street Number: 86A");
    }

}

package management.system.assignment2;

import javax.persistence.Entity;

@Entity
public class Contacts {

    String name;
    String address;
    int countrycode;
    long phonenum;
    String email;

    public Contacts(String name, String address, int countrycode, long phonenum, String email) {
        this.name = name;
        this.address = address;
        this.countrycode = countrycode;
        this.phonenum = phonenum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

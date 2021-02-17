package modellayer;

public abstract class Person
{
    protected String name;
    protected String address;
    protected String zipcode;
    protected String city;
    protected String country;
    protected String phone;
    
    public Person(String name, String address, String zipcode, String city, String country, String phone) {
        this.setName(name);
        this.setAddress(address);
        this.setZipcode(zipcode);
        this.setCity(city);
        this.setCountry(country);
        this.setPhone(phone);
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
    
    public String getZipcode() {
        return zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String toString() {
        return "\n* Name: " + name + "\n* Address: " + address + "\n* Zipcode: " + zipcode + "\n* City: " + city + 
                "\n* Country: " + country + "\n* Phone: " + phone;
    }
    
}

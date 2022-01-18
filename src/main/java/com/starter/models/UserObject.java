package com.starter.models;

import java.util.Date;


class NameObject {
    public String title;
    public String first;
    public String last;
}

class StreetObject {
    public int number;
    public String name;
}

class CoordinatesObject {
    public String latitude;
    public String longitude;
}

class TimezoneObject {
    public String offset;
    public String description;
}

class LocationObject {
    public StreetObject street;
    public String city;
    public String state;
    public String country;
    public int postcode;
    public CoordinatesObject coordinates;
    public TimezoneObject timezone;
}

class LoginObject {
    public String uuid;
    public String username;
    public String password;
    public String salt;
    public String md5;
    public String sha1;
    public String sha256;
}

class DobObject {
    public Date date;
    public int age;
}

class RegisteredObject {
    public Date date;
    public int age;
}

class IdObject {
    public String name;
    public String value;
}

class PictureObject {
    public String large;
    public String medium;
    public String thumbnail;
}

public class UserObject {
    public String gender;
    public NameObject name;
    public LocationObject location;
    public String email;
    public LoginObject login;
    public DobObject dob;
    public RegisteredObject registered;
    public String phone;
    public String cell;
    public IdObject id;
    public PictureObject picture;
    public String nat;
}

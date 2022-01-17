package com.starter.models;

import java.util.Date;
import java.util.List;

class NameObject {
    private String title;
    private String first;
    private String last;
}

class StreetObject {
    private Number number;
    private String name;
}

class CoordinatesObject {
    private String latitude;
    private String longitude;
}

class TimezoneObject {
    private String offset;
    private String description;
}

class LocationObject {
    private StreetObject street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private CoordinatesObject coordinates;
    private TimezoneObject timezone;
}

class LoginObject {
    private String uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}

class DobObject {
    private Date date;
    private Number age;
}

class RegisteredObject {
    private Date date;
    private Number age;
}

class IdObject {
    private String name;
    private String value;
}

class PictureObject {
    private String large;
    private String medium;
    private String thumbnail;
}

class InfoObject {
    private String seed;
    private Number results;
    private Number page;
    private String version;
}

class UserObject {
    private String gender;
    private NameObject name;
    private LocationObject location;
    private String email;
    private LoginObject login;
    private DobObject dob;
    private RegisteredObject registered;
    private String phone;
    private String cell;
    private IdObject id;
    private PictureObject picture;
    private String nat;
}

public class UserModel {
    private List<UserObject> result;
    private InfoObject info;
}
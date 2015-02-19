package models;

import play.db.ebean.Model;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;

@Entity
public class Customer extends Model {
    public String firstName;
    public String lastName;
    @Embedded
    public Address address;
}
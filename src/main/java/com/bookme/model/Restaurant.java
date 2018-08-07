package com.bookme.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {

    @Id
    Float id;

    String name;

    int pincode;

    public Float getId() {
        return id;
    }

    public void setId(final Float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Restaurant() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Restaurant [id=" + id + ", name=" + name + ", pincode=" + pincode + "]";
    }

    public Restaurant(final Float id, final String name, final Integer pincode) {
        super();
        this.id = id;
        this.name = name;
        this.pincode = pincode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + pincode;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restaurant other = (Restaurant) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (pincode != other.pincode) {
            return false;
        }
        return true;
    }
}

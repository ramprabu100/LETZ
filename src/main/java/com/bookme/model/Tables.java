package com.bookme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bookme.model.enumeration.TableSize;

@Entity
public class Tables extends Item{

 
    
    String name;

    TableSize type;

    float price;

    float restaurantID;

    /**
     * @return the restaurant
     */

    public float getRestaurant() {
        return restaurantID;
    }

    /**
     * @param restaurant
     *            the restaurant to set
     */
    public void setRestaurant(final float restaurantID) {
        this.restaurantID = restaurantID;
    }

    int restaturant;

    public Tables(final String name, final TableSize type, final float price, final float restaurantID) {
        super();
        this.name = name;
        this.type = type;
        this.price = price;
        this.restaurantID=restaurantID;
    }

    public Tables() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public TableSize getType() {
        return type;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setType(final TableSize type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        final Tables other = (Tables) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Table [name=" + name + ", type=" + type + ", price=" + price + "]";
    }

}

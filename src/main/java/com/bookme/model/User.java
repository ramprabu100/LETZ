package com.bookme.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "usertable")
public abstract class User {

    @Id
    int id;

    String name;

    String passWord;

    /**
     * @param id
     * @param name
     * @param passWord
     * @param role
     */
    public User(final int id, final String name, final String passWord, final String role) {
        super();
        this.id = id;
        this.name = name;
        this.passWord = passWord;
        this.role = role;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord
     *            the passWord to set
     */
    public void setPassWord(final String passWord) {
        this.passWord = passWord;
    }

    /**
     *
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     *            the role to set
     */
    public void setRole(final String role) {
        this.role = role;
    }

    String role;

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
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
        final User other = (User) obj;
        if (id != other.id) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (passWord == null) {
            if (other.passWord != null) {
                return false;
            }
        } else if (!passWord.equals(other.passWord)) {
            return false;
        }
        if (role == null) {
            if (other.role != null) {
                return false;
            }
        } else if (!role.equals(other.role)) {
            return false;
        }
        return true;
    }

    public User(final int id, final String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

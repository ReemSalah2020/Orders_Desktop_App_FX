/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author MAHMOUD.T
 */
public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean admin;

    public User(String firstName, String lastName, String userName, String password, boolean admin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.admin = admin;
    }//END;

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }//END;

//----------------------------------
    public String getFirstName() {
        return firstName;
    }//END;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//END;

    public String getLastName() {
        return lastName;
    }//END;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//END;

    public String getUserName() {
        return userName;
    }//END;

    public void setEmail(String email) {
        this.userName = email;
    }//END;

    public String getPassword() {
        return password;
    }//END;

    public void setPassword(String password) {
        this.password = password;
    }//END;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

}//END class;

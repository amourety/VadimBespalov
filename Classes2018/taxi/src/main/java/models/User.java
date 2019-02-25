package models;

import java.net.URL;
import java.util.List;

/**
 * Created by amour on 04.09.2018.
 */

import lombok.*;


@Builder
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class User {

    private Long id;

    private String phone;
    private String hashPassword;

    private String firstName;
    private String lastName;
    private String email;
    private URL photo;

    private Role role;
    private List<Authority> authorities;

    private List<User> users;

    private List<User> managers;

    private List<Taxi> favoritesTaxi;

    public class InnerManager {
        public List<User> getClients(){
            return users;
        }
    }
    public class InnerUser{
        public List<Taxi> getFavoritesTaxi(){
            return favoritesTaxi;
        }
    }

    public class InnerAdmin{
        public List<User> getManagers(){
            return managers;
        }
    }

    public InnerAdmin asAdmin(){
        return new InnerAdmin();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public URL getPhoto() {
        return photo;
    }

    public void setPhoto(URL photo) {
        this.photo = photo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getManagers() {
        return managers;
    }

    public void setManagers(List<User> managers) {
        this.managers = managers;
    }

    public List<Taxi> getFavoritesTaxi() {
        return favoritesTaxi;
    }

    public void setFavoritesTaxi(List<Taxi> favoritesTaxi) {
        this.favoritesTaxi = favoritesTaxi;
    }
}
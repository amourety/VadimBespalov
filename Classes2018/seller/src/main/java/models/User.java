package models;

import lombok.*;

import java.net.URL;
import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
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

    // for manager
    private List<User> clients;
    // for admin
    private List<User> managers;
    // as user

    public boolean isAdmin() {
        return role.equals(Role.ADMIN);
    }

    public class InnerManager {
        public List<User> getClients() {
            return clients;
        }
    }

    public class InnerUser {
        public Object getFavoritesPizzas() {
            return null;
        }
    }

    public class InnerAdmin {
        public List<User> getManagers() {
            return managers;
        }
    }

    public InnerManager asManager() {
        return new InnerManager();
    }

    public InnerAdmin asAdmin() {
        return new InnerAdmin();
    }

    public InnerUser asUser() {
        return new InnerUser();
    }

}

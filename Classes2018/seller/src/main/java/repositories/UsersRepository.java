package repositories;

import models.User;

import java.util.Optional;


public interface UsersRepository extends CrudRepository<User ,Long> {
    Optional<User> findByPhone(String phone);
}

package repositories;

import models.User;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * 04.09.2018
 * UsersRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository extends CrudRepository<User ,Long> {
    Optional<User> findByPhone(String phone);
}
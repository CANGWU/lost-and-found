package edu.nju.lostandfound.data.repository;

import edu.nju.lostandfound.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 10:05
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}

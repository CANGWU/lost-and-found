package edu.nju.lostandfound.data.repository;

import edu.nju.lostandfound.data.enmu.SignStatus;
import edu.nju.lostandfound.data.entity.Material;
import edu.nju.lostandfound.data.entity.Sign;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 10:06
 */

@RepositoryRestResource(path = "sign")
@Repository
public interface SignRepository extends JpaRepository<Sign, Long> {


    Page<Sign> findBySignStatus(SignStatus signStatus, Pageable pageable);



}

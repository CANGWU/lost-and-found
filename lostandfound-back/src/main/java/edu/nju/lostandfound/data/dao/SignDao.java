package edu.nju.lostandfound.data.dao;

import edu.nju.lostandfound.data.enmu.SignStatus;
import edu.nju.lostandfound.data.entity.Sign;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:12
 */
public interface SignDao {


    public Page<Sign> getSignBySignStatus(SignStatus signStatus, Pageable pageable);

    public long getTotalSize();

    public Page<Sign> getAll(Pageable pageable);


}

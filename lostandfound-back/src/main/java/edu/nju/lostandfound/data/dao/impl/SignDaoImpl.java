package edu.nju.lostandfound.data.dao.impl;

import edu.nju.lostandfound.data.dao.SignDao;
import edu.nju.lostandfound.data.enmu.SignStatus;
import edu.nju.lostandfound.data.entity.Sign;
import edu.nju.lostandfound.data.repository.SignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:14
 */

@Component
public class SignDaoImpl implements SignDao{

    @Autowired
    SignRepository signRepository;

    @Override
    public Page<Sign> getSignBySignStatus(SignStatus signStatus, Pageable pageable) {
        return signRepository.findBySignStatus(signStatus, pageable);
    }

    @Override
    public long getTotalSize() {
        return signRepository.count();
    }

    @Override
    public Page<Sign> getAll(Pageable pageable) {
        return signRepository.findAll(pageable);
    }
}

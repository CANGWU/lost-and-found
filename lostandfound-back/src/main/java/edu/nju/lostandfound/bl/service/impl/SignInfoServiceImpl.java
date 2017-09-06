package edu.nju.lostandfound.bl.service.impl;

import edu.nju.lostandfound.bl.domain.SignInfo;
import edu.nju.lostandfound.bl.service.SignInfoService;
import edu.nju.lostandfound.data.dao.SignDao;
import edu.nju.lostandfound.data.entity.Sign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:50
 */
@Service
public class SignInfoServiceImpl implements SignInfoService {

    @Autowired
    SignDao signDao;

    @Override
    public List<SignInfo> getAllSignInfo(Pageable pageable) {

        Page<Sign> signPage = signDao.getAll(pageable);
        List<SignInfo> signInfos = new ArrayList<>();

        for(Sign sign : signPage){
            signInfos.add(new SignInfo(sign));
        }
        return signInfos;
    }

    @Override
    public long getTotalSize() {
        return signDao.getTotalSize();
    }
}

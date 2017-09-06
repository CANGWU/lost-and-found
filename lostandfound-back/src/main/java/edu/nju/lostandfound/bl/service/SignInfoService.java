package edu.nju.lostandfound.bl.service;

import edu.nju.lostandfound.bl.domain.SignInfo;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:49
 */
public interface SignInfoService {


    public List<SignInfo> getAllSignInfo(Pageable pageable);

    public long getTotalSize();
}

package edu.nju.lostandfound.data.repository;

import edu.nju.lostandfound.data.DataConfig;
import edu.nju.lostandfound.data.entity.Sign;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:07
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DataConfig.class)
@Transactional
public class SignRepositoryTest {
    @Autowired
    SignRepository signRepository;


    @Test
    public void test1(){
        Sign sign = signRepository.findOne(new Long(1));

        System.out.println(sign.getUser().getPassword());

        assert sign.getUser().getPassword().equals("123456");

    }


}

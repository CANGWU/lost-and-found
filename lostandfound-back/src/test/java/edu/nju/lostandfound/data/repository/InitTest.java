package edu.nju.lostandfound.data.repository;

import edu.nju.lostandfound.data.DataConfig;
import edu.nju.lostandfound.data.enmu.SignStatus;
import edu.nju.lostandfound.data.entity.Sign;
import edu.nju.lostandfound.data.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 10:07
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DataConfig.class)
@Transactional
public class InitTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    SignRepository signRepository;


    @Test
    public void init(){

        //添加初始账号
        User user = new User();
        user.setDescription("最初始账号");
        user.setEmail("141250052@smail.nju.edu.cn");
        user.setName("黄迪璇");
        user.setPassword("123456");
        user.setPhoneNumber("18362916726");
        user.setPhotoUrl("http://www.baidu.com");
        userRepository.save(user);

        //添加少量告示
        List<Sign> signs = new ArrayList<>();
        for(int i=0; i< 5 ; i++){
            Sign sign = new Sign();
            sign.setDescription("简单描述");
            sign.setLostAddress("南京大学");
            sign.setSignStatus(SignStatus.FINDING);
            sign.setLostDateBef(new Date());
            sign.setLostDateEnd(new Date());
            sign.setTags("未知");
            sign.setTitle("测试用的sign");
            sign.setUser(user);

            signs.add(sign);
        }

        signRepository.save(signs);




    }




}

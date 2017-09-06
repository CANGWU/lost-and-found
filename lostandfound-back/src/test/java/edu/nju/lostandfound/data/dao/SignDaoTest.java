package edu.nju.lostandfound.data.dao;

import edu.nju.lostandfound.data.DataConfig;
import edu.nju.lostandfound.data.entity.Sign;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;

/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:16
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DataConfig.class)
@Transactional
public class SignDaoTest {

    @Autowired
    SignDao signDao;


    @Test
    public void test1(){
        Page<Sign> signs =  signDao.getAll(new Pageable() {
            @Override
            public int getPageNumber() {
                return 0;
            }

            @Override
            public int getPageSize() {
                return 5;
            }

            @Override
            public int getOffset() {
                return 0;
            }

            @Override
            public Sort getSort() {
                return null;
            }

            @Override
            public Pageable next() {
                return null;
            }

            @Override
            public Pageable previousOrFirst() {
                return null;
            }

            @Override
            public Pageable first() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }
        });
        System.out.println(signs.getSize());
        Iterator<Sign> signIterator = signs.iterator();

        assert  signIterator.next().getUser().getPassword().equals("123456");
    }
}

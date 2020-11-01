package com.example.test;

import com.example.dao.UserDao;
import com.example.pojo.User;
import com.example.vo.QueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserDaoTest {

    private UserDao userDao;

    private InputStream in;

    private SqlSession sqlSession;


    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        users.forEach(user -> System.out.println(user));
    }

    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession = factory.openSession();
       userDao = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

//    @Test
//    public void testFindById() {
//        User user = userDao.findById(48);
//        System.out.println(user);
//    }
//
//    @Test
//    public void testFinByName() {
//        List<User> users = userDao.findByName("%王%");
//        users.forEach(user -> System.out.println(user));
//    }
//
//    @Test
//    public void testFindByQueryVO() {
//        QueryVO queryVO = new QueryVO();
//        User user = new User();
//        user.setUsername("%王%");
//        queryVO.setUser(user);
//        List<User> users = userDao.findByQueryVO(queryVO);
//        users.forEach(u -> System.out.println(u));
//    }
//
//    @Test
//    public void testSave() {
//        User user = new User();
//        user.setUsername("caocao");
//        user.setAddress("北京");
//        user.setSex("男");
//        user.setBirthday(new Date());
//        userDao.save(user);
//        System.out.println(user.getId());
//    }

}

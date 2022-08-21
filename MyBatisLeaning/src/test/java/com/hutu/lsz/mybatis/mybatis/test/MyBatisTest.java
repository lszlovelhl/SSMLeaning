package com.hutu.lsz.mybatis.mybatis.test;

import com.hutu.lsz.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ShiZhuo Long
 * @date 2022/8/21
 * @apiNote
 */
public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
//        获取核心配置文件的输入流inputStream
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        获取sql的会话对象SqlSession，是MyBatis提供的操作数据库的对象，不会自动提交事务
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取sql的会话对象SqlSession，是MyBatis提供的操作数据库的对象，通过boolean值自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        获取UserMapper的代理实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        调用Mapper接口中的方法，实现添加用户的功能
        int result = userMapper.insertUser();
        System.out.println("结果:" + result);
        //提交事务
//        sqlSession.commit();
//        关闭sqlSession对象
        sqlSession.close();
    }

}

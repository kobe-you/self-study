package cn.kobe.service;

import cn.kobe.bean.Admin;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 11:46
 * @Describe
 */
public interface AdminService {
    int deleteByPrimaryKey(String adminAccount);

    int insert(Admin record);

    Admin selectByPrimaryKey(String adminAccount);

    List<Admin> selectAll(Integer pageNumber, Integer pageSize);

    int updateByPrimaryKey(Admin record);

    List<Admin> selectByName(String name, Integer pageNumber, Integer pageSize);

    Admin login(String account, String password);

//    Integer startAdmin(String s);
//
//    Integer banAdmin(String s);
}

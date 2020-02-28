package cn.kobe.service.impl;

import cn.kobe.bean.Admin;
import cn.kobe.mapper.AdminMapper;
import cn.kobe.service.AdminService;
import cn.kobe.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kobe byrant
 * @Date: 2020/2/14 11:48
 * @Describe
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();
    @Override
    public int deleteByPrimaryKey(String adminAccount) {
        int i = adminMapper.deleteByPrimaryKey(adminAccount);
        return i;
    }

    @Override
    public int insert(Admin record) {
        int insert = adminMapper.insert(record);
        return insert;
    }

    @Override
    public Admin selectByPrimaryKey(String adminAccount) {
        Admin admin = adminMapper.selectByPrimaryKey(adminAccount);
        return admin;
    }

    @Override
    public List<Admin> selectAll(Integer pageNumber, Integer pageSize ) {
        pageNumber = pageNumber * pageSize;
        List<Admin> admins = adminMapper.selectAll(pageNumber, pageSize);
        return admins;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        int i = adminMapper.updateByPrimaryKey(record);
        return i;
    }

    @Override
    public List<Admin> selectByName(String name, Integer pageNumber, Integer pageSize) {
        pageNumber = pageNumber * pageSize;
        List<Admin> admins = adminMapper.selectByName(name, pageNumber, pageSize);
        return admins;
    }

    @Override
    public Admin login(String account, String password) {
        Admin admin = adminMapper.login(account, password);
        return admin;
    }
}

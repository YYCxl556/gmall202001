package com.atguigu.gmall.service;



import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();
    // 想根据用户Id，或者用户的昵称或者根据用户的名称等多个不同的字段进行查询，如果什么都不输入，则查询所有？
    List<UserInfo> findByUserInfo(UserInfo userInfo);
    //模糊查询nickName
    List<UserInfo> findByNickName(String nickName);
    //添加数据
  void addUser(UserInfo userInfo);
    //修改
    void updUser(UserInfo userInfo);
    //删除
    void delUser(UserInfo userInfo);

    /**
     * 根据userID查询用户的地址
     * @param UserId
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(String UserId);
    /**
     * 根据userID查询用户的地址
     * @param userAddress
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(UserAddress userAddress);

}

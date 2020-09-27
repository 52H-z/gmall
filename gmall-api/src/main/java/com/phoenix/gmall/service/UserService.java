package com.phoenix.gmall.service;



import com.phoenix.gmall.bean.UmsMember;
import com.phoenix.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressById(String memberId);
}

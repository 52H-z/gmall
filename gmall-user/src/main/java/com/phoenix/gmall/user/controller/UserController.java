package com.phoenix.gmall.user.controller;


import com.phoenix.gmall.bean.UmsMember;
import com.phoenix.gmall.bean.UmsMemberReceiveAddress;
import com.phoenix.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";

    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;

    }

    @RequestMapping("getReceiveAddressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressById(String memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getReceiveAddressById(memberId);
        return umsMemberReceiveAddress;

    }

}

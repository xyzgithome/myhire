
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("c")
public class HelloController {

    @GetMapping("hello")
    public Object hello() {
        return "Hello CompanyService~~~";
    }

}

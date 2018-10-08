package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:GYZ
 * Date:2018-10-0722:04
 * Description:<描述>
 */
//@Controller 负责注册一个bean 到spring 上下文中
//@RequestMapping 注解为控制器指定可以处理哪些 URL 请求
@Controller
//@RequestMapping("/mvc")
public class mvcController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}

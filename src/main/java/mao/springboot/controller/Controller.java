package mao.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Project name(项目名称)：springboot
 * Package(包名): mao.springboot.Controller
 * Class(类名): Controller
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/9
 * Time(创建时间)： 21:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller
{
    @RequestMapping("test1")
    @ResponseBody
    public String test1(HttpServletResponse response)
    {
        response.setContentType("text/html;charset=UTF-8");
        return "访问Controller成功";
    }

    @RequestMapping("test2")
    public String test2()
    {
        return "test.html";
    }
}

package cn.itsource.aigou.plat.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    /**
     * 登录接口
     * @param employee
     * @return
     */
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if ("123".equals(employee.getPassword())&&"shawn".equals(employee.getUsername())){
            return AjaxResult.me().setObject(null);
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject(null);
        }
    }
}

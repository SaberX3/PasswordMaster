package com.example.springbootdemoone.web;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemoone.Config.Auther;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@Api(tags="index的接口")
public class IndexController {
    @RequestMapping(value ="/say",method = RequestMethod.GET)
    @ApiOperation("say hello的接口")
    public @ResponseBody String say(String words){
        return "Hello"+words;
    }


    @RequestMapping(value="/name",method = RequestMethod.GET)
    @ApiOperation("获取班级名字的接口")
    @ResponseBody
    public  Map<String,Object> name(){
        Map<String,Object> namemap=new HashMap<String,Object>();
        class  Hignclass{
            public int number;
            public String name;
            Hignclass(int num,String na){
                number=num;
                name=na;
            }
        }
        Hignclass class1=new Hignclass(50,"高一1308班");
        namemap.put("firstclass",class1);
        return namemap;
    }

    @RequestMapping(value="/login",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public @ResponseBody String login(@RequestBody JSONObject jsonParam)
    {
        JSONObject result= new JSONObject();
        if(jsonParam.getString("username").equals("admin")&&jsonParam.getString("password").equals("SaberdaisukiX3")){
            result.clear();
            result.put("msg","登录成功");
            result.put("token","gjdkghkjadhgkjlahgk");
            result.put("status",1);
            return result.toJSONString();
        }
        else {
            result.clear();
            result.put("msg","登录失败");
            result.put("status",0);
            return result.toJSONString();
        }
    }
    @Autowired
    private Auther auther;
    @RequestMapping(value = "auther",method = RequestMethod.GET)
    @ApiOperation("获取作者信息的API")
    @ResponseBody
    public  String auther(){
        return "作者:"+ auther.getName()+"-------email:"+auther.getEmail();
    }
}

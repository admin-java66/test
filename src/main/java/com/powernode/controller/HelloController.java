package com.powernode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


@Controller
public class HelloController{

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String hello(HttpServletRequest request,@RequestParam MultipartFile multipartFile,@RequestParam("username") String username){

        System.out.println("username"+username);
        /*获取源文件名称*/
        String originalFilename = multipartFile.getOriginalFilename();

        /*获取新文件名称*/
        originalFilename = UUID.randomUUID().toString()+ originalFilename;

        String upload = request.getSession().getServletContext().getRealPath("/upload");
        upload = upload+"/"+originalFilename;
        File file = new File(upload);
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "index.jsp";
    }


}

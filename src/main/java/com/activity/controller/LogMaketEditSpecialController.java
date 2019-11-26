package com.activity.controller;

import com.activity.service.LogMaketEditSpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/logMaketEditSpecial")
public class LogMaketEditSpecialController {

    @Autowired
    private LogMaketEditSpecialService logMaketEditSpecialService;

    @ResponseBody
    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public Object getLogMaketEditSpecialList(){
        return logMaketEditSpecialService.getLogMaketEditSpecialList();
    }
}

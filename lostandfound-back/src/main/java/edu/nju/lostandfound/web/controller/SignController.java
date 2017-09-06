package edu.nju.lostandfound.web.controller;

import edu.nju.lostandfound.bl.domain.ResponseMsg;
import edu.nju.lostandfound.bl.service.SignInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


/**
 * @Author xuan {hdx@xingzheyi.com}
 * @Date 2017/9/5 15:44
 */

@RestController
@RequestMapping("/sign")
public class SignController {

    @Autowired
    SignInfoService signInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseMsg getAllSignInfo(Pageable pageable, HttpServletResponse response){
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setData(signInfoService.getAllSignInfo(pageable));
        response.setHeader("x-total-count", signInfoService.getTotalSize() + "");
        return responseMsg;
    }



}

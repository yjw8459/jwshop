package com.yjw.jwshop.common.web;

import com.yjw.jwshop.common.vo.TestVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/cmmn")
public class CommonController {

    @GetMapping
    public ModelAndView test(){
        TestVO result = new TestVO("유종원", "피이지");
        List<TestVO> list = new ArrayList<>();
        return new ModelAndView("/cmmn/main")
                    .addObject("result", result)
                    .addObject("url", "/cmmn")
                    .addObject("logo", "logo")
                    .addObject("prods", list)
                ;
    }

    @GetMapping(value = "/main")
    public ModelAndView main(){

        return new ModelAndView("/common/main");
    }


}

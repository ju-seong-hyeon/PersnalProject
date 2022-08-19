package Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {
    @RequestMapping("/index")
    public String home(){
        log.info("home controller1");
        return "home";
    }
    @RequestMapping("/login")
    public String home1(){
        log.info("home controller2");
        return "home";
    }
    @RequestMapping("/MemberForm")
    public String home3(){
        log.info("home controller3");
        return "home";
    }
}

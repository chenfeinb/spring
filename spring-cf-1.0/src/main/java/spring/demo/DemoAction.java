package spring.demo;

import spring.annotation.Autowried;
import spring.annotation.Controller;
import spring.annotation.RequestMapping;
import spring.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@Controller
@RequestMapping
public class DemoAction {

    @Autowried
    private IDemoService demoService;

    public void query(HttpServletRequest request,HttpServletResponse response,
                      @RequestParam("name") String name){
        String result = demoService.get(name);
    }
}

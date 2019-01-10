package spring.demo;

import spring.annotation.Service;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@Service
public class DemoServiuceImpl implements IDemoService {
    @Override
    public String get(String name) {
        return "My name is  "+name;
    }
}

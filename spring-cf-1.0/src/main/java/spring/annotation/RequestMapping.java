package spring.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
}

package spring.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2019/1/10 0010.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowried {
    String value() default  "";
}

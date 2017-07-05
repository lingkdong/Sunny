package unit;

import com.sunny.web.model.User;
import com.sunny.web.service.UserService;
import org.apache.commons.lang.xwork.builder.ToStringBuilder;
import org.apache.commons.lang.xwork.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by DT254 on 2017/6/15.
 */
public class UserServiceTest extends AbstractTest {
    @Autowired
    private UserService userService;
    @Test
    public void testFindUserByName() throws Exception {
        User user=userService.findUserByName("mine");
        System.out.println(ToStringBuilder.reflectionToString(user, ToStringStyle.SHORT_PREFIX_STYLE));
    }

    public void testASII(){
        char c ='–';
        char a ='－';
        char d ='-';
        char e ='-';

        System.out.println((int)c);
        System.out.println((int)a);
        System.out.println((int)d);
        System.out.println((int)e);
    }
}
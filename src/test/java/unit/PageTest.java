package unit;

import com.sunny.web.model.User;
import com.sunny.web.service.UserService;
import org.apache.commons.lang.xwork.builder.ToStringBuilder;
import org.apache.commons.lang.xwork.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by DT254 on 2017/7/4.
 */
public class PageTest extends AbstractTest{
    @Autowired
    private UserService userService;
    @Test
    public void testFind() throws Exception {

    }

}

package unit;

import org.apache.commons.lang.xwork.builder.ToStringBuilder;
import org.apache.commons.lang.xwork.builder.ToStringStyle;
import org.junit.Test;

import java.util.Date;

/**
 * Created by DT254 on 2017/4/12.
 */
public class Run {
    @Test
    public void test(){
        Star star=new Star.Builder().name("google").pass("pass").createTime(new Date()).lastUpdateTime(new Date())
                .build();
        System.out.println(ToStringBuilder.reflectionToString(star, ToStringStyle.SHORT_PREFIX_STYLE));
    }
}

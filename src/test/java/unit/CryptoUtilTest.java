package unit;

import com.sunny.web.util.CryptoUtil;
import com.sunny.web.util.ProjectConstant;
import org.junit.Test;

/**
 * Created by DT254 on 2017/6/14.
 */
public class CryptoUtilTest {
    @Test
    public void test_Cry(){
        final CryptoUtil crypto = new CryptoUtil();

        final String encryptedData = crypto.encrypt("This is a test message.", ProjectConstant.CRY_INITIAL_VECTOR,
                ProjectConstant.CRY_KEY);
        System.out.println(encryptedData);

        final String decryptedData = crypto.decrypt(encryptedData, ProjectConstant.CRY_INITIAL_VECTOR,
                ProjectConstant.CRY_KEY);
        System.out.println(decryptedData);
    }

}
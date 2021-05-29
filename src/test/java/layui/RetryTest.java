package layui;

import com.ptg.purchase.console.PurchaseConsoleApplication;
import com.ptg.purchase.console.service.impl.RecoryTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author xch
 * @Date 2020/12/17 19:24
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PurchaseConsoleApplication.class)
public class RetryTest {
    @Autowired
    private RecoryTest recoryTest;

    @Test
    public void retry() {
        recoryTest.retry();
    }
}

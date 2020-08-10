import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.mockito.Mockito.*;

public class Mockitotest {
    @Test
    public void myTest() {
        /* 创建 Mock 对象 */
        List list = mock(List.class);
        /* 设置预期，当调用 get(0) 方法时返回 "111" */
        when(list.get(0)).thenReturn("SF1916056-金日靓");
        /* 验证返回结果 */
        String ret = (String)list.get(0);
        String ret2 = (String)list.get(2);
        Assert.assertEquals(ret, "SF1916056-金日靓");
        Assert.assertEquals(ret2, null);
    }
}
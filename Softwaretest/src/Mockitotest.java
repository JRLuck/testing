import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.mockito.Mockito.*;

public class Mockitotest {
    @Test
    public void myTest() {
        /* ���� Mock ���� */
        List list = mock(List.class);
        /* ����Ԥ�ڣ������� get(0) ����ʱ���� "111" */
        when(list.get(0)).thenReturn("SF1916056-������");
        /* ��֤���ؽ�� */
        String ret = (String)list.get(0);
        String ret2 = (String)list.get(2);
        Assert.assertEquals(ret, "SF1916056-������");
        Assert.assertEquals(ret2, null);
    }
}
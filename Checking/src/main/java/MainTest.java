import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/**
 * Main Tester.
 *
 * @author <QS>
 * @since <pre>Sept, 24, 2020</pre>
 * @version 1.0
 */
public class MainTest {

    @Before
    public void before() throws Exception {
        System.out.println("begin");
    }

    @After
    public void after() throws Exception {
        System.out.println("finish");
    }



    /*相似度为零的测试*/
    @Test
    public void testshouldb0() throws Exception{
        Main.work("src/test/test1/orig.txt","src/test/test1/empty.txt","src/result/shouldb0");
    }
    /*相似度为1的测试*/
    @Test
    public void testshouldb1() throws Exception {
        Main.work("src/test/test1/orig.txt","src/test/test1/orig.txt","src/result/shouldb1");
    }


    @Test
    public void testmain1() throws Exception {
        Main.work("src/test/test1/orig.txt","src/test/test1/orig_0.8_add.txt","src/result/testmain1");
    }


    @Test
    public void testmain2() throws Exception {
        Main.work("src/test/test1/orig.txt","src/test/test1/orig_0.8_del.txt","src/result/testmain2");
    }


    @Test
    public void testmain3() throws Exception {
        Main.work("src/test/test1/orig.txt","src/test/test1/orig_0.8_dis_1.txt","src/result/testmain3");
    }


    @Test
    public void testmain4() throws Exception {
        Main.work("src/test/test1/orig.txt","src/test/test1/orig_0.8_dis_10.txt","src/result/testmain4");
    }

    @Test
    public void testmain5() throws Exception {
        Main.work("src/test/test1/orig.txt","src/test/test1/orig_0.8_dis_15.txt","src/result/testmain5");
    }

    @Test
    public void testmain6() throws Exception{
        Main.work("src/test/test1/orig_0.8_add.txt","src/test/test1/orig_0.8_dis_1.txt","src/result/testmain6");
    }


    /*文件不存在的情况*/
    @Test
    public void testz()throws Exception{
        Main.work("src/test/test1/kkk.txt","src/text/text1/orig.txt","src/result/shouldbnull.txt");
    }

}


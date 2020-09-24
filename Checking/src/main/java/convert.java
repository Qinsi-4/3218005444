import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;



public class convert {

    /*将txt文本转换为字符串*/
    public static String textToString(String inFilePath) {

        String str = "";

        File file = new File(inFilePath);

        if(!file.exists()){

            System.out.println(inFilePath+"This File does not exist");

            System.exit(0);



        }

        Long length = file.length();

        byte[] content = new byte[length.intValue()];

        try {

            FileInputStream in = new FileInputStream(file);

            in.read(content);

            in.close();

            str = new String(content, StandardCharsets.UTF_8);//UTF_8显示

        } catch (IOException e) {

            e.printStackTrace();

        }

        return str;

    }

    /*将字符串转换成文本*/
    public static void stringToText(String outFilePath, String result) {

        File file = new File(outFilePath);

        try {

            FileWriter fw = new FileWriter(file);

            char[] cr = result.toCharArray();

            fw.write(cr);

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*四舍五入保留两位小数*/
    public static String process(double ans){


        BigDecimal decimal = new BigDecimal(ans * 100);

        String Ans =decimal.setScale(2, RoundingMode.HALF_UP).toPlainString();

        return Ans;

    }
}

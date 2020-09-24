import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

        String originString = convert.textToString(args[0]);

        String copyString = convert.textToString(args[1]);

        double ans =getCos.getCos(originString,copyString);

        String ansString = process(ans);

        convert.stringToText(args[2],"原文件地址 ："+args[0]+"\n"+"抄袭文件地址 ："+args[1]+"\n"+"答案地址 ："+args[2]+"\n"+"相似度 ："+ansString);

        System.out.println("Similarity :"+ansString+"\n");

    }

    /*四舍五入保留两位小数*/
    public static String process(double ans){


        BigDecimal decimal = new BigDecimal(ans * 100);

        String Ans =decimal.setScale(2, RoundingMode.HALF_UP).toPlainString();

        return Ans;

    }
}

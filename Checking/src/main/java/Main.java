import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

       work(args[0],args[1],args[2]);

    }

    /*四舍五入保留两位小数*/
    public static String process(double ans){


        BigDecimal decimal = new BigDecimal(ans * 100);

        String Ans =decimal.setScale(2, RoundingMode.HALF_UP).toPlainString();

        return Ans;

    }

    public static void work(String s1, String s2, String s3) {
        String originString = convert.textToString(s1);

        String copyString = convert.textToString(s2);

        double ans =getCos.getCos(originString,copyString);

        String ansString = process(ans);

        convert.stringToText(s3,"origintextpath : "+s1+"\n"+"copytextpath : "+s2+"\n"+"answertextpath : "+s3+"\n"+"similarity : "+ansString);

        System.out.println("Similarity :"+ansString+"\n");
    }
}

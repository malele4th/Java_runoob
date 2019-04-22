import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexMatches5 {
	public static void main( String args[] ){
		Pattern p = Pattern.compile("(\\d{2})([a-z]{2,3})");
		Matcher m =p.matcher("33aa-32sdy-29ssc");
		while(m.find()) {
		   System.out.println(m.group(2));//每次匹配获取第二组内容
		}
	}
}

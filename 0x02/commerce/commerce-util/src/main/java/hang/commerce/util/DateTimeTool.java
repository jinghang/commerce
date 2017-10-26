package hang.commerce.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 */
public class DateTimeTool {

	/**
	 * 日期格式化
	 * @param time 日期
	 * @return yyyy-MM-dd HH:mm:ss 格式的日期
	 */
	public static String format(Date time){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
	}
}

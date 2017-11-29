package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class TestLog4j {
	static Logger logger = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) throws InterruptedException{
		DOMConfigurator.configure("D:\\project\\log4j\\src\\log4j\\log4j.xml");
		for(int i=0;i<5000;i++){
		logger.trace("genzongxinxi");
		logger.debug("tiaoshixinxi");
		logger.info("shuchuxinxi");
		logger.warn("jinggaoxinxi");
		logger.error("cuowuxinxi");
		logger.fatal("zhimingxinxi");
		}
	}

}

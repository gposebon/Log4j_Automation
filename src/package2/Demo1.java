package package2;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Esto es un log de DEBUG");
		log.info("Esto es un log de INFO");
		log.error("Esto es un log de ERROR");
		log.fatal("Esto es un log de FATAL");

	}

}

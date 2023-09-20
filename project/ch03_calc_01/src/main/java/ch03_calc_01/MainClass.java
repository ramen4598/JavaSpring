package ch03_calc_01;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		CalAssembler calAssembler = ctx.getBean("calAssembler", CalAssembler.class);
		calAssembler.assembler();
		
		ctx.close();
	}

}

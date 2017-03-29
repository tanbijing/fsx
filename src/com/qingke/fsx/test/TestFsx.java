package com.qingke.fsx.test;

import java.text.DecimalFormat;

import org.apache.logging.log4j.*;

import com.qingke.fsx.*;

public class TestFsx {

	public static void main(String[] args) {
		Zombie zombie = new Zombie();
		Person person = new Person();
		
		Logger log = LogManager.getLogger();
		
		for(Address toAdd:Address.values()){
			int personWinCount = 0;
			for(int count=0;count<3;count++){
//				System.out.println("======================================");
				log.info("===============================================");
				System.out.println("第"+(count+1)+"次");
				double zombieUse = zombie.go(toAdd);
				double personUse = person.go(toAdd);
				DecimalFormat format = new DecimalFormat("#.0");
				
				System.out.println("人类使用了"+format.format(personUse)+"天到达"+toAdd.chinaName);
				System.out.println("丧尸使用了"+format.format(zombieUse)+"天到达"+toAdd.chinaName);
				
				if(zombieUse>personUse) personWinCount++;
			}
			System.out.println("去"+toAdd.chinaName+(personWinCount>=2 ? "人类胜利" : "人类失败"));
		}
	}

}

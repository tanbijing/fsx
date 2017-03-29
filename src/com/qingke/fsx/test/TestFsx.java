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
				System.out.println("��"+(count+1)+"��");
				double zombieUse = zombie.go(toAdd);
				double personUse = person.go(toAdd);
				DecimalFormat format = new DecimalFormat("#.0");
				
				System.out.println("����ʹ����"+format.format(personUse)+"�쵽��"+toAdd.chinaName);
				System.out.println("ɥʬʹ����"+format.format(zombieUse)+"�쵽��"+toAdd.chinaName);
				
				if(zombieUse>personUse) personWinCount++;
			}
			System.out.println("ȥ"+toAdd.chinaName+(personWinCount>=2 ? "����ʤ��" : "����ʧ��"));
		}
	}

}

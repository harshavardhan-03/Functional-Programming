package com.xworkz.functional.tester;

import java.util.Collection;

import com.xworkz.functional.dao.MarketDAO;
import com.xworkz.functional.dao.MarketDAOimpl;
import com.xworkz.functional.dto.MarketDTO;
import com.xworkz.functional.dto.MarketType;

public class MarketTester {

	public static void main(String[] args) {
		MarketDTO dto1 = new MarketDTO("National Market","Bangalore",46,MarketType.COMMERCIAL);
		MarketDTO dto2 = new MarketDTO("Brigade Road","Bangalore",32,MarketType.COMMERCIAL);
		MarketDTO dto3 = new MarketDTO("Devaraj Market","Mysore",39,MarketType.AGRICULTUREMARKET);
		MarketDTO dto4 = new MarketDTO("Cauvery Arts","Mysore",42,MarketType.CRAFTS);
		MarketDTO dto5 = new MarketDTO("Silk Market","Ramanagara",26,MarketType.SILKMARKET);
		
		MarketDAO dao = new MarketDAOimpl();
		dao.save(dto5);
	    dao.save(dto4);
	    dao.save(dto3);
	    dao.save(dto2);
	    dao.save(dto1);
	    
		MarketDTO dto = dao.find((elements)-> elements.getName().equals("Devaraj Market"));
		System.out.println("findByName: "+dto);
		
		dto = dao.find((a) -> a.getLocation().equals("Mysore"));
		System.out.println("findByLocation: "+dto);
		
	    dto = dao.find((j)-> j.getType().equals(MarketType.CRAFTS));
        System.out.println("findByType: "+dto);
        
        Collection<MarketDTO> collection = dao.findAll((k)-> k.getLocation().equals("Mysore"));
        for (MarketDTO marketDTO : collection) {
        	System.out.println(marketDTO);		
		}		
	}
}
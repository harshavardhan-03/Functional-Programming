package com.xworkz.functional.tester;

import java.util.Collection;
import java.util.Optional;


import com.xworkz.functional.dao.RogiDAO;
import com.xworkz.functional.dao.RogiDAOimpl;
import com.xworkz.functional.dto.RogiDTO;

public class RogiDTOTester {

	public static void main(String[] args) {
		RogiDTO dto1 = new RogiDTO(1, "Pavan" ,22,"Maleria", false);
		RogiDTO dto2 = new RogiDTO(2, "Aravind" ,23,"Dengue", true);
		RogiDTO dto3 = new RogiDTO(3, "Farook" ,24,"Small-Pox", true);
		RogiDTO dto4 = new RogiDTO(4, "Noor" ,21,"Cancer", true);
		
		RogiDAO dao = new RogiDAOimpl();
		
		
		dao.save(dto4);
		dao.save(dto3);
		dao.save(dto2);
		dao.save(dto1);
		
		Optional<RogiDTO> dto = dao.findOne((id)-> id.getId() == 4);
		System.out.println(dto);
		
		dto = dao.findOne((name)-> name.getName().equals("Pavan"));
		System.out.println(dto);
		
		System.out.println(dao.totalSize());
		
		System.out.println(dao.findByMaxAge());
		
		System.out.println(dao.findByMinAge());
		
		Collection<RogiDTO> collection = dao.findAll();
		for(RogiDTO rogiDTO: collection) {
			System.out.println(rogiDTO);
		}
		
		collection = dao.findAll((baduku)->baduku.isbadukuGuarantee() == true);
		for(RogiDTO rogiDTO: collection) {
			System.out.println(rogiDTO);
		}
		
	}

		
	}


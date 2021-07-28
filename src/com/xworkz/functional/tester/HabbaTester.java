package com.xworkz.functional.tester;

import java.util.Arrays;
import java.util.Collection;

import com.xworkz.functional.dao.HabbaDAO;
import com.xworkz.functional.dao.HabbaDAOimpl;
import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.Religion;

public class HabbaTester {

	public static void main(String[] args) {

		HabbaDTO dto1 = new HabbaDTO("Dasara", "SouthIndia", 9, Religion.HINDU, "Sweet", true, true);
		HabbaDTO dto2 = new HabbaDTO("Onum", "Kerala", 1, Religion.HINDU, "Sadya", true, false);
		HabbaDTO dto3 = new HabbaDTO("Ramzan", "India", 1, Religion.MUSLIM, "Biryani", true, true);
		HabbaDTO dto4 = new HabbaDTO("Deewali", "India", 1, Religion.HINDU, "Sweet", true, true);

		HabbaDAO dao = new HabbaDAOimpl();

		dao.ulisu(dto4);
		dao.ulisu(dto3);
		dao.ulisu(dto2);
		dao.ulisu(dto1);

//		HabbaDTO dto = dao.ondunaHuduku((i) -> i.getName().equals("Dasara"));
//		System.out.println("\nFind By Name :"+ dto);
//		
//		dto = dao.ondunaHuduku((j) -> j.getRegion().equals("SouthIndia"));
//		System.out.println("\nFind By Region:" + dto);
//		
//		dto = dao.ondunaHuduku((k) -> k.getReligion().equals(Religion.HINDU));
//		System.out.println("\nFind By Religion :" +dto);
//		
//		Collection <HabbaDTO> collection = dao.yellavanuHuduku((l) -> l.getRegion().equals("India"));
//		
//		for( HabbaDTO habbadto : collection) {
//			System.out.println("\n Find All By Region:"+habbadto);
//		}
//		

		Collection<HabbaDTO> collection = Arrays.asList(dto1, dto2, dto3, dto4);

		collection.forEach((festival) -> System.out.println(festival.getName().toUpperCase()));

		System.out.println("*********************************************");

		collection.forEach((habba) -> System.out.println(habba.getRegion().toLowerCase()));
		System.out.println("*********************************************");
		collection.forEach((fest) -> {
			if (fest.getNoOfDays() >= 2) {
				System.out.println(fest.getSpecialFood().toUpperCase());

			} else {
				System.out.println(fest.getSpecialFood());
			}
		});
	}

}

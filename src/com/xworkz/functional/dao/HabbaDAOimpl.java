package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.search.HabbaSearch;

public class HabbaDAOimpl implements HabbaDAO {

	private List<HabbaDTO> list = new ArrayList<HabbaDTO>();

	@Override
	public boolean ulisu(HabbaDTO dto) {
		System.out.println("Added:" + dto);
		return list.add(dto);
	}

//	@Override
//	public HabbaDTO ondunaHuduku(HabbaSearch search) {
//		Iterator <HabbaDTO> itr = this.list.iterator();
//		HabbaDTO dto = null;
//		while(itr.hasNext()) {
//			HabbaDTO habbaDTO = itr.next();
//			if(search.huduku(habbaDTO))
//				dto = habbaDTO;
//		}
//		return dto;
//	}
//
//	@Override
//	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search) {
//		Collection<HabbaDTO> collection = new ArrayList<>();
//		list.forEach((dto) -> {
//			if(search.huduku(dto))
//				collection.add(dto);
//		});
//		System.out.println("\nyellavanu huduku :");
//		return collection;
//	}

	@Override
	public HabbaDTO ondunaHuduku(HabbaSearch search) {
		// Iterator<HabbaDTO> itr = this.collection.iterator();
		// HabbaDTO dto = null;

		this.list.forEach(d -> {
			if (search.huduku(d)) {
				list.add(d);
			}
		});
		return list.get(0);
	}

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search) {
		// Iterator<HabbaDTO> itr = this.collection.iterator();
		Collection<HabbaDTO> temp = new ArrayList<HabbaDTO>();
		this.list.forEach((d) -> {
			if (search.huduku(d)) {
				temp.add(d);
			}
		});
		return temp;
	}
}

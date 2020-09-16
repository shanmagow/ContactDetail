package com.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ashokit.dto.ContactDto;
import com.ashokit.persistance.ContactDtlsEntity;
import com.ashokit.persistance.ContactDtlsRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactDtlsRepository contactrepo;
	
	public boolean saveContacts(ContactDto dto) {
		ContactDtlsEntity contactdtls=new ContactDtlsEntity();
		BeanUtils.copyProperties(dto, contactdtls);
		ContactDtlsEntity saveentity= contactrepo.save(contactdtls);
		return saveentity.getCid() != -1;
	}

	public List<ContactDto> getAllcontacts() {
		// TODO Auto-generated method stub
		return null;
	}

	public ContactDto getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateContacts() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteContacts(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveContacts() {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.ashokit.service;

import java.util.List;

import com.ashokit.dto.ContactDto;

public interface ContactService {
	public boolean saveContacts(ContactDto dto);
	public List<ContactDto> getAllcontacts();
	public ContactDto getContactById(Integer cid);
	public boolean updateContacts();
	public boolean deleteContacts(Integer cid);
}

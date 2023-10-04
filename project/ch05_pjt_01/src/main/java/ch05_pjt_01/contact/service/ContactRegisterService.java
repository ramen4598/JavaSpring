package ch05_pjt_01.contact.service;

import ch05_pjt_01.contact.ContactSet;
import ch05_pjt_01.contact.dao.ContactDao;

public class ContactRegisterService {
	
	private ContactDao contactDao;
	
	public ContactRegisterService(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	public void register(ContactSet contactSet) {
		String name = contactSet.getName();
		if(verify(name)){
			contactDao.insert(contactSet);
		}else {
			System.out.println("The name has already regiseterd.");
		}
	}
	
	public boolean verify(String name){
		ContactSet contactSet = contactDao.select(name);
		return contactSet == null ? true : false;
	}
	
	public void SetWordDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}


}

package com.gokhangunay.dao;

import com.gokhangunay.model.Personnel;

public interface PersonnelDAO {
	
	// burada bir kalip olusturucam. DAOlar genel olarak interface dir. Ama zorunluluk diye birsey yoktur.
	
	public void addPersonel(Personnel personnel);
	
	public Personnel getPersonelById(int id);

}

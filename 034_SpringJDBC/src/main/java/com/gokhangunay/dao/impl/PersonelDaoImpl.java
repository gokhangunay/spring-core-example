package com.gokhangunay.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gokhangunay.connectionpool.ConnectionPool;
import com.gokhangunay.dao.PersonnelDAO;
import com.gokhangunay.model.Personnel;

public class PersonelDaoImpl implements PersonnelDAO {

	private String query = null;
	
	private ConnectionPool connection;
	
	private ResultSet resultSet;

	// ad, soyad ve benzeri aramalari ayrica delete update işlerini size biraktim. Yapin bir zahmet :)
	
	public void addPersonel(Personnel personnel){
		try {
			query = "insert into companyDB.Personnel (name, surname, experience) values (?, ?, ?)";
			
			ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/SpringBeanConfig.xml");
			
			connection = applicationContext.getBean("connectionPoolBean", ConnectionPool.class);
			
			PreparedStatement preparedStatement = connection.connectionPoolCRUD(query);
			
			preparedStatement.setString(1, personnel.getName());
			preparedStatement.setString(2, personnel.getSurname());
			preparedStatement.setString(3, personnel.getExperience());
			
			preparedStatement.executeUpdate();
			
			connection.closeConnection(connection.getResult(), preparedStatement, connection.getConnection());

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Personel Add is Success");
		}
	}


	
	public Personnel getPersonelById(int id) {
		
		try {
			String query = " select * from companyDB.Personnel where idPersonnel = ? ";
			
			Personnel personnel = null;
			
			ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/SpringBeanConfig.xml");
			
			connection = applicationContext.getBean("connectionPoolBean", ConnectionPool.class);
			
			resultSet = connection.connectionPoolandSelectQuery(query, id);		
			
			if(resultSet.next()){
				personnel = new Personnel(resultSet.getInt(1), resultSet.getString("name"), resultSet.getString("surname"), resultSet.getString("experience"));
			}
			
			connection.closeConnection(connection.getResult(), connection.getPreparedStatement(), connection.getConnection());
			
			return personnel;
			
		}catch (SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public ConnectionPool getConnection() {
		return connection;
	}

	public void setConnection(ConnectionPool connection) {
		this.connection = connection;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

}

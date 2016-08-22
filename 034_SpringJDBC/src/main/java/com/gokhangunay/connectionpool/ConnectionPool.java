package com.gokhangunay.connectionpool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ConnectionPool {

	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet result;

// Alttaki metotta generic bir yapi kurmaya calistim. 
//	Daha cok query sonucunda donecek datalar ile ilgili islemler ve enterprise web projelerinde daha uygun olacagindan kapadim gitti.	

/*	
	public List<Object[]> connectionPoolandSelectQuery(String query, Integer...parameters){
		
		try {
			if(query!=null){
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement(query);
				
	            for (int i = 0; i < parameters.length; i++) {
	                preparedStatement.setInt((i+1), parameters[i]);
	             }
				
				result = preparedStatement.executeQuery(); 
				
				if(result!=null){
					while(result.next()){
						int columns = result.getMetaData().getColumnCount();
						Object[] array = new Object[columns];
						for(int i=0; i<columns; i++){	
							array[i] = result.getObject(i+1);
						}
						resultSet.add(array);
					}
				}
				return resultSet;
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		return null;		
	}
*/	
	public ResultSet connectionPoolandSelectQuery(String query, Integer...parameters){
		
		try {
			if(query!=null){
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement(query);
				
	            for (int i = 0; i < parameters.length; i++) {
	                preparedStatement.setInt((i+1), parameters[i]);
	             }
	            
				result = preparedStatement.executeQuery(); 
				if(result!=null){
					return result;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		return null;		
	}
	
	public PreparedStatement connectionPoolCRUD(String query){
		
		try {
			if(query!=null){
				connection = dataSource.getConnection();
				preparedStatement = connection.prepareStatement(query);				
				
				return preparedStatement;
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
		
		return null;
	}
	
	public void closeConnection(ResultSet result, PreparedStatement preparedStatement, Connection connection){
		
			if(result!=null){
				try {
					result.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null){
				try {
					preparedStatement.close();	
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(connection!=null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		     result=null;
		     preparedStatement=null;
		     connection=null;
		     dataSource = null;
	}
	
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}

	public void setPreparedStatement(PreparedStatement preparedStatement) {
		this.preparedStatement = preparedStatement;
	}

	public ResultSet getResult() {
		return result;
	}

	public void setResult(ResultSet result) {
		this.result = result;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}

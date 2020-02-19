package com.nikunj.springcore.springJDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nikunj.springcore.springJDBC.dto.SpringJDBCDTO;

public class SpringJDBCDAOImpl implements SpringJDBCDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(SpringJDBCDTO dto) {
		Connection connection = null;
		PreparedStatement pst = null;
		String query = "insert into nikunj values (?,?,?) ";
		try {
			// getting connection
			connection = dataSource.getConnection();
			// using function prepareStatement of connection for execute qurey
			// query for insert data into table
			pst = connection.prepareStatement(query);
			//setting value at placeholder
			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setInt(3, dto.getAge());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pst != null || connection != null) {
				try {
					pst.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void showTable() {
		Connection connection= null;
		SpringJDBCDTO dto = null;
		PreparedStatement pst = null;
		String query = "select * from nikunj";
		try {
			connection = dataSource.getConnection();
			pst= connection.prepareStatement(query);

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				dto=new SpringJDBCDTO(rs.getInt("id") ,rs.getString("name") , rs.getInt("age"));
				System.out.println(dto);
			}
			rs.close();
			
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			if (pst != null || connection != null) {
				try {
					
					pst.close();
					connection.close();
					System.out.println("all connection is closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

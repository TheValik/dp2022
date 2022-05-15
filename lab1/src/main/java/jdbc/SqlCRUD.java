package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import servlets.LabCRUDInterface;
import users.User1;

public class SqlCRUD implements LabCRUDInterface<User1> {
	
	Connection connection;
	
	public SqlCRUD() {
		
		this.connection = new Connect().getCon();
		System.out.println(connection);
	}
		
	
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(User1 t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection.prepareStatement("INSERT INTO GpU (name,price,width) " + "VALUES (?,?,?)")) {
			st.setString(1, t.getName());
			st.setInt(2, t.getPrice());
			st.setFloat(3, t.getWidth());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<User1> read() {
		// TODO Auto-generated method stub
		List<User1> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM GpU;");) {
			while (rs.next()) {
				list.add(new User1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void update(int id, User1 t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("UPDATE GpU " + "SET \"name\"=?, \"price\"=?, \"width\"=? WHERE id=?;")) {
			st.setString(1, t.getName());
			st.setInt(2, t.getPrice());
			st.setFloat(3, t.getWidth());
			st.setInt(4, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		try (PreparedStatement st = connection
				.prepareStatement("DELETE FROM GpU WHERE id=?;")) {
			st.setInt(1, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

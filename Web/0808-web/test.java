package util;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import dao.LunchAppDataSource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ConnectCheck")
public class ConnectCheck extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		String sql = """
		        INSERT INTO lunches
                VALUES
                (4,'うどん屋さん','きつねうどん')
                ;
		        """;
		try(Connection db = new LunchAppDataSource().getConnection();
			PreparedStatement ps = db.prepareStatement(sql);{
            ps.executeUpdate();
            
		} catch (SQLException | NamingException e) {
			//エラーメッセージを出力
			out.println("error: " + e.getMessage());
			//スタックトレースをブラウザに出力
			e.printStackTrace(out);
		}
		
	}
}
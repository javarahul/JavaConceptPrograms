package javaprograms.designpattern.structural.facade;

import java.sql.Connection;

public class MySqlHelper {
	public static Connection getMySQLDBConnection() {
		System.out.println("getMySQLDBConnection");
		return null;
	}

	public void generateMySQLPDFReport(String tableName, Connection con) {
		System.out.println("generateMySQLPDFReport");
	}

	public void generateMySQLHTMLReport(String tableName, Connection con) {
		System.out.println("generateMySQLHTMLReport");
	}
}

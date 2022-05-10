package javaprograms.designpattern.structural.facade;

import java.sql.Connection;

public class OracleHelper {
	public static Connection getOracleDBConnection() {
		System.out.println("getOracleDBConnection");
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		System.out.println("generateOraclePDFReport");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		System.out.println("generateOracleHTMLReport");
	}
}

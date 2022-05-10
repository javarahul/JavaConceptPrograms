package javaprograms.designpattern.structural.facade;

import java.sql.Connection;

public class HelperFacade {
	public static enum DBTypes {
		MYSQL, ORACLE;
	}

	public static enum ReportTypes {
		PDF, HTML;
	}

	public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName) {
		Connection con = null;
		switch (dbTypes) {
			case MYSQL: {
				con = MySqlHelper.getMySQLDBConnection();
				MySqlHelper mySqlHelper = new MySqlHelper();
				switch (reportTypes) {
					case PDF: {
						mySqlHelper.generateMySQLPDFReport(tableName, con);
						break;
					}
					case HTML: {
						mySqlHelper.generateMySQLHTMLReport(tableName, con);
						break;
					}
				}
				break;
			}
			case ORACLE: {
				con = OracleHelper.getOracleDBConnection();
				OracleHelper oracleHelper = new OracleHelper();
				switch (reportTypes) {
					case PDF: {
						oracleHelper.generateOraclePDFReport(tableName, con);
						break;
					}
					case HTML: {
						oracleHelper.generateOracleHTMLReport(tableName, con);
						break;
					}
				}
				break;
			}
		}
	}
}

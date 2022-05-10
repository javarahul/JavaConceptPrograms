package javaprograms.designpattern.structural.facade;

import java.sql.Connection;

public class FacadePatternTest {

	public static void main(String[] args) {
		String tableName = "Employee";

		// generating MySql HTML report and Oracle PDF report without using Facade
		System.out.println("generating MySql HTML report and Oracle PDF report without using Facade");
		Connection con = MySqlHelper.getMySQLDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySQLHTMLReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		System.out.println();

		System.out.println("generating MySql HTML report and Oracle PDF report using Facade");

		// generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}

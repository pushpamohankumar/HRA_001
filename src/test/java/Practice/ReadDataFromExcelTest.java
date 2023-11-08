package Practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Org");
		
		/*int count = sh.getLastRowNum();
		int lastcell = sh.getRow(1).getLastCellNum();
		
		for(int i=1;i<=count;i++)//row
		{
			
			for(int j=0;j<lastcell;j++) //cell
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
	}*/
		/*int count = sh.getLastRowNum();
		//int lastcell = sh.getRow(1).getLastCellNum();
		{
			for(int i=1;i<=count;i++)
			{
				String value =sh.getRow(i) .getCell(0).getStringCellValue();
				System.out.println(value);
				
			}
		}
*/
		/*int count = sh.getLastRowNum();
		int lastcell = sh.getRow(1).getLastCellNum();
		for(int i=1;i<=count;i++) {
			for(int j=0;j<lastcell;j++)
			{
			String value = sh.getRow(i).getCell(j).getStringCellValue();	
			System.out.print(value+ " "+"\n");
			}
			System.out.println();
		
}*/		/*int count = sh.getLastRowNum();
		for(int i=1;i<count;i++)
		{
		 String value = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
		
	}*/
		int count = sh.getLastRowNum();
		 int lastcell = sh.getRow(1).getLastCellNum();
		 for(int i=1;i<=count;i++) {
			 for(int j=0;j<lastcell;j++) {
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+ " ");
			 }
			 System.out.println();
		 }
		}}

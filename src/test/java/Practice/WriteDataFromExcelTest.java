package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.io.FileBackedOutputStream;

public class WriteDataFromExcelTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ReadDataFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Org");
		/*sh.createRow(8).createCell(0).setCellValue("Wipro");
		sh.getRow(8).createCell(1).setCellValue("Hydrabad");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
		wb.close();*/
		/*sh.createRow(9);
		Scanner sc=new Scanner(System.in);
		String value = sc.nextLine();
		System.out.println("Enter the Values");
		
		for(int i=10;i<15;i++) {
			for(int j=0;j<1;j++) {
				
				
			}*/
	sh.createRow(3).createCell(0).setCellValue("Wipro");
	sh.getRow(3).createCell(1).setCellValue("Bangalore");
	sh.createRow(4).createCell(0).setCellValue("GenPact");
	sh.getRow(4).createCell(1).setCellValue("Hydrabad");
	FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\ReadDataFromExcel.xlsx");
	wb.write(fos);
	int r = sh.getLastRowNum();
	short c = sh.getRow(1).getLastCellNum();
	for(int i=1;i<=r;i++) {
		for(int j=0;j<c;j++) {
			String value = sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value);
		}
		System.out.println();
	}
	
	}
	}


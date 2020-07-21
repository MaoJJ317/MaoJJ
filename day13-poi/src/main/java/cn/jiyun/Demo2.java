package cn.jiyun;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/** 

* @author User: 小灰灰 

* @version Time：2020年3月16日 下午4:34:30 

* 类说明 

*/

public class Demo2 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
	//把导出的user.xslx文件导入并读取数据
		
		//1创建wb 工作簿
		XSSFWorkbook wb = new XSSFWorkbook(new File("G:/user.xlsx"));
		
		//2通过工作簿拿到sheet表格
		XSSFSheet sheet = wb.getSheetAt(0);
			
		int rowNum = sheet.getLastRowNum();//得到数据总共多少行
		
		List<User> list = new ArrayList<User>();
		
		for (int i = 1; i <= rowNum; i++) {
			//3通过sheet拿到行   //XSSFRow row = sheet.getRow(0);
			XSSFRow row = sheet.getRow(i);//循环出数据的行数
			
			//4通过获取每一列
			User user = new User();
			
			//5获取到循环中的第N列数据
			Integer id =(int)(row.getCell(0).getNumericCellValue());
			String userName = row.getCell(1).getStringCellValue();
			String passWord = row.getCell(2).getStringCellValue();
			user.setId(id);//得到第N行的第一列
			user.setUserName(userName);
			user.setPassWord(passWord);
			
			//6把拿到的数据放到list集合中
			list.add(user);
		}
		//关闭wb
		wb.close();
		
		System.out.println(list);
	}

}

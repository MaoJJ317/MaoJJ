package cn.jiyun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/** 

* @author User: 小灰灰 

* @version Time：2020年3月16日 

* 类说明 

*/

public class Demo1 {

	public static void main(String[] args) throws IOException {
		//把用户信息导出到本地excel工作表中
		
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setId(1);
			user.setUserName("小灰灰"+i);	
			user.setPassWord("111"+i);
			list.add(user);
		}
		
		//创建一个工作簿
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//2创建一个表格
		XSSFSheet sheet = wb.createSheet();
		
		//3创建一行数据 下标从0开始计算
		XSSFRow row0 = sheet.createRow(0);
		
		//4在行的基础上创建列  下标从0开始
		XSSFCell cell0 = row0.createCell(0);
		
		//给列赋值   构建表头数据
		cell0.setCellValue("编号");
		row0.createCell(1).setCellValue("用户名");
		row0.createCell(2).setCellValue("密码");
		
		//填充用户数据
		for (int i = 0; i <list.size(); i++) {
			User user = list.get(i);//循环导出用户信息
			
			//创建一行
			XSSFRow row = sheet.createRow(i+1);//行
			row.createCell(0).setCellValue(user.getId());//列
			row.createCell(1).setCellValue(user.getUserName());
			row.createCell(2).setCellValue(user.getPassWord());
		}
		
		//5写出数据
		OutputStream out = new FileOutputStream(new File("G:/user.xlsx"));//输出的文件目录
		wb.write(out);
		
		//6关闭输出流和工作簿
		wb.close();
		out.close();
	}

}

package string;

import java.io.*;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Aadhar_Card {
	
	public static void main (String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
				
		Aadhar_Card ad = new Aadhar_Card();
		String path="C:\\Users\\Tech\\eclipse-workspace\\java programming\\testdata\\voter_rrecords.xlsx";
		try {
		BufferedReader br  = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the Name");
		String name  = sc.next();
		System.out.println("enter the name of Father ");
		String father_name =sc.next();
		System.out.println("enter the age");
		int age = Integer.parseInt(br.readLine());
		boolean isAadhar = false;
		boolean isVoter  = false;
		String aadhar = "" , voter_id = "";
		
		if(age < 18)
		{
			
			ad.validate_age(age);
		
		} else
		{
			
			System.out.println("Enter the choice as per below Information:");
			System.out.println("Press 1  - for Aadhar Card");
			System.out.println("Press 2 - for Voter ID card");
			
			int choice = Integer.parseInt(br.readLine());
			
			
			switch(choice)
			{
			
			case 1:
				System.out.println(" enter your aadhar number:");
				aadhar = br.readLine();
				isAadhar = true;
				break;	
			case 2:
				System.out.println("Please enter your voter id number:");
				voter_id = br.readLine();
				isVoter = true;
				break;
			} 
			
			if(isAadhar) {
				boolean isValid  = validate_data(path, isAadhar, isVoter, aadhar);
				if(!isValid) {
					throw new Exception ("aadhar number entered is not valid");
				} else {
					
					System.out.println("your aadhar is validate successfully !!");
				}
			}
			if(isVoter) {
				boolean isValid  = validate_data(path, isAadhar, isVoter, voter_id);
				if(!isValid) {
					throw new Exception ("voter id number entered is not valid");
				}else {
					
					System.out.println("your voter id is validated successfully !!");
				}
				
			}
			
			System.out.println("Enter the choice as per below Information:");
			System.out.println("Press 1  - for bjp party ");
			System.out.println("Press 2 - for congress party");
			System.out.println("Press 3  - for aam aadami party");
			System.out.println("Press 4 - for nota");
			
			int vote_opt = Integer.parseInt(br.readLine());
			switch(vote_opt) {
			
			case 1:
				System.out.println("Congratulations !");
				break;
			case 2:
				System.out.println("Congratulations !");
				break;
			case 3:
				System.out.println("Congratulations !");
				break;
			case 4:
				System.out.println("Congratulations !");
				break;
			}
			
			
		}
		
		 
		} catch(Exception e) {
			
			System.out.println("Error Inputs occured !! Please re enter data");
			main(null);
			
		}
	}
	
	public static  boolean  validate_data(String path,boolean identifier_aadhar, boolean identifier_voter, String value)
	{
		String value1="";
		boolean foundData = false;
		
		
		try
		{
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
	        XSSFSheet sheet=wb.getSheetAt(0);
	        int numberOfrows = sheet.getLastRowNum();
	        
	        if(identifier_aadhar) 
	        {
	        	int col = 0;
	        	for (int i=0;i<numberOfrows;i++)
	        	{
	        		value1=sheet.getRow(i).getCell(col).getStringCellValue();
	        		if(value1.equals(value)) 
	        		{
	        			foundData = true;
	        			break;
	        		}
	        		
	        	}
	        	
	        }
	        if(identifier_voter) {
	        	
	        	int col = 1;
	        	for (int i=0;i<numberOfrows;i++) {
	        		value1=sheet.getRow(i).getCell(col).getStringCellValue();
	        		if(value1.equals(value)) {
	        			foundData = true;
	        			break;
	        		}
	        		
	        	}
	        	
	        }
 	        
			
		} catch (Exception e) 
		{
			System.out.println("issues in get read data method "+e);
			
		}
		return foundData;
	}
	
	public void validate_age(int age) throws Exception {
		try {
		if(age < 18) {
			
			throw new Exception ("Age entered is Incorrect !! Please re-enter the details");
		
		}
		}catch(Exception e) {
			
			main(null);
		}
	}

}

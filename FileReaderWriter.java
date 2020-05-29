import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReaderWriter {

	public static void writeToFile(String SAMPLE_XLSX_FILE_PATH, Person person)
			throws EncryptedDocumentException, IOException {
		Person[] persondata = new Person[] { person };
		writeToFile(SAMPLE_XLSX_FILE_PATH, persondata);
	}

	public static void writeToFile(String SAMPLE_XLSX_FILE_PATH, Person[] persondata)
			throws EncryptedDocumentException, IOException {
		// Creating a Workbook from an Excel file (.xls or .xlsx)
		File file = new File(SAMPLE_XLSX_FILE_PATH);

		FileInputStream fip;
		XSSFWorkbook workbook;
		Sheet sheet;
		int rowCount;
		try {
			// Create a FileInputStream object
			// for getting the information of the file
			fip = new FileInputStream(file);
			// Getting the workbook instance from given file
			workbook = new XSSFWorkbook(fip);
			// Retrieving the first worksheet in the Workbook
			sheet = workbook.getSheetAt(0);
			// getting the index of last row
			rowCount = sheet.getLastRowNum();
		} catch (FileNotFoundException e) {
			// Getting new Instance of workbook
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet();
			rowCount = 0;
			createHeader(sheet.createRow(rowCount));
		}

		int columnCount = 0;

		for (Person person : persondata) {
			Row row = sheet.createRow(++rowCount);
			Cell cell1 = row.createCell(columnCount++);
			Cell cell2 = row.createCell(columnCount++);
			Cell cell3 = row.createCell(columnCount++);
			Cell cell4 = row.createCell(columnCount++);
			Cell cell5 = row.createCell(columnCount++);
			cell1.setCellValue((String) person.getName());
			cell2.setCellValue((String) person.getEmailAddress());
			cell3.setCellValue((String) person.getDob());
			cell4.setCellValue((int) person.getSalary());
			cell5.setCellValue((String) person.getDepartment());

		}

		try (FileOutputStream outputStream = new FileOutputStream(SAMPLE_XLSX_FILE_PATH)) {
			workbook.write(outputStream);
			outputStream.close();
			workbook.close();
		}

		System.out.println("Writing Finished");
	}

	public static Person[] readExcelFile(String SAMPLE_XLSX_FILE_PATH) throws IOException, InvalidFormatException {

		// Creating a Workbook from an Excel file (.xls or .xlsx)
		Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

		// Retrieving the number of sheets in the Workbook
		//System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

		/*
		 * =================================================== Iterating over all the
		 * rows and columns in a Sheet
		 * ===================================================
		 */

		// Getting the Sheet at index zero
		Sheet sheet = workbook.getSheetAt(0);

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		// you can use a for-each loop to iterate over the rows and columns
		
		ArrayList<Person> personList = new ArrayList<>();
		for (Row row : sheet) {
			Person person = new Person();
			String[] cellValue = new String[5];
			int i = 0;
			if (row.getRowNum() != 0) {
				for (Cell cell : row) {
					cellValue[i++] = dataFormatter.formatCellValue(cell);
					//System.out.print(cellValue[i++] + "\t");

				}
				//System.out.println();
				person.setName(cellValue[0]);
				person.setEmailAddress(cellValue[1]);
				person.setDob(cellValue[2]);
				person.setSalary(Integer.valueOf(cellValue[3]));
				person.setDepartment(cellValue[4]);
				personList.add(person);
			}

		}

		// Closing the workbook
		workbook.close();
		Person[] a = new Person[personList.size()];
		a = personList.toArray(a);
		return a;
	}

	private static void createHeader(Row row) {
		int columnCount = -1;
		Cell cell1 = row.createCell(++columnCount);
		Cell cell2 = row.createCell(++columnCount);
		Cell cell3 = row.createCell(++columnCount);
		Cell cell4 = row.createCell(++columnCount);
		Cell cell5 = row.createCell(++columnCount);
		cell1.setCellValue((String) "Name");
		cell2.setCellValue((String) "EmailAddress");
		cell3.setCellValue((String) "Date Of Birth");
		cell4.setCellValue((String) "Salary");
		cell5.setCellValue((String) "Department");
	}

}
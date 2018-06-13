package com.mcdanieljoshuar.com;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Generate_Document {

	public static void main(String[] args) {
		
		try {
			
		
		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Intern\\Desktop\\JavaFun\\JoshMcDaniel.docx"));
		
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("Woah, it worked!");
		document.write(out);
		out.close();
		System.out.println("JoshMcDaniel Word doc printed successfully!");
		
		} catch (Exception e) {
			System.out.println("It did NOT work...");
		}

	}

}

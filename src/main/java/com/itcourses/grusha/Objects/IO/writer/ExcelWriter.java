package com.itcourses.grusha.Objects.IO.writer;

import com.itcourses.grusha.Objects.Interfaces.Robot;
import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class ExcelWriter {
    private static String[] columns = {"Name", "Age", "Material", "Targets", "OS"};
    private static List<Robot> robots = new ArrayList<>();

    public static void main(String[] args) throws IOException, InvalidFormatException {
        //Generate Robots
        robots.add(new Robot("Bender", 25, "Alcohol"));
        Robot R2D2 = new Robot("R2-D2", 200, "something");
        R2D2.setTargets(Arrays.asList("Skywalker", "Darth Vader"));
        robots.add(R2D2);

        // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file


        /* CreationHelper helps us create instances of various things like DataFormat,
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Robots");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Other rows and cells with robots data
        int rowNum = 1;
        for (Robot robot : robots) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(robot.getRobotName());

            row.createCell(1)
                    .setCellValue(robot.getAge());

            row.createCell(2)
                    .setCellValue(robot.getMadeFrom());

            if (robot.getTargets() != null)
                row.createCell(3)
                        .setCellValue(robot.getTargets().toString());

            row.createCell(4)
                    .setCellValue(robot.toString());
        }

        // Resize all columns to fit the content size
        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("D:\\trainings\\RobotFile" + (new Date().getTime()) + ".xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}

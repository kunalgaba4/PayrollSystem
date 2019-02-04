package com.payroll.groupSeven.helperclasses;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.payroll.groupSeven.Employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class PdfGenerator {
    public void PdfGenrator() {
        try {
            OutputStream file = new FileOutputStream(new File("Employees_Details.pdf"));
            Document document = new Document();
            PdfWriter.getInstance(document, file);


            PdfPTable table = new PdfPTable(1);
            PdfPCell cell = new PdfPCell(new Paragraph("Employees Details"));
            cell.setColspan(6);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setPadding(20.0f);
            cell.setSpaceCharRatio(3);
            cell.setBackgroundColor(new BaseColor(240, 21, 82));
            table.addCell(cell);
            for (Employee e: EmployeeSingelton.getInstance().getArray()) {
                table.addCell(e.toString());
            }
            table.addCell("Total payroll "+String.valueOf(EmployeeSingelton.getInstance().getTotalPayroll()));
            table.setSpacingBefore(50.0f);
            table.setSpacingAfter(50.0f);
            document.open();
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Employees Pyroll"));
            document.add(new Paragraph("Document Generated On - " + new Date().toString()));
            document.add(table);
            document.add(Chunk.NEWLINE);
            document.newPage();
            document.close();
            file.close();
            System.out.println("Pdf created successfully..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.payroll.groupSeven;




import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.payroll.groupSeven.vehicleInfo.Car;

public class PdfGenerator {


    public void PdfGenrator(){

            try {

                CommissionBasedPartTime commissionBasedPartTime= new CommissionBasedPartTime("Jagmeet",50, 14,
                        70,2.5,new Car("Black","Honda","Pb091015",4,2,15000));

                FixedBasedPartTime fixedBasedPartTime= new FixedBasedPartTime("Sumit",24,100,
                        100,500,new Car("Black","Honda","Pb091015",4,2,10000));

                Intern intern= new Intern("karan",24,"Lambton",1000,null);
                FullTime fullTime= new FullTime("Kunal",24,1000,20,null);

                OutputStream file = new FileOutputStream(new File("Employees Details.pdf"));
                Document document = new Document();
                PdfWriter.getInstance(document, file);


                PdfPTable table=new PdfPTable(1);

                PdfPCell cell = new PdfPCell (new Paragraph ("Employees Details"));

                cell.setColspan (6);
                cell.setHorizontalAlignment (Element.ALIGN_CENTER);
                cell.setPadding (10.0f);
                cell.setBackgroundColor (new BaseColor (240, 21, 82));

                table.addCell(cell);
                table.addCell(commissionBasedPartTime.toString());
                table.addCell(fixedBasedPartTime.toString());
                table.addCell(intern.toString());
                table.addCell(fullTime.toString());
                table.setSpacingBefore(30.0f);
                table.setSpacingAfter(30.0f);



                document.open();


                document.add(Chunk.NEWLINE);

                document.add(new Paragraph("This is our Project"));
                document.add(new Paragraph("Document Generated On - "+new Date().toString()));

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

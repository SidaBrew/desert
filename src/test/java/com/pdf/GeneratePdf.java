package com.pdf;

import com.lowagie.text.*;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;

public class GeneratePdf {

    private static final Logger logger = LoggerFactory.getLogger(GeneratePdf.class);

    public static PdfPCell cell;

    public static void main(String[] args) {

        Createbatch();
    }

    public static String Createbatch(){

        //创建文件
        Document document = new Document(PageSize.A4);

        String state ="";

        //设置字体
        try {
            BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            Font fontChinese = new Font(bf, 12, Font.NORMAL);
            Font font10 = new Font(bf, 10, Font.NORMAL);
            Font font11 = new Font(bf, 18, Font.BOLD);
            Font font12 = new Font(bf, 12, Font.BOLD);
            Font font13 = new Font(bf,3 , Font.NORMAL);
        //生成的PDF文件名
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("pdf文件"));

            /************************左  右   上   下*************************/
            document.setMargins(36,36,36,36);

            //开始写PDF
            document.open();
            String path ="d:/pdf";
            Image gif = null;
            gif = Image.getInstance(path+"/images/tklogo.png");
            gif.setAlignment(Image.ALIGN_CENTER | Image.UNDERLYING);
            gif.setAlignment(Image.RIGHT);
            gif.scaleAbsolute(105.f,27.5f);
            document.add((Element) gif);
            document.add(new Paragraph(createspace(200),fontChinese));
            document.add(new Paragraph(createspace(45)+"住院免押金有授权通知单",font11));
            document.add(new Paragraph("    ",fontChinese));
            document.add(new Paragraph(createspace(2)+"客户信息",font12));
            document.add(new Paragraph("    ",font13));
            float[] widths1 ={2f,2f};
            PdfPTable table1 = new PdfPTable(widths1);

            cell = new PdfPCell(new Paragraph("姓名"+createspace(2)+"sida11",font10));
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table1.addCell(cell);

            cell = new PdfPCell(new Paragraph("出生日期："+createspace(2)+"2019"+"年"+createspace(2)+"12"+"月"
                    +createspace(2)+"08"+"日",font10));
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            table1.addCell(cell);
            table1.setWidthPercentage(100);
            document.add(table1);

            float[] widths2 = { 4f };
            PdfPTable table2 = new PdfPTable(widths2);

            document.add(new Paragraph("    ",fontChinese));
            document.add(new Paragraph("    ",fontChinese));
            document.add(new Paragraph("    ",fontChinese));
            document.add(new Paragraph(createspace(180)+"(盖章处)"+createspace(22),font10));

            document.close();
            state="";

        } catch (Exception e) {
            state="conn have errors";
            e.getMessage();
        }

        return state;
    }

    private static String createspace(int num) {

        String str ="";
        if(num>=1){
            for (int i = 0; i < num; i++) {
                str = str +" ";
            }
        }else{
            str ="";
            logger.info("err:不能生成指定个数的空格");
        }

        return str;
    }

}

package com.app.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Hello world!
 *
 */
public class GenerateQRCode 
{
    public static void main( String[] args ) throws Exception
    {
        new GenerateQRCode().generateQRCode("Today is wonderful day");
    }
    
    
    private void generateQRCode(String msg) throws Exception {
    	QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = 
          barcodeWriter.encode(msg, BarcodeFormat.QR_CODE, 200, 200);
     
         BufferedImage bufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
         ImageIO.write(bufferedImage, "jpeg", new File("E:\\test\\info.jpeg"));
         System.out.println("image stored");
    }
}

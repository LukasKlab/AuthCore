package net.labindustries.authcore.utilites;

import java.io.ByteArrayOutputStream;

public class QrCodeGeneration {

    private byte[] getQRCodeImageByteArray(String text, int width, int height) throws WriterException, IOException {


        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
        byte[] pngData = pngOutputStream.toByteArray();
        return pngData;
    }



}

package TextProcessingEx;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
//        String [] pathParts = path.split("\\\\");
//        String fullFileName = pathParts[pathParts.length - 1];
//
//        String fileName = fullFileName.split("\\.")[0];
//                String extension = fullFileName.split("\\.")[1];
//
//        System.out.println("File name: " + fileName);
//        System.out.println("File extension: " + extension);

        // решаваме със substring

        int indexLast = path.lastIndexOf("\\");
        String fullFileName = path.substring(indexLast + 1);
        int indexPoint = fullFileName.indexOf(".");
        String fileName = fullFileName.substring(0, indexPoint);
                String fileExtension = fullFileName.substring(indexPoint + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}

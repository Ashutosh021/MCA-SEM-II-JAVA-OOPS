import java.io.File;

public class prg5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File directoryPath = new File("D:\\VS CODE PROGRAM\\MCA\\2nd SEM\\Java LAB\\unit 3");
        File filesList[] = directoryPath.listFiles();
        System.out.println("list of files and directories in the specified directory");
        for (File file : filesList) {
            System.out.println("file name:" + file.getName());
            String path = file.getAbsolutePath();
            System.out.println("file path:" + path);

            System.out.println("extension:" + path.substring(path.lastIndexOf('.')));
            System.out.println("size :" + file.length());
            System.out.println(" ");
        }
    }
}
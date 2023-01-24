//import java.io.BufferedReader;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.*;
//
//public class CH_FileSystem {
//
////    public static void main(String[] args) {
//////        String fileName1 = "FileSystemText1.txt";
//////        Path path1 = FileSystems.getDefault().getPath("E:\\Full_Stack_Java_Developer\\Master in Java\\Java Input Output\\Paths\\file\\" + fileName1);
//////        printFile(path1);
//////        System.out.println("*************");
//////        String fileName2 = "FileSystemText2.txt";
//////        Path path2 = FileSystems.getDefault().getPath("E:\\Full_Stack_Java_Developer\\Master in Java\\Java Input Output\\Paths\\file\\" + fileName2);
//////        printFile(path2);
//////
//////        Path absolutePath = Path.of(".");
//////        Path absolutePath1 = Paths.get("..");
//////        System.out.println(absolutePath.toAbsolutePath());
//////        System.out.println(absolutePath1.toAbsolutePath());
//////
//////        Path path3 = FileSystems.getDefault().getPath(".", "file", "data.txt");
////
//////        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
//////        for(FileStore store: stores){
//////            System.out.println(store);
//////            System.out.println(store.name());
//////        }
//////
//////        Iterable<Path> rootPath = FileSystems.getDefault().getRootDirectories();
//////        for(Path path: rootPath){
//////            System.out.println(path);
//////            System.out.println(path.toAbsolutePath());
//////        }
////
////
//////        File workingDirectory = new File("").getAbsoluteFile(); // When we pass empty string it will pass the current directory file
//////        System.out.println(workingDirectory.getAbsolutePath());
////
//////        File file = new File("E:\\Full_Stack_Java_Developer\\Master in Java\\Java Input Output\\Walk File\\FileTree");
///////// Print All file Name Using IO Suing list
////        File dir3File = new File(file, "\\Dir2");
////        String[] contentFile = dir3File.list();
////
//////        for (int i = 0; i < contentFile.length; i++) {
//////            System.out.println(i + " : " + contentFile[i]);
////
///////// Print All file Name Using IO using List File
//////            File dir2File = new File(file, "\\Dir2");
//////            File[] contentFile2 = dir2File.listFiles();
//////
//////            for (int i = 0; i < contentFile2.length; i++) {
//////                System.out.println(i + " : " + contentFile2[i].getName());
//////            }
////
////        }
//
//    private static void printFile(Path path){
//        try(BufferedReader buffer = new BufferedReader(Files.newBufferedReader(path)) ){
//            String line;
//            while ( (line = buffer.readLine()) != null){
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//

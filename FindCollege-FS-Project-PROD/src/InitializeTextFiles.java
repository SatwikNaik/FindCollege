import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class InitializeTextFiles {
    private static final String FS_FolderName = "FS-Database\\";

    static void sort(File file) throws IOException {
        List<String> arrayList = new ArrayList<>(Files.readAllLines(file.toPath(), StandardCharsets.UTF_8));
        String temp;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).compareTo(arrayList.get(j)) > 0) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            for (String s : arrayList) {
                p.println(s); // Writes s to the text file.
            }

        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        InitializeTextFiles initializeTextFiles = new InitializeTextFiles();
        initializeTextFiles.initializeColleges();
        initializeTextFiles.initializeLogin_Colleges();
        initializeTextFiles.initializeStudents();
        initializeTextFiles.initializeLogin_Students();
        initializeTextFiles.initializeMarks();
        PointersRecord pointersRecord = new PointersRecord();
        pointersRecord.createPointerRecords();

    }

    void initializeColleges() throws IOException {
        String fileName = "Colleges.txt";
        File file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1|Sinivas University, college of engineering and technology|50.00|86000|Bangalore|9999999999|sucet@sucet.edu|www.sucet.com");
            p.println("2|Ramaiah Institute of Technology|85.00|86000|Bangalore|9536521478|ramaiah@ramaiah.edu|www.ramaiah.com");
            p.println("3|BMS Institute of Technology and Management|75.00|86000|Bangalore|8569741256|bms@bms.edu|www.bms.com");
            p.println("4|RNS Institute of Technology|60.00|150000|Bangalore|9658745236|rns@rns.edu|www.rns.com");
            p.println("5|Bangalore Institute of Technology|80.00|86000|Bangalore|8547152369|bangalore@bangalore.edu|www.bangalore.com");

        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
        fileName = "College_IDs.txt";
        file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1");
            p.println("2");
            p.println("3");
            p.println("4");
            p.println("5");
        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
        fileName = "College_Name_ID.txt";
        file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("Sinivas University, college of engineering and technology|1");
            p.println("Ramaiah Institute of Technology|2");
            p.println("BMS Institute of Technology and Management|3");
            p.println("RNS Institute of Technology|4");
            p.println("Bangalore Institute of Technology|5");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    void initializeLogin_Colleges() throws IOException {
        String fileName = "Login_Colleges.txt";
        File file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1|sucet@sucet.edu|password");
            p.println("2|ramaiah@ramaiah.edu|password");
            p.println("3|bms@bms.edu|password");
            p.println("4|rns@rns.edu|password");
            p.println("5|bangalore@bangalore.edu|password");
        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
    }

    void initializeStudents() throws IOException {
        String fileName = "Students.txt";
        File file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1|Pradeep||N M|2000-05-02|Male||9856583458|pradeepnm@gmail.com|Mangalore");
            p.println("2|Satwik||Naik|1999-12-27|Male||97458965214|naiksatwik99@gmail.com|Mangalore");
        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
        fileName = "Student_IDs.txt";
        file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1");
            p.println("2");
            p.println("3");
        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
    }

    void initializeLogin_Students() throws IOException {
        String fileName = "Login_Students.txt";
        File file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1|pradeepnm@gmail.com|pass");
            p.println("2|naiksatwik99@gmail.com|pass");
        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
    }

    void initializeMarks() throws IOException {
        String fileName = "Marks.txt";
        File file = new File(FS_FolderName + fileName);
        file.createNewFile();
        try (FileWriter f = new FileWriter(file, false); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
            p.println("1|60|40|60|80|75|66|0|0");
            p.println("2|67|47|80|89|55|86|0|0");
        } catch (IOException i) {
            i.printStackTrace();
        }
        FS_Execute.sort(file, 0);
    }
}

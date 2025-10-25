import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



public class StudentDatabase {
    private ArrayList<Student> records;
    private String filename;

    public StudentDatabase(String filename)
    {
        this.filename=filename;
        this.records=new ArrayList<Student>();
    }


    public void readFromFile() throws Exception
    {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }
        try
        {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            records.clear();
            while (line != null) {
                records.add(createRecordFrom(line));
                
                line = br.readLine();
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }

    }


    public Student SearchStudent(int ID)
    {
        
        for(int i=0;i<records.size();i++)
        {
            if((records.get(i)).getStudentID()==ID)
            {
                return records.get(i);
            }
        }
        return null;
    }
}

    
     
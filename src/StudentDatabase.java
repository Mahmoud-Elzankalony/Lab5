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


    
    
    
}


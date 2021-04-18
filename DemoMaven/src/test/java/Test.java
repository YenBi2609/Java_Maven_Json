import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.junit.Assert;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.ArrayList;


public class Test {
    @org.junit.Test
    public void TransfertoJsonFileTest() throws IOException {

        ManageStudent manageStudent = new ManageStudent();

        ArrayList<Student> list = manageStudent.getList();

        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String JsonString = gson.toJson(list);
        FileWriter fw = null;
        try {
            fw = new FileWriter("JsonFile.json");
            char [] x = JsonString.toCharArray();
            for(char y : x){
                fw.write(y);
            }
            Assert.assertNotNull(fw);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fw.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
        StringBuilder builder = new StringBuilder();

        FileReader fr = new FileReader("JsonFile.json");
        int c;
        while((c = fr.read()) != -1){
                 builder.append( (char) c);
        }
        Type collectionType = new TypeToken<ArrayList<Student>>(){}.getType();
        ArrayList<Student> list2 = gson.fromJson(builder.toString(), collectionType);
        for (int i = 0; i < list2.size() ; i++) {
            list2.get(i).display();
        }
        Assert.assertNotNull(fr);
            fr.close();
    }
}


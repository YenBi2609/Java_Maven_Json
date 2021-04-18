
import java.util.ArrayList;

public class ManageStudent {
    private ArrayList<Student> list;
    public ManageStudent(){
        list = new ArrayList<>();
        list.add(new Student(1,"Hoang Anh"));
        list.add(new Student(2,"Yen"));
        list.add(new Student(3,"Hiep"));
        list.add(new Student(4,"Hao"));
        list.add(new Student(5,"Duong"));
    }

    public ArrayList<Student> getList() {
        return list;
    }
}
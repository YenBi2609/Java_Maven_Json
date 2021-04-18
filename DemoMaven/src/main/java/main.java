import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class main {
    public static void main(String[] args) {
        Address address = new Address("ly thuong kiet", "tang 4 FHome", "Da Nang", "Viet Nam");
        NestedObject nestedObject = new NestedObject("anh", "[email protected]", 22, true, address);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String result = gson.toJson(nestedObject);
        System.out.println(result);


        NestedObject nestedObject2 = gson.fromJson(result, NestedObject.class);
        System.out.println(nestedObject2);

    }
}

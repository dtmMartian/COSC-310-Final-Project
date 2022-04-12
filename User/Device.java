package User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Device {
    List<List<String>> master = new ArrayList<>();
    Map<List<String>, String> problems = new HashMap<>();



    public List GetMaster() {
        return master;
    }
}

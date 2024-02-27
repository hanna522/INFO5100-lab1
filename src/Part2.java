import java.util.ArrayList;

public class Part2 {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> switchedNames = new ArrayList<String>();

    public Part2() {
        names.add("Hanna");
        names.add("Tony");
        names.add("Polly");
        names.add("Alex");
        names.add("Ruby");

        switchedNames = switchNames(names);
    }

    public static ArrayList<String> switchNames(ArrayList<String> n) {
        ArrayList<String> switched = new ArrayList<String>();

        for (String name : n) {
            if (name.length() > 1) {
                String switchedName = name.substring(name.length() - 1).toUpperCase() + 
                                      name.substring(1, name.length() - 1) + 
                                      name.substring(0, 1).toLowerCase();
                switched.add(switchedName);
            } else {
                switched.add(name);
            }
        }
        return switched;
    }

    public static void printNames(ArrayList<String> n, String v) {
        System.out.print(v + " = {");
        for (int i=0; i<n.size(); i++) {
            if (i == n.size()-1) {
                System.out.print(n.get(i));
            } else {
                System.out.print(n.get(i) + ", ");
            }
        }
        System.out.println("}");
    }
}

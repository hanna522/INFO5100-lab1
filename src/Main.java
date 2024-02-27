import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //part1
        Part1 part1 = new Part1();
        Part1.printArray(part1.x, "x");
        Part1.printArray(part1.y, "y");
        Part1.printArray(part1.z, "z = x + y");
        
        //part2
        Part2 part2 = new Part2();
        Part2.printNames(part2.names, "Names");
        Part2.printNames(part2.switchedNames, "Names (switched)");
    }
}

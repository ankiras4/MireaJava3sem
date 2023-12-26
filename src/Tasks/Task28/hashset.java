package Tasks.Task28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class hashset
{
    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>(Arrays.asList("RED", "BLUE", "GREEN"));

        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);    // [BLUE, GREEN, RED]
    }
}
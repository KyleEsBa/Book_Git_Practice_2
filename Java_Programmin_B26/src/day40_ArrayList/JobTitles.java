package day40_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {
        ArrayList<String> allJobs=new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET","Developer","PO", "CEO","Dev op", "QA", "BA", "Chef"));
        System.out.println(allJobs);

        ArrayList<String> excluded=new ArrayList<>(Arrays.asList("PO"));
        System.out.println(excluded);
        allJobs.retainAll(Arrays.asList(excluded));
    }
}

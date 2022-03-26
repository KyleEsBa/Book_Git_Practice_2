package day36_methods;



public class ArrayIndexOf {
    public static void main(String[] args) {
        int[]a={12,5,1,5,8};
        System.out.println(indexOf(a,5));
        String[]strs={"Hello","Java","James","Hello"};
        System.out.println(indexOf(strs,"hello"));
    }

    public static int indexOf(String [] strs,String element){
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equalsIgnoreCase(element))
                return i;
        }
        return -1;
    }

    public static int indexOf(int [] nums, int element){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==element)
                return i;
        }
        return -1;
    }
}

public class Runner {
    public static void main(String args[]){
        //test your answers
        System.out.println(factorial(1)==1);
        System.out.println(factorial(5)==120);
        System.out.println(factorial(12)==479001600);

        System.out.println(fibonacci(3)==2);
        System.out.println(fibonacci(6)==8);
        System.out.println(fibonacci(40)==102334155);

        System.out.println(sumDigits(126)==9);
        System.out.println(sumDigits(10)==1);
        System.out.println(sumDigits(4378)==22);

        System.out.println(stringClean("yyzzza").equals("yza"));
        System.out.println(stringClean("112ab445").equals("12ab45"));
        System.out.println(stringClean("Hello, bookkeeper").equals("Helo, bokeper"));

        int[] testArray = {1, 2, 20};
        System.out.println(array220(testArray, 0));
        testArray = new int[] {3};
        System.out.println(!array220(testArray, 0));
        testArray = new int[] {1, 2, 3, 4, 5, 50, 6};
        System.out.println(array220(testArray, 0));

        System.out.println(strDist("catcowcat", "cat")==9);
        System.out.println(strDist("", "cat")==0);
        System.out.println(strDist("abccatcowcatcatxyz", "cat")==12);
    }

    public static int factorial(int n){
        if(n<1){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return factorial (n-1) * n;
        }
    }

    public static int fibonacci(int n){
        if(n<=0) {
            return 0;
        }else if(n<=2){
                return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int sumDigits(int n){
        if(n<0){
            return 0;
        }else if(n%10==n){
            return n;
        }else{
            return sumDigits(n/10) + n%10;
        }
    }

    public static String stringClean(String str){
        if(str.length()==1){
            return str;
        }else if(str.substring(0, 1).equals(str.substring(1, 2))){
            return stringClean(str.substring(1, str.length()));
        }else{
            return str.substring(0, 1) + stringClean(str.substring(1, str.length()));
        }
    }

    public static boolean array220(int[] nums, int index){
        if(index==nums.length){
            return false;
        }
        for(int n = index; n<nums.length; n++){
            if(nums[n]==nums[index]*10){
                return true;
            }
        }
        return array220(nums, index+1);
    }

    public static int strDist(String str, String sub){
        if(str.length()<sub.length()){
            return 0;
        }
        if(str.substring(0, sub.length()).equals(sub)){
            if(str.substring(str.length()-sub.length(), str.length()).equals(sub)){
                return str.length();
            }else{
                return strDist(str.substring(0, str.length()-1), sub);
            }
        }else{
            return strDist(str.substring(1, str.length()), sub);
        }
    }
}

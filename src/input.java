public class input {
    static String remVowel(String str)
    {
        return str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", "");
    }
    public static void main(String[] args)
    {
        String str = "Hello, have a good day";
        System.out.println(remVowel(str));
    }

}

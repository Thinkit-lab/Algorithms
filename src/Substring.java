public class Substring{
    public static void main(String[] args) {
        String[] names = {
                "Praveen Kumar",
                "Yuvraj Singh",
                "Harbhajan Singh",
                "Gurjit Singh",
                "Virat Kohli",
                "Rohit Sharma",
                "Sandeep Singh",
                "Milkha Singh"
        };

        int strArrLen = names.length;
        String surname = "Singh";
        int surnameLen = surname.length();

        for(int i = 0; i<=strArrLen-1; i++){
            int strtIndex = names[i].length() - surnameLen;
            String subStr = names[i].substring(strtIndex);

            if(subStr.equals(surname)){
                System.out.println(names[i]);
            }
        }

    }
}
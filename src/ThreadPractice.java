import java.util.Arrays;

public class ThreadPractice {
    public static void main(String[] args) {
        MyThread newThread = new MyThread();
        newThread.start();
        System.out.println(Arrays.toString(MyThread.arr));


    }
}

class MyThread extends Thread{
    public static int[] arr = {2,4,7,54,89,9,23,4,56,74,55};

    public void run(){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * 2;
        }
    }
}

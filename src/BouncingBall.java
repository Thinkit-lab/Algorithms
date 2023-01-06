public class BouncingBall {

        public static int bouncingBall(double h, double bounce, double window) {
            int count = 1;
            if(h>0 && bounce>0 && bounce<1 && window<h){
                while((h*bounce) > window){
                    count+=2;
                    h = h*bounce;
                }
            } else {
                count = -1;
            }
            return count;
        }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3, 1, 1.5));
    }

}

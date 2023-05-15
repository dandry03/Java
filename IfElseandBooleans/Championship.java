public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 500;    //gryffindor points
        int hufflepuff = 800;    //hufflepuff points

        if ((hufflepuff - gryffindor) >= 300) {
            System.out.println("Hufflepuff wins the House Cup!!! Congratulations!!!");
        } else if (hufflepuff >= gryffindor) {
            System.out.println("Hufflepuff gets second place!");
        } else if ((gryffindor - hufflepuff) <= 100) {
            System.out.println("Hufflepuff gets third place.");
        } else if ((gryffindor - hufflepuff) > 100) {
            System.out.println("Hufflepuff gets fourth place.");
        }

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        
    }
}

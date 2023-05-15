public class LogicalOperators {
        public static void main(String[] args) {
                int artGrade = 65;
                int englishGrade = 60;
                String language = "Java";

                if (artGrade > 75 || englishGrade > 75 || language.equals("Java")){
                       System.out.println("Congratulations, you got the scholarship!!!"); 
                } else {
                        System.out.println("We're sorry, you didn't get the scholarship.");
                }

                int credits = 56;
                double GPA = 1.5;

                if (credits >= 40 && GPA >= 2.0) {
                        System.out.println("You earned you diploma!");
                } else {
                        System.out.println("We're sorry, you need at least 40 credits and a minimum GPA of 2.0.");
                }
        }
}

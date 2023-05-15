public class BooleanComparisons {
        public static void main(String[] args) {
               
                int chemistryGrade = 95;
                //int biologyGrade = 85;
                int englishGrade = 75;

                System.out.println(chemistryGrade != englishGrade);

                double sales = 37.55;
                double costs = 5.55;

                System.out.println(costs <= sales);

                String sentence = "I love Cookies!";
                String sentence2 = "I love Cookies!";

                System.out.println(!sentence.equals(sentence2));
        }
}

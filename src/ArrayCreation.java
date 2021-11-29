public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        if (numbers.length >= 3) {

            double results = (numbers[0] + ((numbers.length-1)/2) + numbers.length-1) / 3;
double rounded= (int)(results+0.5);

            return rounded; // Make sure to update this line. It is a temporary placeholder to avoid an error.
        }
        return 0.0;
    }


    public static String stringArray(String[] friends) {

        if (friends.length == 5) {
            int one = friends[0].length() ;
            int two = friends[1].length() ;
            int three = friends[2].length() ;
            int four = friends[3].length() ;
            int five = friends[4].length() ;

            return "" + one + " " + two + " " + three + " " + four + " " + five;
            // Make sure to update this line. It is a temporary placeholder to avoid an error.
        } else {
            return "";
        }
    }


    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana",
                "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
        "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
        "Swahili", "Spanish", "English", "French", "English"};

        int pick= (int)(Math.random()*13);

        return "The capital of "+countries[pick]+" is "+capitals[pick]+" and the primary language is "+languages[pick];
    }
}

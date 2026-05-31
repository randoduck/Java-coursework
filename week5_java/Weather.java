public class Weather {

    public static class Forecast {
        private double temp;
        private double humidity;

        public Forecast(double temp, double humidity) {
            this.temp = temp;
            this.humidity = humidity;
        }

        public String predict() {
            if (temp > 30 && humidity < 50) {
                return "Sunny";
            } else if (humidity > 70) {
                return "Rainy";
            } else {
                return "Cloudy";
            }
        }

        public String details(String city) {
            return city + ": " + temp + " C, " + humidity + "%, " + predict();
        }
    }

    public static void main(String[] args) {
        Forecast f1 = new Forecast(40, 30);
        Forecast f2 = new Forecast(18, 85);
        Forecast f3 = new Forecast(26, 65);

        System.out.println(f1.details("Delhi"));
        System.out.println(f2.details("Bengaluru"));
        System.out.println(f3.details("Mumbai"));
    }
}

public final class App {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService(new RealHttpClient());
        Weather weather = weatherService.getWeatherToday();
        System.out.println("Hello World!");
        System.out.println("The weather today is " + weather);
    }
}

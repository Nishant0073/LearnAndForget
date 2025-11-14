public class  WeatherData{

    private int temprature;
    private int humedity;

    public WeatherData(int temprature, int humedity) {
        this.temprature = temprature;
        this.humedity = humedity;
    }

    public int getTemprature() {
        return temprature;
    }
    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }
    public int getHumedity() {
        return humedity;
    }
    public void setHumedity(int humedity) {
        this.humedity = humedity;
    }

}

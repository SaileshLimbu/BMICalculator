package np.com.softwarica.secondassignment;

public class BMI {
    private float height;
    private float weight;

    public BMI(){

    }

    public BMI(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float calculateBMI(){
        float heightInMeter = height/100;
        return weight/(heightInMeter * heightInMeter);
    }

}

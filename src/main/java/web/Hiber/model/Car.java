package web.Hiber.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
    @Id @GeneratedValue
    private int id;
    private String model;
    private int series;
    private float hP;

    public Car(String model, int series, float hP) {
        this.model = model;
        this.series = series;
        this.hP = hP;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public float gethP() {
        return hP;
    }

    public void sethP(float hP) {
        this.hP = hP;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                ", hP=" + hP +
                '}';
    }
}

package hiber.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car")
public class Car implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Column (name = "model")
    private String model;
    @Column(name = "series")
    private int series;

    public Car(String model, int series) {

        this.model = model;
        this.series = series;
    }

    public Car() {

    }
    public void setUser(User user){
        this.user = user;
    }
    public User getUser() {
        return user; }


    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }


    @Override
    public String toString() {
        return "Car{" +
                "user=" + user.getId() +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }


}
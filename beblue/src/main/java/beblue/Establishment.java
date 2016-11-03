package beblue;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by MrViking on 02/11/2016.
 */
@Entity
public class Establishment {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cb_sun")
    private float cb_sun;
    @JsonProperty("cb_mon")
    private float cb_mon;
    @JsonProperty("cb_tue")
    private float cb_tue;
    @JsonProperty("cb_wed")
    private float cb_wed;
    @JsonProperty("cb_thu")
    private float cb_thu;
    @JsonProperty("cb_fri")
    private float cb_fri;
    @JsonProperty("cb_sat")
    private float cb_sat;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    public float getCb_sun() {
        return cb_sun;
    }

    public void setCb_sun(float cb_sun) {
        this.cb_sun = cb_sun;
    }

    @Basic
    public float getCb_mon() {
        return cb_mon;
    }

    public void setCb_mon(float cb_mon) {
        this.cb_mon = cb_mon;
    }

    @Basic
    public float getCb_tue() {
        return cb_tue;
    }

    public void setCb_tue(float cb_tue) {
        this.cb_tue = cb_tue;
    }

    @Basic
    public float getCb_wed() {
        return cb_wed;
    }

    public void setCb_wed(float cb_wed) {
        this.cb_wed = cb_wed;
    }

    @Basic
    public float getCb_thu() {
        return cb_thu;
    }

    public void setCb_thu(float cb_thu) {
        this.cb_thu = cb_thu;
    }

    @Basic
    public float getCb_fri() {
        return cb_fri;
    }

    public void setCb_fri(float cb_fri) {
        this.cb_fri = cb_fri;
    }

    @Basic
    public float getCb_sat() {
        return cb_sat;
    }

    public void setCb_sat(float cb_sat) {
        this.cb_sat = cb_sat;
    }
}

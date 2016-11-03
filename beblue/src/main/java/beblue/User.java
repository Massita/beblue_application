package beblue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by MrViking on 02/11/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class User {

    @JsonProperty("name")
    private String name;
    @JsonProperty("user_cpf")
    private String userCpf;
    @JsonProperty("balance")
    private double balance;

    @Basic
    @Column(name = "name", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Basic
    @Column(name = "user_cpf", length = 15)
    public String getUserCpf() {
        return userCpf;
    }

    public void setUserCpf(String userCpf) {
        this.userCpf = userCpf;
    }

    @Basic
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

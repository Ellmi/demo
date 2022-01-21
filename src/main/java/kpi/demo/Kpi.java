package kpi.demo;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kpi")
@Data
public class Kpi {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @NotNull
    private String type;
    @NotNull
    private Date time;
    public Kpi(String type, Date time){
        this.setType(type);
        this.setTime(time);
    }
}

package kpi.demo;

import com.sun.istack.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class KpiDto {
    @NotNull
    private String type;
    @NotNull
    private Date time;
    public KpiDto(String type, Date time){
        this.setType(type);
        this.setTime(time);
    }
}

package kpi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KpiController {
    @Autowired
    private KpiService kpiService;
    @PostMapping("/kpi")
    public String create(@RequestBody KpiDto kpiRequest){
        kpiService.create(kpiRequest);
        return "ok";
    }
}

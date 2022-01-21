package kpi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class KpiService {
    private final KpiRepository kpiRepository;

    public KpiService(KpiRepository kpiRepository) {
        this.kpiRepository = kpiRepository;
    }

    public void create(KpiDto kpi) {
        kpiRepository.save(new Kpi(kpi.getType(), new Date()));
    }
}

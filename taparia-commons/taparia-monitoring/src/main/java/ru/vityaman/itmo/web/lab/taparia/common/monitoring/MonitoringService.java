package ru.vityaman.itmo.web.lab.taparia.common.monitoring;

import ru.vityaman.itmo.web.lab.taparia.common.monitoring.metric.Counter;

public interface MonitoringService {
    Counter counter(String name);

    default MonitoringService of(String namespace) {
        return new NamespacedMonitoringService(namespace, this);
    }
}

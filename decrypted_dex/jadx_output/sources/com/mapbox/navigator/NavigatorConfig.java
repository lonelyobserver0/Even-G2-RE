package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class NavigatorConfig implements Serializable {
    private ElectronicHorizonOptions electronicHorizonOptions;
    private IncidentsOptions incidentsOptions;
    private Boolean noSignalSimulationEnabled;
    private PollingConfig polling;
    private RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute;
    private Boolean useSensors;
    private Float voiceInstructionThreshold;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public NavigatorConfig(Float f10, ElectronicHorizonOptions electronicHorizonOptions, PollingConfig pollingConfig, IncidentsOptions incidentsOptions, Boolean bool, Boolean bool2, RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute) {
        this.voiceInstructionThreshold = f10;
        this.electronicHorizonOptions = electronicHorizonOptions;
        this.polling = pollingConfig;
        this.incidentsOptions = incidentsOptions;
        this.noSignalSimulationEnabled = bool;
        this.useSensors = bool2;
        this.rerouteStrategyForMatchRoute = rerouteStrategyForMatchRoute;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigatorConfig navigatorConfig = (NavigatorConfig) obj;
        return Objects.equals(this.voiceInstructionThreshold, navigatorConfig.voiceInstructionThreshold) && Objects.equals(this.electronicHorizonOptions, navigatorConfig.electronicHorizonOptions) && Objects.equals(this.polling, navigatorConfig.polling) && Objects.equals(this.incidentsOptions, navigatorConfig.incidentsOptions) && Objects.equals(this.noSignalSimulationEnabled, navigatorConfig.noSignalSimulationEnabled) && Objects.equals(this.useSensors, navigatorConfig.useSensors) && Objects.equals(this.rerouteStrategyForMatchRoute, navigatorConfig.rerouteStrategyForMatchRoute);
    }

    public ElectronicHorizonOptions getElectronicHorizonOptions() {
        return this.electronicHorizonOptions;
    }

    public IncidentsOptions getIncidentsOptions() {
        return this.incidentsOptions;
    }

    public Boolean getNoSignalSimulationEnabled() {
        return this.noSignalSimulationEnabled;
    }

    public PollingConfig getPolling() {
        return this.polling;
    }

    public RerouteStrategyForMatchRoute getRerouteStrategyForMatchRoute() {
        return this.rerouteStrategyForMatchRoute;
    }

    public Boolean getUseSensors() {
        return this.useSensors;
    }

    public Float getVoiceInstructionThreshold() {
        return this.voiceInstructionThreshold;
    }

    public int hashCode() {
        return Objects.hash(this.voiceInstructionThreshold, this.electronicHorizonOptions, this.polling, this.incidentsOptions, this.noSignalSimulationEnabled, this.useSensors, this.rerouteStrategyForMatchRoute);
    }

    public void setElectronicHorizonOptions(ElectronicHorizonOptions electronicHorizonOptions) {
        this.electronicHorizonOptions = electronicHorizonOptions;
    }

    public void setIncidentsOptions(IncidentsOptions incidentsOptions) {
        this.incidentsOptions = incidentsOptions;
    }

    public void setNoSignalSimulationEnabled(Boolean bool) {
        this.noSignalSimulationEnabled = bool;
    }

    public void setPolling(PollingConfig pollingConfig) {
        this.polling = pollingConfig;
    }

    public void setRerouteStrategyForMatchRoute(RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute) {
        this.rerouteStrategyForMatchRoute = rerouteStrategyForMatchRoute;
    }

    public void setUseSensors(Boolean bool) {
        this.useSensors = bool;
    }

    public void setVoiceInstructionThreshold(Float f10) {
        this.voiceInstructionThreshold = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[voiceInstructionThreshold: ");
        b.s(this.voiceInstructionThreshold, sb2, ", electronicHorizonOptions: ");
        sb2.append(RecordUtils.fieldToString(this.electronicHorizonOptions));
        sb2.append(", polling: ");
        sb2.append(RecordUtils.fieldToString(this.polling));
        sb2.append(", incidentsOptions: ");
        sb2.append(RecordUtils.fieldToString(this.incidentsOptions));
        sb2.append(", noSignalSimulationEnabled: ");
        b.w(sb2, ", useSensors: ", this.noSignalSimulationEnabled);
        b.w(sb2, ", rerouteStrategyForMatchRoute: ", this.useSensors);
        sb2.append(RecordUtils.fieldToString(this.rerouteStrategyForMatchRoute));
        sb2.append("]");
        return sb2.toString();
    }
}

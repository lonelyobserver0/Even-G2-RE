package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EventsMetadata implements Serializable {
    private final AppMetadata appMetadata;
    private final AudioType audioType;
    private final Byte batteryLevel;
    private final Boolean batteryPluggedIn;
    private final String connectivity;
    private final Byte percentTimeInForeground;
    private final Byte percentTimeInPortrait;
    private final Byte screenBrightness;
    private final Byte volumeLevel;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public EventsMetadata(Byte b2, AudioType audioType, Byte b10, Byte b11, Byte b12, Boolean bool, Byte b13, String str, AppMetadata appMetadata) {
        this.volumeLevel = b2;
        this.audioType = audioType;
        this.screenBrightness = b10;
        this.percentTimeInForeground = b11;
        this.percentTimeInPortrait = b12;
        this.batteryPluggedIn = bool;
        this.batteryLevel = b13;
        this.connectivity = str;
        this.appMetadata = appMetadata;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventsMetadata eventsMetadata = (EventsMetadata) obj;
        return Objects.equals(this.volumeLevel, eventsMetadata.volumeLevel) && Objects.equals(this.audioType, eventsMetadata.audioType) && Objects.equals(this.screenBrightness, eventsMetadata.screenBrightness) && Objects.equals(this.percentTimeInForeground, eventsMetadata.percentTimeInForeground) && Objects.equals(this.percentTimeInPortrait, eventsMetadata.percentTimeInPortrait) && Objects.equals(this.batteryPluggedIn, eventsMetadata.batteryPluggedIn) && Objects.equals(this.batteryLevel, eventsMetadata.batteryLevel) && Objects.equals(this.connectivity, eventsMetadata.connectivity) && Objects.equals(this.appMetadata, eventsMetadata.appMetadata);
    }

    public AppMetadata getAppMetadata() {
        return this.appMetadata;
    }

    public AudioType getAudioType() {
        return this.audioType;
    }

    public Byte getBatteryLevel() {
        return this.batteryLevel;
    }

    public Boolean getBatteryPluggedIn() {
        return this.batteryPluggedIn;
    }

    public String getConnectivity() {
        return this.connectivity;
    }

    public Byte getPercentTimeInForeground() {
        return this.percentTimeInForeground;
    }

    public Byte getPercentTimeInPortrait() {
        return this.percentTimeInPortrait;
    }

    public Byte getScreenBrightness() {
        return this.screenBrightness;
    }

    public Byte getVolumeLevel() {
        return this.volumeLevel;
    }

    public int hashCode() {
        return Objects.hash(this.volumeLevel, this.audioType, this.screenBrightness, this.percentTimeInForeground, this.percentTimeInPortrait, this.batteryPluggedIn, this.batteryLevel, this.connectivity, this.appMetadata);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[volumeLevel: ");
        sb2.append(RecordUtils.fieldToString(this.volumeLevel));
        sb2.append(", audioType: ");
        sb2.append(RecordUtils.fieldToString(this.audioType));
        sb2.append(", screenBrightness: ");
        sb2.append(RecordUtils.fieldToString(this.screenBrightness));
        sb2.append(", percentTimeInForeground: ");
        sb2.append(RecordUtils.fieldToString(this.percentTimeInForeground));
        sb2.append(", percentTimeInPortrait: ");
        sb2.append(RecordUtils.fieldToString(this.percentTimeInPortrait));
        sb2.append(", batteryPluggedIn: ");
        b.w(sb2, ", batteryLevel: ", this.batteryPluggedIn);
        sb2.append(RecordUtils.fieldToString(this.batteryLevel));
        sb2.append(", connectivity: ");
        h.z(sb2, this.connectivity, ", appMetadata: ");
        sb2.append(RecordUtils.fieldToString(this.appMetadata));
        sb2.append("]");
        return sb2.toString();
    }
}

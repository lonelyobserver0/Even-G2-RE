package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class SystemInformation implements Serializable {
    private final String applicationBuildNumber;
    private final String applicationCachePath;
    private final String applicationDataPath;
    private final String applicationName;
    private final String applicationPackage;
    private final String applicationVersion;
    private final String architecture;
    private final String device;
    private final String deviceInfo;
    private final boolean isPhysicalDevice;
    private final Platform platform;
    private final String platformName;
    private final String platformVersion;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SystemInformation(Platform platform, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, String str11) {
        this.platform = platform;
        this.platformName = str;
        this.platformVersion = str2;
        this.applicationName = str3;
        this.applicationPackage = str4;
        this.applicationVersion = str5;
        this.applicationBuildNumber = str6;
        this.device = str7;
        this.architecture = str8;
        this.deviceInfo = str9;
        this.applicationDataPath = str10;
        this.isPhysicalDevice = z2;
        this.applicationCachePath = str11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemInformation systemInformation = (SystemInformation) obj;
        return Objects.equals(this.platform, systemInformation.platform) && Objects.equals(this.platformName, systemInformation.platformName) && Objects.equals(this.platformVersion, systemInformation.platformVersion) && Objects.equals(this.applicationName, systemInformation.applicationName) && Objects.equals(this.applicationPackage, systemInformation.applicationPackage) && Objects.equals(this.applicationVersion, systemInformation.applicationVersion) && Objects.equals(this.applicationBuildNumber, systemInformation.applicationBuildNumber) && Objects.equals(this.device, systemInformation.device) && Objects.equals(this.architecture, systemInformation.architecture) && Objects.equals(this.deviceInfo, systemInformation.deviceInfo) && Objects.equals(this.applicationDataPath, systemInformation.applicationDataPath) && this.isPhysicalDevice == systemInformation.isPhysicalDevice && Objects.equals(this.applicationCachePath, systemInformation.applicationCachePath);
    }

    public String getApplicationBuildNumber() {
        return this.applicationBuildNumber;
    }

    public String getApplicationCachePath() {
        return this.applicationCachePath;
    }

    public String getApplicationDataPath() {
        return this.applicationDataPath;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public String getApplicationPackage() {
        return this.applicationPackage;
    }

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public String getArchitecture() {
        return this.architecture;
    }

    public String getDevice() {
        return this.device;
    }

    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public boolean getIsPhysicalDevice() {
        return this.isPhysicalDevice;
    }

    public Platform getPlatform() {
        return this.platform;
    }

    public String getPlatformName() {
        return this.platformName;
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public native String getPrettyDeviceName();

    public int hashCode() {
        return Objects.hash(this.platform, this.platformName, this.platformVersion, this.applicationName, this.applicationPackage, this.applicationVersion, this.applicationBuildNumber, this.device, this.architecture, this.deviceInfo, this.applicationDataPath, Boolean.valueOf(this.isPhysicalDevice), this.applicationCachePath);
    }

    public native long runningTime();

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[platform: ");
        sb2.append(RecordUtils.fieldToString(this.platform));
        sb2.append(", platformName: ");
        h.z(sb2, this.platformName, ", platformVersion: ");
        h.z(sb2, this.platformVersion, ", applicationName: ");
        h.z(sb2, this.applicationName, ", applicationPackage: ");
        h.z(sb2, this.applicationPackage, ", applicationVersion: ");
        h.z(sb2, this.applicationVersion, ", applicationBuildNumber: ");
        h.z(sb2, this.applicationBuildNumber, ", device: ");
        h.z(sb2, this.device, ", architecture: ");
        h.z(sb2, this.architecture, ", deviceInfo: ");
        h.z(sb2, this.deviceInfo, ", applicationDataPath: ");
        h.z(sb2, this.applicationDataPath, ", isPhysicalDevice: ");
        h.A(this.isPhysicalDevice, sb2, ", applicationCachePath: ");
        return h.t(sb2, this.applicationCachePath, "]");
    }

    public native long totalMemory();
}

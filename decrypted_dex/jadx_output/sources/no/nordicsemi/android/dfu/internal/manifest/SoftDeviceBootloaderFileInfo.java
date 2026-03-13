package no.nordicsemi.android.dfu.internal.manifest;

import com.google.gson.annotations.SerializedName;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SoftDeviceBootloaderFileInfo extends FileInfo {

    @SerializedName("bl_size")
    private int bootloaderSize;

    @SerializedName("sd_size")
    private int softdeviceSize;

    public int getBootloaderSize() {
        return this.bootloaderSize;
    }

    public int getSoftdeviceSize() {
        return this.softdeviceSize;
    }
}

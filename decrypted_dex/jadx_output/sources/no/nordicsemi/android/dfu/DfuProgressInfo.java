package no.nordicsemi.android.dfu;

import android.os.SystemClock;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DfuProgressInfo {
    private int bytesReceived;
    private int bytesSent;
    private int currentPart;
    private int imageSizeInBytes;
    private int initialBytesSent;
    private int lastBytesSent;
    private long lastProgressTime;
    private final ProgressListener mListener;
    private int maxObjectSizeInBytes;
    private int progress;
    private long timeStart;
    private int totalParts;

    public interface ProgressListener {
        void updateProgressNotification();
    }

    public DfuProgressInfo(ProgressListener progressListener) {
        this.mListener = progressListener;
    }

    public void addBytesSent(int i3) {
        setBytesSent(this.bytesSent + i3);
    }

    public int getAvailableObjectSizeIsBytes() {
        int i3 = this.imageSizeInBytes;
        int i10 = this.bytesSent;
        int i11 = this.maxObjectSizeInBytes;
        return Math.min(i3 - i10, i11 - (i10 % i11));
    }

    public float getAverageSpeed() {
        if (SystemClock.elapsedRealtime() - this.timeStart != 0) {
            return (this.bytesSent - this.initialBytesSent) / (r0 - r2);
        }
        return 0.0f;
    }

    public int getBytesReceived() {
        return this.bytesReceived;
    }

    public int getBytesSent() {
        return this.bytesSent;
    }

    public int getCurrentPart() {
        return this.currentPart;
    }

    public int getImageSizeInBytes() {
        return this.imageSizeInBytes;
    }

    public int getProgress() {
        return this.progress;
    }

    public float getSpeed() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        float f10 = elapsedRealtime - this.timeStart != 0 ? (this.bytesSent - this.lastBytesSent) / (elapsedRealtime - this.lastProgressTime) : 0.0f;
        this.lastProgressTime = elapsedRealtime;
        this.lastBytesSent = this.bytesSent;
        return f10;
    }

    public int getTotalParts() {
        return this.totalParts;
    }

    public void init(int i3, int i10, int i11) {
        this.imageSizeInBytes = i3;
        this.maxObjectSizeInBytes = IntCompanionObject.MAX_VALUE;
        this.currentPart = i10;
        this.totalParts = i11;
    }

    public boolean isComplete() {
        return this.bytesSent == this.imageSizeInBytes;
    }

    public boolean isLastPart() {
        return this.currentPart == this.totalParts;
    }

    public boolean isObjectComplete() {
        return this.bytesSent % this.maxObjectSizeInBytes == 0;
    }

    public void setBytesReceived(int i3) {
        this.bytesReceived = i3;
    }

    public void setBytesSent(int i3) {
        if (this.timeStart == 0) {
            this.timeStart = SystemClock.elapsedRealtime();
            this.initialBytesSent = i3;
        }
        this.bytesSent = i3;
        this.progress = (int) ((i3 * 100.0f) / this.imageSizeInBytes);
        this.mListener.updateProgressNotification();
    }

    public void setMaxObjectSizeInBytes(int i3) {
        this.maxObjectSizeInBytes = i3;
    }

    public void setProgress(int i3) {
        this.progress = i3;
        this.mListener.updateProgressNotification();
    }

    public DfuProgressInfo setTotalPart(int i3) {
        this.totalParts = i3;
        return this;
    }
}

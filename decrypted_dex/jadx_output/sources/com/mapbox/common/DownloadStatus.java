package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DownloadStatus implements Serializable {
    private long downloadId;
    private DownloadOptions downloadOptions;
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long receivedBytes;
    private TransferState state;
    private Long totalBytes;
    private long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadStatus(long j, TransferState transferState, TransferError transferError, Long l9, long j3, long j10, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.downloadId = j;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l9;
        this.receivedBytes = j3;
        this.transferredBytes = j10;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStatus downloadStatus = (DownloadStatus) obj;
        return this.downloadId == downloadStatus.downloadId && Objects.equals(this.state, downloadStatus.state) && Objects.equals(this.error, downloadStatus.error) && Objects.equals(this.totalBytes, downloadStatus.totalBytes) && this.receivedBytes == downloadStatus.receivedBytes && this.transferredBytes == downloadStatus.transferredBytes && Objects.equals(this.downloadOptions, downloadStatus.downloadOptions) && Objects.equals(this.httpResult, downloadStatus.httpResult);
    }

    public long getDownloadId() {
        return this.downloadId;
    }

    public DownloadOptions getDownloadOptions() {
        return this.downloadOptions;
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getReceivedBytes() {
        return this.receivedBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.downloadId), this.state, this.error, this.totalBytes, Long.valueOf(this.receivedBytes), Long.valueOf(this.transferredBytes), this.downloadOptions, this.httpResult);
    }

    public void setDownloadId(long j) {
        this.downloadId = j;
    }

    public void setDownloadOptions(DownloadOptions downloadOptions) {
        this.downloadOptions = downloadOptions;
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setReceivedBytes(long j) {
        this.receivedBytes = j;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l9) {
        this.totalBytes = l9;
    }

    public void setTransferredBytes(long j) {
        this.transferredBytes = j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[downloadId: ");
        b.p(this.downloadId, sb2, ", state: ");
        sb2.append(RecordUtils.fieldToString(this.state));
        sb2.append(", error: ");
        sb2.append(RecordUtils.fieldToString(this.error));
        sb2.append(", totalBytes: ");
        b.u(this.totalBytes, sb2, ", receivedBytes: ");
        b.p(this.receivedBytes, sb2, ", transferredBytes: ");
        b.p(this.transferredBytes, sb2, ", downloadOptions: ");
        sb2.append(RecordUtils.fieldToString(this.downloadOptions));
        sb2.append(", httpResult: ");
        sb2.append(RecordUtils.fieldToString(this.httpResult));
        sb2.append("]");
        return sb2.toString();
    }

    public DownloadStatus(TransferError transferError, Long l9, DownloadOptions downloadOptions, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l9;
        this.downloadOptions = downloadOptions;
        this.httpResult = expected;
        this.downloadId = 0L;
        this.state = TransferState.PENDING;
        this.receivedBytes = 0L;
        this.transferredBytes = 0L;
    }
}

package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UploadStatus implements Serializable {
    private TransferError error;
    private Expected<HttpRequestError, HttpResponseData> httpResult;
    private long sentBytes;
    private TransferState state;
    private Long totalBytes;
    private long totalSentBytes;
    private long uploadId;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadStatus(long j, TransferState transferState, TransferError transferError, Long l9, long j3, long j10, Expected<HttpRequestError, HttpResponseData> expected) {
        this.uploadId = j;
        this.state = transferState;
        this.error = transferError;
        this.totalBytes = l9;
        this.sentBytes = j3;
        this.totalSentBytes = j10;
        this.httpResult = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadStatus uploadStatus = (UploadStatus) obj;
        return this.uploadId == uploadStatus.uploadId && Objects.equals(this.state, uploadStatus.state) && Objects.equals(this.error, uploadStatus.error) && Objects.equals(this.totalBytes, uploadStatus.totalBytes) && this.sentBytes == uploadStatus.sentBytes && this.totalSentBytes == uploadStatus.totalSentBytes && Objects.equals(this.httpResult, uploadStatus.httpResult);
    }

    public TransferError getError() {
        return this.error;
    }

    public Expected<HttpRequestError, HttpResponseData> getHttpResult() {
        return this.httpResult;
    }

    public long getSentBytes() {
        return this.sentBytes;
    }

    public TransferState getState() {
        return this.state;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTotalSentBytes() {
        return this.totalSentBytes;
    }

    public long getUploadId() {
        return this.uploadId;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.uploadId), this.state, this.error, this.totalBytes, Long.valueOf(this.sentBytes), Long.valueOf(this.totalSentBytes), this.httpResult);
    }

    public void setError(TransferError transferError) {
        this.error = transferError;
    }

    public void setHttpResult(Expected<HttpRequestError, HttpResponseData> expected) {
        this.httpResult = expected;
    }

    public void setSentBytes(long j) {
        this.sentBytes = j;
    }

    public void setState(TransferState transferState) {
        this.state = transferState;
    }

    public void setTotalBytes(Long l9) {
        this.totalBytes = l9;
    }

    public void setTotalSentBytes(long j) {
        this.totalSentBytes = j;
    }

    public void setUploadId(long j) {
        this.uploadId = j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[uploadId: ");
        b.p(this.uploadId, sb2, ", state: ");
        sb2.append(RecordUtils.fieldToString(this.state));
        sb2.append(", error: ");
        sb2.append(RecordUtils.fieldToString(this.error));
        sb2.append(", totalBytes: ");
        b.u(this.totalBytes, sb2, ", sentBytes: ");
        b.p(this.sentBytes, sb2, ", totalSentBytes: ");
        b.p(this.totalSentBytes, sb2, ", httpResult: ");
        sb2.append(RecordUtils.fieldToString(this.httpResult));
        sb2.append("]");
        return sb2.toString();
    }

    public UploadStatus(TransferError transferError, Long l9, Expected<HttpRequestError, HttpResponseData> expected) {
        this.error = transferError;
        this.totalBytes = l9;
        this.httpResult = expected;
        this.uploadId = 0L;
        this.state = TransferState.PENDING;
        this.sentBytes = 0L;
        this.totalSentBytes = 0L;
    }
}

package com.mapbox.common;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface HttpServiceInterface {
    void cancelRequest(long j, ResultCallback resultCallback);

    void cancelUpload(long j, ResultCallback resultCallback);

    long download(DownloadOptions downloadOptions, DownloadStatusCallback downloadStatusCallback);

    long request(HttpRequest httpRequest, HttpResponseCallback httpResponseCallback);

    void setInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    void setMaxRequestsPerHost(byte b2);

    @Deprecated
    boolean supportsKeepCompression();

    long upload(UploadOptions uploadOptions, UploadStatusCallback uploadStatusCallback);
}

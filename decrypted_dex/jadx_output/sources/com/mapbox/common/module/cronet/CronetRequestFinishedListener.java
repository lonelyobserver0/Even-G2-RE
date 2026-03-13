package com.mapbox.common.module.cronet;

import com.mapbox.common.NetworkUsageMetricsMeter;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.RequestFinishedInfo;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/mapbox/common/module/cronet/CronetRequestFinishedListener;", "Lorg/chromium/net/RequestFinishedInfo$Listener;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "onRequestFinished", "", "requestInfo", "Lorg/chromium/net/RequestFinishedInfo;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CronetRequestFinishedListener extends RequestFinishedInfo.Listener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetRequestFinishedListener(Executor executor) {
        super(executor);
        Intrinsics.checkNotNullParameter(executor, "executor");
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestInfo) {
        Intrinsics.checkNotNull(requestInfo);
        RequestFinishedInfo.Metrics metrics = requestInfo.getMetrics();
        String url = requestInfo.getUrl();
        Intrinsics.checkNotNull(url);
        Long sentByteCount = metrics.getSentByteCount();
        Intrinsics.checkNotNull(sentByteCount);
        int longValue = (int) sentByteCount.longValue();
        Long receivedByteCount = metrics.getReceivedByteCount();
        Intrinsics.checkNotNull(receivedByteCount);
        NetworkUsageMetricsMeter.onBytesTransferred(url, longValue, (int) receivedByteCount.longValue());
    }
}

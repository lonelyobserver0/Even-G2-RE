package com.mapbox.common.module;

import com.mapbox.common.HttpRequestError;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/module/RequestDetail;", "", "cancel", "", "error", "Lcom/mapbox/common/HttpRequestError;", "start", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface RequestDetail {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(RequestDetail requestDetail, HttpRequestError httpRequestError, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(StubApp.getString2(13754));
            }
            if ((i3 & 1) != 0) {
                httpRequestError = null;
            }
            requestDetail.cancel(httpRequestError);
        }
    }

    void cancel(HttpRequestError error);

    void start();
}

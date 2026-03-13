package com.mapbox.common.module.okhttp;

import Ac.j;
import android.util.Log;
import com.mapbox.common.NetworkUsageMetricsMeter;
import com.mapbox.common.module.cronet.a;
import com.stub.StubApp;
import java.io.IOException;
import wc.C1881F;
import wc.InterfaceC1887d;
import wc.p;
import wc.q;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NetworkUsageListener extends q {
    public static NetworkUsageMetricCallback CALLBACK;
    private long bytesRequest;
    private long bytesResponse;
    private boolean reported;
    private static final String TAG = StubApp.getString2(13788);
    public static final p FACTORY = new a(1);

    public interface NetworkUsageMetricCallback {
        void onBytesTransferred(String str, long j, long j3);
    }

    private NetworkUsageListener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q lambda$static$0(InterfaceC1887d interfaceC1887d) {
        return new NetworkUsageListener();
    }

    private void notifyCallback(InterfaceC1887d interfaceC1887d) {
        if (this.reported) {
            return;
        }
        String str = ((j) interfaceC1887d).f335b.f22493a.f22425h;
        NetworkUsageMetricCallback networkUsageMetricCallback = CALLBACK;
        if (networkUsageMetricCallback != null) {
            try {
                networkUsageMetricCallback.onBytesTransferred(str, this.bytesRequest, this.bytesResponse);
            } catch (NullPointerException e10) {
                Log.w(StubApp.getString2(13788), StubApp.getString2(13789), e10);
            }
        }
        notifyInternalMetrics(str, (int) this.bytesRequest, (int) this.bytesResponse);
        this.reported = true;
    }

    public static void notifyInternalMetrics(String str, int i3, int i10) {
        NetworkUsageMetricsMeter.onBytesTransferred(str, i3, i10);
    }

    @Override // wc.q
    public void callEnd(InterfaceC1887d interfaceC1887d) {
        super.callEnd(interfaceC1887d);
        notifyCallback(interfaceC1887d);
    }

    @Override // wc.q
    public void callFailed(InterfaceC1887d interfaceC1887d, IOException iOException) {
        super.callFailed(interfaceC1887d, iOException);
        notifyCallback(interfaceC1887d);
    }

    @Override // wc.q
    public void requestBodyEnd(InterfaceC1887d interfaceC1887d, long j) {
        super.requestBodyEnd(interfaceC1887d, j);
        this.bytesRequest += j;
    }

    @Override // wc.q
    public void requestHeadersEnd(InterfaceC1887d interfaceC1887d, z zVar) {
        super.requestHeadersEnd(interfaceC1887d, zVar);
        long j = this.bytesRequest;
        String[] strArr = zVar.f22495c.f22417a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += str.length();
        }
        this.bytesRequest = length + j;
    }

    @Override // wc.q
    public void responseBodyEnd(InterfaceC1887d interfaceC1887d, long j) {
        super.responseBodyEnd(interfaceC1887d, j);
        this.bytesResponse += j;
    }

    @Override // wc.q
    public void responseHeadersEnd(InterfaceC1887d interfaceC1887d, C1881F c1881f) {
        super.responseHeadersEnd(interfaceC1887d, c1881f);
        long j = this.bytesResponse;
        String[] strArr = c1881f.f22330f.f22417a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += str.length();
        }
        this.bytesResponse = length + j;
    }
}

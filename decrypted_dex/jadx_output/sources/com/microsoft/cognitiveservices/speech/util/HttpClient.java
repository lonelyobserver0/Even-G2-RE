package com.microsoft.cognitiveservices.speech.util;

import N9.a;
import N9.c;
import com.stub.StubApp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f12739a;

    public HttpClient() {
        setCacheFilePath(System.getProperty(StubApp.getString2(15716)));
        this.f12739a = createExecutor();
        createClientInstance();
    }

    public native void createClientInstance();

    public ExecutorService createExecutor() {
        return Executors.newFixedThreadPool(2);
    }

    public FutureTask<Boolean> createTask(String str, String str2, byte[] bArr, String str3, int[] iArr, byte[] bArr2) {
        try {
            return new a(new c(this, str, str2, bArr, str3, iArr, bArr2), Boolean.TRUE);
        } catch (Exception unused) {
            return null;
        }
    }

    public native void deleteClientInstance();

    public native void dispatchCallback(String str, int i3, Object[] objArr, byte[] bArr);

    public void executeTask(FutureTask<Boolean> futureTask) {
        this.f12739a.execute(futureTask);
    }

    public void finalize() {
        deleteClientInstance();
        this.f12739a.shutdown();
    }

    public boolean hasConnectivityManager() {
        return true;
    }

    public URL newUrl(String str) throws MalformedURLException {
        return new URL(str);
    }

    public native void onCostChange(boolean z2);

    public native void onPowerChange(boolean z2, boolean z10);

    public native void setCacheFilePath(String str);

    public native void setDeviceInfo(String str, String str2, String str3);

    public native void setSystemInfo(String str, String str2, String str3, String str4, String str5, String str6);
}

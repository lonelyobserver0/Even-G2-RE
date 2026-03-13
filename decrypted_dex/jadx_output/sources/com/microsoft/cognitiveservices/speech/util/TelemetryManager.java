package com.microsoft.cognitiveservices.speech.util;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TelemetryManager {

    /* renamed from: b, reason: collision with root package name */
    public static volatile TelemetryManager f12750b;

    /* renamed from: a, reason: collision with root package name */
    public HttpClient f12751a;

    public static TelemetryManager getSingleton() {
        if (f12750b == null) {
            synchronized (TelemetryManager.class) {
                if (f12750b == null) {
                    try {
                        System.loadLibrary(StubApp.getString2("16151"));
                    } catch (Exception unused) {
                        System.loadLibrary(StubApp.getString2("16151"));
                    }
                    TelemetryManager telemetryManager = new TelemetryManager();
                    telemetryManager.f12751a = new HttpClient();
                    f12750b = telemetryManager;
                }
            }
        }
        return f12750b;
    }
}

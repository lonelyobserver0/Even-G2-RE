package com.microsoft.cognitiveservices.speech.util;

import android.content.Context;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ContextHolder {

    /* renamed from: b, reason: collision with root package name */
    public static volatile ContextHolder f12733b;

    /* renamed from: a, reason: collision with root package name */
    public Context f12734a;

    public static synchronized ContextHolder getInstance() {
        ContextHolder contextHolder;
        synchronized (ContextHolder.class) {
            try {
                if (f12733b == null) {
                    f12733b = new ContextHolder();
                }
                contextHolder = f12733b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return contextHolder;
    }

    public Context getContext() {
        return this.f12734a;
    }

    public void setContext(Context context) {
        this.f12734a = context != null ? StubApp.getOrigApplicationContext(context.getApplicationContext()) : null;
    }
}

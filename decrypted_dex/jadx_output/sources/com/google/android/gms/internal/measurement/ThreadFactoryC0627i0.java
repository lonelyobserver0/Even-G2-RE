package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ThreadFactoryC0627i0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f11585a;

    public ThreadFactoryC0627i0(C0657o0 c0657o0) {
        Objects.requireNonNull(c0657o0);
        this.f11585a = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11585a.newThread(runnable);
        newThread.setName(StubApp.getString2(12093));
        return newThread;
    }
}

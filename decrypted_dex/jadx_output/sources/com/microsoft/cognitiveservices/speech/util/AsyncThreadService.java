package com.microsoft.cognitiveservices.speech.util;

import com.stub.StubApp;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class AsyncThreadService {

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f12728a;

    /* renamed from: b, reason: collision with root package name */
    public static int f12729b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12730c = new Object();

    public static void initialize() {
        synchronized (f12730c) {
            try {
                if (f12729b == 0) {
                    f12728a = Executors.newCachedThreadPool();
                }
                f12729b++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void shutdown() {
        synchronized (f12730c) {
            try {
                int i3 = f12729b - 1;
                f12729b = i3;
                if (i3 == 0) {
                    f12728a.shutdownNow();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        Future<T> submit;
        synchronized (f12730c) {
            try {
                if (f12728a.isShutdown() || f12729b == 0) {
                    throw new IllegalStateException(StubApp.getString2("16099"), new IllegalStateException());
                }
                submit = f12728a.submit(callable);
            } catch (Throwable th) {
                throw th;
            }
        }
        return submit;
    }
}

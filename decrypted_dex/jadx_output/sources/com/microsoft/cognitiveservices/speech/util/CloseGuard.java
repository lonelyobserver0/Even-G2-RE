package com.microsoft.cognitiveservices.speech.util;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class CloseGuard {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f12731a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12732b;

    public CloseGuard() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f12731a = atomicBoolean;
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f12732b = atomicInteger;
        atomicBoolean.set(false);
        atomicInteger.set(0);
    }

    public void closeObject() {
        this.f12731a.set(true);
        while (true) {
            int i3 = 0;
            while (true) {
                AtomicInteger atomicInteger = this.f12732b;
                if (atomicInteger.compareAndSet(0, -1) || atomicInteger.get() == -1) {
                    return;
                }
                int i10 = i3 + 1;
                if (i3 == 100) {
                    break;
                } else {
                    i3 = i10;
                }
            }
            Thread.yield();
        }
    }

    public void enterUseObject() {
        boolean z2 = this.f12731a.get();
        String string2 = StubApp.getString2(16100);
        if (z2) {
            throw new IllegalStateException(string2);
        }
        int i3 = 0;
        int i10 = 0;
        do {
            AtomicInteger atomicInteger = this.f12732b;
            if (atomicInteger.compareAndSet(i3, i3 + 1)) {
                return;
            }
            int i11 = i10 + 1;
            if (i10 == 100) {
                Thread.yield();
                i10 = 0;
            } else {
                i10 = i11;
            }
            i3 = atomicInteger.get();
        } while (i3 != -1);
        throw new IllegalStateException(string2);
    }

    public void exitUseObject() {
        this.f12732b.decrementAndGet();
    }
}

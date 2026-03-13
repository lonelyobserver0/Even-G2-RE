package com.microsoft.cognitiveservices.speech.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class EventHandlerImpl<T> {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f12736b;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f12738d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12735a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f12737c = false;

    public EventHandlerImpl(AtomicInteger atomicInteger) {
        this.f12738d = atomicInteger;
    }

    public void addEventListener(EventHandler<T> eventHandler) {
        synchronized (this) {
            try {
                if (!this.f12737c) {
                    this.f12737c = true;
                    Runnable runnable = this.f12736b;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12735a.add(eventHandler);
    }

    public void fireEvent(Object obj, T t3) {
        Iterator it = this.f12735a.iterator();
        while (it.hasNext()) {
            EventHandler eventHandler = (EventHandler) it.next();
            AtomicInteger atomicInteger = this.f12738d;
            if (atomicInteger != null) {
                atomicInteger.incrementAndGet();
            }
            eventHandler.onEvent(obj, t3);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
    }

    public boolean isUpdateNotificationOnConnectedFired() {
        return this.f12737c;
    }

    public void removeEventListener(EventHandler<T> eventHandler) {
        this.f12735a.remove(eventHandler);
    }

    public void updateNotificationOnConnected(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f12737c) {
                    runnable.run();
                }
                this.f12736b = runnable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

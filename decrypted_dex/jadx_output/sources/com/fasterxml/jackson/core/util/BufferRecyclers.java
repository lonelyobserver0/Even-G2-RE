package com.fasterxml.jackson.core.util;

import com.stub.StubApp;
import java.lang.ref.SoftReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BufferRecyclers {
    private static final ThreadLocalBufferManager _bufferRecyclerTracker;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef;

    static {
        boolean z2;
        try {
            z2 = StubApp.getString2("6547").equals(System.getProperty(StubApp.getString2("10491")));
        } catch (SecurityException unused) {
            z2 = false;
        }
        _bufferRecyclerTracker = z2 ? ThreadLocalBufferManager.instance() : null;
        _recyclerRef = new ThreadLocal<>();
    }

    public static BufferRecycler getBufferRecycler() {
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference<BufferRecycler> softReference = threadLocal.get();
        BufferRecycler bufferRecycler = softReference == null ? null : softReference.get();
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            ThreadLocalBufferManager threadLocalBufferManager = _bufferRecyclerTracker;
            threadLocal.set(threadLocalBufferManager != null ? threadLocalBufferManager.wrapAndTrack(bufferRecycler) : new SoftReference<>(bufferRecycler));
        }
        return bufferRecycler;
    }
}

package com.microsoft.cognitiveservices.speech.diagnostics.logging;

import com.microsoft.cognitiveservices.speech.diagnostics.logging.Logger;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class EventLogger {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12567a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static EventHandler f12568b;

    /* renamed from: c, reason: collision with root package name */
    public static SafeHandle f12569c;

    public interface EventHandler {
        void logMessage(String str);
    }

    public static void setCallback() {
        setCallback(null);
    }

    public static void setFilters() {
        Logger.f(new String[0]);
    }

    public static void setLevel(Level level) {
        Contracts.throwIfNull(level, StubApp.getString2(9577));
        Logger.g(Logger.Type.Event, level);
    }

    public static void setCallback(EventHandler eventHandler) {
        synchronized (f12567a) {
            try {
                if (eventHandler != null) {
                    SafeHandle safeHandle = new SafeHandle(System.identityHashCode(eventHandler), SafeHandleType.EventLoggerCallback);
                    f12569c = safeHandle;
                    Contracts.throwIfNull(safeHandle, StubApp.getString2("16019"));
                    f12568b = eventHandler;
                    Logger.e(eventHandler, f12569c.getValue());
                } else {
                    f12569c = null;
                    Logger.e(null, 0L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setFilters(String[] strArr) {
        Contracts.throwIfNull(strArr, StubApp.getString2(16020));
        Logger.f(strArr);
    }
}

package com.microsoft.cognitiveservices.speech.diagnostics.logging;

import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.diagnostics.logging.EventLogger;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.StringRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
abstract class Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type Event;
        public static final Type File;
        public static final Type Memory;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f12571a;

        static {
            Type type = new Type(StubApp.getString2(16022), 0);
            File = type;
            Type type2 = new Type(StubApp.getString2(16023), 1);
            Memory = type2;
            Type type3 = new Type(StubApp.getString2(16024), 2);
            Event = type3;
            f12571a = new Type[]{type, type2, type3};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f12571a.clone();
        }
    }

    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void a(String[] strArr) {
        Contracts.throwIfNull(strArr, StubApp.getString2(16020));
        Contracts.throwIfFail(logFileSetFilters(String.join(StubApp.getString2(1262), strArr)));
    }

    public static String b(long j) {
        StringRef stringRef = new StringRef("");
        Contracts.throwIfFail(logMemoryGetLine(j, stringRef));
        return stringRef.getValue();
    }

    public static long c() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(logMemoryGetLineNumNewest(intRef));
        return intRef.getValue();
    }

    public static long d() {
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(logMemoryGetLineNumOldest(intRef));
        return intRef.getValue();
    }

    public static void e(EventLogger.EventHandler eventHandler, long j) {
        Contracts.throwIfFail(logEventSetCallback(eventHandler, j));
    }

    public static void f(String[] strArr) {
        Contracts.throwIfNull(strArr, StubApp.getString2(16020));
        Contracts.throwIfFail(logEventSetFilters(String.join(StubApp.getString2(1262), strArr)));
    }

    public static void g(Type type, Level level) {
        Contracts.throwIfNull(type, StubApp.getString2(660));
        Contracts.throwIfNull(level, StubApp.getString2(9577));
        Contracts.throwIfFail(logSetLevel(type.name().toLowerCase(), level.name().toLowerCase()));
    }

    public static void h(String[] strArr) {
        Contracts.throwIfNull(strArr, StubApp.getString2(16020));
        Contracts.throwIfFail(logMemorySetFilters(String.join(StubApp.getString2(1262), strArr)));
    }

    private static final native long logEventSetCallback(EventLogger.EventHandler eventHandler, long j);

    private static final native long logEventSetFilters(String str);

    private static final native long logFileSetFilters(String str);

    private static final native long logMemoryGetLine(long j, StringRef stringRef);

    private static final native long logMemoryGetLineNumNewest(IntRef intRef);

    private static final native long logMemoryGetLineNumOldest(IntRef intRef);

    private static final native long logMemorySetFilters(String str);

    private static final native long logSetLevel(String str, String str2);
}

package com.microsoft.cognitiveservices.speech.diagnostics.logging;

import I9.a;
import com.microsoft.cognitiveservices.speech.SpeechConfig;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SpxTrace {
    static {
        try {
            Class.forName(SpeechConfig.class.getName());
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void SPX_TRACE_ERROR(String str) {
        a b2 = b();
        SPX_TRACE_ERROR(str, new Object[0], b2.f3236a, b2.f3237b);
    }

    public static void SPX_TRACE_INFO(String str) {
        a b2 = b();
        SPX_TRACE_INFO(str, new Object[0], b2.f3236a, b2.f3237b);
    }

    public static void SPX_TRACE_VERBOSE(String str) {
        a b2 = b();
        SPX_TRACE_VERBOSE(str, new Object[0], b2.f3236a, b2.f3237b);
    }

    public static void SPX_TRACE_WARNING(String str) {
        a b2 = b();
        SPX_TRACE_WARNING(str, new Object[0], b2.f3236a, b2.f3237b);
    }

    public static void a(int i3, String str, String str2, Object[] objArr, int i10, String str3) {
        Contracts.throwIfNull(str, StubApp.getString2(616));
        Contracts.throwIfNull(str2, StubApp.getString2(16004));
        Contracts.throwIfNull(objArr, StubApp.getString2(16030));
        Contracts.throwIfNull(str3, StubApp.getString2(3105));
        Contracts.throwIfFail(logTraceString(i3, str, str3, i10, String.format(str2, objArr)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r3 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static I9.a b() {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L1c
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()     // Catch: java.lang.Exception -> L1c
            r3 = 2
            r2 = r2[r3]     // Catch: java.lang.Exception -> L1c
            if (r2 == 0) goto L1c
            java.lang.String r3 = r2.getFileName()     // Catch: java.lang.Exception -> L1c
            int r1 = r2.getLineNumber()     // Catch: java.lang.Exception -> L1b
            if (r3 != 0) goto L1b
            goto L1c
        L1b:
            r0 = r3
        L1c:
            I9.a r2 = new I9.a
            r2.<init>()
            r2.f3237b = r0
            r2.f3236a = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.cognitiveservices.speech.diagnostics.logging.SpxTrace.b():I9.a");
    }

    private static final native long logTraceString(int i3, String str, String str2, int i10, String str3);

    public static void SPX_TRACE_ERROR(String str, Object[] objArr, int i3, String str2) {
        a(2, StubApp.getString2(16026), str, objArr, i3, str2);
    }

    public static void SPX_TRACE_INFO(String str, Object[] objArr, int i3, String str2) {
        a(8, StubApp.getString2(16027), str, objArr, i3, str2);
    }

    public static void SPX_TRACE_VERBOSE(String str, Object[] objArr, int i3, String str2) {
        a(16, StubApp.getString2(16028), str, objArr, i3, str2);
    }

    public static void SPX_TRACE_WARNING(String str, Object[] objArr, int i3, String str2) {
        a(4, StubApp.getString2(16029), str, objArr, i3, str2);
    }
}

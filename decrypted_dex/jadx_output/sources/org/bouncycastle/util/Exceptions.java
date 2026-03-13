package org.bouncycastle.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Exceptions {
    public static IllegalArgumentException illegalArgumentException(String str, Throwable th) {
        return new IllegalArgumentException(str, th);
    }

    public static IllegalStateException illegalStateException(String str, Throwable th) {
        return new IllegalStateException(str, th);
    }
}

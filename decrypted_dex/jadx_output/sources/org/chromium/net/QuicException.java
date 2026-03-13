package org.chromium.net;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class QuicException extends NetworkException {
    public QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}

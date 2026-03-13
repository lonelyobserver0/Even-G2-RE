package org.bouncycastle.util.encoders;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    public EncoderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}

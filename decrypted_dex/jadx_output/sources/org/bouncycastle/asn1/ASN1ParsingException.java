package org.bouncycastle.asn1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable cause;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}

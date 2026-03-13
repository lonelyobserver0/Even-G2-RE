package org.bouncycastle.tsp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TSPValidationException extends TSPException {
    private int failureCode;

    public TSPValidationException(String str) {
        super(str);
        this.failureCode = -1;
    }

    public int getFailureCode() {
        return this.failureCode;
    }

    public TSPValidationException(String str, int i3) {
        super(str);
        this.failureCode = i3;
    }
}

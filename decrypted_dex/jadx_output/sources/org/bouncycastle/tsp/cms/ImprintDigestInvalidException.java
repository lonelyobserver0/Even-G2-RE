package org.bouncycastle.tsp.cms;

import org.bouncycastle.tsp.TimeStampToken;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ImprintDigestInvalidException extends Exception {
    private TimeStampToken token;

    public ImprintDigestInvalidException(String str, TimeStampToken timeStampToken) {
        super(str);
        this.token = timeStampToken;
    }

    public TimeStampToken getTimeStampToken() {
        return this.token;
    }
}

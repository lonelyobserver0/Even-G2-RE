package org.bouncycastle.asn1;

import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class LimitedInputStream extends InputStream {
    protected final InputStream _in;
    private int _limit;

    public LimitedInputStream(InputStream inputStream, int i3) {
        this._in = inputStream;
        this._limit = i3;
    }

    public int getLimit() {
        return this._limit;
    }

    public void setParentEofDetect(boolean z2) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z2);
        }
    }
}

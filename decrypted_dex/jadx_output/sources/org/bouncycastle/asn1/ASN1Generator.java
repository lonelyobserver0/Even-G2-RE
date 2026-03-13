package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ASN1Generator {
    protected OutputStream _out;

    public ASN1Generator(OutputStream outputStream) {
        this._out = outputStream;
    }

    public abstract OutputStream getRawOutputStream();
}

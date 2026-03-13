package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class BERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    public BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeHdr(int i3) throws IOException {
        this._out.write(i3);
        this._out.write(128);
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    public void writeBEREnd() throws IOException {
        this._out.write(0);
        this._out.write(0);
        if (this._tagged && this._isExplicit) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    public void writeBERHeader(int i3) throws IOException {
        if (!this._tagged) {
            writeHdr(i3);
            return;
        }
        int i10 = this._tagNo;
        int i11 = i10 | 128;
        if (this._isExplicit) {
            writeHdr(i10 | 160);
        } else {
            if ((i3 & 32) == 0) {
                writeHdr(i11);
                return;
            }
            i3 = i10 | 160;
        }
        writeHdr(i3);
    }

    public BERGenerator(OutputStream outputStream, int i3, boolean z2) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z2;
        this._tagNo = i3;
    }
}

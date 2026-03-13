package org.bouncycastle.cms;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSTypedStream {
    private static final int BUF_SIZ = 32768;
    protected InputStream _in;
    private final ASN1ObjectIdentifier _oid;

    public static class FullReaderStream extends FilterInputStream {
        public FullReaderStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i3, int i10) throws IOException {
            if (i10 == 0) {
                return 0;
            }
            int readFully = Streams.readFully(((FilterInputStream) this).in, bArr, i3, i10);
            if (readFully > 0) {
                return readFully;
            }
            return -1;
        }
    }

    public CMSTypedStream(InputStream inputStream) {
        this(PKCSObjectIdentifiers.data.getId(), inputStream, 32768);
    }

    public void drain() throws IOException {
        Streams.drain(this._in);
        this._in.close();
    }

    public InputStream getContentStream() {
        return this._in;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this._oid;
    }

    public CMSTypedStream(String str, InputStream inputStream) {
        this(new ASN1ObjectIdentifier(str), inputStream, 32768);
    }

    public CMSTypedStream(String str, InputStream inputStream, int i3) {
        this(new ASN1ObjectIdentifier(str), inputStream, i3);
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this._oid = aSN1ObjectIdentifier;
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, InputStream inputStream) {
        this(aSN1ObjectIdentifier, inputStream, 32768);
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, InputStream inputStream, int i3) {
        this._oid = aSN1ObjectIdentifier;
        this._in = new FullReaderStream(new BufferedInputStream(inputStream, i3));
    }
}

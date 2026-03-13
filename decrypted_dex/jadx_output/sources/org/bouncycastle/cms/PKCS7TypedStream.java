package org.bouncycastle.cms;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS7TypedStream extends CMSTypedStream {
    private final ASN1Encodable content;

    public PKCS7TypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1ObjectIdentifier);
        this.content = aSN1Encodable;
    }

    @Override // org.bouncycastle.cms.CMSTypedStream
    public void drain() throws IOException {
        this.content.toASN1Primitive();
    }

    public ASN1Encodable getContent() {
        return this.content;
    }

    @Override // org.bouncycastle.cms.CMSTypedStream
    public InputStream getContentStream() {
        try {
            return getContentStream(this.content);
        } catch (IOException e10) {
            throw new CMSRuntimeException(u.q(e10, new StringBuilder(StubApp.getString2(28207))), e10);
        }
    }

    private InputStream getContentStream(ASN1Encodable aSN1Encodable) throws IOException {
        int i3;
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791));
        int i10 = 1;
        if ((encoded[0] & 31) == 31) {
            do {
                i3 = encoded[i10] & ByteCompanionObject.MIN_VALUE;
                i10++;
            } while (i3 != 0);
        }
        int i11 = i10 + 1;
        byte b2 = encoded[i10];
        if ((b2 & ByteCompanionObject.MIN_VALUE) != 0) {
            i11 += b2 & ByteCompanionObject.MAX_VALUE;
        }
        return new ByteArrayInputStream(encoded, i11, encoded.length - i11);
    }
}

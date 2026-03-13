package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS7ProcessableObject implements CMSTypedData {
    private final ASN1Encodable structure;
    private final ASN1ObjectIdentifier type;

    public PKCS7ProcessableObject(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.type = aSN1ObjectIdentifier;
        this.structure = aSN1Encodable;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return this.structure;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.type;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) throws IOException, CMSException {
        ASN1Encodable aSN1Encodable = this.structure;
        boolean z2 = aSN1Encodable instanceof ASN1Sequence;
        String string2 = StubApp.getString2(26791);
        if (z2) {
            Iterator<ASN1Encodable> it = ASN1Sequence.getInstance(aSN1Encodable).iterator();
            while (it.hasNext()) {
                outputStream.write(it.next().toASN1Primitive().getEncoded(string2));
            }
        } else {
            byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(string2);
            int i3 = 1;
            while ((encoded[i3] & UByte.MAX_VALUE) > 127) {
                i3++;
            }
            int i10 = i3 + 1;
            outputStream.write(encoded, i10, encoded.length - i10);
        }
    }
}

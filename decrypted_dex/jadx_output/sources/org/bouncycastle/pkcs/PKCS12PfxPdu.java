package org.bouncycastle.pkcs;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS12PfxPdu {
    private Pfx pfx;

    public PKCS12PfxPdu(Pfx pfx) {
        this.pfx = pfx;
    }

    private static Pfx parseBytes(byte[] bArr) throws IOException {
        String string2 = StubApp.getString2(28012);
        try {
            return Pfx.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e10) {
            throw new PKCSIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new PKCSIOException(h.l(e11, new StringBuilder(string2)), e11);
        }
    }

    public ContentInfo[] getContentInfos() {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(this.pfx.getAuthSafe().getContent()).getOctets());
        ContentInfo[] contentInfoArr = new ContentInfo[aSN1Sequence.size()];
        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
            contentInfoArr[i3] = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i3));
        }
        return contentInfoArr;
    }

    public byte[] getEncoded() throws IOException {
        return toASN1Structure().getEncoded();
    }

    public AlgorithmIdentifier getMacAlgorithmID() {
        MacData macData = this.pfx.getMacData();
        if (macData != null) {
            return macData.getMac().getAlgorithmId();
        }
        return null;
    }

    public boolean hasMac() {
        return this.pfx.getMacData() != null;
    }

    public boolean isMacValid(PKCS12MacCalculatorBuilderProvider pKCS12MacCalculatorBuilderProvider, char[] cArr) throws PKCSException {
        if (!hasMac()) {
            throw new IllegalStateException(StubApp.getString2(33895));
        }
        MacData macData = this.pfx.getMacData();
        try {
            return Arrays.constantTimeAreEqual(new MacDataGenerator(pKCS12MacCalculatorBuilderProvider.get(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), new PKCS12PBEParams(macData.getSalt(), macData.getIterationCount().intValue())))).build(cArr, ASN1OctetString.getInstance(this.pfx.getAuthSafe().getContent()).getOctets()).getEncoded(), this.pfx.getMacData().getEncoded());
        } catch (IOException e10) {
            throw new PKCSException(u.q(e10, new StringBuilder(StubApp.getString2(33894))));
        }
    }

    public Pfx toASN1Structure() {
        return this.pfx;
    }

    public PKCS12PfxPdu(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }

    public byte[] getEncoded(String str) throws IOException {
        return toASN1Structure().getEncoded(str);
    }
}

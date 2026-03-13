package org.bouncycastle.jce;

import com.stub.StubApp;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS12Util {
    private static byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i3, char[] cArr, byte[] bArr2, String str) throws Exception {
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(aSN1ObjectIdentifier.getId(), str);
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i3);
        SecretKey generateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(cArr));
        Mac mac = Mac.getInstance(aSN1ObjectIdentifier.getId(), str);
        mac.init(generateSecret, pBEParameterSpec);
        mac.update(bArr2);
        return mac.doFinal();
    }

    public static byte[] convertToDefiniteLength(byte[] bArr) throws IOException {
        return Pfx.getInstance(bArr).getEncoded(StubApp.getString2(26791));
    }

    public static byte[] convertToDefiniteLength(byte[] bArr, char[] cArr, String str) throws IOException {
        Pfx pfx = Pfx.getInstance(bArr);
        ContentInfo authSafe = pfx.getAuthSafe();
        ASN1Primitive fromByteArray = ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(authSafe.getContent()).getOctets());
        String string2 = StubApp.getString2(26791);
        ContentInfo contentInfo = new ContentInfo(authSafe.getContentType(), new DEROctetString(fromByteArray.getEncoded(string2)));
        MacData macData = pfx.getMacData();
        try {
            int intValue = macData.getIterationCount().intValue();
            return new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), DERNull.INSTANCE), calculatePbeMac(macData.getMac().getAlgorithmId().getAlgorithm(), macData.getSalt(), intValue, cArr, ASN1OctetString.getInstance(contentInfo.getContent()).getOctets(), str)), macData.getSalt(), intValue)).getEncoded(string2);
        } catch (Exception e10) {
            throw new IOException(a.b(e10, new StringBuilder(StubApp.getString2(31409))));
        }
    }
}

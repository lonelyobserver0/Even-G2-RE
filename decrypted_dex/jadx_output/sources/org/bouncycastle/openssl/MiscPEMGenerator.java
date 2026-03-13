package org.bouncycastle.openssl;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemHeader;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MiscPEMGenerator implements PemObjectGenerator {
    private static final ASN1ObjectIdentifier[] dsaOids = {X9ObjectIdentifiers.id_dsa, OIWObjectIdentifiers.dsaWithSHA1};
    private static final byte[] hexEncodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    private final PEMEncryptor encryptor;
    private final Object obj;

    public MiscPEMGenerator(Object obj) {
        this.obj = obj;
        this.encryptor = null;
    }

    private PemObject createPemObject(Object obj) throws IOException {
        byte[] encoded;
        String string2;
        if (obj instanceof PemObject) {
            return (PemObject) obj;
        }
        if (obj instanceof PemObjectGenerator) {
            return ((PemObjectGenerator) obj).generate();
        }
        if (obj instanceof X509CertificateHolder) {
            encoded = ((X509CertificateHolder) obj).getEncoded();
            string2 = StubApp.getString2(30865);
        } else if (obj instanceof X509CRLHolder) {
            encoded = ((X509CRLHolder) obj).getEncoded();
            string2 = StubApp.getString2(33616);
        } else if (obj instanceof X509TrustedCertificateBlock) {
            encoded = ((X509TrustedCertificateBlock) obj).getEncoded();
            string2 = StubApp.getString2(33617);
        } else if (obj instanceof PrivateKeyInfo) {
            PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
            ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
            if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.rsaEncryption)) {
                encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                string2 = StubApp.getString2(33618);
            } else {
                ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = dsaOids;
                if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifierArr[0]) || algorithm.equals((ASN1Primitive) aSN1ObjectIdentifierArr[1])) {
                    DSAParameter dSAParameter = DSAParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
                    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                    aSN1EncodableVector.add(new ASN1Integer(0L));
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getP()));
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getQ()));
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getG()));
                    BigInteger value = ASN1Integer.getInstance(privateKeyInfo.parsePrivateKey()).getValue();
                    aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getG().modPow(value, dSAParameter.getP())));
                    aSN1EncodableVector.add(new ASN1Integer(value));
                    encoded = new DERSequence(aSN1EncodableVector).getEncoded();
                    string2 = StubApp.getString2(33621);
                } else if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_ecPublicKey)) {
                    encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                    string2 = StubApp.getString2(33619);
                } else {
                    encoded = privateKeyInfo.getEncoded();
                    string2 = StubApp.getString2(33620);
                }
            }
        } else if (obj instanceof SubjectPublicKeyInfo) {
            encoded = ((SubjectPublicKeyInfo) obj).getEncoded();
            string2 = StubApp.getString2(33622);
        } else if (obj instanceof X509AttributeCertificateHolder) {
            encoded = ((X509AttributeCertificateHolder) obj).getEncoded();
            string2 = StubApp.getString2(32854);
        } else if (obj instanceof PKCS10CertificationRequest) {
            encoded = ((PKCS10CertificationRequest) obj).getEncoded();
            string2 = StubApp.getString2(33623);
        } else if (obj instanceof PKCS8EncryptedPrivateKeyInfo) {
            encoded = ((PKCS8EncryptedPrivateKeyInfo) obj).getEncoded();
            string2 = StubApp.getString2(33624);
        } else {
            if (!(obj instanceof ContentInfo)) {
                throw new PemGenerationException(StubApp.getString2(33629));
            }
            encoded = ((ContentInfo) obj).getEncoded();
            string2 = StubApp.getString2(29174);
        }
        PEMEncryptor pEMEncryptor = this.encryptor;
        if (pEMEncryptor == null) {
            return new PemObject(string2, encoded);
        }
        String upperCase = Strings.toUpperCase(pEMEncryptor.getAlgorithm());
        if (upperCase.equals(StubApp.getString2(28051))) {
            upperCase = StubApp.getString2(33625);
        }
        byte[] iv = this.encryptor.getIV();
        byte[] encrypt = this.encryptor.encrypt(encoded);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new PemHeader(StubApp.getString2(33626), StubApp.getString2(33627)));
        StringBuilder n10 = AbstractC1482f.n(upperCase, StubApp.getString2(321));
        n10.append(getHexEncoded(iv));
        arrayList.add(new PemHeader(StubApp.getString2(33628), n10.toString()));
        return new PemObject(string2, arrayList, encrypt);
    }

    private String getHexEncoded(byte[] bArr) throws IOException {
        char[] cArr = new char[bArr.length * 2];
        for (int i3 = 0; i3 != bArr.length; i3++) {
            byte b2 = bArr[i3];
            int i10 = b2 & UByte.MAX_VALUE;
            int i11 = i3 * 2;
            byte[] bArr2 = hexEncodingTable;
            cArr[i11] = (char) bArr2[i10 >>> 4];
            cArr[i11 + 1] = (char) bArr2[b2 & 15];
        }
        return new String(cArr);
    }

    @Override // org.bouncycastle.util.io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        try {
            return createPemObject(this.obj);
        } catch (IOException e10) {
            throw new PemGenerationException(u.q(e10, new StringBuilder(StubApp.getString2(33630))), e10);
        }
    }

    public MiscPEMGenerator(Object obj, PEMEncryptor pEMEncryptor) {
        this.obj = obj;
        this.encryptor = pEMEncryptor;
    }
}

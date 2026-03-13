package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.ua.DSTU4145BinaryField;
import org.bouncycastle.asn1.ua.DSTU4145ECBinary;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.ua.DSTU4145PointEncoder;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.DHPublicKey;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PublicKeyFactory {
    private static Map converters;

    /* renamed from: org.bouncycastle.crypto.util.PublicKeyFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class DHAgreementConverter extends SubjectPublicKeyInfoConverter {
        private DHAgreementConverter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            DHParameter dHParameter = DHParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            ASN1Integer aSN1Integer = (ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            BigInteger l9 = dHParameter.getL();
            return new DHPublicKeyParameters(aSN1Integer.getValue(), new DHParameters(dHParameter.getP(), dHParameter.getG(), null, l9 == null ? 0 : l9.intValue()));
        }

        public /* synthetic */ DHAgreementConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DHPublicNumberConverter extends SubjectPublicKeyInfoConverter {
        private DHPublicNumberConverter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            BigInteger y10 = DHPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey()).getY();
            DomainParameters domainParameters = DomainParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            BigInteger p8 = domainParameters.getP();
            BigInteger g10 = domainParameters.getG();
            BigInteger q10 = domainParameters.getQ();
            BigInteger j = domainParameters.getJ() != null ? domainParameters.getJ() : null;
            ValidationParams validationParams = domainParameters.getValidationParams();
            return new DHPublicKeyParameters(y10, new DHParameters(p8, g10, q10, j, validationParams != null ? new DHValidationParameters(validationParams.getSeed(), validationParams.getPgenCounter().intValue()) : null));
        }

        public /* synthetic */ DHPublicNumberConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DSAConverter extends SubjectPublicKeyInfoConverter {
        private DSAConverter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            DSAParameters dSAParameters;
            ASN1Integer aSN1Integer = (ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            ASN1Encodable parameters = subjectPublicKeyInfo.getAlgorithm().getParameters();
            if (parameters != null) {
                DSAParameter dSAParameter = DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            } else {
                dSAParameters = null;
            }
            return new DSAPublicKeyParameters(aSN1Integer.getValue(), dSAParameters);
        }

        public /* synthetic */ DSAConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DSTUConverter extends SubjectPublicKeyInfoConverter {
        private DSTUConverter() {
            super(null);
        }

        private void reverseBytes(byte[] bArr) {
            for (int i3 = 0; i3 < bArr.length / 2; i3++) {
                byte b2 = bArr[i3];
                bArr[i3] = bArr[(bArr.length - 1) - i3];
                bArr[(bArr.length - 1) - i3] = b2;
            }
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            ECDomainParameters eCDomainParameters;
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            ASN1ObjectIdentifier algorithm2 = algorithm.getAlgorithm();
            DSTU4145Params dSTU4145Params = DSTU4145Params.getInstance(algorithm.getParameters());
            try {
                byte[] clone = Arrays.clone(((ASN1OctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets());
                ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
                if (algorithm2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    reverseBytes(clone);
                }
                if (dSTU4145Params.isNamedCurve()) {
                    eCDomainParameters = DSTU4145NamedCurves.getByOID(dSTU4145Params.getNamedCurve());
                } else {
                    DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                    byte[] b2 = eCBinary.getB();
                    if (algorithm2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                        reverseBytes(b2);
                    }
                    BigInteger bigInteger = new BigInteger(1, b2);
                    DSTU4145BinaryField field = eCBinary.getField();
                    ECCurve.F2m f2m = new ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), bigInteger);
                    byte[] g10 = eCBinary.getG();
                    if (algorithm2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                        reverseBytes(g10);
                    }
                    eCDomainParameters = new ECDomainParameters(f2m, DSTU4145PointEncoder.decodePoint(f2m, g10), eCBinary.getN());
                }
                return new ECPublicKeyParameters(DSTU4145PointEncoder.decodePoint(eCDomainParameters.getCurve(), clone), eCDomainParameters);
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(29380));
            }
        }

        public /* synthetic */ DSTUConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class ECConverter extends SubjectPublicKeyInfoConverter {
        private ECConverter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            ECDomainParameters eCDomainParameters;
            byte b2;
            X962Parameters x962Parameters = X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
                X9ECParameters byOID = CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
                if (byOID == null) {
                    byOID = ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
                }
                eCDomainParameters = new ECNamedDomainParameters(aSN1ObjectIdentifier, byOID);
            } else {
                eCDomainParameters = x962Parameters.isImplicitlyCA() ? (ECDomainParameters) obj : new ECDomainParameters(X9ECParameters.getInstance(x962Parameters.getParameters()));
            }
            byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
            ASN1OctetString dEROctetString = new DEROctetString(bytes);
            if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b2 = bytes[2]) == 2 || b2 == 3) && new X9IntegerConverter().getByteLength(eCDomainParameters.getCurve()) >= bytes.length - 3)) {
                try {
                    dEROctetString = (ASN1OctetString) ASN1Primitive.fromByteArray(bytes);
                } catch (IOException unused) {
                    throw new IllegalArgumentException(StubApp.getString2(29381));
                }
            }
            return new ECPublicKeyParameters(new X9ECPoint(eCDomainParameters.getCurve(), dEROctetString).getPoint(), eCDomainParameters);
        }

        public /* synthetic */ ECConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class Ed25519Converter extends SubjectPublicKeyInfoConverter {
        private Ed25519Converter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new Ed25519PublicKeyParameters(PublicKeyFactory.getRawKey(subjectPublicKeyInfo, obj));
        }

        public /* synthetic */ Ed25519Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class Ed448Converter extends SubjectPublicKeyInfoConverter {
        private Ed448Converter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new Ed448PublicKeyParameters(PublicKeyFactory.getRawKey(subjectPublicKeyInfo, obj));
        }

        public /* synthetic */ Ed448Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class ElGamalConverter extends SubjectPublicKeyInfoConverter {
        private ElGamalConverter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            return new ElGamalPublicKeyParameters(((ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue(), new ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }

        public /* synthetic */ ElGamalConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class GOST3410_2001Converter extends SubjectPublicKeyInfoConverter {
        private GOST3410_2001Converter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            ASN1ObjectIdentifier publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            ECGOST3410Parameters eCGOST3410Parameters = new ECGOST3410Parameters(new ECNamedDomainParameters(publicKeyParamSet, ECGOST3410NamedCurves.getByOIDX9(publicKeyParamSet)), publicKeyParamSet, gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            try {
                byte[] octets = ((ASN1OctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets();
                if (octets.length != 64) {
                    throw new IllegalArgumentException(StubApp.getString2(29382));
                }
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i3 = 1; i3 <= 32; i3++) {
                    bArr[i3] = octets[32 - i3];
                    bArr[i3 + 32] = octets[64 - i3];
                }
                return new ECPublicKeyParameters(eCGOST3410Parameters.getCurve().decodePoint(bArr), eCGOST3410Parameters);
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(29383));
            }
        }

        public /* synthetic */ GOST3410_2001Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class GOST3410_2012Converter extends SubjectPublicKeyInfoConverter {
        private GOST3410_2012Converter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            ASN1ObjectIdentifier algorithm2 = algorithm.getAlgorithm();
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(algorithm.getParameters());
            ASN1ObjectIdentifier publicKeyParamSet = gOST3410PublicKeyAlgParameters.getPublicKeyParamSet();
            ECGOST3410Parameters eCGOST3410Parameters = new ECGOST3410Parameters(new ECNamedDomainParameters(publicKeyParamSet, ECGOST3410NamedCurves.getByOIDX9(publicKeyParamSet)), publicKeyParamSet, gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            try {
                ASN1OctetString aSN1OctetString = (ASN1OctetString) subjectPublicKeyInfo.parsePublicKey();
                int i3 = algorithm2.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) ? 64 : 32;
                int i10 = i3 * 2;
                byte[] octets = aSN1OctetString.getOctets();
                if (octets.length != i10) {
                    throw new IllegalArgumentException(StubApp.getString2(29384));
                }
                byte[] bArr = new byte[i10 + 1];
                bArr[0] = 4;
                for (int i11 = 1; i11 <= i3; i11++) {
                    bArr[i11] = octets[i3 - i11];
                    bArr[i11 + i3] = octets[i10 - i11];
                }
                return new ECPublicKeyParameters(eCGOST3410Parameters.getCurve().decodePoint(bArr), eCGOST3410Parameters);
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(29385));
            }
        }

        public /* synthetic */ GOST3410_2012Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class RSAConverter extends SubjectPublicKeyInfoConverter {
        private RSAConverter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            RSAPublicKey rSAPublicKey = RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            return new RSAKeyParameters(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }

        public /* synthetic */ RSAConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static abstract class SubjectPublicKeyInfoConverter {
        private SubjectPublicKeyInfoConverter() {
        }

        public abstract AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException;

        public /* synthetic */ SubjectPublicKeyInfoConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class X25519Converter extends SubjectPublicKeyInfoConverter {
        private X25519Converter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new X25519PublicKeyParameters(PublicKeyFactory.getRawKey(subjectPublicKeyInfo, obj));
        }

        public /* synthetic */ X25519Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class X448Converter extends SubjectPublicKeyInfoConverter {
        private X448Converter() {
            super(null);
        }

        @Override // org.bouncycastle.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
            return new X448PublicKeyParameters(PublicKeyFactory.getRawKey(subjectPublicKeyInfo, obj));
        }

        public /* synthetic */ X448Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        converters = hashMap;
        AnonymousClass1 anonymousClass1 = null;
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption, new RSAConverter(anonymousClass1));
        converters.put(PKCSObjectIdentifiers.id_RSASSA_PSS, new RSAConverter(anonymousClass1));
        converters.put(X509ObjectIdentifiers.id_ea_rsa, new RSAConverter(anonymousClass1));
        converters.put(X9ObjectIdentifiers.dhpublicnumber, new DHPublicNumberConverter(anonymousClass1));
        converters.put(PKCSObjectIdentifiers.dhKeyAgreement, new DHAgreementConverter(anonymousClass1));
        converters.put(X9ObjectIdentifiers.id_dsa, new DSAConverter(anonymousClass1));
        converters.put(OIWObjectIdentifiers.dsaWithSHA1, new DSAConverter(anonymousClass1));
        converters.put(OIWObjectIdentifiers.elGamalAlgorithm, new ElGamalConverter(anonymousClass1));
        converters.put(X9ObjectIdentifiers.id_ecPublicKey, new ECConverter(anonymousClass1));
        converters.put(CryptoProObjectIdentifiers.gostR3410_2001, new GOST3410_2001Converter(anonymousClass1));
        converters.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, new GOST3410_2012Converter(anonymousClass1));
        converters.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, new GOST3410_2012Converter(anonymousClass1));
        converters.put(UAObjectIdentifiers.dstu4145be, new DSTUConverter(anonymousClass1));
        converters.put(UAObjectIdentifiers.dstu4145le, new DSTUConverter(anonymousClass1));
        converters.put(EdECObjectIdentifiers.id_X25519, new X25519Converter(anonymousClass1));
        converters.put(EdECObjectIdentifiers.id_X448, new X448Converter(anonymousClass1));
        converters.put(EdECObjectIdentifiers.id_Ed25519, new Ed25519Converter(anonymousClass1));
        converters.put(EdECObjectIdentifiers.id_Ed448, new Ed448Converter(anonymousClass1));
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] getRawKey(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) {
        return subjectPublicKeyInfo.getPublicKeyData().getOctets();
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return createKey(subjectPublicKeyInfo, null);
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        SubjectPublicKeyInfoConverter subjectPublicKeyInfoConverter = (SubjectPublicKeyInfoConverter) converters.get(algorithm.getAlgorithm());
        if (subjectPublicKeyInfoConverter != null) {
            return subjectPublicKeyInfoConverter.getPublicKeyParameters(subjectPublicKeyInfo, obj);
        }
        throw new IOException(StubApp.getString2(29386) + algorithm.getAlgorithm());
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}

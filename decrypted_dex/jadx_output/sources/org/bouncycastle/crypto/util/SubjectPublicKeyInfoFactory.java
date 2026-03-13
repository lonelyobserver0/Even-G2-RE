package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAPublicKey;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SubjectPublicKeyInfoFactory {
    private static Set cryptoProOids;

    static {
        HashSet hashSet = new HashSet(5);
        cryptoProOids = hashSet;
        hashSet.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A);
        cryptoProOids.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B);
        cryptoProOids.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C);
        cryptoProOids.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA);
        cryptoProOids.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB);
    }

    private SubjectPublicKeyInfoFactory() {
    }

    public static SubjectPublicKeyInfo createSubjectPublicKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        X962Parameters x962Parameters;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), new RSAPublicKey(rSAKeyParameters.getModulus(), rSAKeyParameters.getExponent()));
        }
        if (asymmetricKeyParameter instanceof DSAPublicKeyParameters) {
            DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPublicKeyParameters.getParameters();
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, parameters != null ? new DSAParameter(parameters.getP(), parameters.getQ(), parameters.getG()) : null), new ASN1Integer(dSAPublicKeyParameters.getY()));
        }
        if (!(asymmetricKeyParameter instanceof ECPublicKeyParameters)) {
            if (asymmetricKeyParameter instanceof X448PublicKeyParameters) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(EdECObjectIdentifiers.id_X448), ((X448PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            if (asymmetricKeyParameter instanceof X25519PublicKeyParameters) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(EdECObjectIdentifiers.id_X25519), ((X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            if (asymmetricKeyParameter instanceof Ed448PublicKeyParameters) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed448), ((Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            if (asymmetricKeyParameter instanceof Ed25519PublicKeyParameters) {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519), ((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            }
            throw new IOException(StubApp.getString2(29379));
        }
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
        ECDomainParameters parameters2 = eCPublicKeyParameters.getParameters();
        if (parameters2 == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
        } else {
            if (parameters2 instanceof ECGOST3410Parameters) {
                ECGOST3410Parameters eCGOST3410Parameters = (ECGOST3410Parameters) parameters2;
                BigInteger bigInteger = eCPublicKeyParameters.getQ().getAffineXCoord().toBigInteger();
                BigInteger bigInteger2 = eCPublicKeyParameters.getQ().getAffineYCoord().toBigInteger();
                GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = new GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet());
                int i3 = 32;
                int i10 = 64;
                if (cryptoProOids.contains(eCGOST3410Parameters.getPublicKeyParamSet())) {
                    aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3410_2001;
                } else if (bigInteger.bitLength() > 256) {
                    aSN1ObjectIdentifier = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
                    i10 = 128;
                    i3 = 64;
                } else {
                    aSN1ObjectIdentifier = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
                }
                byte[] bArr = new byte[i10];
                int i11 = i10 / 2;
                extractBytes(bArr, i11, 0, bigInteger);
                extractBytes(bArr, i11, i3, bigInteger2);
                try {
                    return new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, gOST3410PublicKeyAlgParameters), new DEROctetString(bArr));
                } catch (IOException unused) {
                    return null;
                }
            }
            x962Parameters = parameters2 instanceof ECNamedDomainParameters ? new X962Parameters(((ECNamedDomainParameters) parameters2).getName()) : new X962Parameters(new X9ECParameters(parameters2.getCurve(), new X9ECPoint(parameters2.getG(), false), parameters2.getN(), parameters2.getH(), parameters2.getSeed()));
        }
        return new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), eCPublicKeyParameters.getQ().getEncoded(false));
    }

    private static void extractBytes(byte[] bArr, int i3, int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(byteArray, 0, bArr2, i3 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i11 = 0; i11 != i3; i11++) {
            bArr[i10 + i11] = byteArray[(byteArray.length - 1) - i11];
        }
    }
}

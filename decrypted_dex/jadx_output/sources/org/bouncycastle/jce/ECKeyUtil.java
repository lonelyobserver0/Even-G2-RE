package org.bouncycastle.jce;

import E1.a;
import com.stub.StubApp;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECKeyUtil {

    public static class UnexpectedException extends RuntimeException {
        private Throwable cause;

        public UnexpectedException(Throwable th) {
            super(th.toString());
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public static PrivateKey privateToExplicitParameters(PrivateKey privateKey, String str) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return privateToExplicitParameters(privateKey, provider);
        }
        throw new NoSuchProviderException(a.j(StubApp.getString2(29422), str));
    }

    public static PublicKey publicToExplicitParameters(PublicKey publicKey, String str) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(str);
        if (provider != null) {
            return publicToExplicitParameters(publicKey, provider);
        }
        throw new NoSuchProviderException(a.j(StubApp.getString2(29422), str));
    }

    public static PrivateKey privateToExplicitParameters(PrivateKey privateKey, Provider provider) throws IllegalArgumentException, NoSuchAlgorithmException {
        X9ECParameters x9ECParameters;
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(privateKey.getEncoded()));
            if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((ASN1Primitive) CryptoProObjectIdentifiers.gostR3410_2001)) {
                throw new UnsupportedEncodingException(StubApp.getString2("32456"));
            }
            X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                x9ECParameters = ECUtil.getNamedCurveByOid(ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters()));
                if (x9ECParameters.hasSeed()) {
                    x9ECParameters = new X9ECParameters(x9ECParameters.getCurve(), x9ECParameters.getBaseEntry(), x9ECParameters.getN(), x9ECParameters.getH());
                }
            } else {
                if (!x962Parameters.isImplicitlyCA()) {
                    return privateKey;
                }
                ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                x9ECParameters = new X9ECParameters(providerConfiguration.getEcImplicitlyCa().getCurve(), new X9ECPoint(providerConfiguration.getEcImplicitlyCa().getG(), false), providerConfiguration.getEcImplicitlyCa().getN(), providerConfiguration.getEcImplicitlyCa().getH());
            }
            return KeyFactory.getInstance(privateKey.getAlgorithm(), provider).generatePrivate(new PKCS8EncodedKeySpec(new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, new X962Parameters(x9ECParameters)), privateKeyInfo.parsePrivateKey()).getEncoded()));
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (NoSuchAlgorithmException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new UnexpectedException(e12);
        }
    }

    public static PublicKey publicToExplicitParameters(PublicKey publicKey, Provider provider) throws IllegalArgumentException, NoSuchAlgorithmException {
        X9ECParameters x9ECParameters;
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(publicKey.getEncoded()));
            if (subjectPublicKeyInfo.getAlgorithm().getAlgorithm().equals((ASN1Primitive) CryptoProObjectIdentifiers.gostR3410_2001)) {
                throw new IllegalArgumentException(StubApp.getString2("32456"));
            }
            X962Parameters x962Parameters = X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                x9ECParameters = ECUtil.getNamedCurveByOid(ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters()));
                if (x9ECParameters.hasSeed()) {
                    x9ECParameters = new X9ECParameters(x9ECParameters.getCurve(), x9ECParameters.getBaseEntry(), x9ECParameters.getN(), x9ECParameters.getH());
                }
            } else {
                if (!x962Parameters.isImplicitlyCA()) {
                    return publicKey;
                }
                ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                x9ECParameters = new X9ECParameters(providerConfiguration.getEcImplicitlyCa().getCurve(), new X9ECPoint(providerConfiguration.getEcImplicitlyCa().getG(), false), providerConfiguration.getEcImplicitlyCa().getN(), providerConfiguration.getEcImplicitlyCa().getH());
            }
            return KeyFactory.getInstance(publicKey.getAlgorithm(), provider).generatePublic(new X509EncodedKeySpec(new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, new X962Parameters(x9ECParameters)), subjectPublicKeyInfo.getPublicKeyData().getBytes()).getEncoded()));
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (NoSuchAlgorithmException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new UnexpectedException(e12);
        }
    }
}

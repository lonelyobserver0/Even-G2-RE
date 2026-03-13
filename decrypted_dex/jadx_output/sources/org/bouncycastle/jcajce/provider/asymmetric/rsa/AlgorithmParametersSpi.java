package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.MessageDigestUtils;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    public static class OAEP extends AlgorithmParametersSpi {
        OAEPParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            ASN1ObjectIdentifier oid = DigestFactory.getOID(this.currentSpec.getDigestAlgorithm());
            DERNull dERNull = DERNull.INSTANCE;
            try {
                return new RSAESOAEPparams(new AlgorithmIdentifier(oid, dERNull), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(((MGF1ParameterSpec) this.currentSpec.getMGFParameters()).getDigestAlgorithm()), dERNull)), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(((PSource.PSpecified) this.currentSpec.getPSource()).getValue()))).getEncoded(StubApp.getString2("26791"));
            } catch (IOException unused) {
                throw new RuntimeException(StubApp.getString2(30776));
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(30777));
            }
            this.currentSpec = (OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(30780);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException(StubApp.getString2(30781));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str) || str.equalsIgnoreCase(StubApp.getString2(19963))) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            String string2 = StubApp.getString2(30778);
            String string22 = StubApp.getString2(30779);
            try {
                RSAESOAEPparams rSAESOAEPparams = RSAESOAEPparams.getInstance(bArr);
                if (rSAESOAEPparams.getMaskGenAlgorithm().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1)) {
                    this.currentSpec = new OAEPParameterSpec(MessageDigestUtils.getDigestName(rSAESOAEPparams.getHashAlgorithm().getAlgorithm()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.getDigestName(AlgorithmIdentifier.getInstance(rSAESOAEPparams.getMaskGenAlgorithm().getParameters()).getAlgorithm())), new PSource.PSpecified(ASN1OctetString.getInstance(rSAESOAEPparams.getPSourceAlgorithm().getParameters()).getOctets()));
                } else {
                    throw new IOException(string22 + rSAESOAEPparams.getMaskGenAlgorithm().getAlgorithm());
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException(string2);
            } catch (ClassCastException unused2) {
                throw new IOException(string2);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!str.equalsIgnoreCase(StubApp.getString2(19963)) && !str.equalsIgnoreCase(StubApp.getString2(30489))) {
                throw new IOException(StubApp.getString2(30487).concat(str));
            }
            engineInit(bArr);
        }
    }

    public static class PSS extends AlgorithmParametersSpi {
        PSSParameterSpec currentSpec;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            PSSParameterSpec pSSParameterSpec = this.currentSpec;
            ASN1ObjectIdentifier oid = DigestFactory.getOID(pSSParameterSpec.getDigestAlgorithm());
            DERNull dERNull = DERNull.INSTANCE;
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(oid, dERNull);
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
            String string2 = StubApp.getString2(26791);
            if (mGF1ParameterSpec != null) {
                return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(mGF1ParameterSpec.getDigestAlgorithm()), dERNull)), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField())).getEncoded(string2);
            }
            return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(pSSParameterSpec.getMGFAlgorithm().equals(StubApp.getString2(28183)) ? NISTObjectIdentifiers.id_shake128 : NISTObjectIdentifiers.id_shake256), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField())).getEncoded(string2);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(30782));
            }
            this.currentSpec = (PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(30784);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.currentSpec;
            }
            throw new InvalidParameterSpecException(StubApp.getString2(30785));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (str.equalsIgnoreCase(StubApp.getString2(19963)) || str.equalsIgnoreCase(StubApp.getString2(30489))) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            String string2 = StubApp.getString2(30783);
            String string22 = StubApp.getString2(30779);
            try {
                RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(bArr);
                ASN1ObjectIdentifier algorithm = rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm();
                if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_mgf1)) {
                    this.currentSpec = new PSSParameterSpec(MessageDigestUtils.getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.getDigestName(AlgorithmIdentifier.getInstance(rSASSAPSSparams.getMaskGenAlgorithm().getParameters()).getAlgorithm())), rSASSAPSSparams.getSaltLength().intValue(), rSASSAPSSparams.getTrailerField().intValue());
                    return;
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_shake128;
                if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) || algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
                    this.currentSpec = new PSSParameterSpec(MessageDigestUtils.getDigestName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()), algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier) ? "SHAKE128" : "SHAKE256", null, rSASSAPSSparams.getSaltLength().intValue(), rSASSAPSSparams.getTrailerField().intValue());
                } else {
                    throw new IOException(string22 + rSASSAPSSparams.getMaskGenAlgorithm().getAlgorithm());
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException(string2);
            } catch (ClassCastException unused2) {
                throw new IOException(string2);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str) && !str.equalsIgnoreCase(StubApp.getString2(19963))) {
                throw new IOException(StubApp.getString2(30487).concat(str));
            }
            engineInit(bArr);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException(StubApp.getString2(30484));
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals(StubApp.getString2(30489));
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException;
}

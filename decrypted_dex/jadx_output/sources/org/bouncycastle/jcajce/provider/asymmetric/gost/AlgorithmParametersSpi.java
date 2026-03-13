package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    GOST3410ParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(this.currentSpec.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(this.currentSpec.getDigestParamSetOID()), new ASN1ObjectIdentifier(this.currentSpec.getEncryptionParamSetOID())).getEncoded(StubApp.getString2("26791"));
        } catch (IOException unused) {
            throw new RuntimeException(StubApp.getString2(30761));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new NullPointerException(StubApp.getString2(30484));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof GOST3410ParameterSpec)) {
            throw new InvalidParameterSpecException(StubApp.getString2(30762));
        }
        this.currentSpec = (GOST3410ParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return StubApp.getString2(30764);
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals(StubApp.getString2(30489));
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == GOST3410PublicKeyParameterSetSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException(StubApp.getString2(30765));
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
        String string2 = StubApp.getString2(30763);
        try {
            this.currentSpec = GOST3410ParameterSpec.fromPublicKeyAlg(GOST3410PublicKeyAlgParameters.getInstance((ASN1Sequence) ASN1Primitive.fromByteArray(bArr)));
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

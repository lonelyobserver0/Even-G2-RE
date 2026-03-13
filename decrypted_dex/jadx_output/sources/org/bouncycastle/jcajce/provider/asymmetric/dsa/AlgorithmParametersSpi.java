package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.DSAParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    DSAParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new DSAParameter(this.currentSpec.getP(), this.currentSpec.getQ(), this.currentSpec.getG()).getEncoded(StubApp.getString2("26791"));
        } catch (IOException unused) {
            throw new RuntimeException(StubApp.getString2(30569));
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
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidParameterSpecException(StubApp.getString2(30570));
        }
        this.currentSpec = (DSAParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return StubApp.getString2(30572);
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals(StubApp.getString2(30489));
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DSAParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException(StubApp.getString2(30573));
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) {
        if (isASN1FormatString(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        String string2 = StubApp.getString2(30571);
        try {
            DSAParameter dSAParameter = DSAParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
            this.currentSpec = new DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
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

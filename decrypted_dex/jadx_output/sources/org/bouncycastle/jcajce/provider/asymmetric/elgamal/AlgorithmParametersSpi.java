package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AlgorithmParametersSpi extends BaseAlgorithmParameters {
    ElGamalParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new ElGamalParameter(this.currentSpec.getP(), this.currentSpec.getG()).getEncoded(StubApp.getString2("26791"));
        } catch (IOException unused) {
            throw new RuntimeException(StubApp.getString2(30722));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        boolean z2 = algorithmParameterSpec instanceof ElGamalParameterSpec;
        if (!z2 && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException(StubApp.getString2(30723));
        }
        if (z2) {
            this.currentSpec = (ElGamalParameterSpec) algorithmParameterSpec;
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.currentSpec = new ElGamalParameterSpec(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return StubApp.getString2(30725);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == ElGamalParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        if (cls == DHParameterSpec.class) {
            return new DHParameterSpec(this.currentSpec.getP(), this.currentSpec.getG());
        }
        throw new InvalidParameterSpecException(StubApp.getString2(30726));
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
        String string2 = StubApp.getString2(30724);
        try {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(ASN1Primitive.fromByteArray(bArr));
            this.currentSpec = new ElGamalParameterSpec(elGamalParameter.getP(), elGamalParameter.getG());
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

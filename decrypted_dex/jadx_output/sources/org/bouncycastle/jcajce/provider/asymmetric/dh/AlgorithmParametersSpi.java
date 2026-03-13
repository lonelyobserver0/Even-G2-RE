package org.bouncycastle.jcajce.provider.asymmetric.dh;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.pkcs.DHParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    DHParameterSpec currentSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        try {
            return new DHParameter(this.currentSpec.getP(), this.currentSpec.getG(), this.currentSpec.getL()).getEncoded(StubApp.getString2("26791"));
        } catch (IOException unused) {
            throw new RuntimeException(StubApp.getString2(30483));
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
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException(StubApp.getString2(30485));
        }
        this.currentSpec = (DHParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return StubApp.getString2(30488);
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals(StubApp.getString2(30489));
    }

    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return this.currentSpec;
        }
        throw new InvalidParameterSpecException(StubApp.getString2(30490));
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
        String string2 = StubApp.getString2(30486);
        try {
            DHParameter dHParameter = DHParameter.getInstance(bArr);
            this.currentSpec = dHParameter.getL() != null ? new DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue()) : new DHParameterSpec(dHParameter.getP(), dHParameter.getG());
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException(string2);
        } catch (ClassCastException unused2) {
            throw new IOException(string2);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (!isASN1FormatString(str)) {
            throw new IOException(a.j(StubApp.getString2(30487), str));
        }
        engineInit(bArr);
    }
}

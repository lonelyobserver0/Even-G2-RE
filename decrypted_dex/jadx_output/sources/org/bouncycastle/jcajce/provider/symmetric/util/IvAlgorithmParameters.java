package org.bouncycastle.jcajce.provider.symmetric.util;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IvAlgorithmParameters extends BaseAlgorithmParameters {
    private byte[] iv;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded(StubApp.getString2(30489));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException(StubApp.getString2(31931));
        }
        this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return StubApp.getString2(32429);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException(StubApp.getString2(31988));
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        boolean isASN1FormatString = isASN1FormatString(str);
        String string2 = StubApp.getString2(31343);
        if (isASN1FormatString) {
            return new DEROctetString(engineGetEncoded(string2)).getEncoded();
        }
        if (str.equals(string2)) {
            return Arrays.clone(this.iv);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets();
        }
        this.iv = Arrays.clone(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (isASN1FormatString(str)) {
            try {
                engineInit(((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets());
            } catch (Exception e10) {
                throw new IOException(a.i(StubApp.getString2(32428), e10));
            }
        } else {
            if (!str.equals(StubApp.getString2(31343))) {
                throw new IOException(StubApp.getString2(31686));
            }
            engineInit(bArr);
        }
    }
}

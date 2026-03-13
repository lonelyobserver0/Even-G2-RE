package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PBEPKCS12 {

    public static class AlgParams extends BaseAlgorithmParameters {
        PKCS12PBEParams params;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.params.getEncoded(StubApp.getString2("26791"));
            } catch (IOException e10) {
                throw new RuntimeException(StubApp.getString2(32025) + e10.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(32065));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.params = new PKCS12PBEParams(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32067);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new PBEParameterSpec(this.params.getIV(), this.params.getIterations().intValue());
            }
            throw new InvalidParameterSpecException(StubApp.getString2(32068));
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
            this.params = PKCS12PBEParams.getInstance(ASN1Primitive.fromByteArray(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException(StubApp.getString2(32066));
            }
            engineInit(bArr);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPKCS12.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            a.x(new StringBuilder(), PREFIX, StubApp.getString2(31459), configurableProvider, StubApp.getString2(32069));
        }
    }

    private PBEPKCS12() {
    }
}

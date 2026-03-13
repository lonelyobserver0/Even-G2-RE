package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PBEParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PBEPBKDF1 {

    public static class AlgParams extends BaseAlgorithmParameters {
        PBEParameter params;

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
                throw new InvalidParameterSpecException(StubApp.getString2(32026));
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.params = new PBEParameter(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return StubApp.getString2(32028);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new PBEParameterSpec(this.params.getSalt(), this.params.getIterationCount().intValue());
            }
            throw new InvalidParameterSpecException(StubApp.getString2(32029));
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
            this.params = PBEParameter.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException(StubApp.getString2(32027));
            }
            engineInit(bArr);
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = PBEPBKDF1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(32030), PREFIX + StubApp.getString2(31459));
            String string2 = StubApp.getString2(31464);
            StringBuilder sb2 = new StringBuilder(string2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC;
            String string22 = StubApp.getString2(29642);
            a.z(a.q(a.q(a.q(a.q(sb2, aSN1ObjectIdentifier, configurableProvider, string22, string2), PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, configurableProvider, string22, string2), PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC, configurableProvider, string22, string2), PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, configurableProvider, string22, string2), PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC, configurableProvider, string22);
        }
    }

    private PBEPBKDF1() {
    }
}

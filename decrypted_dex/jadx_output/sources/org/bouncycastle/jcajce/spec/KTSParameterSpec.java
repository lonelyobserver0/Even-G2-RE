package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KTSParameterSpec implements AlgorithmParameterSpec {
    private final AlgorithmIdentifier kdfAlgorithm;
    private final int keySizeInBits;
    private byte[] otherInfo;
    private final AlgorithmParameterSpec parameterSpec;
    private final String wrappingKeyAlgorithm;

    /* renamed from: org.bouncycastle.jcajce.spec.KTSParameterSpec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final String algorithmName;
        private AlgorithmIdentifier kdfAlgorithm;
        private final int keySizeInBits;
        private byte[] otherInfo;
        private AlgorithmParameterSpec parameterSpec;

        public Builder(String str, int i3) {
            this(str, i3, null);
        }

        public KTSParameterSpec build() {
            return new KTSParameterSpec(this.algorithmName, this.keySizeInBits, this.parameterSpec, this.kdfAlgorithm, this.otherInfo, null);
        }

        public Builder withKdfAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
            this.kdfAlgorithm = algorithmIdentifier;
            return this;
        }

        public Builder withParameterSpec(AlgorithmParameterSpec algorithmParameterSpec) {
            this.parameterSpec = algorithmParameterSpec;
            return this;
        }

        public Builder(String str, int i3, byte[] bArr) {
            this.algorithmName = str;
            this.keySizeInBits = i3;
            this.kdfAlgorithm = new AlgorithmIdentifier(X9ObjectIdentifiers.id_kdf_kdf3, new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256));
            this.otherInfo = bArr == null ? new byte[0] : Arrays.clone(bArr);
        }
    }

    private KTSParameterSpec(String str, int i3, AlgorithmParameterSpec algorithmParameterSpec, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.wrappingKeyAlgorithm = str;
        this.keySizeInBits = i3;
        this.parameterSpec = algorithmParameterSpec;
        this.kdfAlgorithm = algorithmIdentifier;
        this.otherInfo = bArr;
    }

    public AlgorithmIdentifier getKdfAlgorithm() {
        return this.kdfAlgorithm;
    }

    public String getKeyAlgorithmName() {
        return this.wrappingKeyAlgorithm;
    }

    public int getKeySize() {
        return this.keySizeInBits;
    }

    public byte[] getOtherInfo() {
        return Arrays.clone(this.otherInfo);
    }

    public AlgorithmParameterSpec getParameterSpec() {
        return this.parameterSpec;
    }

    public /* synthetic */ KTSParameterSpec(String str, int i3, AlgorithmParameterSpec algorithmParameterSpec, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, AnonymousClass1 anonymousClass1) {
        this(str, i3, algorithmParameterSpec, algorithmIdentifier, bArr);
    }
}

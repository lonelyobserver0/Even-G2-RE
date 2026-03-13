package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ScryptConfig extends PBKDFConfig {
    private final int blockSize;
    private final int costParameter;
    private final int parallelizationParameter;
    private final int saltLength;

    /* renamed from: org.bouncycastle.crypto.util.ScryptConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final int blockSize;
        private final int costParameter;
        private final int parallelizationParameter;
        private int saltLength = 16;

        public Builder(int i3, int i10, int i11) {
            if (i3 <= 1 || !isPowerOf2(i3)) {
                throw new IllegalArgumentException(StubApp.getString2(28994));
            }
            this.costParameter = i3;
            this.blockSize = i10;
            this.parallelizationParameter = i11;
        }

        private static boolean isPowerOf2(int i3) {
            return (i3 & (i3 + (-1))) == 0;
        }

        public ScryptConfig build() {
            return new ScryptConfig(this, null);
        }

        public Builder withSaltLength(int i3) {
            this.saltLength = i3;
            return this;
        }
    }

    private ScryptConfig(Builder builder) {
        super(MiscObjectIdentifiers.id_scrypt);
        this.costParameter = builder.costParameter;
        this.blockSize = builder.blockSize;
        this.parallelizationParameter = builder.parallelizationParameter;
        this.saltLength = builder.saltLength;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getCostParameter() {
        return this.costParameter;
    }

    public int getParallelizationParameter() {
        return this.parallelizationParameter;
    }

    public int getSaltLength() {
        return this.saltLength;
    }

    public /* synthetic */ ScryptConfig(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}

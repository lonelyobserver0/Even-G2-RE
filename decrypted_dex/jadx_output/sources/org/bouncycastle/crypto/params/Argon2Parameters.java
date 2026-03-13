package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CharToByteConverter;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Argon2Parameters {
    public static final int ARGON2_VERSION_10 = 16;
    public static final int ARGON2_VERSION_13 = 19;
    public static final int ARGON2_d = 0;
    public static final int ARGON2_i = 1;
    public static final int ARGON2_id = 2;
    private static final int DEFAULT_ITERATIONS = 3;
    private static final int DEFAULT_LANES = 1;
    private static final int DEFAULT_MEMORY_COST = 12;
    private static final int DEFAULT_TYPE = 1;
    private static final int DEFAULT_VERSION = 19;
    private final byte[] additional;
    private final CharToByteConverter converter;
    private final int iterations;
    private final int lanes;
    private final int memory;
    private final byte[] salt;
    private final byte[] secret;
    private final int type;
    private final int version;

    /* renamed from: org.bouncycastle.crypto.params.Argon2Parameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private byte[] additional;
        private CharToByteConverter converter;
        private int iterations;
        private int lanes;
        private int memory;
        private byte[] salt;
        private byte[] secret;
        private final int type;
        private int version;

        public Builder() {
            this(1);
        }

        public Argon2Parameters build() {
            return new Argon2Parameters(this.type, this.salt, this.secret, this.additional, this.iterations, this.memory, this.lanes, this.version, this.converter, null);
        }

        public void clear() {
            Arrays.clear(this.salt);
            Arrays.clear(this.secret);
            Arrays.clear(this.additional);
        }

        public Builder withAdditional(byte[] bArr) {
            this.additional = Arrays.clone(bArr);
            return this;
        }

        public Builder withCharToByteConverter(CharToByteConverter charToByteConverter) {
            this.converter = charToByteConverter;
            return this;
        }

        public Builder withIterations(int i3) {
            this.iterations = i3;
            return this;
        }

        public Builder withMemoryAsKB(int i3) {
            this.memory = i3;
            return this;
        }

        public Builder withMemoryPowOfTwo(int i3) {
            this.memory = 1 << i3;
            return this;
        }

        public Builder withParallelism(int i3) {
            this.lanes = i3;
            return this;
        }

        public Builder withSalt(byte[] bArr) {
            this.salt = Arrays.clone(bArr);
            return this;
        }

        public Builder withSecret(byte[] bArr) {
            this.secret = Arrays.clone(bArr);
            return this;
        }

        public Builder withVersion(int i3) {
            this.version = i3;
            return this;
        }

        public Builder(int i3) {
            this.converter = PasswordConverter.UTF8;
            this.type = i3;
            this.lanes = 1;
            this.memory = 4096;
            this.iterations = 3;
            this.version = 19;
        }
    }

    private Argon2Parameters(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13, CharToByteConverter charToByteConverter) {
        this.salt = Arrays.clone(bArr);
        this.secret = Arrays.clone(bArr2);
        this.additional = Arrays.clone(bArr3);
        this.iterations = i10;
        this.memory = i11;
        this.lanes = i12;
        this.version = i13;
        this.type = i3;
        this.converter = charToByteConverter;
    }

    public void clear() {
        Arrays.clear(this.salt);
        Arrays.clear(this.secret);
        Arrays.clear(this.additional);
    }

    public byte[] getAdditional() {
        return Arrays.clone(this.additional);
    }

    public CharToByteConverter getCharToByteConverter() {
        return this.converter;
    }

    public int getIterations() {
        return this.iterations;
    }

    public int getLanes() {
        return this.lanes;
    }

    public int getMemory() {
        return this.memory;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.salt);
    }

    public byte[] getSecret() {
        return Arrays.clone(this.secret);
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public /* synthetic */ Argon2Parameters(int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, int i11, int i12, int i13, CharToByteConverter charToByteConverter, AnonymousClass1 anonymousClass1) {
        this(i3, bArr, bArr2, bArr3, i10, i11, i12, i13, charToByteConverter);
    }
}

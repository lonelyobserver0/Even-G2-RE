package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Composer {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private Composer() {
    }

    public static Composer compose() {
        return new Composer();
    }

    public Composer bool(boolean z2) {
        this.bos.write(z2 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.bos.toByteArray();
    }

    public Composer bytes(Encodable encodable) {
        try {
            this.bos.write(encodable.getEncoded());
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer pad(int i3, int i10) {
        while (i10 >= 0) {
            try {
                this.bos.write(i3);
                i10--;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        return this;
    }

    public Composer padUntil(int i3, int i10) {
        while (this.bos.size() < i10) {
            this.bos.write(i3);
        }
        return this;
    }

    public Composer u16str(int i3) {
        int i10 = i3 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.bos.write((byte) (i10 >>> 8));
        this.bos.write((byte) i10);
        return this;
    }

    public Composer u32str(int i3) {
        this.bos.write((byte) (i3 >>> 24));
        this.bos.write((byte) (i3 >>> 16));
        this.bos.write((byte) (i3 >>> 8));
        this.bos.write((byte) i3);
        return this;
    }

    public Composer u64str(long j) {
        u32str((int) (j >>> 32));
        u32str((int) j);
        return this;
    }

    public Composer bytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(byte[] bArr, int i3, int i10) {
        try {
            this.bos.write(bArr, i3, i10);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(Encodable[] encodableArr) {
        try {
            for (Encodable encodable : encodableArr) {
                this.bos.write(encodable.getEncoded());
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.bos.write(bArr2);
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Composer bytes(byte[][] bArr, int i3, int i10) {
        while (i3 != i10) {
            try {
                this.bos.write(bArr[i3]);
                i3++;
            } catch (Exception e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        return this;
    }
}

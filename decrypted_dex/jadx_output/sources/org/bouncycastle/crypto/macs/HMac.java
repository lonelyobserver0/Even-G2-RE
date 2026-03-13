package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import java.util.Hashtable;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HMac implements Mac {
    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    private static Hashtable blockLengths;
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte[] inputPad;
    private Memoable ipadState;
    private Memoable opadState;
    private byte[] outputBuf;

    static {
        Hashtable hashtable = new Hashtable();
        blockLengths = hashtable;
        hashtable.put(StubApp.getString2(28192), Integers.valueOf(32));
        blockLengths.put(StubApp.getString2(28179), Integers.valueOf(16));
        blockLengths.put(StubApp.getString2(28178), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(4894), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(28185), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(21747), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(5778), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(28501), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(1488), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(23704), Integers.valueOf(128));
        blockLengths.put(StubApp.getString2(23705), Integers.valueOf(128));
        blockLengths.put(StubApp.getString2(28523), Integers.valueOf(64));
        blockLengths.put(StubApp.getString2(28525), Integers.valueOf(64));
    }

    public HMac(Digest digest) {
        this(digest, getByteLength(digest));
    }

    private static int getByteLength(Digest digest) {
        if (digest instanceof ExtendedDigest) {
            return ((ExtendedDigest) digest).getByteLength();
        }
        Integer num = (Integer) blockLengths.get(digest.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(StubApp.getString2(29032) + digest.getAlgorithmName());
    }

    private static void xorPad(byte[] bArr, int i3, byte b2) {
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ b2);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) {
        this.digest.doFinal(this.outputBuf, this.blockLength);
        Memoable memoable = this.opadState;
        if (memoable != null) {
            ((Memoable) this.digest).reset(memoable);
            Digest digest = this.digest;
            digest.update(this.outputBuf, this.blockLength, digest.getDigestSize());
        } else {
            Digest digest2 = this.digest;
            byte[] bArr2 = this.outputBuf;
            digest2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.digest.doFinal(bArr, i3);
        int i10 = this.blockLength;
        while (true) {
            byte[] bArr3 = this.outputBuf;
            if (i10 >= bArr3.length) {
                break;
            }
            bArr3[i10] = 0;
            i10++;
        }
        Memoable memoable2 = this.ipadState;
        if (memoable2 != null) {
            ((Memoable) this.digest).reset(memoable2);
            return doFinal;
        }
        Digest digest3 = this.digest;
        byte[] bArr4 = this.inputPad;
        digest3.update(bArr4, 0, bArr4.length);
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + StubApp.getString2(29033);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.digestSize;
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] bArr;
        this.digest.reset();
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length > this.blockLength) {
            this.digest.update(key, 0, length);
            this.digest.doFinal(this.inputPad, 0);
            length = this.digestSize;
        } else {
            System.arraycopy(key, 0, this.inputPad, 0, length);
        }
        while (true) {
            bArr = this.inputPad;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.outputBuf, 0, this.blockLength);
        xorPad(this.inputPad, this.blockLength, IPAD);
        xorPad(this.outputBuf, this.blockLength, OPAD);
        Digest digest = this.digest;
        if (digest instanceof Memoable) {
            Memoable copy = ((Memoable) digest).copy();
            this.opadState = copy;
            ((Digest) copy).update(this.outputBuf, 0, this.blockLength);
        }
        Digest digest2 = this.digest;
        byte[] bArr2 = this.inputPad;
        digest2.update(bArr2, 0, bArr2.length);
        Digest digest3 = this.digest;
        if (digest3 instanceof Memoable) {
            this.ipadState = ((Memoable) digest3).copy();
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Memoable memoable = this.ipadState;
        if (memoable != null) {
            ((Memoable) this.digest).reset(memoable);
            return;
        }
        this.digest.reset();
        Digest digest = this.digest;
        byte[] bArr = this.inputPad;
        digest.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) {
        this.digest.update(b2);
    }

    private HMac(Digest digest, int i3) {
        this.digest = digest;
        int digestSize = digest.getDigestSize();
        this.digestSize = digestSize;
        this.blockLength = i3;
        this.inputPad = new byte[i3];
        this.outputBuf = new byte[i3 + digestSize];
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) {
        this.digest.update(bArr, i3, i10);
    }
}

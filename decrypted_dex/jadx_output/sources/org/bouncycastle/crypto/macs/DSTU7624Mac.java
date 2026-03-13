package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU7624Mac implements Mac {
    private static final int BITS_IN_BYTE = 8;
    private int blockSize;
    private byte[] buf;
    private int bufOff;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f18988c;
    private byte[] cTemp;
    private DSTU7624Engine engine;
    private boolean initCalled = false;
    private byte[] kDelta;
    private int macSize;

    public DSTU7624Mac(int i3, int i10) {
        this.engine = new DSTU7624Engine(i3);
        int i11 = i3 / 8;
        this.blockSize = i11;
        this.macSize = i10 / 8;
        this.f18988c = new byte[i11];
        this.kDelta = new byte[i11];
        this.cTemp = new byte[i11];
        this.buf = new byte[i11];
    }

    private void processBlock(byte[] bArr, int i3) {
        xor(this.f18988c, 0, bArr, i3, this.cTemp);
        this.engine.processBlock(this.cTemp, 0, this.f18988c, 0);
    }

    private void xor(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3) {
        int length = bArr.length - i3;
        int i11 = this.blockSize;
        if (length < i11 || bArr2.length - i10 < i11 || bArr3.length < i11) {
            throw new IllegalArgumentException(StubApp.getString2(29024));
        }
        for (int i12 = 0; i12 < this.blockSize; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i3] ^ bArr2[i12 + i10]);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        int i10 = this.bufOff;
        byte[] bArr2 = this.buf;
        if (i10 % bArr2.length != 0) {
            throw new DataLengthException(StubApp.getString2(29025));
        }
        xor(this.f18988c, 0, bArr2, 0, this.cTemp);
        xor(this.cTemp, 0, this.kDelta, 0, this.f18988c);
        DSTU7624Engine dSTU7624Engine = this.engine;
        byte[] bArr3 = this.f18988c;
        dSTU7624Engine.processBlock(bArr3, 0, bArr3, 0);
        int i11 = this.macSize;
        if (i11 + i3 > bArr.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        System.arraycopy(this.f18988c, 0, bArr, i3, i11);
        reset();
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29026);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(29027));
        }
        this.engine.init(true, cipherParameters);
        this.initCalled = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Arrays.fill(this.f18988c, (byte) 0);
        Arrays.fill(this.cTemp, (byte) 0);
        Arrays.fill(this.kDelta, (byte) 0);
        Arrays.fill(this.buf, (byte) 0);
        this.engine.reset();
        if (this.initCalled) {
            DSTU7624Engine dSTU7624Engine = this.engine;
            byte[] bArr = this.kDelta;
            dSTU7624Engine.processBlock(bArr, 0, bArr, 0);
        }
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) {
        int i3 = this.bufOff;
        byte[] bArr = this.buf;
        if (i3 == bArr.length) {
            processBlock(bArr, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i10 = this.bufOff;
        this.bufOff = i10 + 1;
        bArr2[i10] = b2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(29028));
        }
        int blockSize = this.engine.getBlockSize();
        int i11 = this.bufOff;
        int i12 = blockSize - i11;
        if (i10 > i12) {
            System.arraycopy(bArr, i3, this.buf, i11, i12);
            processBlock(this.buf, 0);
            this.bufOff = 0;
            i10 -= i12;
            i3 += i12;
            while (i10 > blockSize) {
                processBlock(bArr, i3);
                i10 -= blockSize;
                i3 += blockSize;
            }
        }
        System.arraycopy(bArr, i3, this.buf, this.bufOff, i10);
        this.bufOff += i10;
    }
}

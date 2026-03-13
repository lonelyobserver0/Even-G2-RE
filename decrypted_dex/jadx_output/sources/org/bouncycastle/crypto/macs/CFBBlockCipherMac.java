package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CFBBlockCipherMac implements Mac {
    private byte[] buf;
    private int bufOff;
    private MacCFBBlockCipher cipher;
    private byte[] mac;
    private int macSize;
    private BlockCipherPadding padding;

    public CFBBlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, 8, (blockCipher.getBlockSize() * 8) / 2, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) {
        int blockSize = this.cipher.getBlockSize();
        BlockCipherPadding blockCipherPadding = this.padding;
        if (blockCipherPadding == null) {
            while (true) {
                int i10 = this.bufOff;
                if (i10 >= blockSize) {
                    break;
                }
                this.buf[i10] = 0;
                this.bufOff = i10 + 1;
            }
        } else {
            blockCipherPadding.addPadding(this.buf, this.bufOff);
        }
        this.cipher.processBlock(this.buf, 0, this.mac, 0);
        this.cipher.getMacBlock(this.mac);
        System.arraycopy(this.mac, 0, bArr, i3, this.macSize);
        reset();
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.cipher.init(cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i3 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i3] = 0;
                i3++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) {
        int i3 = this.bufOff;
        byte[] bArr = this.buf;
        if (i3 == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i10 = this.bufOff;
        this.bufOff = i10 + 1;
        bArr2[i10] = b2;
    }

    public CFBBlockCipherMac(BlockCipher blockCipher, int i3, int i10) {
        this(blockCipher, i3, i10, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28301));
        }
        int blockSize = this.cipher.getBlockSize();
        int i11 = this.bufOff;
        int i12 = blockSize - i11;
        if (i10 > i12) {
            System.arraycopy(bArr, i3, this.buf, i11, i12);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            i10 -= i12;
            i3 += i12;
            while (i10 > blockSize) {
                this.cipher.processBlock(bArr, i3, this.mac, 0);
                i10 -= blockSize;
                i3 += blockSize;
            }
        }
        System.arraycopy(bArr, i3, this.buf, this.bufOff, i10);
        this.bufOff += i10;
    }

    public CFBBlockCipherMac(BlockCipher blockCipher, int i3, int i10, BlockCipherPadding blockCipherPadding) {
        this.padding = null;
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29018));
        }
        this.mac = new byte[blockCipher.getBlockSize()];
        MacCFBBlockCipher macCFBBlockCipher = new MacCFBBlockCipher(blockCipher, i3);
        this.cipher = macCFBBlockCipher;
        this.padding = blockCipherPadding;
        this.macSize = i10 / 8;
        this.buf = new byte[macCFBBlockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    public CFBBlockCipherMac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this(blockCipher, 8, (blockCipher.getBlockSize() * 8) / 2, blockCipherPadding);
    }
}

package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import i2.u;
import kotlin.UByte;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMac implements Mac {
    private byte[] Lu;
    private byte[] Lu2;
    private byte[] ZEROES;
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;
    private byte[] poly;

    public CMac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    private byte[] doubleLu(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i3 = (-shiftLeft(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b2 = bArr2[length];
        byte[] bArr3 = this.poly;
        bArr2[length] = (byte) (b2 ^ (bArr3[1] & i3));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i3) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i3 & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] lookupPoly(int i3) {
        int i10 = i3 * 8;
        int i11 = 135;
        switch (i10) {
            case 64:
            case DilithiumEngine.DilithiumPolyT1PackedBytes /* 320 */:
                i11 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i11 = 45;
                break;
            case BERTags.FLAGS /* 224 */:
                i11 = 777;
                break;
            case 256:
                i11 = 1061;
                break;
            case KyberEngine.KyberPolyBytes /* 384 */:
                i11 = DfuBaseService.ERROR_CRC_ERROR;
                break;
            case 448:
                i11 = 2129;
                break;
            case 512:
                i11 = 293;
                break;
            case 768:
                i11 = 655377;
                break;
            case 1024:
                i11 = 524355;
                break;
            case 2048:
                i11 = 548865;
                break;
            default:
                throw new IllegalArgumentException(u.p(i10, StubApp.getString2(29020)));
        }
        return Pack.intToBigEndian(i11);
    }

    private static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i3 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            int i10 = bArr[length] & UByte.MAX_VALUE;
            bArr2[length] = (byte) (i3 | (i10 << 1));
            i3 = (i10 >>> 7) & 1;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) {
        byte[] bArr2;
        if (this.bufOff == this.cipher.getBlockSize()) {
            bArr2 = this.Lu;
        } else {
            new ISO7816d4Padding().addPadding(this.buf, this.bufOff);
            bArr2 = this.Lu2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr3 = this.mac;
            if (i10 >= bArr3.length) {
                this.cipher.processBlock(this.buf, 0, bArr3, 0);
                System.arraycopy(this.mac, 0, bArr, i3, this.macSize);
                reset();
                return this.macSize;
            }
            byte[] bArr4 = this.buf;
            bArr4[i10] = (byte) (bArr4[i10] ^ bArr2[i10]);
            i10++;
        }
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
        validate(cipherParameters);
        this.cipher.init(true, cipherParameters);
        byte[] bArr = this.ZEROES;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        byte[] doubleLu = doubleLu(bArr2);
        this.Lu = doubleLu;
        this.Lu2 = doubleLu(doubleLu);
        reset();
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

    public void validate(CipherParameters cipherParameters) {
        if (cipherParameters != null && !(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(29021));
        }
    }

    public CMac(BlockCipher blockCipher, int i3) {
        if (i3 % 8 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29018));
        }
        if (i3 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException(StubApp.getString2(29019) + (blockCipher.getBlockSize() * 8));
        }
        this.cipher = new CBCBlockCipher(blockCipher);
        this.macSize = i3 / 8;
        this.poly = lookupPoly(blockCipher.getBlockSize());
        this.mac = new byte[blockCipher.getBlockSize()];
        this.buf = new byte[blockCipher.getBlockSize()];
        this.ZEROES = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
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
}

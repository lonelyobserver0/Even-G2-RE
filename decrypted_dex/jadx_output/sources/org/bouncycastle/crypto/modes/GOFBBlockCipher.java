package org.bouncycastle.crypto.modes;

import android.R;
import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOFBBlockCipher extends StreamBlockCipher {

    /* renamed from: C1, reason: collision with root package name */
    static final int f19034C1 = 16843012;

    /* renamed from: C2, reason: collision with root package name */
    static final int f19035C2 = 16843009;
    private byte[] IV;
    int N3;

    /* renamed from: N4, reason: collision with root package name */
    int f19036N4;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public GOFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.firstStep = true;
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException(StubApp.getString2(29127));
        }
        this.IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private int bytesToint(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] << 24) & (-16777216)) + ((bArr[i3 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i3 + 1] << 8) & 65280) + (bArr[i3] & UByte.MAX_VALUE);
    }

    private void intTobytes(int i3, byte[] bArr, int i10) {
        bArr[i10 + 3] = (byte) (i3 >>> 24);
        bArr[i10 + 2] = (byte) (i3 >>> 16);
        bArr[i10 + 1] = (byte) (i3 >>> 8);
        bArr[i10] = (byte) i3;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b2) {
        if (this.byteCount == 0) {
            if (this.firstStep) {
                this.firstStep = false;
                this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
                this.N3 = bytesToint(this.ofbOutV, 0);
                this.f19036N4 = bytesToint(this.ofbOutV, 4);
            }
            int i3 = this.N3 + 16843009;
            this.N3 = i3;
            int i10 = this.f19036N4;
            int i11 = i10 + 16843012;
            this.f19036N4 = i11;
            if (i11 < 16843012 && i11 > 0) {
                this.f19036N4 = i10 + R.attr.format;
            }
            intTobytes(i3, this.ofbV, 0);
            intTobytes(this.f19036N4, this.ofbV, 4);
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i12 = this.byteCount;
        int i13 = i12 + 1;
        this.byteCount = i13;
        byte b10 = (byte) (b2 ^ bArr[i12]);
        int i14 = this.blockSize;
        if (i13 == i14) {
            this.byteCount = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i14, bArr2, 0, bArr2.length - i14);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i15 = this.blockSize;
            System.arraycopy(bArr3, 0, bArr4, length - i15, i15);
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + StubApp.getString2(29104);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.firstStep = true;
        this.N3 = 0;
        this.f19036N4 = 0;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i3 = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i3 >= bArr2.length - iv.length) {
                        break;
                    }
                    bArr2[i3] = 0;
                    i3++;
                }
            } else {
                System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            }
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.cipher;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) throws DataLengthException, IllegalStateException {
        processBytes(bArr, i3, this.blockSize, bArr2, i10);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.firstStep = true;
        this.N3 = 0;
        this.f19036N4 = 0;
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}

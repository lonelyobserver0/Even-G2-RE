package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KCCMBlockCipher implements AEADBlockCipher {
    private static final int BITS_IN_BYTE = 8;
    private static final int BYTES_IN_INT = 4;
    private static final int MAX_MAC_BIT_LENGTH = 512;
    private static final int MIN_MAC_BIT_LENGTH = 64;

    /* renamed from: G1, reason: collision with root package name */
    private byte[] f19037G1;
    private int Nb_;
    private ExposedByteArrayOutputStream associatedText;
    private byte[] buffer;
    private byte[] counter;
    private ExposedByteArrayOutputStream data;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f19038s;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    private void CalculateMac(byte[] bArr, int i3, int i10) {
        while (i10 > 0) {
            for (int i11 = 0; i11 < this.engine.getBlockSize(); i11++) {
                byte[] bArr2 = this.macBlock;
                bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i3 + i11]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr3 = this.macBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i10 -= this.engine.getBlockSize();
            i3 += this.engine.getBlockSize();
        }
    }

    private void ProcessBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.counter;
            if (i12 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.f19038s;
            bArr4[i12] = (byte) (bArr4[i12] + bArr3[i12]);
            i12++;
        }
        this.engine.processBlock(this.f19038s, 0, this.buffer, 0);
        for (int i13 = 0; i13 < this.engine.getBlockSize(); i13++) {
            bArr2[i11 + i13] = (byte) (this.buffer[i13] ^ bArr[i3 + i13]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[LOOP:0: B:17:0x0064->B:19:0x006b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte getFlag(boolean r4, int r5) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 824(0x338, float:1.155E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            if (r4 == 0) goto L19
            r4 = 878(0x36e, float:1.23E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r0.append(r4)
            goto L1c
        L19:
            r0.append(r1)
        L1c:
            r4 = 8
            if (r5 == r4) goto L54
            r4 = 16
            if (r5 == r4) goto L4c
            r4 = 32
            if (r5 == r4) goto L44
            r4 = 48
            if (r5 == r4) goto L3c
            r4 = 64
            if (r5 == r4) goto L31
            goto L5c
        L31:
            r4 = 29128(0x71c8, float:4.0817E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
        L38:
            r0.append(r4)
            goto L5c
        L3c:
            r4 = 29129(0x71c9, float:4.0818E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            goto L38
        L44:
            r4 = 29130(0x71ca, float:4.082E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            goto L38
        L4c:
            r4 = 29131(0x71cb, float:4.0821E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            goto L38
        L54:
            r4 = 29132(0x71cc, float:4.0823E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            goto L38
        L5c:
            int r4 = r3.Nb_
            int r4 = r4 + (-1)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
        L64:
            int r5 = r4.length()
            r2 = 4
            if (r5 >= r2) goto L7a
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>(r4)
            r4 = 0
            java.lang.StringBuffer r4 = r5.insert(r4, r1)
            java.lang.String r4 = r4.toString()
            goto L64
        L7a:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)
            byte r4 = (byte) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.modes.KCCMBlockCipher.getFlag(boolean, int):byte");
    }

    private void intToBytes(int i3, byte[] bArr, int i10) {
        bArr[i10 + 3] = (byte) (i3 >> 24);
        bArr[i10 + 2] = (byte) (i3 >> 16);
        bArr[i10 + 1] = (byte) (i3 >> 8);
        bArr[i10] = (byte) i3;
    }

    private void processAAD(byte[] bArr, int i3, int i10, int i11) {
        if (i10 - i3 < this.engine.getBlockSize()) {
            throw new IllegalArgumentException(StubApp.getString2(29134));
        }
        if (i10 % this.engine.getBlockSize() != 0) {
            throw new IllegalArgumentException(StubApp.getString2(29133));
        }
        byte[] bArr2 = this.nonce;
        System.arraycopy(bArr2, 0, this.f19037G1, 0, (bArr2.length - this.Nb_) - 1);
        intToBytes(i11, this.buffer, 0);
        System.arraycopy(this.buffer, 0, this.f19037G1, (this.nonce.length - this.Nb_) - 1, 4);
        byte[] bArr3 = this.f19037G1;
        bArr3[bArr3.length - 1] = getFlag(true, this.macSize);
        this.engine.processBlock(this.f19037G1, 0, this.macBlock, 0);
        intToBytes(i10, this.buffer, 0);
        if (i10 <= this.engine.getBlockSize() - this.Nb_) {
            for (int i12 = 0; i12 < i10; i12++) {
                byte[] bArr4 = this.buffer;
                int i13 = this.Nb_ + i12;
                bArr4[i13] = (byte) (bArr4[i13] ^ bArr[i3 + i12]);
            }
            for (int i14 = 0; i14 < this.engine.getBlockSize(); i14++) {
                byte[] bArr5 = this.macBlock;
                bArr5[i14] = (byte) (bArr5[i14] ^ this.buffer[i14]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr6 = this.macBlock;
            blockCipher.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        for (int i15 = 0; i15 < this.engine.getBlockSize(); i15++) {
            byte[] bArr7 = this.macBlock;
            bArr7[i15] = (byte) (bArr7[i15] ^ this.buffer[i15]);
        }
        BlockCipher blockCipher2 = this.engine;
        byte[] bArr8 = this.macBlock;
        blockCipher2.processBlock(bArr8, 0, bArr8, 0);
        while (i10 != 0) {
            for (int i16 = 0; i16 < this.engine.getBlockSize(); i16++) {
                byte[] bArr9 = this.macBlock;
                bArr9[i16] = (byte) (bArr9[i16] ^ bArr[i16 + i3]);
            }
            BlockCipher blockCipher3 = this.engine;
            byte[] bArr10 = this.macBlock;
            blockCipher3.processBlock(bArr10, 0, bArr10, 0);
            i3 += this.engine.getBlockSize();
            i10 -= this.engine.getBlockSize();
        }
    }

    private void setNb(int i3) {
        if (i3 != 4 && i3 != 6 && i3 != 8) {
            throw new IllegalArgumentException(StubApp.getString2(29135));
        }
        this.Nb_ = i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        int processPacket = processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i3);
        reset();
        return processPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + StubApp.getString2(29136);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.mac);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        return i3 + this.macSize;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        return i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException(StubApp.getString2(29137));
            }
            this.nonce = aEADParameters.getNonce();
            this.macSize = aEADParameters.getMacSize() / 8;
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29138));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.macSize = this.engine.getBlockSize();
            this.initialAssociatedText = null;
            parameters = parametersWithIV.getParameters();
        }
        this.mac = new byte[this.macSize];
        this.forEncryption = z2;
        this.engine.init(true, parameters);
        this.counter[0] = 1;
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        this.associatedText.write(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        this.associatedText.write(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        this.data.write(b2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException, IllegalStateException {
        if (bArr.length < i3 + i10) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        this.data.write(bArr, i3, i10);
        return 0;
    }

    public int processPacket(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws IllegalStateException, InvalidCipherTextException {
        int i12;
        if (bArr.length - i3 < i10) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (bArr2.length - i11 < i10) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        if (this.associatedText.size() > 0) {
            if (this.forEncryption) {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size());
            } else {
                processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size() - this.macSize);
            }
        }
        boolean z2 = this.forEncryption;
        String string2 = StubApp.getString2(29139);
        if (!z2) {
            if ((i10 - this.macSize) % this.engine.getBlockSize() != 0) {
                throw new DataLengthException(string2);
            }
            this.engine.processBlock(this.nonce, 0, this.f19038s, 0);
            int blockSize = i10 / this.engine.getBlockSize();
            int i13 = i3;
            int i14 = i11;
            for (int i15 = 0; i15 < blockSize; i15++) {
                ProcessBlock(bArr, i13, i10, bArr2, i14);
                i13 += this.engine.getBlockSize();
                i14 += this.engine.getBlockSize();
            }
            if (i10 > i13) {
                int i16 = 0;
                while (true) {
                    byte[] bArr3 = this.counter;
                    if (i16 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.f19038s;
                    bArr4[i16] = (byte) (bArr4[i16] + bArr3[i16]);
                    i16++;
                }
                this.engine.processBlock(this.f19038s, 0, this.buffer, 0);
                int i17 = 0;
                while (true) {
                    i12 = this.macSize;
                    if (i17 >= i12) {
                        break;
                    }
                    bArr2[i14 + i17] = (byte) (this.buffer[i17] ^ bArr[i13 + i17]);
                    i17++;
                }
                i14 += i12;
            }
            int i18 = 0;
            while (true) {
                byte[] bArr5 = this.counter;
                if (i18 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.f19038s;
                bArr6[i18] = (byte) (bArr6[i18] + bArr5[i18]);
                i18++;
            }
            this.engine.processBlock(this.f19038s, 0, this.buffer, 0);
            int i19 = this.macSize;
            System.arraycopy(bArr2, i14 - i19, this.buffer, 0, i19);
            CalculateMac(bArr2, 0, i14 - this.macSize);
            System.arraycopy(this.macBlock, 0, this.mac, 0, this.macSize);
            int i20 = this.macSize;
            byte[] bArr7 = new byte[i20];
            System.arraycopy(this.buffer, 0, bArr7, 0, i20);
            if (!Arrays.constantTimeAreEqual(this.mac, bArr7)) {
                throw new InvalidCipherTextException(StubApp.getString2(29121));
            }
            reset();
            return i10 - this.macSize;
        }
        if (i10 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException(string2);
        }
        CalculateMac(bArr, i3, i10);
        this.engine.processBlock(this.nonce, 0, this.f19038s, 0);
        int i21 = i3;
        int i22 = i10;
        int i23 = i11;
        while (i22 > 0) {
            ProcessBlock(bArr, i21, i10, bArr2, i23);
            i22 -= this.engine.getBlockSize();
            i21 += this.engine.getBlockSize();
            i23 += this.engine.getBlockSize();
        }
        int i24 = 0;
        while (true) {
            byte[] bArr8 = this.counter;
            if (i24 >= bArr8.length) {
                break;
            }
            byte[] bArr9 = this.f19038s;
            bArr9[i24] = (byte) (bArr9[i24] + bArr8[i24]);
            i24++;
        }
        this.engine.processBlock(this.f19038s, 0, this.buffer, 0);
        int i25 = 0;
        while (true) {
            int i26 = this.macSize;
            if (i25 >= i26) {
                System.arraycopy(this.macBlock, 0, this.mac, 0, i26);
                reset();
                return this.macSize + i10;
            }
            bArr2[i23 + i25] = (byte) (this.buffer[i25] ^ this.macBlock[i25]);
            i25++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        Arrays.fill(this.f19037G1, (byte) 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.counter, (byte) 0);
        Arrays.fill(this.macBlock, (byte) 0);
        this.counter[0] = 1;
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i3) {
        this.associatedText = new ExposedByteArrayOutputStream();
        this.data = new ExposedByteArrayOutputStream();
        this.Nb_ = 4;
        this.engine = blockCipher;
        this.macSize = blockCipher.getBlockSize();
        this.nonce = new byte[blockCipher.getBlockSize()];
        this.initialAssociatedText = new byte[blockCipher.getBlockSize()];
        this.mac = new byte[blockCipher.getBlockSize()];
        this.macBlock = new byte[blockCipher.getBlockSize()];
        this.f19037G1 = new byte[blockCipher.getBlockSize()];
        this.buffer = new byte[blockCipher.getBlockSize()];
        this.f19038s = new byte[blockCipher.getBlockSize()];
        this.counter = new byte[blockCipher.getBlockSize()];
        setNb(i3);
    }
}

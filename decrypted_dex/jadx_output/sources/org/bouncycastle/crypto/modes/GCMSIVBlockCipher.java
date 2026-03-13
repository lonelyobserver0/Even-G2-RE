package org.bouncycastle.crypto.modes;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GCMSIVBlockCipher implements AEADBlockCipher {
    private static final byte ADD = -31;
    private static final int AEAD_COMPLETE = 2;
    private static final int BUFLEN = 16;
    private static final int HALFBUFLEN = 8;
    private static final int INIT = 1;
    private static final byte MASK = Byte.MIN_VALUE;
    private static final int MAX_DATALEN = 2147483623;
    private static final int NONCELEN = 12;
    private boolean forEncryption;
    private byte[] macBlock;
    private final GCMSIVHasher theAEADHasher;
    private final BlockCipher theCipher;
    private final GCMSIVHasher theDataHasher;
    private GCMSIVCache theEncData;
    private int theFlags;
    private final byte[] theGHash;
    private byte[] theInitialAEAD;
    private final GCMMultiplier theMultiplier;
    private byte[] theNonce;
    private GCMSIVCache thePlain;
    private final byte[] theReverse;

    /* renamed from: org.bouncycastle.crypto.modes.GCMSIVBlockCipher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class GCMSIVCache extends ByteArrayOutputStream {
        public void clearBuffer() {
            Arrays.fill(getBuffer(), (byte) 0);
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public class GCMSIVHasher {
        private int numActive;
        private long numHashed;
        private final byte[] theBuffer;
        private final byte[] theByte;

        private GCMSIVHasher() {
            this.theBuffer = new byte[16];
            this.theByte = new byte[1];
        }

        public void completeHash() {
            if (this.numActive > 0) {
                Arrays.fill(GCMSIVBlockCipher.this.theReverse, (byte) 0);
                GCMSIVBlockCipher.fillReverse(this.theBuffer, 0, this.numActive, GCMSIVBlockCipher.this.theReverse);
                GCMSIVBlockCipher gCMSIVBlockCipher = GCMSIVBlockCipher.this;
                gCMSIVBlockCipher.gHASH(gCMSIVBlockCipher.theReverse);
            }
        }

        public long getBytesProcessed() {
            return this.numHashed;
        }

        public void reset() {
            this.numActive = 0;
            this.numHashed = 0L;
        }

        public void updateHash(byte b2) {
            byte[] bArr = this.theByte;
            bArr[0] = b2;
            updateHash(bArr, 0, 1);
        }

        public /* synthetic */ GCMSIVHasher(GCMSIVBlockCipher gCMSIVBlockCipher, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void updateHash(byte[] bArr, int i3, int i10) {
            int i11;
            int i12 = this.numActive;
            int i13 = 16 - i12;
            if (i12 <= 0 || i10 < i13) {
                i11 = i10;
                i13 = 0;
            } else {
                System.arraycopy(bArr, i3, this.theBuffer, i12, i13);
                GCMSIVBlockCipher.fillReverse(this.theBuffer, 0, 16, GCMSIVBlockCipher.this.theReverse);
                GCMSIVBlockCipher gCMSIVBlockCipher = GCMSIVBlockCipher.this;
                gCMSIVBlockCipher.gHASH(gCMSIVBlockCipher.theReverse);
                i11 = i10 - i13;
                this.numActive = 0;
            }
            while (i11 >= 16) {
                GCMSIVBlockCipher.fillReverse(bArr, i3 + i13, 16, GCMSIVBlockCipher.this.theReverse);
                GCMSIVBlockCipher gCMSIVBlockCipher2 = GCMSIVBlockCipher.this;
                gCMSIVBlockCipher2.gHASH(gCMSIVBlockCipher2.theReverse);
                i13 += 16;
                i11 -= 16;
            }
            if (i11 > 0) {
                System.arraycopy(bArr, i3 + i13, this.theBuffer, this.numActive, i11);
                this.numActive += i11;
            }
            this.numHashed += i10;
        }
    }

    public GCMSIVBlockCipher() {
        this(new AESEngine());
    }

    private static int bufLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private byte[] calculateTag() {
        this.theDataHasher.completeHash();
        byte[] completePolyVal = completePolyVal();
        byte[] bArr = new byte[16];
        for (int i3 = 0; i3 < 12; i3++) {
            completePolyVal[i3] = (byte) (completePolyVal[i3] ^ this.theNonce[i3]);
        }
        completePolyVal[15] = (byte) (completePolyVal[15] & ByteCompanionObject.MAX_VALUE);
        this.theCipher.processBlock(completePolyVal, 0, bArr, 0);
        return bArr;
    }

    private void checkAEADStatus(int i3) {
        int i10 = this.theFlags;
        if ((i10 & 1) == 0) {
            throw new IllegalStateException(StubApp.getString2(29119));
        }
        if ((i10 & 2) != 0) {
            throw new IllegalStateException(StubApp.getString2(29118));
        }
        if (this.theAEADHasher.getBytesProcessed() - Long.MIN_VALUE > (MAX_DATALEN - i3) - Long.MIN_VALUE) {
            throw new IllegalStateException(StubApp.getString2(29117));
        }
    }

    private static void checkBuffer(byte[] bArr, int i3, int i10, boolean z2) {
        int bufLength = bufLength(bArr);
        int i11 = i3 + i10;
        if (i10 < 0 || i3 < 0 || i11 < 0 || i11 > bufLength) {
            if (!z2) {
                throw new DataLengthException(StubApp.getString2(28674));
            }
        }
    }

    private void checkStatus(int i3) {
        long j;
        int i10 = this.theFlags;
        if ((i10 & 1) == 0) {
            throw new IllegalStateException(StubApp.getString2(29119));
        }
        if ((i10 & 2) == 0) {
            this.theAEADHasher.completeHash();
            this.theFlags |= 2;
        }
        long size = this.thePlain.size();
        if (this.forEncryption) {
            j = 2147483623;
        } else {
            size = this.theEncData.size();
            j = 2147483639;
        }
        if (size - Long.MIN_VALUE > (j - i3) - Long.MIN_VALUE) {
            throw new IllegalStateException(StubApp.getString2(29120));
        }
    }

    private byte[] completePolyVal() {
        byte[] bArr = new byte[16];
        gHashLengths();
        fillReverse(this.theGHash, 0, 16, bArr);
        return bArr;
    }

    private void decryptPlain() throws InvalidCipherTextException {
        byte[] buffer = this.theEncData.getBuffer();
        int size = this.theEncData.size();
        int i3 = size - 16;
        if (i3 < 0) {
            throw new InvalidCipherTextException(StubApp.getString2(29122));
        }
        byte[] copyOfRange = Arrays.copyOfRange(buffer, i3, size);
        byte[] clone = Arrays.clone(copyOfRange);
        clone[15] = (byte) (clone[15] | Byte.MIN_VALUE);
        byte[] bArr = new byte[16];
        int i10 = 0;
        while (i3 > 0) {
            this.theCipher.processBlock(clone, 0, bArr, 0);
            int min = Math.min(16, i3);
            xorBlock(bArr, buffer, i10, min);
            this.thePlain.write(bArr, 0, min);
            this.theDataHasher.updateHash(bArr, 0, min);
            i3 -= min;
            i10 += min;
            incrementCounter(clone);
        }
        byte[] calculateTag = calculateTag();
        if (!Arrays.constantTimeAreEqual(calculateTag, copyOfRange)) {
            reset();
            throw new InvalidCipherTextException(StubApp.getString2(29121));
        }
        byte[] bArr2 = this.macBlock;
        System.arraycopy(calculateTag, 0, bArr2, 0, bArr2.length);
    }

    private void deriveKeys(KeyParameter keyParameter) {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        int length = keyParameter.getKey().length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(this.theNonce, 0, bArr, 4, 12);
        this.theCipher.init(true, keyParameter);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr3, 8, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 0, 8);
        bArr[0] = (byte) (bArr[0] + 1);
        this.theCipher.processBlock(bArr, 0, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr4, 8, 8);
        if (length == 32) {
            bArr[0] = (byte) (bArr[0] + 1);
            this.theCipher.processBlock(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 16, 8);
            bArr[0] = (byte) (bArr[0] + 1);
            this.theCipher.processBlock(bArr, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr4, 24, 8);
        }
        this.theCipher.init(true, new KeyParameter(bArr4));
        fillReverse(bArr3, 0, 16, bArr2);
        mulX(bArr2);
        this.theMultiplier.init(bArr2);
        this.theFlags |= 1;
    }

    private int encryptPlain(byte[] bArr, byte[] bArr2, int i3) {
        byte[] buffer = this.thePlain.getBuffer();
        byte[] clone = Arrays.clone(bArr);
        clone[15] = (byte) (clone[15] | Byte.MIN_VALUE);
        byte[] bArr3 = new byte[16];
        int size = this.thePlain.size();
        int i10 = 0;
        while (size > 0) {
            this.theCipher.processBlock(clone, 0, bArr3, 0);
            int min = Math.min(16, size);
            xorBlock(bArr3, buffer, i10, min);
            System.arraycopy(bArr3, 0, bArr2, i3 + i10, min);
            size -= min;
            i10 += min;
            incrementCounter(clone);
        }
        return this.thePlain.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fillReverse(byte[] bArr, int i3, int i10, byte[] bArr2) {
        int i11 = 0;
        int i12 = 15;
        while (i11 < i10) {
            bArr2[i12] = bArr[i3 + i11];
            i11++;
            i12--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gHASH(byte[] bArr) {
        xorBlock(this.theGHash, bArr);
        this.theMultiplier.multiplyH(this.theGHash);
    }

    private void gHashLengths() {
        byte[] bArr = new byte[16];
        Pack.longToBigEndian(this.theDataHasher.getBytesProcessed() * 8, bArr, 0);
        Pack.longToBigEndian(this.theAEADHasher.getBytesProcessed() * 8, bArr, 8);
        gHASH(bArr);
    }

    private static void incrementCounter(byte[] bArr) {
        for (int i3 = 0; i3 < 4; i3++) {
            byte b2 = (byte) (bArr[i3] + 1);
            bArr[i3] = b2;
            if (b2 != 0) {
                return;
            }
        }
    }

    private static void mulX(byte[] bArr) {
        int i3 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            byte b2 = bArr[i10];
            bArr[i10] = (byte) (i3 | ((b2 >> 1) & CertificateBody.profileType));
            i3 = (b2 & 1) == 0 ? 0 : -128;
        }
        if (i3 != 0) {
            bArr[0] = (byte) (bArr[0] ^ ADD);
        }
    }

    private void resetStreams() {
        GCMSIVCache gCMSIVCache = this.thePlain;
        if (gCMSIVCache != null) {
            gCMSIVCache.clearBuffer();
        }
        this.theAEADHasher.reset();
        this.theDataHasher.reset();
        this.thePlain = new GCMSIVCache();
        this.theEncData = this.forEncryption ? null : new GCMSIVCache();
        this.theFlags &= -3;
        Arrays.fill(this.theGHash, (byte) 0);
        byte[] bArr = this.theInitialAEAD;
        if (bArr != null) {
            this.theAEADHasher.updateHash(bArr, 0, bArr.length);
        }
    }

    private static void xorBlock(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i3) throws IllegalStateException, InvalidCipherTextException {
        checkStatus(0);
        checkBuffer(bArr, i3, getOutputSize(0), true);
        if (!this.forEncryption) {
            decryptPlain();
            int size = this.thePlain.size();
            System.arraycopy(this.thePlain.getBuffer(), 0, bArr, i3, size);
            resetStreams();
            return size;
        }
        byte[] calculateTag = calculateTag();
        int encryptPlain = encryptPlain(calculateTag, bArr, i3) + 16;
        System.arraycopy(calculateTag, 0, bArr, this.thePlain.size() + i3, 16);
        byte[] bArr2 = this.macBlock;
        System.arraycopy(calculateTag, 0, bArr2, 0, bArr2.length);
        resetStreams();
        return encryptPlain;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.theCipher.getAlgorithmName() + StubApp.getString2(29123);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i3) {
        if (this.forEncryption) {
            return this.thePlain.size() + i3 + 16;
        }
        int size = this.theEncData.size() + i3;
        if (size > 16) {
            return size - 16;
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.theCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i3) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        KeyParameter keyParameter;
        byte[] bArr;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            bArr = aEADParameters.getAssociatedText();
            iv = aEADParameters.getNonce();
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29126));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
            bArr = null;
        }
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException(StubApp.getString2(29125));
        }
        if (keyParameter == null || !(keyParameter.getKey().length == 16 || keyParameter.getKey().length == 32)) {
            throw new IllegalArgumentException(StubApp.getString2(29124));
        }
        this.forEncryption = z2;
        this.theInitialAEAD = bArr;
        this.theNonce = iv;
        deriveKeys(keyParameter);
        resetStreams();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b2) {
        checkAEADStatus(1);
        this.theAEADHasher.updateHash(b2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i3, int i10) {
        checkAEADStatus(i10);
        checkBuffer(bArr, i3, i10, false);
        this.theAEADHasher.updateHash(bArr, i3, i10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b2, byte[] bArr, int i3) throws DataLengthException {
        checkStatus(1);
        if (!this.forEncryption) {
            this.theEncData.write(b2);
            return 0;
        }
        this.thePlain.write(b2);
        this.theDataHasher.updateHash(b2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        checkStatus(i10);
        checkBuffer(bArr, i3, i10, false);
        if (this.forEncryption) {
            this.thePlain.write(bArr, i3, i10);
            this.theDataHasher.updateHash(bArr, i3, i10);
        } else {
            this.theEncData.write(bArr, i3, i10);
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        resetStreams();
    }

    public GCMSIVBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new Tables4kGCMMultiplier());
    }

    private static void xorBlock(byte[] bArr, byte[] bArr2, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i3]);
        }
    }

    public GCMSIVBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        this.theGHash = new byte[16];
        this.theReverse = new byte[16];
        this.macBlock = new byte[16];
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29116));
        }
        this.theCipher = blockCipher;
        this.theMultiplier = gCMMultiplier;
        AnonymousClass1 anonymousClass1 = null;
        this.theAEADHasher = new GCMSIVHasher(this, anonymousClass1);
        this.theDataHasher = new GCMSIVHasher(this, anonymousClass1);
    }
}

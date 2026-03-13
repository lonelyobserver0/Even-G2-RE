package org.bouncycastle.pqc.crypto.picnic;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.logging.Logger;
import kotlin.UByte;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.picnic.Signature;
import org.bouncycastle.pqc.crypto.picnic.Signature2;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PicnicEngine {
    private static final Logger LOG = Logger.getLogger(PicnicEngine.class.getName());
    protected static final int LOWMC_MAX_AND_GATES = 1144;
    protected static final int LOWMC_MAX_KEY_BITS = 256;
    private static final int LOWMC_MAX_STATE_SIZE = 64;
    protected static final int LOWMC_MAX_WORDS = 16;
    private static final int MAX_AUX_BYTES = 176;
    private static final int MAX_DIGEST_SIZE = 64;
    private static final int PICNIC_MAX_LOWMC_BLOCK_SIZE = 32;
    private static final int PICNIC_MAX_PRIVATEKEY_SIZE = 98;
    private static final int PICNIC_MAX_PUBLICKEY_SIZE = 65;
    private static final int PICNIC_MAX_SIGNATURE_SIZE = 209522;
    private static final int TRANSFORM_FS = 0;
    private static final int TRANSFORM_INVALID = 255;
    private static final int TRANSFORM_UR = 1;
    private static final int WORD_SIZE_BITS = 32;
    protected static final int saltSizeBytes = 32;
    private final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    protected final int UnruhGWithInputBytes;
    protected final int UnruhGWithoutInputBytes;
    protected final int andSizeBytes;
    protected final Xof digest;
    protected final int digestSizeBytes;
    protected final int numMPCParties;
    protected final int numMPCRounds;
    protected final int numOpenedRounds;
    protected final int numRounds;
    protected final int numSboxes;
    private final int parameters;
    protected final int pqSecurityLevel;
    protected final int seedSizeBytes;
    private int signatureLength;
    protected final int stateSizeBits;
    protected final int stateSizeBytes;
    protected final int stateSizeWords;
    private final int transform;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PicnicEngine(int r17) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.<init>(int):void");
    }

    private void Commit(byte[] bArr, int i3, View view, byte[] bArr2) {
        this.digest.update((byte) 4);
        this.digest.update(bArr, i3, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update((byte) 0);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.outputShare), 0, this.stateSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
    }

    private void G(int i3, byte[] bArr, int i10, View view, byte[] bArr2) {
        int i11 = this.seedSizeBytes + this.andSizeBytes;
        this.digest.update((byte) 5);
        this.digest.update(bArr, i10, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        if (i3 == 2) {
            this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
            i11 += this.stateSizeBytes;
        }
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(i11), 0, 2);
        this.digest.doFinal(bArr2, 0, i11);
    }

    private void HCP(byte[] bArr, int[] iArr, int[] iArr2, byte[][] bArr2, byte[] bArr3, byte[] bArr4, int[] iArr3, int[] iArr4, byte[] bArr5) {
        for (int i3 = 0; i3 < this.numMPCRounds; i3++) {
            this.digest.update(bArr2[i3], 0, this.digestSizeBytes);
        }
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr4, 0, 32);
        this.digest.update(Pack.intToLittleEndian(iArr3), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr4), 0, this.stateSizeBytes);
        this.digest.update(bArr5, 0, bArr5.length);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
        if (iArr == null || iArr2 == null) {
            return;
        }
        expandChallengeHash(bArr, iArr, iArr2);
    }

    private void LowMCEnc(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        if (iArr != iArr2) {
            System.arraycopy(iArr, 0, iArr2, 0, this.stateSizeWords);
        }
        KMatricesWithPointer KMatrix = LowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr4, iArr3, KMatrix.getData(), KMatrix.getMatrixPointer());
        xor_array(iArr2, iArr2, iArr4, 0, this.stateSizeWords);
        for (int i3 = 1; i3 <= this.numRounds; i3++) {
            KMatricesWithPointer KMatrix2 = LowmcConstants.KMatrix(this, i3);
            matrix_mul(iArr4, iArr3, KMatrix2.getData(), KMatrix2.getMatrixPointer());
            substitution(iArr2);
            int i10 = i3 - 1;
            KMatricesWithPointer LMatrix = LowmcConstants.LMatrix(this, i10);
            matrix_mul(iArr2, iArr2, LMatrix.getData(), LMatrix.getMatrixPointer());
            KMatricesWithPointer RConstant = LowmcConstants.RConstant(this, i10);
            xor_array(iArr2, iArr2, RConstant.getData(), RConstant.getMatrixPointer(), this.stateSizeWords);
            xor_array(iArr2, iArr2, iArr4, 0, this.stateSizeWords);
        }
    }

    public static int appendUnique(int[] iArr, int i3, int i10) {
        if (i10 == 0) {
            iArr[i10] = i3;
        } else {
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == i3) {
                    return i10;
                }
            }
            iArr[i10] = i3;
        }
        return i10 + 1;
    }

    private boolean arePaddingBitsZero(byte[] bArr, int i3) {
        int numBytes = Utils.numBytes(i3);
        while (i3 < numBytes * 8) {
            if (Utils.getBit(bArr, i3) != 0) {
                return false;
            }
            i3++;
        }
        return true;
    }

    private void aux_mpc_AND(int i3, int i10, int i11, Tape tape) {
        int i12 = this.numMPCParties - 1;
        Utils.setBit(tape.tapes[i12], tape.pos - 1, (byte) ((((i3 & i10) ^ (Utils.parity16(tape.tapesToWord()) ^ Utils.getBit(tape.tapes[i12], tape.pos - 1))) ^ i11) & 255));
    }

    public static int bitsToChunks(int i3, byte[] bArr, int i10, int[] iArr) {
        int i11 = i10 * 8;
        if (i3 > i11) {
            return 0;
        }
        int i12 = i11 / i3;
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = 0;
            for (int i14 = 0; i14 < i3; i14++) {
                iArr[i13] = iArr[i13] + (Utils.getBit(bArr, (i13 * i3) + i14) << i14);
            }
        }
        return i12;
    }

    private void commit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3, int i10) {
        this.digest.update(bArr2, 0, this.seedSizeBytes);
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, this.andSizeBytes);
        }
        this.digest.update(bArr4, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i3), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i10), 0, 2);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_h(byte[] bArr, byte[][] bArr2) {
        for (int i3 = 0; i3 < this.numMPCParties; i3++) {
            this.digest.update(bArr2[i3], 0, this.digestSizeBytes);
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_v(byte[] bArr, byte[] bArr2, Msg msg) {
        this.digest.update(bArr2, 0, this.stateSizeBytes);
        for (int i3 = 0; i3 < this.numMPCParties; i3++) {
            this.digest.update(msg.msgs[i3], 0, Utils.numBytes(msg.pos));
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private int computeInputShareSize(byte[] bArr, int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            int challenge = getChallenge(bArr, i11);
            if (challenge == 1 || challenge == 2) {
                i10 += i3;
            }
        }
        return i10;
    }

    private void computeSaltAndRootSeed(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        Pack.intToLittleEndian(iArr, bArr3, 0);
        Pack.intToLittleEndian(iArr2, bArr4, 0);
        Pack.intToLittleEndian(iArr3, bArr5, 0);
        byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, this.stateSizeBytes);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, 0, this.stateSizeBytes);
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr5, 0, this.stateSizeBytes);
        this.digest.update(copyOfRange, 0, this.stateSizeBytes);
        this.digest.update(bArr2, 0, bArr2.length);
        this.digest.update(copyOfRange2, 0, this.stateSizeBytes);
        this.digest.update(copyOfRange3, 0, this.stateSizeBytes);
        this.digest.update(Pack.shortToLittleEndian((short) (this.stateSizeBits & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)), 0, 2);
        this.digest.doFinal(bArr, 0, bArr.length);
    }

    private byte[] computeSeeds(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr) {
        byte[] bArr2 = new byte[(this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32];
        this.digest.update(Pack.intToLittleEndian(iArr), 0, this.stateSizeBytes);
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(Pack.intToLittleEndian(iArr2), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr3), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(this.stateSizeBits), 0, 2);
        this.digest.doFinal(bArr2, 0, (this.numMPCParties * this.numMPCRounds * this.seedSizeBytes) + 32);
        return bArr2;
    }

    private boolean contains(int[] iArr, int i3, int i10) {
        for (int i11 = 0; i11 < i3; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    private boolean createRandomTape(byte[] bArr, int i3, byte[] bArr2, int i10, int i11, byte[] bArr3, int i12) {
        if (i12 < this.digestSizeBytes) {
            return false;
        }
        this.digest.update((byte) 2);
        this.digest.update(bArr, i3, this.seedSizeBytes);
        this.digest.doFinal(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i10), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i11), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
        this.digest.doFinal(bArr3, 0, i12);
        return true;
    }

    private void createRandomTapes(Tape tape, byte[][] bArr, int i3, byte[] bArr2, int i10) {
        int i11 = this.andSizeBytes * 2;
        for (int i12 = 0; i12 < this.numMPCParties; i12++) {
            this.digest.update(bArr[i12 + i3], 0, this.seedSizeBytes);
            this.digest.update(bArr2, 0, 32);
            this.digest.update(Pack.intToLittleEndian(i10), 0, 2);
            this.digest.update(Pack.intToLittleEndian(i12), 0, 2);
            this.digest.doFinal(tape.tapes[i12], 0, i11);
        }
    }

    private int deserializeSignature(Signature signature, byte[] bArr, int i3, int i10) {
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        if (i3 < Utils.numBytes(this.numMPCRounds * 2)) {
            return -1;
        }
        int computeInputShareSize = computeInputShareSize(bArr, this.stateSizeBytes);
        int numBytes = Utils.numBytes(this.numMPCRounds * 2) + 32;
        int i11 = this.numMPCRounds;
        int i12 = (((this.seedSizeBytes * 2) + this.andSizeBytes + this.digestSizeBytes) * i11) + numBytes + computeInputShareSize;
        if (this.transform == 1) {
            i12 += this.UnruhGWithoutInputBytes * i11;
        }
        if (i3 < i12) {
            return -1;
        }
        System.arraycopy(bArr, i10, bArr2, 0, Utils.numBytes(i11 * 2));
        int numBytes2 = i10 + Utils.numBytes(this.numMPCRounds * 2);
        if (!isChallengeValid(bArr2)) {
            return -1;
        }
        System.arraycopy(bArr, numBytes2, signature.salt, 0, 32);
        int i13 = numBytes2 + 32;
        for (int i14 = 0; i14 < this.numMPCRounds; i14++) {
            int challenge = getChallenge(bArr2, i14);
            System.arraycopy(bArr, i13, proofArr[i14].view3Commitment, 0, this.digestSizeBytes);
            int i15 = i13 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i16 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(bArr, i15, proofArr[i14].view3UnruhG, 0, i16);
                i15 += i16;
            }
            System.arraycopy(bArr, i15, proofArr[i14].communicatedBits, 0, this.andSizeBytes);
            int i17 = i15 + this.andSizeBytes;
            System.arraycopy(bArr, i17, proofArr[i14].seed1, 0, this.seedSizeBytes);
            int i18 = this.seedSizeBytes;
            int i19 = i17 + i18;
            System.arraycopy(bArr, i19, proofArr[i14].seed2, 0, i18);
            i13 = i19 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.littleEndianToInt(bArr, i13, proofArr[i14].inputShare, 0, this.stateSizeBytes / 4);
                if (this.stateSizeBits == 129) {
                    proofArr[i14].inputShare[this.stateSizeWords - 1] = bArr[(this.stateSizeBytes + i13) - 1] & UByte.MAX_VALUE;
                }
                i13 += this.stateSizeBytes;
                if (!arePaddingBitsZero(Pack.intToLittleEndian(proofArr[i14].inputShare), this.stateSizeBits)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private int deserializeSignature2(Signature2 signature2, byte[] bArr, int i3, int i10) {
        Logger logger;
        String string2;
        int i11 = this.digestSizeBytes;
        int i12 = i11 + 32;
        if (bArr.length < i12) {
            return -1;
        }
        System.arraycopy(bArr, i10, signature2.challengeHash, 0, i11);
        int i13 = i10 + this.digestSizeBytes;
        System.arraycopy(bArr, i13, signature2.salt, 0, 32);
        int i14 = i13 + 32;
        expandChallengeHash(signature2.challengeHash, signature2.challengeC, signature2.challengeP);
        int revealSeedsSize = new Tree(this, this.numMPCRounds, this.seedSizeBytes).revealSeedsSize(signature2.challengeC, this.numOpenedRounds);
        signature2.iSeedInfoLen = revealSeedsSize;
        int i15 = i12 + revealSeedsSize;
        int openMerkleTreeSize = new Tree(this, this.numMPCRounds, this.digestSizeBytes).openMerkleTreeSize(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds);
        signature2.cvInfoLen = openMerkleTreeSize;
        int i16 = i15 + openMerkleTreeSize;
        int revealSeedsSize2 = new Tree(this, this.numMPCParties, this.seedSizeBytes).revealSeedsSize(new int[1], 1);
        for (int i17 = 0; i17 < this.numMPCRounds; i17++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i17)) {
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i17)] != this.numMPCParties - 1) {
                    i16 += this.andSizeBytes;
                }
                i16 = i16 + revealSeedsSize2 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (i3 == i16) {
            int i18 = signature2.iSeedInfoLen;
            byte[] bArr2 = new byte[i18];
            signature2.iSeedInfo = bArr2;
            System.arraycopy(bArr, i14, bArr2, 0, i18);
            int i19 = i14 + signature2.iSeedInfoLen;
            int i20 = signature2.cvInfoLen;
            byte[] bArr3 = new byte[i20];
            signature2.cvInfo = bArr3;
            System.arraycopy(bArr, i19, bArr3, 0, i20);
            int i21 = i19 + signature2.cvInfoLen;
            for (int i22 = 0; i22 < this.numMPCRounds; i22++) {
                if (contains(signature2.challengeC, this.numOpenedRounds, i22)) {
                    signature2.proofs[i22] = new Signature2.Proof2(this);
                    Signature2.Proof2 proof2 = signature2.proofs[i22];
                    proof2.seedInfoLen = revealSeedsSize2;
                    byte[] bArr4 = new byte[revealSeedsSize2];
                    proof2.seedInfo = bArr4;
                    System.arraycopy(bArr, i21, bArr4, 0, revealSeedsSize2);
                    int i23 = i21 + signature2.proofs[i22].seedInfoLen;
                    if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i22)] != this.numMPCParties - 1) {
                        System.arraycopy(bArr, i23, signature2.proofs[i22].aux, 0, this.andSizeBytes);
                        i23 += this.andSizeBytes;
                        if (!arePaddingBitsZero(signature2.proofs[i22].aux, this.numRounds * 3 * this.numSboxes)) {
                            logger = LOG;
                            string2 = StubApp.getString2(34095);
                        }
                    }
                    System.arraycopy(bArr, i23, signature2.proofs[i22].input, 0, this.stateSizeBytes);
                    int i24 = i23 + this.stateSizeBytes;
                    int i25 = this.andSizeBytes;
                    System.arraycopy(bArr, i24, signature2.proofs[i22].msgs, 0, i25);
                    int i26 = i24 + i25;
                    if (arePaddingBitsZero(signature2.proofs[i22].msgs, this.numRounds * 3 * this.numSboxes)) {
                        System.arraycopy(bArr, i26, signature2.proofs[i22].f19460C, 0, this.digestSizeBytes);
                        i21 = i26 + this.digestSizeBytes;
                    } else {
                        logger = LOG;
                        string2 = StubApp.getString2(34096);
                    }
                }
            }
            return 0;
        }
        logger = LOG;
        string2 = StubApp.getString2(34093) + bArr.length + StubApp.getString2(34094) + i16;
        logger.fine(string2);
        return -1;
    }

    private void expandChallengeHash(byte[] bArr, int[] iArr, int[] iArr2) {
        int ceil_log2 = Utils.ceil_log2(this.numMPCRounds);
        int ceil_log22 = Utils.ceil_log2(this.numMPCParties);
        int[] iArr3 = new int[(this.digestSizeBytes * 8) / Math.min(ceil_log2, ceil_log22)];
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, this.digestSizeBytes);
        int i3 = 0;
        while (i3 < this.numOpenedRounds) {
            int bitsToChunks = bitsToChunks(ceil_log2, bArr2, this.digestSizeBytes, iArr3);
            for (int i10 = 0; i10 < bitsToChunks; i10++) {
                int i11 = iArr3[i10];
                if (i11 < this.numMPCRounds) {
                    i3 = appendUnique(iArr, i11, i3);
                }
                if (i3 == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
        int i12 = 0;
        while (i12 < this.numOpenedRounds) {
            int bitsToChunks2 = bitsToChunks(ceil_log22, bArr2, this.digestSizeBytes, iArr3);
            for (int i13 = 0; i13 < bitsToChunks2; i13++) {
                int i14 = iArr3[i13];
                if (i14 < this.numMPCParties) {
                    iArr2[i12] = i14;
                    i12++;
                }
                if (i12 == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
    }

    public static int extend(int i3) {
        return ~(i3 - 1);
    }

    private void getAuxBits(byte[] bArr, Tape tape) {
        int i3 = this.numMPCParties - 1;
        int i10 = this.stateSizeBits;
        int i11 = 0;
        for (int i12 = 0; i12 < this.numRounds; i12++) {
            int i13 = 0;
            while (i13 < i10) {
                Utils.setBit(bArr, i11, Utils.getBit(tape.tapes[i3], (i10 * 2 * i12) + i10 + i13));
                i13++;
                i11++;
            }
        }
    }

    private int[] getMissingLeavesList(int[] iArr) {
        int[] iArr2 = new int[this.numMPCRounds - this.numOpenedRounds];
        int i3 = 0;
        for (int i10 = 0; i10 < this.numMPCRounds; i10++) {
            if (!contains(iArr, this.numOpenedRounds, i10)) {
                iArr2[i3] = i10;
                i3++;
            }
        }
        return iArr2;
    }

    public static int indexOf(int[] iArr, int i3, int i10) {
        for (int i11 = 0; i11 < i3; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    private boolean isChallengeValid(byte[] bArr) {
        for (int i3 = 0; i3 < this.numMPCRounds; i3++) {
            if (getChallenge(bArr, i3) > 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean is_picnic3(int i3) {
        return i3 == 7 || i3 == 8 || i3 == 9;
    }

    private int mpc_AND(int i3, int i10, int i11, int i12, Tape tape, Msg msg) {
        int extend = ((i11 & extend(i10)) ^ (i12 & extend(i3))) ^ tape.tapesToWord();
        byte[] intToLittleEndian = Pack.intToLittleEndian(extend);
        int i13 = msg.unopened;
        if (i13 >= 0) {
            Utils.setBit(intToLittleEndian, msg.unopened, (byte) (Utils.getBit(msg.msgs[i13], msg.pos) & UByte.MAX_VALUE));
            extend = Pack.littleEndianToInt(intToLittleEndian, 0);
        }
        wordToMsgs(extend, msg);
        return (i3 & i10) ^ Utils.parity16(extend);
    }

    private void mpc_LowMC(Tape tape, View[] viewArr, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i3 = this.stateSizeWords;
        mpc_xor_constant(iArr2, i3 * 3, iArr, 0, i3);
        KMatricesWithPointer KMatrix = LowmcConstants.KMatrix(this, 0);
        for (int i10 = 0; i10 < 3; i10++) {
            matrix_mul_offset(iArr2, i10 * this.stateSizeWords, viewArr[i10].inputShare, 0, KMatrix.getData(), KMatrix.getMatrixPointer());
        }
        int[] iArr3 = iArr2;
        mpc_xor(iArr3, iArr3, this.stateSizeWords, 3);
        for (int i11 = 1; i11 <= this.numRounds; i11++) {
            KMatricesWithPointer KMatrix2 = LowmcConstants.KMatrix(this, i11);
            for (int i12 = 0; i12 < 3; i12++) {
                matrix_mul_offset(iArr3, this.stateSizeWords * i12, viewArr[i12].inputShare, 0, KMatrix2.getData(), KMatrix2.getMatrixPointer());
            }
            mpc_substitution(iArr3, tape, viewArr);
            int i13 = i11 - 1;
            KMatricesWithPointer LMatrix = LowmcConstants.LMatrix(this, i13);
            int i14 = this.stateSizeWords;
            mpc_matrix_mul(iArr3, i14 * 3, iArr2, i14 * 3, LMatrix.getData(), LMatrix.getMatrixPointer(), 3);
            KMatricesWithPointer RConstant = LowmcConstants.RConstant(this, i13);
            iArr3 = iArr2;
            mpc_xor_constant(iArr3, this.stateSizeWords * 3, RConstant.getData(), RConstant.getMatrixPointer(), this.stateSizeWords);
            mpc_xor(iArr3, iArr3, this.stateSizeWords, 3);
        }
        for (int i15 = 0; i15 < 3; i15++) {
            int i16 = this.stateSizeWords;
            System.arraycopy(iArr3, (i15 + 3) * i16, viewArr[i15].outputShare, 0, i16);
        }
    }

    private void mpc_matrix_mul(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.stateSizeWords;
            matrix_mul_offset(iArr, (i13 * i14) + i3, iArr2, (i14 * i13) + i10, iArr3, i11);
        }
    }

    private void mpc_sbox(int[] iArr, int[] iArr2, Tape tape, Msg msg) {
        for (int i3 = 0; i3 < this.numSboxes * 3; i3 += 3) {
            int i10 = i3 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i10);
            int i11 = iArr2[i10];
            int i12 = i3 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i12);
            int i13 = iArr2[i12];
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i3);
            int i14 = iArr2[i3];
            int mpc_AND = mpc_AND(bitFromWordArray, bitFromWordArray2, i11, i13, tape, msg);
            int mpc_AND2 = mpc_AND(bitFromWordArray2, bitFromWordArray3, i13, i14, tape, msg);
            int mpc_AND3 = mpc_AND(bitFromWordArray3, bitFromWordArray, i14, i11, tape, msg);
            int i15 = bitFromWordArray ^ mpc_AND2;
            int i16 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i10, i15);
            Utils.setBitInWordArray(iArr, i12, mpc_AND3 ^ i16);
            Utils.setBitInWordArray(iArr, i3, (i16 ^ bitFromWordArray3) ^ mpc_AND);
        }
    }

    private void mpc_substitution(int[] iArr, Tape tape, View[] viewArr) {
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int[] iArr4 = new int[3];
        int[] iArr5 = new int[3];
        int[] iArr6 = new int[3];
        int[] iArr7 = new int[3];
        int i3 = 0;
        while (i3 < this.numSboxes * 3) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = ((i10 + 3) * this.stateSizeWords * 32) + i3;
                iArr2[i10] = Utils.getBitFromWordArray(iArr, i11 + 2);
                iArr3[i10] = Utils.getBitFromWordArray(iArr, i11 + 1);
                iArr4[i10] = Utils.getBitFromWordArray(iArr, i11);
            }
            mpc_AND(iArr2, iArr3, iArr5, tape, viewArr);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND(iArr10, iArr8, iArr11, tape, viewArr);
            int[] iArr13 = iArr7;
            mpc_AND(iArr8, iArr9, iArr13, tape, viewArr);
            iArr2 = iArr9;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = ((i12 + 3) * this.stateSizeWords * 32) + i3;
                Utils.setBitInWordArray(iArr, i13 + 2, iArr2[i12] ^ iArr11[i12]);
                Utils.setBitInWordArray(iArr, i13 + 1, (iArr2[i12] ^ iArr10[i12]) ^ iArr13[i12]);
                Utils.setBitInWordArray(iArr, i13, ((iArr2[i12] ^ iArr10[i12]) ^ iArr8[i12]) ^ iArr12[i12]);
            }
            i3 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    private void mpc_xor(int[] iArr, int[] iArr2, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = i10 + i11;
                int i14 = this.stateSizeWords;
                iArr[(i13 * i14) + i12] = iArr[(i13 * i14) + i12] ^ iArr2[(i14 * i11) + i12];
            }
        }
    }

    private void mpc_xor_constant(int[] iArr, int i3, int[] iArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 + i3;
            iArr[i13] = iArr[i13] ^ iArr2[i12 + i10];
        }
    }

    private void mpc_xor_constant_verify(int[] iArr, int[] iArr2, int i3, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = this.stateSizeWords * 2;
        } else if (i11 != 2) {
            return;
        } else {
            i12 = this.stateSizeWords * 3;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i13 + i12;
            iArr[i14] = iArr[i14] ^ iArr2[i13 + i3];
        }
    }

    private void picnic_keygen(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int length = bArr3.length / 4;
        int[] iArr = new int[length];
        int length2 = bArr.length / 4;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[bArr2.length / 4];
        int i3 = this.stateSizeBytes;
        byte[] bArr4 = new byte[i3];
        secureRandom.nextBytes(bArr4);
        zeroTrailingBits(bArr4, this.stateSizeBits);
        System.arraycopy(bArr4, 0, bArr3, 0, i3);
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = Pack.littleEndianToInt(bArr3, i10 * 4);
        }
        secureRandom.nextBytes(bArr4);
        zeroTrailingBits(bArr4, this.stateSizeBits);
        System.arraycopy(bArr4, 0, bArr, 0, i3);
        for (int i11 = 0; i11 < length2; i11++) {
            iArr2[i11] = Pack.littleEndianToInt(bArr, i11 * 4);
        }
        LowMCEnc(iArr2, iArr3, iArr);
        Pack.intToLittleEndian(iArr, bArr3, 0);
        Pack.intToLittleEndian(iArr2, bArr, 0);
        Pack.intToLittleEndian(iArr3, bArr2, 0);
    }

    private int picnic_read_public_key(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        System.arraycopy(bArr3, 1, bArr, 0, this.stateSizeBytes);
        int i3 = this.stateSizeBytes;
        System.arraycopy(bArr3, i3 + 1, bArr2, 0, i3);
        return 0;
    }

    private boolean picnic_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PicnicEngine picnicEngine;
        int serializeSignature2;
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr, 1, bArr4, 0, this.stateSizeBytes);
        byte[] bArr5 = new byte[32];
        int i3 = this.stateSizeBytes;
        System.arraycopy(bArr, i3 + 1, bArr5, 0, i3);
        byte[] bArr6 = new byte[32];
        int i10 = this.stateSizeBytes;
        System.arraycopy(bArr, (i10 * 2) + 1, bArr6, 0, i10);
        int i11 = this.stateSizeWords;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        Pack.littleEndianToInt(bArr4, 0, iArr);
        Pack.littleEndianToInt(bArr6, 0, iArr3);
        Pack.littleEndianToInt(bArr5, 0, iArr2);
        boolean is_picnic3 = is_picnic3(this.parameters);
        String string2 = StubApp.getString2(34097);
        String string22 = StubApp.getString2(34098);
        if (is_picnic3) {
            picnicEngine = this;
            Signature2 signature2 = new Signature2(this);
            if (!picnicEngine.sign_picnic3(iArr, iArr2, iArr3, bArr2, signature2)) {
                LOG.fine(string22);
                return false;
            }
            serializeSignature2 = serializeSignature2(signature2, bArr3, bArr2.length + 4);
            if (serializeSignature2 == -1) {
                LOG.fine(string2);
                return false;
            }
        } else {
            Signature signature = new Signature(this);
            picnicEngine = this;
            if (picnicEngine.sign_picnic1(iArr, iArr2, iArr3, bArr2, signature) != 0) {
                LOG.fine(string22);
                return false;
            }
            serializeSignature2 = serializeSignature(signature, bArr3, bArr2.length + 4);
            if (serializeSignature2 == -1) {
                LOG.fine(string2);
                return false;
            }
        }
        picnicEngine.signatureLength = serializeSignature2;
        Pack.intToLittleEndian(serializeSignature2, bArr3, 0);
        return true;
    }

    private int picnic_verify(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        picnic_read_public_key(bArr5, bArr4, bArr);
        int i10 = this.stateSizeWords;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        Pack.littleEndianToInt(bArr4, 0, iArr2);
        Pack.littleEndianToInt(bArr5, 0, iArr);
        if (is_picnic3(this.parameters)) {
            Signature2 signature2 = new Signature2(this);
            deserializeSignature2(signature2, bArr3, i3, bArr2.length + 4);
            return verify_picnic3(signature2, iArr, iArr2, bArr2);
        }
        Signature signature = new Signature(this);
        if (deserializeSignature(signature, bArr3, i3, bArr2.length + 4) == 0) {
            return verify(signature, iArr, iArr2, bArr2);
        }
        LOG.fine(StubApp.getString2(34099));
        return -1;
    }

    private int picnic_write_private_key(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i3 = this.stateSizeBytes;
        int i10 = (i3 * 3) + 1;
        if (bArr4.length < i10) {
            LOG.fine(StubApp.getString2(34100));
            return -1;
        }
        bArr4[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr4, 1, i3);
        int i11 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr4, i11 + 1, i11);
        int i12 = this.stateSizeBytes;
        System.arraycopy(bArr3, 0, bArr4, (i12 * 2) + 1, i12);
        return i10;
    }

    private int picnic_write_public_key(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i3 = this.stateSizeBytes;
        int i10 = (i3 * 2) + 1;
        if (bArr3.length < i10) {
            LOG.fine(StubApp.getString2(34101));
            return -1;
        }
        bArr3[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr3, 1, i3);
        int i11 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr3, i11 + 1, i11);
        return i10;
    }

    private int serializeSignature2(Signature2 signature2, byte[] bArr, int i3) {
        int i10 = this.digestSizeBytes + 32 + signature2.iSeedInfoLen + signature2.cvInfoLen;
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i11)) {
                int i12 = signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i11)];
                int i13 = i10 + signature2.proofs[i11].seedInfoLen;
                if (i12 != this.numMPCParties - 1) {
                    i13 += this.andSizeBytes;
                }
                i10 = i13 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (bArr.length < i10) {
            return -1;
        }
        System.arraycopy(signature2.challengeHash, 0, bArr, i3, this.digestSizeBytes);
        int i14 = this.digestSizeBytes + i3;
        System.arraycopy(signature2.salt, 0, bArr, i14, 32);
        int i15 = i14 + 32;
        System.arraycopy(signature2.iSeedInfo, 0, bArr, i15, signature2.iSeedInfoLen);
        int i16 = i15 + signature2.iSeedInfoLen;
        System.arraycopy(signature2.cvInfo, 0, bArr, i16, signature2.cvInfoLen);
        int i17 = i16 + signature2.cvInfoLen;
        for (int i18 = 0; i18 < this.numMPCRounds; i18++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i18)) {
                Signature2.Proof2 proof2 = signature2.proofs[i18];
                System.arraycopy(proof2.seedInfo, 0, bArr, i17, proof2.seedInfoLen);
                int i19 = i17 + signature2.proofs[i18].seedInfoLen;
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i18)] != this.numMPCParties - 1) {
                    System.arraycopy(signature2.proofs[i18].aux, 0, bArr, i19, this.andSizeBytes);
                    i19 += this.andSizeBytes;
                }
                System.arraycopy(signature2.proofs[i18].input, 0, bArr, i19, this.stateSizeBytes);
                int i20 = i19 + this.stateSizeBytes;
                System.arraycopy(signature2.proofs[i18].msgs, 0, bArr, i20, this.andSizeBytes);
                int i21 = i20 + this.andSizeBytes;
                System.arraycopy(signature2.proofs[i18].f19460C, 0, bArr, i21, this.digestSizeBytes);
                i17 = i21 + this.digestSizeBytes;
            }
        }
        return i17 - i3;
    }

    private void setChallenge(byte[] bArr, int i3, int i10) {
        int i11 = i3 * 2;
        Utils.setBit(bArr, i11, (byte) (i10 & 1));
        Utils.setBit(bArr, i11 + 1, (byte) ((i10 >>> 1) & 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f7, code lost:
    
        r18 = r3;
        r12 = r6;
        r19 = r8;
        r20 = r10;
        r8 = r1;
        r1 = r2;
        r10 = r7;
        r3 = r16 * r4;
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011e, code lost:
    
        if (r0.createRandomTape(r1, (r0.seedSizeBytes * 2) + r3, r30.salt, r4, 2, r8.tapes[r19], r0.andSizeBytes) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0126, code lost:
    
        r1 = r13[r7];
        r0.xor_three(r1[r19].inputShare, r26, r1[0].inputShare, r1[r20].inputShare, r0.stateSizeBytes);
        r8.pos = 0;
        r1 = org.bouncycastle.util.Pack.littleEndianToInt(r12, 0, r18 / 4);
        r0.mpc_LowMC(r8, r13[r7], r28, r1);
        org.bouncycastle.util.Pack.intToLittleEndian(r1, r12, 0);
        r1 = new int[16];
        r2 = r13[r7];
        r0.xor_three(r1, r2[0].outputShare, r2[r20].outputShare, r2[r19].outputShare, r0.stateSizeBytes);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0174, code lost:
    
        if (subarrayEquals(r1, r27, r0.stateSizeWords) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0199, code lost:
    
        r0.Commit(r1, r3, r13[r7][0], r14[r7][0]);
        r0.Commit(r1, r3 + r0.seedSizeBytes, r13[r7][r20], r14[r7][r20]);
        r0.Commit(r1, (r0.seedSizeBytes * 2) + r3, r13[r7][r19], r14[r7][r19]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c9, code lost:
    
        if (r0.transform != r20) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01cb, code lost:
    
        r0.G(0, r1, r3, r13[r7][0], r15[r7][0]);
        r0.G(1, r1, r3 + r0.seedSizeBytes, r13[r7][r20], r15[r7][r20]);
        r0.G(2, r1, (r0.seedSizeBytes * 2) + r3, r13[r7][r19], r15[r7][r19]);
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0205, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0176, code lost:
    
        org.bouncycastle.pqc.crypto.picnic.PicnicEngine.LOG.fine(com.stub.StubApp.getString2(34103) + r7 + com.stub.StubApp.getString2(74));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0198, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        org.bouncycastle.pqc.crypto.picnic.PicnicEngine.LOG.fine(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int sign_picnic1(int[] r26, int[] r27, int[] r28, byte[] r29, org.bouncycastle.pqc.crypto.picnic.Signature r30) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.sign_picnic1(int[], int[], int[], byte[], org.bouncycastle.pqc.crypto.picnic.Signature):int");
    }

    private boolean sign_picnic3(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature2 signature2) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        PicnicEngine picnicEngine = this;
        int i14 = picnicEngine.seedSizeBytes + 32;
        byte[] bArr2 = new byte[i14];
        picnicEngine.computeSaltAndRootSeed(bArr2, iArr, iArr2, iArr3, bArr);
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 32, i14);
        signature2.salt = Arrays.copyOfRange(bArr2, 0, 32);
        Tree tree = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.seedSizeBytes);
        tree.generateSeeds(copyOfRange, signature2.salt, 0);
        byte[][] leaves = tree.getLeaves();
        int leavesOffset = tree.getLeavesOffset();
        int i15 = picnicEngine.numMPCRounds;
        Tape[] tapeArr = new Tape[i15];
        Tree[] treeArr = new Tree[i15];
        int i16 = 0;
        while (true) {
            i3 = picnicEngine.numMPCRounds;
            if (i16 >= i3) {
                break;
            }
            tapeArr[i16] = new Tape(picnicEngine);
            Tree tree2 = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
            treeArr[i16] = tree2;
            tree2.generateSeeds(leaves[i16 + leavesOffset], signature2.salt, i16);
            picnicEngine.createRandomTapes(tapeArr[i16], treeArr[i16].getLeaves(), treeArr[i16].getLeavesOffset(), signature2.salt, i16);
            i16++;
        }
        int[] iArr4 = {i3, picnicEngine.stateSizeWords * 4};
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[] bArr4 = new byte[MAX_AUX_BYTES];
        int i17 = 0;
        while (true) {
            i10 = picnicEngine.numMPCRounds;
            if (i17 >= i10) {
                break;
            }
            tapeArr[i17].computeAuxTape(bArr3[i17]);
            i17++;
        }
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, i10, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes);
        int i18 = 0;
        while (true) {
            i11 = picnicEngine.numMPCRounds;
            if (i18 >= i11) {
                break;
            }
            int i19 = 0;
            while (true) {
                i13 = picnicEngine.numMPCParties;
                if (i19 < i13 - 1) {
                    picnicEngine.commit(bArr5[i18][i19], treeArr[i18].getLeaf(i19), null, signature2.salt, i18, i19);
                    i19++;
                }
            }
            int i20 = i13 - 1;
            picnicEngine.getAuxBits(bArr4, tapeArr[i18]);
            picnicEngine.commit(bArr5[i18][i20], treeArr[i18].getLeaf(i20), bArr4, signature2.salt, i18, i20);
            i18++;
        }
        Msg[] msgArr = new Msg[i11];
        int[] iArr5 = new int[picnicEngine.stateSizeBits];
        int i21 = 0;
        while (true) {
            int i22 = picnicEngine.numMPCRounds;
            if (i21 >= i22) {
                byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) cls, i22, picnicEngine.digestSizeBytes);
                byte[][] bArr7 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
                for (int i23 = 0; i23 < picnicEngine.numMPCRounds; i23++) {
                    picnicEngine.commit_h(bArr6[i23], bArr5[i23]);
                    picnicEngine.commit_v(bArr7[i23], bArr3[i23], msgArr[i23]);
                }
                Tree tree3 = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
                tree3.buildMerkleTree(bArr7, signature2.salt);
                int i24 = picnicEngine.numOpenedRounds;
                int[] iArr6 = new int[i24];
                signature2.challengeC = iArr6;
                int[] iArr7 = new int[i24];
                signature2.challengeP = iArr7;
                byte[] bArr8 = new byte[picnicEngine.digestSizeBytes];
                signature2.challengeHash = bArr8;
                int i25 = 0;
                picnicEngine.HCP(bArr8, iArr6, iArr7, bArr6, tree3.nodes[0], signature2.salt, iArr2, iArr3, bArr);
                int[] iArr8 = new int[1];
                signature2.cvInfo = tree3.openMerkleTree(picnicEngine.getMissingLeavesList(signature2.challengeC), picnicEngine.numMPCRounds - picnicEngine.numOpenedRounds, iArr8);
                signature2.cvInfoLen = iArr8[0];
                int i26 = picnicEngine.numMPCRounds;
                int i27 = picnicEngine.seedSizeBytes;
                byte[] bArr9 = new byte[i26 * i27];
                signature2.iSeedInfo = bArr9;
                signature2.iSeedInfoLen = tree.revealSeeds(signature2.challengeC, picnicEngine.numOpenedRounds, bArr9, i26 * i27);
                signature2.proofs = new Signature2.Proof2[picnicEngine.numMPCRounds];
                int i28 = 0;
                while (i28 < picnicEngine.numMPCRounds) {
                    if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i28)) {
                        signature2.proofs[i28] = new Signature2.Proof2(picnicEngine);
                        int indexOf = indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i28);
                        int[] iArr9 = {signature2.challengeP[indexOf]};
                        Signature2.Proof2 proof2 = signature2.proofs[i28];
                        int i29 = picnicEngine.numMPCParties;
                        int i30 = picnicEngine.seedSizeBytes;
                        byte[] bArr10 = new byte[i29 * i30];
                        proof2.seedInfo = bArr10;
                        proof2.seedInfoLen = treeArr[i28].revealSeeds(iArr9, 1, bArr10, i29 * i30);
                        if (signature2.challengeP[indexOf] != picnicEngine.numMPCParties - 1) {
                            picnicEngine.getAuxBits(signature2.proofs[i28].aux, tapeArr[i28]);
                        }
                        i12 = i25;
                        System.arraycopy(bArr3[i28], i12, signature2.proofs[i28].input, i12, picnicEngine.stateSizeBytes);
                        System.arraycopy(msgArr[i28].msgs[signature2.challengeP[indexOf]], i12, signature2.proofs[i28].msgs, i12, picnicEngine.andSizeBytes);
                        System.arraycopy(bArr5[i28][signature2.challengeP[indexOf]], i12, signature2.proofs[i28].f19460C, i12, picnicEngine.digestSizeBytes);
                    } else {
                        i12 = i25;
                    }
                    i28++;
                    i25 = i12;
                }
                return true;
            }
            msgArr[i21] = new Msg(picnicEngine);
            int[] littleEndianToInt = Pack.littleEndianToInt(bArr3[i21], 0, picnicEngine.stateSizeWords);
            int i31 = i21;
            picnicEngine.xor_array(littleEndianToInt, littleEndianToInt, iArr, 0, picnicEngine.stateSizeWords);
            Tape tape = tapeArr[i31];
            Msg msg = msgArr[i31];
            picnicEngine = this;
            int[] iArr10 = iArr5;
            if (picnicEngine.simulateOnline(littleEndianToInt, tape, iArr10, msg, iArr3, iArr2) != 0) {
                LOG.fine(StubApp.getString2(34104));
                return false;
            }
            Pack.intToLittleEndian(littleEndianToInt, bArr3[i31], 0);
            i21 = i31 + 1;
            iArr5 = iArr10;
        }
    }

    private int simulateOnline(int[] iArr, Tape tape, int[] iArr2, Msg msg, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        KMatricesWithPointer KMatrix = LowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr5, iArr, KMatrix.getData(), KMatrix.getMatrixPointer());
        xor_array(iArr6, iArr5, iArr3, 0, this.stateSizeWords);
        for (int i3 = 1; i3 <= this.numRounds; i3++) {
            tapesToWords(iArr2, tape);
            mpc_sbox(iArr6, iArr2, tape, msg);
            int i10 = i3 - 1;
            KMatricesWithPointer LMatrix = LowmcConstants.LMatrix(this, i10);
            matrix_mul(iArr6, iArr6, LMatrix.getData(), LMatrix.getMatrixPointer());
            KMatricesWithPointer RConstant = LowmcConstants.RConstant(this, i10);
            xor_array(iArr6, iArr6, RConstant.getData(), RConstant.getMatrixPointer(), this.stateSizeWords);
            KMatricesWithPointer KMatrix2 = LowmcConstants.KMatrix(this, i3);
            matrix_mul(iArr5, iArr, KMatrix2.getData(), KMatrix2.getMatrixPointer());
            xor_array(iArr6, iArr5, iArr6, 0, this.stateSizeWords);
        }
        return !subarrayEquals(iArr6, iArr4, this.stateSizeWords) ? -1 : 0;
    }

    private static boolean subarrayEquals(byte[] bArr, byte[] bArr2, int i3) {
        if (bArr.length < i3 || bArr2.length < i3) {
            return false;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private void substitution(int[] iArr) {
        for (int i3 = 0; i3 < this.numSboxes * 3; i3 += 3) {
            int i10 = i3 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i10);
            int i11 = i3 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i11);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i3);
            Utils.setBitInWordArray(iArr, i10, (bitFromWordArray2 & bitFromWordArray3) ^ bitFromWordArray);
            int i12 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i11, (bitFromWordArray & bitFromWordArray3) ^ i12);
            Utils.setBitInWordArray(iArr, i3, (i12 ^ bitFromWordArray3) ^ (bitFromWordArray & bitFromWordArray2));
        }
    }

    private void tapesToWords(int[] iArr, Tape tape) {
        for (int i3 = 0; i3 < this.stateSizeBits; i3++) {
            iArr[i3] = tape.tapesToWord();
        }
    }

    private int verify(Signature signature, int[] iArr, int[] iArr2, byte[] bArr) {
        int i3;
        int i10;
        int i11;
        PicnicEngine picnicEngine = this;
        char c10 = 3;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        int[][][] iArr4 = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, picnicEngine.numMPCRounds, 3, picnicEngine.stateSizeBytes);
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr4 = signature.challengeBits;
        int i12 = picnicEngine.stateSizeBytes;
        byte[] bArr5 = new byte[Math.max(i12 * 6, i12 + picnicEngine.andSizeBytes)];
        Tape tape = new Tape(picnicEngine);
        int i13 = picnicEngine.numMPCRounds;
        View[] viewArr = new View[i13];
        View[] viewArr2 = new View[i13];
        int i14 = 0;
        while (true) {
            i3 = picnicEngine.numMPCRounds;
            if (i14 >= i3) {
                break;
            }
            viewArr[i14] = new View(picnicEngine);
            View[] viewArr3 = viewArr2;
            View view = new View(picnicEngine);
            viewArr3[i14] = view;
            Signature.Proof[] proofArr2 = proofArr;
            View[] viewArr4 = viewArr;
            char c11 = c10;
            byte[] bArr6 = bArr4;
            picnicEngine.verifyProof(proofArr2[i14], viewArr[i14], view, picnicEngine.getChallenge(bArr4, i14), signature.salt, i14, bArr5, iArr2, tape);
            int challenge = picnicEngine.getChallenge(bArr6, i14);
            picnicEngine.Commit(proofArr2[i14].seed1, 0, viewArr4[i14], bArr2[i14][challenge]);
            int i15 = (challenge + 1) % 3;
            picnicEngine.Commit(proofArr2[i14].seed2, 0, viewArr3[i14], bArr2[i14][i15]);
            int i16 = (challenge + 2) % 3;
            System.arraycopy(proofArr2[i14].view3Commitment, 0, bArr2[i14][i16], 0, picnicEngine.digestSizeBytes);
            if (picnicEngine.transform == 1) {
                picnicEngine.G(challenge, proofArr2[i14].seed1, 0, viewArr4[i14], bArr3[i14][challenge]);
                i10 = challenge;
                picnicEngine = this;
                i11 = i15;
                picnicEngine.G(i11, proofArr2[i14].seed2, 0, viewArr3[i14], bArr3[i14][i15]);
                System.arraycopy(proofArr2[i14].view3UnruhG, 0, bArr3[i14][i16], 0, i10 == 0 ? picnicEngine.UnruhGWithInputBytes : picnicEngine.UnruhGWithoutInputBytes);
            } else {
                i10 = challenge;
                i11 = i15;
            }
            iArr4[i14][i10] = viewArr4[i14].outputShare;
            iArr4[i14][i11] = viewArr3[i14].outputShare;
            int[] iArr5 = new int[picnicEngine.stateSizeWords];
            picnicEngine.xor_three(iArr5, viewArr4[i14].outputShare, viewArr3[i14].outputShare, iArr, picnicEngine.stateSizeBytes);
            iArr4[i14][i16] = iArr5;
            i14++;
            picnicEngine = this;
            bArr4 = bArr6;
            proofArr = proofArr2;
            c10 = c11;
            viewArr = viewArr4;
            viewArr2 = viewArr3;
        }
        byte[] bArr7 = new byte[Utils.numBytes(i3 * 2)];
        H3(iArr, iArr2, iArr4, bArr2, bArr7, signature.salt, bArr, bArr3);
        if (subarrayEquals(bArr4, bArr7, Utils.numBytes(this.numMPCRounds * 2))) {
            return 0;
        }
        LOG.fine(StubApp.getString2(34105));
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
    
        r2 = r2.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int verify_picnic3(org.bouncycastle.pqc.crypto.picnic.Signature2 r33, int[] r34, int[] r35, byte[] r36) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.verify_picnic3(org.bouncycastle.pqc.crypto.picnic.Signature2, int[], int[], byte[]):int");
    }

    private void wordToMsgs(int i3, Msg msg) {
        for (int i10 = 0; i10 < this.numMPCParties; i10++) {
            Utils.setBit(msg.msgs[i10], msg.pos, (byte) (Utils.getBit(Pack.intToLittleEndian(i3), i10) & UByte.MAX_VALUE));
        }
        msg.pos++;
    }

    private void xor_three(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i3) {
        int i10 = this.stateSizeWords;
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = (iArr2[i11] ^ iArr3[i11]) ^ iArr4[i11];
        }
    }

    private void zeroTrailingBits(byte[] bArr, int i3) {
        int numBytes = Utils.numBytes(i3);
        while (i3 < numBytes * 8) {
            Utils.setBit(bArr, i3, (byte) 0);
            i3++;
        }
    }

    public void H3(int[] iArr, int[] iArr2, int[][][] iArr3, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        byte[] bArr6 = new byte[this.digestSizeBytes];
        bArr2[Utils.numBytes(this.numMPCRounds * 2) - 1] = 0;
        this.digest.update((byte) 1);
        for (int i3 = 0; i3 < this.numMPCRounds; i3++) {
            for (int i10 = 0; i10 < 3; i10++) {
                this.digest.update(Pack.intToLittleEndian(iArr3[i3][i10]), 0, this.stateSizeBytes);
            }
        }
        for (int i11 = 0; i11 < this.numMPCRounds; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                this.digest.update(bArr[i11][i12], 0, this.digestSizeBytes);
            }
        }
        if (this.transform == 1) {
            for (int i13 = 0; i13 < this.numMPCRounds; i13++) {
                int i14 = 0;
                while (i14 < 3) {
                    this.digest.update(bArr5[i13][i14], 0, i14 == 2 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
                    i14++;
                }
            }
        }
        this.digest.update(Pack.intToLittleEndian(iArr), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr2), 0, this.stateSizeBytes);
        this.digest.update(bArr3, 0, 32);
        this.digest.update(bArr4, 0, bArr4.length);
        this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        boolean z2 = true;
        int i15 = 0;
        while (z2) {
            for (int i16 = 0; i16 < this.digestSizeBytes; i16++) {
                byte b2 = bArr6[i16];
                int i17 = 0;
                while (true) {
                    if (i17 >= 8) {
                        break;
                    }
                    int i18 = (b2 >>> (6 - i17)) & 3;
                    if (i18 < 3) {
                        setChallenge(bArr2, i15, i18);
                        i15++;
                        if (i15 == this.numMPCRounds) {
                            z2 = false;
                            break;
                        }
                    }
                    i17 += 2;
                }
                if (!z2) {
                    break;
                }
            }
            if (!z2) {
                return;
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr6, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        }
    }

    public void aux_mpc_sbox(int[] iArr, int[] iArr2, Tape tape) {
        for (int i3 = 0; i3 < this.numSboxes * 3; i3 += 3) {
            int i10 = i3 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i10);
            int i11 = i3 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i11);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i3);
            int bitFromWordArray4 = Utils.getBitFromWordArray(iArr2, i10);
            int bitFromWordArray5 = Utils.getBitFromWordArray(iArr2, i11);
            aux_mpc_AND(bitFromWordArray, bitFromWordArray2, ((Utils.getBitFromWordArray(iArr2, i3) ^ bitFromWordArray) ^ bitFromWordArray2) ^ bitFromWordArray3, tape);
            aux_mpc_AND(bitFromWordArray2, bitFromWordArray3, bitFromWordArray4 ^ bitFromWordArray, tape);
            aux_mpc_AND(bitFromWordArray3, bitFromWordArray, (bitFromWordArray5 ^ bitFromWordArray) ^ bitFromWordArray2, tape);
        }
    }

    public void crypto_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_sign(bArr3, bArr2, bArr)) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
    }

    public void crypto_sign_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        picnic_keygen(bArr3, bArr4, bArr5, secureRandom);
        picnic_write_public_key(bArr4, bArr3, bArr);
        picnic_write_private_key(bArr5, bArr4, bArr3, bArr2);
    }

    public boolean crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_verify(bArr3, Arrays.copyOfRange(bArr2, 4, bArr.length + 4), bArr2, Pack.littleEndianToInt(bArr2, 0)) == -1) {
            return false;
        }
        System.arraycopy(bArr2, 4, bArr, 0, bArr.length);
        return true;
    }

    public int getChallenge(byte[] bArr, int i3) {
        int i10 = i3 * 2;
        return Utils.getBit(bArr, i10) | (Utils.getBit(bArr, i10 + 1) << 1);
    }

    public int getPublicKeySize() {
        return this.CRYPTO_PUBLICKEYBYTES;
    }

    public int getSecretKeySize() {
        return this.CRYPTO_SECRETKEYBYTES;
    }

    public int getSignatureSize(int i3) {
        return this.CRYPTO_BYTES + i3;
    }

    public int getTrueSignatureSize() {
        return this.signatureLength;
    }

    public void matrix_mul(int[] iArr, int[] iArr2, int[] iArr3, int i3) {
        matrix_mul_offset(iArr, 0, iArr2, 0, iArr3, i3);
    }

    public void matrix_mul_offset(int[] iArr, int i3, int[] iArr2, int i10, int[] iArr3, int i11) {
        int[] iArr4 = new int[16];
        iArr4[this.stateSizeWords - 1] = 0;
        int i12 = this.stateSizeBits / 32;
        for (int i13 = 0; i13 < this.stateSizeBits; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                i14 ^= iArr3[((this.stateSizeWords * i13) + i15) + i11] & iArr2[i15 + i10];
            }
            for (int i16 = i12 * 32; i16 < this.stateSizeBits; i16++) {
                i14 ^= Utils.getBitFromWordArray(iArr3, (i11 * 32) + (((this.stateSizeWords * i13) * 32) + i16)) & Utils.getBitFromWordArray(iArr2, (i10 * 32) + i16);
            }
            Utils.setBit(iArr4, i13, Utils.parity32(i14));
        }
        System.arraycopy(iArr4, 0, iArr, i3, this.stateSizeWords);
    }

    public void mpc_AND_verify(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View view, View view2) {
        int[] iArr4 = {Utils.getBit(tape.tapes[0], tape.pos), Utils.getBit(tape.tapes[1], tape.pos)};
        int i3 = iArr[0];
        int i10 = iArr2[1] & i3;
        int i11 = iArr[1];
        int i12 = iArr2[0];
        int i13 = ((((i11 & i12) ^ i10) ^ (i12 & i3)) ^ iArr4[0]) ^ iArr4[1];
        iArr3[0] = i13;
        Utils.setBit(view.communicatedBits, tape.pos, (byte) (i13 & 255));
        iArr3[1] = Utils.getBit(view2.communicatedBits, tape.pos);
        tape.pos++;
    }

    public void mpc_LowMC_verify(View view, View view2, Tape tape, int[] iArr, int[] iArr2, int i3) {
        int[] iArr3 = iArr;
        Arrays.fill(iArr3, 0, iArr3.length, 0);
        mpc_xor_constant_verify(iArr3, iArr2, 0, this.stateSizeWords, i3);
        KMatricesWithPointer KMatrix = LowmcConstants.KMatrix(this, 0);
        matrix_mul_offset(iArr3, 0, view.inputShare, 0, KMatrix.getData(), KMatrix.getMatrixPointer());
        matrix_mul_offset(iArr3, this.stateSizeWords, view2.inputShare, 0, KMatrix.getData(), KMatrix.getMatrixPointer());
        mpc_xor(iArr3, iArr3, this.stateSizeWords, 2);
        for (int i10 = 1; i10 <= this.numRounds; i10++) {
            KMatricesWithPointer KMatrix2 = LowmcConstants.KMatrix(this, i10);
            matrix_mul_offset(iArr3, 0, view.inputShare, 0, KMatrix2.getData(), KMatrix2.getMatrixPointer());
            matrix_mul_offset(iArr, this.stateSizeWords, view2.inputShare, 0, KMatrix2.getData(), KMatrix2.getMatrixPointer());
            mpc_substitution_verify(iArr, tape, view, view2);
            int i11 = i10 - 1;
            KMatricesWithPointer LMatrix = LowmcConstants.LMatrix(this, i11);
            int i12 = this.stateSizeWords;
            mpc_matrix_mul(iArr, i12 * 2, iArr, i12 * 2, LMatrix.getData(), LMatrix.getMatrixPointer(), 2);
            KMatricesWithPointer RConstant = LowmcConstants.RConstant(this, i11);
            iArr3 = iArr;
            mpc_xor_constant_verify(iArr3, RConstant.getData(), RConstant.getMatrixPointer(), this.stateSizeWords, i3);
            mpc_xor(iArr3, iArr3, this.stateSizeWords, 2);
        }
        int i13 = this.stateSizeWords;
        System.arraycopy(iArr3, i13 * 2, view.outputShare, 0, i13);
        int i14 = this.stateSizeWords;
        System.arraycopy(iArr3, i14 * 3, view2.outputShare, 0, i14);
    }

    public void mpc_substitution_verify(int[] iArr, Tape tape, View view, View view2) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[2];
        int[] iArr7 = new int[2];
        int i3 = 0;
        while (i3 < this.numSboxes * 3) {
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = ((i10 + 2) * this.stateSizeWords * 32) + i3;
                iArr2[i10] = Utils.getBitFromWordArray(iArr, i11 + 2);
                iArr3[i10] = Utils.getBitFromWordArray(iArr, i11 + 1);
                iArr4[i10] = Utils.getBitFromWordArray(iArr, i11);
            }
            mpc_AND_verify(iArr2, iArr3, iArr5, tape, view, view2);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND_verify(iArr10, iArr8, iArr11, tape, view, view2);
            int[] iArr13 = iArr7;
            mpc_AND_verify(iArr8, iArr9, iArr13, tape, view, view2);
            iArr2 = iArr9;
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = ((i12 + 2) * this.stateSizeWords * 32) + i3;
                Utils.setBitInWordArray(iArr, i13 + 2, iArr2[i12] ^ iArr11[i12]);
                Utils.setBitInWordArray(iArr, i13 + 1, (iArr2[i12] ^ iArr10[i12]) ^ iArr13[i12]);
                Utils.setBitInWordArray(iArr, i13, ((iArr2[i12] ^ iArr10[i12]) ^ iArr8[i12]) ^ iArr12[i12]);
            }
            i3 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    public void prove(Signature.Proof proof, int i3, byte[] bArr, int i10, View[] viewArr, byte[][] bArr2, byte[][] bArr3) {
        if (i3 == 0) {
            System.arraycopy(bArr, i10, proof.seed1, 0, this.seedSizeBytes);
            int i11 = this.seedSizeBytes;
            System.arraycopy(bArr, i10 + i11, proof.seed2, 0, i11);
        } else if (i3 == 1) {
            int i12 = this.seedSizeBytes;
            System.arraycopy(bArr, i10 + i12, proof.seed1, 0, i12);
            int i13 = this.seedSizeBytes;
            System.arraycopy(bArr, (i13 * 2) + i10, proof.seed2, 0, i13);
        } else if (i3 == 2) {
            int i14 = this.seedSizeBytes;
            System.arraycopy(bArr, (i14 * 2) + i10, proof.seed1, 0, i14);
            System.arraycopy(bArr, i10, proof.seed2, 0, this.seedSizeBytes);
        } else {
            LOG.fine(StubApp.getString2(34110));
        }
        if (i3 == 1 || i3 == 2) {
            System.arraycopy(viewArr[2].inputShare, 0, proof.inputShare, 0, this.stateSizeBytes);
        }
        System.arraycopy(viewArr[(i3 + 1) % 3].communicatedBits, 0, proof.communicatedBits, 0, this.andSizeBytes);
        int i15 = (i3 + 2) % 3;
        System.arraycopy(bArr2[i15], 0, proof.view3Commitment, 0, this.digestSizeBytes);
        if (this.transform == 1) {
            System.arraycopy(bArr3[i15], 0, proof.view3UnruhG, 0, i3 == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
        }
    }

    public int serializeSignature(Signature signature, byte[] bArr, int i3) {
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int numBytes = Utils.numBytes(this.numMPCRounds * 2) + 32;
        int i10 = this.numMPCRounds;
        int i11 = (((this.seedSizeBytes * 2) + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes) * i10) + numBytes;
        if (this.transform == 1) {
            i11 += this.UnruhGWithoutInputBytes * i10;
        }
        if (this.CRYPTO_BYTES < i11) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i3, Utils.numBytes(i10 * 2));
        int numBytes2 = Utils.numBytes(this.numMPCRounds * 2) + i3;
        System.arraycopy(signature.salt, 0, bArr, numBytes2, 32);
        int i12 = numBytes2 + 32;
        for (int i13 = 0; i13 < this.numMPCRounds; i13++) {
            int challenge = getChallenge(bArr2, i13);
            System.arraycopy(proofArr[i13].view3Commitment, 0, bArr, i12, this.digestSizeBytes);
            int i14 = i12 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i15 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(proofArr[i13].view3UnruhG, 0, bArr, i14, i15);
                i14 += i15;
            }
            System.arraycopy(proofArr[i13].communicatedBits, 0, bArr, i14, this.andSizeBytes);
            int i16 = i14 + this.andSizeBytes;
            System.arraycopy(proofArr[i13].seed1, 0, bArr, i16, this.seedSizeBytes);
            int i17 = this.seedSizeBytes;
            int i18 = i16 + i17;
            System.arraycopy(proofArr[i13].seed2, 0, bArr, i18, i17);
            i12 = i18 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.intToLittleEndian(proofArr[i13].inputShare, 0, this.stateSizeWords, bArr, i12);
                i12 += this.stateSizeBytes;
            }
        }
        return i12 - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verifyProof(org.bouncycastle.pqc.crypto.picnic.Signature.Proof r17, org.bouncycastle.pqc.crypto.picnic.View r18, org.bouncycastle.pqc.crypto.picnic.View r19, int r20, byte[] r21, int r22, byte[] r23, int[] r24, org.bouncycastle.pqc.crypto.picnic.Tape r25) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.picnic.PicnicEngine.verifyProof(org.bouncycastle.pqc.crypto.picnic.Signature$Proof, org.bouncycastle.pqc.crypto.picnic.View, org.bouncycastle.pqc.crypto.picnic.View, int, byte[], int, byte[], int[], org.bouncycastle.pqc.crypto.picnic.Tape):boolean");
    }

    public void xor_array(int[] iArr, int[] iArr2, int[] iArr3, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = iArr2[i11] ^ iArr3[i11 + i3];
        }
    }

    private void mpc_AND(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View[] viewArr) {
        int i3 = 0;
        int[] iArr4 = {Utils.getBit(tape.tapes[0], tape.pos), Utils.getBit(tape.tapes[1], tape.pos), Utils.getBit(tape.tapes[2], tape.pos)};
        while (i3 < 3) {
            int i10 = iArr[i3];
            int i11 = i3 + 1;
            int i12 = i11 % 3;
            int i13 = iArr2[i12] & i10;
            int i14 = iArr[i12];
            int i15 = iArr2[i3];
            int i16 = (((i10 & i15) ^ (i13 ^ (i14 & i15))) ^ iArr4[i3]) ^ iArr4[i12];
            iArr3[i3] = i16;
            Utils.setBit(viewArr[i3].communicatedBits, tape.pos, (byte) (i16 & 255));
            i3 = i11;
        }
        tape.pos++;
    }

    private static boolean subarrayEquals(int[] iArr, int[] iArr2, int i3) {
        if (iArr.length < i3 || iArr2.length < i3) {
            return false;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}

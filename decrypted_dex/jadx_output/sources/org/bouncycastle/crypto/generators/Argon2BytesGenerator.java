package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Argon2BytesGenerator {
    private static final int ARGON2_ADDRESSES_IN_BLOCK = 128;
    private static final int ARGON2_BLOCK_SIZE = 1024;
    private static final int ARGON2_PREHASH_DIGEST_LENGTH = 64;
    private static final int ARGON2_PREHASH_SEED_LENGTH = 72;
    private static final int ARGON2_QWORDS_IN_BLOCK = 128;
    private static final int ARGON2_SYNC_POINTS = 4;
    private static final long M32L = 4294967295L;
    private static final int MAX_PARALLELISM = 16777216;
    private static final int MIN_ITERATIONS = 1;
    private static final int MIN_OUTLEN = 4;
    private static final int MIN_PARALLELISM = 1;
    private static final byte[] ZERO_BYTES = new byte[4];
    private int laneLength;
    private Block[] memory;
    private Argon2Parameters parameters;
    private int segmentLength;

    /* renamed from: org.bouncycastle.crypto.generators.Argon2BytesGenerator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Block {
        private static final int SIZE = 128;

        /* renamed from: v, reason: collision with root package name */
        private final long[] f18972v;

        private Block() {
            this.f18972v = new long[128];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void copyBlock(Block block) {
            System.arraycopy(block.f18972v, 0, this.f18972v, 0, 128);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xor(Block block, Block block2) {
            long[] jArr = this.f18972v;
            long[] jArr2 = block.f18972v;
            long[] jArr3 = block2.f18972v;
            for (int i3 = 0; i3 < 128; i3++) {
                jArr[i3] = jArr2[i3] ^ jArr3[i3];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block) {
            long[] jArr = this.f18972v;
            long[] jArr2 = block.f18972v;
            for (int i3 = 0; i3 < 128; i3++) {
                jArr[i3] = jArr[i3] ^ jArr2[i3];
            }
        }

        public Block clear() {
            Arrays.fill(this.f18972v, 0L);
            return this;
        }

        public void fromBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException(StubApp.getString2(28878));
            }
            Pack.littleEndianToLong(bArr, 0, this.f18972v);
        }

        public void toBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException(StubApp.getString2(28879));
            }
            Pack.longToLittleEndian(this.f18972v, bArr, 0);
        }

        public /* synthetic */ Block(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block, Block block2) {
            long[] jArr = this.f18972v;
            long[] jArr2 = block.f18972v;
            long[] jArr3 = block2.f18972v;
            for (int i3 = 0; i3 < 128; i3++) {
                jArr[i3] = jArr[i3] ^ (jArr2[i3] ^ jArr3[i3]);
            }
        }
    }

    public static class FillBlock {

        /* renamed from: R, reason: collision with root package name */
        Block f18973R;

        /* renamed from: Z, reason: collision with root package name */
        Block f18974Z;
        Block addressBlock;
        Block inputBlock;

        private FillBlock() {
            AnonymousClass1 anonymousClass1 = null;
            this.f18973R = new Block(anonymousClass1);
            this.f18974Z = new Block(anonymousClass1);
            this.addressBlock = new Block(anonymousClass1);
            this.inputBlock = new Block(anonymousClass1);
        }

        private void applyBlake() {
            for (int i3 = 0; i3 < 8; i3++) {
                int i10 = i3 * 16;
                Argon2BytesGenerator.roundFunction(this.f18974Z, i10, i10 + 1, i10 + 2, i10 + 3, i10 + 4, i10 + 5, i10 + 6, i10 + 7, i10 + 8, i10 + 9, i10 + 10, i10 + 11, i10 + 12, i10 + 13, i10 + 14, i10 + 15);
            }
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = i11 * 2;
                Argon2BytesGenerator.roundFunction(this.f18974Z, i12, i12 + 1, i12 + 16, i12 + 17, i12 + 32, i12 + 33, i12 + 48, i12 + 49, i12 + 64, i12 + 65, i12 + 80, i12 + 81, i12 + 96, i12 + 97, i12 + 112, i12 + 113);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2) {
            this.f18974Z.copyBlock(block);
            applyBlake();
            block2.xor(block, this.f18974Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlockWithXor(Block block, Block block2, Block block3) {
            this.f18973R.xor(block, block2);
            this.f18974Z.copyBlock(this.f18973R);
            applyBlake();
            block3.xorWith(this.f18973R, this.f18974Z);
        }

        public /* synthetic */ FillBlock(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2, Block block3) {
            this.f18973R.xor(block, block2);
            this.f18974Z.copyBlock(this.f18973R);
            applyBlake();
            block3.xor(this.f18973R, this.f18974Z);
        }
    }

    public static class Position {
        int lane;
        int pass;
        int slice;
    }

    private static void F(long[] jArr, int i3, int i10, int i11, int i12) {
        quarterRound(jArr, i3, i10, i12, 32);
        quarterRound(jArr, i11, i12, i10, 24);
        quarterRound(jArr, i3, i10, i12, 16);
        quarterRound(jArr, i11, i12, i10, 63);
    }

    private static void addByteString(byte[] bArr, Digest digest, byte[] bArr2) {
        if (bArr2 == null) {
            digest.update(ZERO_BYTES, 0, 4);
            return;
        }
        Pack.intToLittleEndian(bArr2.length, bArr, 0);
        digest.update(bArr, 0, 4);
        digest.update(bArr2, 0, bArr2.length);
    }

    private void digest(byte[] bArr, byte[] bArr2, int i3, int i10) {
        Block block = this.memory[this.laneLength - 1];
        for (int i11 = 1; i11 < this.parameters.getLanes(); i11++) {
            int i12 = this.laneLength;
            block.xorWith(this.memory[(i12 - 1) + (i11 * i12)]);
        }
        block.toBytes(bArr);
        hash(bArr, bArr2, i3, i10);
    }

    private void doInit(Argon2Parameters argon2Parameters) {
        int memory = argon2Parameters.getMemory();
        if (memory < argon2Parameters.getLanes() * 8) {
            memory = argon2Parameters.getLanes() * 8;
        }
        int lanes = memory / (argon2Parameters.getLanes() * 4);
        this.segmentLength = lanes;
        this.laneLength = lanes * 4;
        initMemory(argon2Parameters.getLanes() * 4 * lanes);
    }

    private void fillFirstBlocks(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[72];
        System.arraycopy(bArr2, 0, bArr3, 0, 64);
        bArr3[64] = 1;
        for (int i3 = 0; i3 < this.parameters.getLanes(); i3++) {
            Pack.intToLittleEndian(i3, bArr2, 68);
            Pack.intToLittleEndian(i3, bArr3, 68);
            hash(bArr2, bArr, 0, 1024);
            this.memory[this.laneLength * i3].fromBytes(bArr);
            hash(bArr3, bArr, 0, 1024);
            this.memory[(this.laneLength * i3) + 1].fromBytes(bArr);
        }
    }

    private void fillMemoryBlocks() {
        FillBlock fillBlock = new FillBlock(null);
        Position position = new Position();
        for (int i3 = 0; i3 < this.parameters.getIterations(); i3++) {
            position.pass = i3;
            for (int i10 = 0; i10 < 4; i10++) {
                position.slice = i10;
                for (int i11 = 0; i11 < this.parameters.getLanes(); i11++) {
                    position.lane = i11;
                    fillSegment(fillBlock, position);
                }
            }
        }
    }

    private void fillSegment(FillBlock fillBlock, Position position) {
        Block block;
        Block block2;
        FillBlock fillBlock2 = fillBlock;
        Position position2 = position;
        boolean isDataIndependentAddressing = isDataIndependentAddressing(position2);
        int startingIndex = getStartingIndex(position2);
        int c10 = AbstractC1482f.c(position2.slice, this.segmentLength, position2.lane * this.laneLength, startingIndex);
        int prevOffset = getPrevOffset(c10);
        if (isDataIndependentAddressing) {
            block = fillBlock2.addressBlock.clear();
            block2 = fillBlock2.inputBlock.clear();
            initAddressBlocks(fillBlock2, position2, block2, block);
        } else {
            block = null;
            block2 = null;
        }
        boolean isWithXor = isWithXor(position2);
        while (true) {
            int i3 = c10;
            if (startingIndex >= this.segmentLength) {
                return;
            }
            Block block3 = block;
            int i10 = prevOffset;
            Block block4 = block2;
            long pseudoRandom = getPseudoRandom(fillBlock2, startingIndex, block3, block4, i10, isDataIndependentAddressing);
            boolean z2 = isDataIndependentAddressing;
            FillBlock fillBlock3 = fillBlock2;
            int refLane = getRefLane(position2, pseudoRandom);
            int refColumn = getRefColumn(position2, startingIndex, pseudoRandom, refLane == position2.lane);
            Block[] blockArr = this.memory;
            Block block5 = blockArr[i10];
            Block block6 = blockArr[(this.laneLength * refLane) + refColumn];
            Block block7 = blockArr[i3];
            if (isWithXor) {
                fillBlock3.fillBlockWithXor(block5, block6, block7);
            } else {
                fillBlock3.fillBlock(block5, block6, block7);
            }
            c10 = i3 + 1;
            startingIndex++;
            position2 = position;
            fillBlock2 = fillBlock3;
            isDataIndependentAddressing = z2;
            prevOffset = i3;
            block = block3;
            block2 = block4;
        }
    }

    private int getPrevOffset(int i3) {
        return i3 % this.laneLength == 0 ? (i3 + r0) - 1 : i3 - 1;
    }

    private long getPseudoRandom(FillBlock fillBlock, int i3, Block block, Block block2, int i10, boolean z2) {
        if (!z2) {
            return this.memory[i10].f18972v[0];
        }
        int i11 = i3 % 128;
        if (i11 == 0) {
            nextAddresses(fillBlock, block2, block);
        }
        return block.f18972v[i11];
    }

    private int getRefColumn(Position position, int i3, long j, boolean z2) {
        int i10;
        int i11;
        int i12 = position.pass;
        int i13 = 0;
        int i14 = position.slice;
        if (i12 != 0) {
            int i15 = this.segmentLength;
            int i16 = this.laneLength;
            int i17 = ((i14 + 1) * i15) % i16;
            int i18 = i16 - i15;
            if (z2) {
                i10 = (i18 + i3) - 1;
            } else {
                i10 = i18 + (i3 != 0 ? 0 : -1);
            }
            i13 = i17;
            i11 = i10;
        } else if (z2) {
            i11 = ((i14 * this.segmentLength) + i3) - 1;
        } else {
            i11 = (i14 * this.segmentLength) + (i3 != 0 ? 0 : -1);
        }
        long j3 = j & 4294967295L;
        return ((int) (i13 + ((i11 - 1) - ((i11 * ((j3 * j3) >>> 32)) >>> 32)))) % this.laneLength;
    }

    private int getRefLane(Position position, long j) {
        return (position.pass == 0 && position.slice == 0) ? position.lane : (int) ((j >>> 32) % this.parameters.getLanes());
    }

    private static int getStartingIndex(Position position) {
        return (position.pass == 0 && position.slice == 0) ? 2 : 0;
    }

    private void hash(byte[] bArr, byte[] bArr2, int i3, int i10) {
        byte[] bArr3 = new byte[4];
        Pack.intToLittleEndian(i10, bArr3, 0);
        if (i10 <= 64) {
            Blake2bDigest blake2bDigest = new Blake2bDigest(i10 * 8);
            blake2bDigest.update(bArr3, 0, 4);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, i3);
            return;
        }
        Blake2bDigest blake2bDigest2 = new Blake2bDigest(512);
        byte[] bArr4 = new byte[64];
        blake2bDigest2.update(bArr3, 0, 4);
        blake2bDigest2.update(bArr, 0, bArr.length);
        blake2bDigest2.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, i3, 32);
        int i11 = i3 + 32;
        int i12 = 2;
        int i13 = ((i10 + 31) / 32) - 2;
        while (i12 <= i13) {
            blake2bDigest2.update(bArr4, 0, 64);
            blake2bDigest2.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i11, 32);
            i12++;
            i11 += 32;
        }
        Blake2bDigest blake2bDigest3 = new Blake2bDigest((i10 - (i13 * 32)) * 8);
        blake2bDigest3.update(bArr4, 0, 64);
        blake2bDigest3.doFinal(bArr2, i11);
    }

    private void initAddressBlocks(FillBlock fillBlock, Position position, Block block, Block block2) {
        block.f18972v[0] = intToLong(position.pass);
        block.f18972v[1] = intToLong(position.lane);
        block.f18972v[2] = intToLong(position.slice);
        block.f18972v[3] = intToLong(this.memory.length);
        block.f18972v[4] = intToLong(this.parameters.getIterations());
        block.f18972v[5] = intToLong(this.parameters.getType());
        if (position.pass == 0 && position.slice == 0) {
            nextAddresses(fillBlock, block, block2);
        }
    }

    private void initMemory(int i3) {
        this.memory = new Block[i3];
        int i10 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i10 >= blockArr.length) {
                return;
            }
            blockArr[i10] = new Block(null);
            i10++;
        }
    }

    private void initialize(byte[] bArr, byte[] bArr2, int i3) {
        Blake2bDigest blake2bDigest = new Blake2bDigest(512);
        Pack.intToLittleEndian(new int[]{this.parameters.getLanes(), i3, this.parameters.getMemory(), this.parameters.getIterations(), this.parameters.getVersion(), this.parameters.getType()}, bArr, 0);
        blake2bDigest.update(bArr, 0, 24);
        addByteString(bArr, blake2bDigest, bArr2);
        addByteString(bArr, blake2bDigest, this.parameters.getSalt());
        addByteString(bArr, blake2bDigest, this.parameters.getSecret());
        addByteString(bArr, blake2bDigest, this.parameters.getAdditional());
        byte[] bArr3 = new byte[72];
        blake2bDigest.doFinal(bArr3, 0);
        fillFirstBlocks(bArr, bArr3);
    }

    private long intToLong(int i3) {
        return i3 & 4294967295L;
    }

    private boolean isDataIndependentAddressing(Position position) {
        return this.parameters.getType() == 1 || (this.parameters.getType() == 2 && position.pass == 0 && position.slice < 2);
    }

    private boolean isWithXor(Position position) {
        return (position.pass == 0 || this.parameters.getVersion() == 16) ? false : true;
    }

    private void nextAddresses(FillBlock fillBlock, Block block, Block block2) {
        long[] jArr = block.f18972v;
        jArr[6] = jArr[6] + 1;
        fillBlock.fillBlock(block, block2);
        fillBlock.fillBlock(block2, block2);
    }

    private static void quarterRound(long[] jArr, int i3, int i10, int i11, int i12) {
        long j = jArr[i3];
        long j3 = jArr[i10];
        long j10 = jArr[i11];
        long i13 = u.i((j & 4294967295L) * 2, 4294967295L & j3, j3, j);
        long rotateRight = Longs.rotateRight(j10 ^ i13, i12);
        jArr[i3] = i13;
        jArr[i11] = rotateRight;
    }

    private void reset() {
        if (this.memory == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i3 >= blockArr.length) {
                return;
            }
            Block block = blockArr[i3];
            if (block != null) {
                block.clear();
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void roundFunction(Block block, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        long[] jArr = block.f18972v;
        F(jArr, i3, i13, i17, i21);
        F(jArr, i10, i14, i18, i22);
        F(jArr, i11, i15, i19, i23);
        F(jArr, i12, i16, i20, i24);
        F(jArr, i3, i14, i19, i24);
        F(jArr, i10, i15, i20, i21);
        F(jArr, i11, i16, i17, i22);
        F(jArr, i12, i13, i18, i23);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    public void init(Argon2Parameters argon2Parameters) {
        this.parameters = argon2Parameters;
        if (argon2Parameters.getLanes() < 1) {
            throw new IllegalStateException(StubApp.getString2(28885));
        }
        if (argon2Parameters.getLanes() > MAX_PARALLELISM) {
            throw new IllegalStateException(StubApp.getString2(28884));
        }
        if (argon2Parameters.getMemory() >= argon2Parameters.getLanes() * 2) {
            if (argon2Parameters.getIterations() < 1) {
                throw new IllegalStateException(StubApp.getString2(28881));
            }
            doInit(argon2Parameters);
        } else {
            throw new IllegalStateException(StubApp.getString2(28882) + (argon2Parameters.getLanes() * 2) + StubApp.getString2(28883) + (argon2Parameters.getLanes() * 2));
        }
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i3, int i10) {
        if (i10 < 4) {
            throw new IllegalStateException(StubApp.getString2(28880));
        }
        byte[] bArr3 = new byte[1024];
        initialize(bArr3, bArr, i10);
        fillMemoryBlocks();
        digest(bArr3, bArr2, i3, i10);
        reset();
        return i10;
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i3, int i10) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr, i3, i10);
    }
}

package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import i2.u;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SkeinEngine implements Memoable {
    private static final Hashtable INITIAL_STATES = new Hashtable();
    private static final int PARAM_TYPE_CONFIG = 4;
    private static final int PARAM_TYPE_KEY = 0;
    private static final int PARAM_TYPE_MESSAGE = 48;
    private static final int PARAM_TYPE_OUTPUT = 63;
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    long[] chain;
    private long[] initialState;
    private byte[] key;
    private final int outputSizeBytes;
    private Parameter[] postMessageParameters;
    private Parameter[] preMessageParameters;
    private final byte[] singleByte;
    final ThreefishEngine threefish;
    private final UBI ubi;

    public static class Configuration {
        private byte[] bytes;

        public Configuration(long j) {
            byte[] bArr = new byte[32];
            this.bytes = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            Pack.longToLittleEndian(j, bArr, 8);
        }

        public byte[] getBytes() {
            return this.bytes;
        }
    }

    public static class Parameter {
        private int type;
        private byte[] value;

        public Parameter(int i3, byte[] bArr) {
            this.type = i3;
            this.value = bArr;
        }

        public int getType() {
            return this.type;
        }

        public byte[] getValue() {
            return this.value;
        }
    }

    public class UBI {
        private byte[] currentBlock;
        private int currentOffset;
        private long[] message;
        private final UbiTweak tweak = new UbiTweak();

        public UBI(int i3) {
            byte[] bArr = new byte[i3];
            this.currentBlock = bArr;
            this.message = new long[bArr.length / 8];
        }

        private void processBlock(long[] jArr) {
            SkeinEngine skeinEngine = SkeinEngine.this;
            skeinEngine.threefish.init(true, skeinEngine.chain, this.tweak.getWords());
            Pack.littleEndianToLong(this.currentBlock, 0, this.message);
            SkeinEngine.this.threefish.processBlock(this.message, jArr);
            for (int i3 = 0; i3 < jArr.length; i3++) {
                jArr[i3] = jArr[i3] ^ this.message[i3];
            }
        }

        public void doFinal(long[] jArr) {
            int i3 = this.currentOffset;
            while (true) {
                byte[] bArr = this.currentBlock;
                if (i3 >= bArr.length) {
                    this.tweak.setFinal(true);
                    processBlock(jArr);
                    return;
                } else {
                    bArr[i3] = 0;
                    i3++;
                }
            }
        }

        public void reset(int i3) {
            this.tweak.reset();
            this.tweak.setType(i3);
            this.currentOffset = 0;
        }

        public void update(byte[] bArr, int i3, int i10, long[] jArr) {
            int i11 = 0;
            while (i10 > i11) {
                if (this.currentOffset == this.currentBlock.length) {
                    processBlock(jArr);
                    this.tweak.setFirst(false);
                    this.currentOffset = 0;
                }
                int min = Math.min(i10 - i11, this.currentBlock.length - this.currentOffset);
                System.arraycopy(bArr, i3 + i11, this.currentBlock, this.currentOffset, min);
                i11 += min;
                this.currentOffset += min;
                this.tweak.advancePosition(min);
            }
        }

        public void reset(UBI ubi) {
            this.currentBlock = Arrays.clone(ubi.currentBlock, this.currentBlock);
            this.currentOffset = ubi.currentOffset;
            this.message = Arrays.clone(ubi.message, this.message);
            this.tweak.reset(ubi.tweak);
        }
    }

    public static class UbiTweak {
        private static final long LOW_RANGE = 9223372034707292160L;
        private static final long T1_FINAL = Long.MIN_VALUE;
        private static final long T1_FIRST = 4611686018427387904L;
        private boolean extendedPosition;
        private long[] tweak = new long[2];

        public UbiTweak() {
            reset();
        }

        public void advancePosition(int i3) {
            if (!this.extendedPosition) {
                long[] jArr = this.tweak;
                long j = jArr[0] + i3;
                jArr[0] = j;
                if (j > LOW_RANGE) {
                    this.extendedPosition = true;
                    return;
                }
                return;
            }
            long[] jArr2 = new long[3];
            long[] jArr3 = this.tweak;
            jArr2[0] = jArr3[0] & BodyPartID.bodyIdMax;
            jArr2[1] = (jArr3[0] >>> 32) & BodyPartID.bodyIdMax;
            jArr2[2] = jArr3[1] & BodyPartID.bodyIdMax;
            long j3 = i3;
            for (int i10 = 0; i10 < 3; i10++) {
                long j10 = j3 + jArr2[i10];
                jArr2[i10] = j10;
                j3 = j10 >>> 32;
            }
            long[] jArr4 = this.tweak;
            jArr4[0] = ((jArr2[1] & BodyPartID.bodyIdMax) << 32) | (jArr2[0] & BodyPartID.bodyIdMax);
            jArr4[1] = (jArr2[2] & BodyPartID.bodyIdMax) | (jArr4[1] & (-4294967296L));
        }

        public int getType() {
            return (int) ((this.tweak[1] >>> 56) & 63);
        }

        public long[] getWords() {
            return this.tweak;
        }

        public boolean isFinal() {
            return (this.tweak[1] & Long.MIN_VALUE) != 0;
        }

        public boolean isFirst() {
            return (this.tweak[1] & T1_FIRST) != 0;
        }

        public void reset() {
            long[] jArr = this.tweak;
            jArr[0] = 0;
            jArr[1] = 0;
            this.extendedPosition = false;
            setFirst(true);
        }

        public void setFinal(boolean z2) {
            if (z2) {
                long[] jArr = this.tweak;
                jArr[1] = jArr[1] | Long.MIN_VALUE;
            } else {
                long[] jArr2 = this.tweak;
                jArr2[1] = jArr2[1] & LongCompanionObject.MAX_VALUE;
            }
        }

        public void setFirst(boolean z2) {
            if (z2) {
                long[] jArr = this.tweak;
                jArr[1] = jArr[1] | T1_FIRST;
            } else {
                long[] jArr2 = this.tweak;
                jArr2[1] = jArr2[1] & (-4611686018427387905L);
            }
        }

        public void setType(int i3) {
            long[] jArr = this.tweak;
            jArr[1] = (jArr[1] & (-274877906944L)) | ((i3 & 63) << 56);
        }

        public String toString() {
            return getType() + StubApp.getString2(28516) + isFirst() + StubApp.getString2(28517) + isFinal();
        }

        public void reset(UbiTweak ubiTweak) {
            this.tweak = Arrays.clone(ubiTweak.tweak, this.tweak);
            this.extendedPosition = ubiTweak.extendedPosition;
        }
    }

    static {
        initialState(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        initialState(256, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        initialState(256, BERTags.FLAGS, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        initialState(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        initialState(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        initialState(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        initialState(512, BERTags.FLAGS, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        initialState(512, KyberEngine.KyberPolyBytes, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        initialState(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public SkeinEngine(int i3, int i10) {
        this.singleByte = new byte[1];
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException(u.p(i10, StubApp.getString2(28518)));
        }
        this.outputSizeBytes = i10 / 8;
        ThreefishEngine threefishEngine = new ThreefishEngine(i3);
        this.threefish = threefishEngine;
        this.ubi = new UBI(threefishEngine.getBlockSize());
    }

    private void checkInitialised() {
        if (this.ubi == null) {
            throw new IllegalArgumentException(StubApp.getString2(28519));
        }
    }

    private static Parameter[] clone(Parameter[] parameterArr, Parameter[] parameterArr2) {
        if (parameterArr == null) {
            return null;
        }
        if (parameterArr2 == null || parameterArr2.length != parameterArr.length) {
            parameterArr2 = new Parameter[parameterArr.length];
        }
        System.arraycopy(parameterArr, 0, parameterArr2, 0, parameterArr2.length);
        return parameterArr2;
    }

    private void copyIn(SkeinEngine skeinEngine) {
        this.ubi.reset(skeinEngine.ubi);
        this.chain = Arrays.clone(skeinEngine.chain, this.chain);
        this.initialState = Arrays.clone(skeinEngine.initialState, this.initialState);
        this.key = Arrays.clone(skeinEngine.key, this.key);
        this.preMessageParameters = clone(skeinEngine.preMessageParameters, this.preMessageParameters);
        this.postMessageParameters = clone(skeinEngine.postMessageParameters, this.postMessageParameters);
    }

    private void createInitialState() {
        long[] jArr = (long[]) INITIAL_STATES.get(variantIdentifier(getBlockSize(), getOutputSize()));
        int i3 = 0;
        if (this.key != null || jArr == null) {
            this.chain = new long[getBlockSize() / 8];
            byte[] bArr = this.key;
            if (bArr != null) {
                ubiComplete(0, bArr);
            }
            ubiComplete(4, new Configuration(this.outputSizeBytes * 8).getBytes());
        } else {
            this.chain = Arrays.clone(jArr);
        }
        if (this.preMessageParameters != null) {
            while (true) {
                Parameter[] parameterArr = this.preMessageParameters;
                if (i3 >= parameterArr.length) {
                    break;
                }
                Parameter parameter = parameterArr[i3];
                ubiComplete(parameter.getType(), parameter.getValue());
                i3++;
            }
        }
        this.initialState = Arrays.clone(this.chain);
    }

    private void initParams(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.key = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new Parameter(num.intValue(), bArr));
            } else {
                vector2.addElement(new Parameter(num.intValue(), bArr));
            }
        }
        Parameter[] parameterArr = new Parameter[vector.size()];
        this.preMessageParameters = parameterArr;
        vector.copyInto(parameterArr);
        sort(this.preMessageParameters);
        Parameter[] parameterArr2 = new Parameter[vector2.size()];
        this.postMessageParameters = parameterArr2;
        vector2.copyInto(parameterArr2);
        sort(this.postMessageParameters);
    }

    private static void initialState(int i3, int i10, long[] jArr) {
        INITIAL_STATES.put(variantIdentifier(i3 / 8, i10 / 8), jArr);
    }

    private void output(long j, byte[] bArr, int i3, int i10) {
        byte[] bArr2 = new byte[8];
        Pack.longToLittleEndian(j, bArr2, 0);
        long[] jArr = new long[this.chain.length];
        ubiInit(63);
        this.ubi.update(bArr2, 0, 8, jArr);
        this.ubi.doFinal(jArr);
        int i11 = (i10 + 7) / 8;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 8;
            int min = Math.min(8, i10 - i13);
            if (min == 8) {
                Pack.longToLittleEndian(jArr[i12], bArr, i13 + i3);
            } else {
                Pack.longToLittleEndian(jArr[i12], bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i13 + i3, min);
            }
        }
    }

    private static void sort(Parameter[] parameterArr) {
        if (parameterArr == null) {
            return;
        }
        for (int i3 = 1; i3 < parameterArr.length; i3++) {
            Parameter parameter = parameterArr[i3];
            int i10 = i3;
            while (i10 > 0) {
                int i11 = i10 - 1;
                if (parameter.getType() < parameterArr[i11].getType()) {
                    parameterArr[i10] = parameterArr[i11];
                    i10 = i11;
                }
            }
            parameterArr[i10] = parameter;
        }
    }

    private void ubiComplete(int i3, byte[] bArr) {
        ubiInit(i3);
        this.ubi.update(bArr, 0, bArr.length, this.chain);
        ubiFinal();
    }

    private void ubiFinal() {
        this.ubi.doFinal(this.chain);
    }

    private void ubiInit(int i3) {
        this.ubi.reset(i3);
    }

    private static Integer variantIdentifier(int i3, int i10) {
        return Integers.valueOf(i3 | (i10 << 16));
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SkeinEngine(this);
    }

    public int doFinal(byte[] bArr, int i3) {
        checkInitialised();
        if (bArr.length < this.outputSizeBytes + i3) {
            throw new OutputLengthException(StubApp.getString2(28520));
        }
        ubiFinal();
        if (this.postMessageParameters != null) {
            int i10 = 0;
            while (true) {
                Parameter[] parameterArr = this.postMessageParameters;
                if (i10 >= parameterArr.length) {
                    break;
                }
                Parameter parameter = parameterArr[i10];
                ubiComplete(parameter.getType(), parameter.getValue());
                i10++;
            }
        }
        int blockSize = getBlockSize();
        int v2 = AbstractC1482f.v(this.outputSizeBytes, blockSize, 1, blockSize);
        for (int i11 = 0; i11 < v2; i11++) {
            int i12 = i11 * blockSize;
            output(i11, bArr, i3 + i12, Math.min(blockSize, this.outputSizeBytes - i12));
        }
        reset();
        return this.outputSizeBytes;
    }

    public int getBlockSize() {
        return this.threefish.getBlockSize();
    }

    public int getOutputSize() {
        return this.outputSizeBytes;
    }

    public void init(SkeinParameters skeinParameters) {
        this.chain = null;
        this.key = null;
        this.preMessageParameters = null;
        this.postMessageParameters = null;
        if (skeinParameters != null) {
            if (skeinParameters.getKey().length < 16) {
                throw new IllegalArgumentException(StubApp.getString2(28521));
            }
            initParams(skeinParameters.getParameters());
        }
        createInitialState();
        ubiInit(48);
    }

    public void reset() {
        long[] jArr = this.initialState;
        long[] jArr2 = this.chain;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        ubiInit(48);
    }

    public void update(byte b2) {
        byte[] bArr = this.singleByte;
        bArr[0] = b2;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SkeinEngine skeinEngine = (SkeinEngine) memoable;
        if (getBlockSize() != skeinEngine.getBlockSize() || this.outputSizeBytes != skeinEngine.outputSizeBytes) {
            throw new IllegalArgumentException(StubApp.getString2(28522));
        }
        copyIn(skeinEngine);
    }

    public void update(byte[] bArr, int i3, int i10) {
        checkInitialised();
        this.ubi.update(bArr, i3, i10, this.chain);
    }

    public SkeinEngine(SkeinEngine skeinEngine) {
        this(skeinEngine.getBlockSize() * 8, skeinEngine.getOutputSize() * 8);
        copyIn(skeinEngine);
    }
}

package kotlin.random;

import com.mapbox.common.b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p0.AbstractC1482f;

@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b'\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/random/Random;", "", "<init>", "()V", "nextBits", "", "bitCount", "nextInt", "until", "from", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class Random {

    /* renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0019\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010H\u0016J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "defaultRandom", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "nextBits", "", "bitCount", "nextInt", "until", "from", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "nextBytes", "", "array", "size", "fromIndex", "toIndex", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    public static final class Companion extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: kotlin.random.Random$Default$Serialized */
        public static final class Serialized implements Serializable {
            public static final Serialized INSTANCE = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.INSTANCE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void readObject(ObjectInputStream input) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int bitCount) {
            return Random.defaultRandom.nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.defaultRandom.nextLong();
        }

        private Companion() {
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int size) {
            return Random.defaultRandom.nextBytes(size);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double until) {
            return Random.defaultRandom.nextDouble(until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int until) {
            return Random.defaultRandom.nextInt(until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long until) {
            return Random.defaultRandom.nextLong(until);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.defaultRandom.nextBytes(array, fromIndex, toIndex);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double from, double until) {
            return Random.defaultRandom.nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int from, int until) {
            return Random.defaultRandom.nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long from, long until) {
            return Random.defaultRandom.nextLong(from, until);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i3, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return random.nextBytes(bArr, i3, i10);
    }

    public abstract int nextBits(int bitCount);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (fromIndex < 0 || fromIndex > array.length || toIndex < 0 || toIndex > array.length) {
            throw new IllegalArgumentException(b.j(AbstractC1482f.l(fromIndex, "fromIndex (", toIndex, ") or toIndex (", ") are out of range: 0.."), array.length, '.').toString());
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(AbstractC1482f.e(fromIndex, "fromIndex (", toIndex, ") must be not greater than toIndex (", ").").toString());
        }
        int i3 = (toIndex - fromIndex) / 4;
        for (int i10 = 0; i10 < i3; i10++) {
            int nextInt = nextInt();
            array[fromIndex] = (byte) nextInt;
            array[fromIndex + 1] = (byte) (nextInt >>> 8);
            array[fromIndex + 2] = (byte) (nextInt >>> 16);
            array[fromIndex + 3] = (byte) (nextInt >>> 24);
            fromIndex += 4;
        }
        int i11 = toIndex - fromIndex;
        int nextBits = nextBits(i11 * 8);
        for (int i12 = 0; i12 < i11; i12++) {
            array[fromIndex + i12] = (byte) (nextBits >>> (i12 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public double nextDouble(double until) {
        return nextDouble(0.0d, until);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public long nextLong(long until) {
        return nextLong(0L, until);
    }

    public double nextDouble(double from, double until) {
        double nextDouble;
        RandomKt.checkRangeBounds(from, until);
        double d8 = until - from;
        if (Double.isInfinite(d8) && Math.abs(from) <= Double.MAX_VALUE && Math.abs(until) <= Double.MAX_VALUE) {
            double d10 = 2;
            double nextDouble2 = ((until / d10) - (from / d10)) * nextDouble();
            nextDouble = from + nextDouble2 + nextDouble2;
        } else {
            nextDouble = from + (nextDouble() * d8);
        }
        return nextDouble >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : nextDouble;
    }

    public int nextInt(int from, int until) {
        int nextInt;
        int i3;
        int i10;
        RandomKt.checkRangeBounds(from, until);
        int i11 = until - from;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                i10 = nextBits(RandomKt.fastLog2(i11));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i3 = nextInt % i11;
                } while ((i11 - 1) + (nextInt - i3) < 0);
                i10 = i3;
            }
            return from + i10;
        }
        while (true) {
            int nextInt2 = nextInt();
            if (from <= nextInt2 && nextInt2 < until) {
                return nextInt2;
            }
        }
    }

    public long nextLong(long from, long until) {
        long nextLong;
        long j;
        long j3;
        int nextInt;
        RandomKt.checkRangeBounds(from, until);
        long j10 = until - from;
        if (j10 > 0) {
            if (((-j10) & j10) == j10) {
                int i3 = (int) j10;
                int i10 = (int) (j10 >>> 32);
                if (i3 != 0) {
                    nextInt = nextBits(RandomKt.fastLog2(i3));
                } else if (i10 == 1) {
                    nextInt = nextInt();
                } else {
                    j3 = (nextBits(RandomKt.fastLog2(i10)) << 32) + (nextInt() & BodyPartID.bodyIdMax);
                }
                j3 = nextInt & BodyPartID.bodyIdMax;
            } else {
                do {
                    nextLong = nextLong() >>> 1;
                    j = nextLong % j10;
                } while ((j10 - 1) + (nextLong - j) < 0);
                j3 = j;
            }
            return from + j3;
        }
        while (true) {
            long nextLong2 = nextLong();
            if (from <= nextLong2 && nextLong2 < until) {
                return nextLong2;
            }
        }
    }

    public byte[] nextBytes(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }
}

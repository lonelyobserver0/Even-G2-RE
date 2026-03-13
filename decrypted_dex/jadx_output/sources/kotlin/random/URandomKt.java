package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;
import org.bouncycastle.asn1.cmc.BodyPartID;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a/\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001cH\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"nextUInt", "Lkotlin/UInt;", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)I", "until", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "from", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "Lkotlin/ULong;", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "nextUBytes", "Lkotlin/UByteArray;", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "size", "", "(Lkotlin/random/Random;I)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "checkUIntRangeBounds", "", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class URandomKt {
    /* renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m1257checkUIntRangeBoundsJ1ME1BU(int i3, int i10) {
        if (Integer.compareUnsigned(i10, i3) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m129boximpl(i3), UInt.m129boximpl(i10)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m1258checkULongRangeBoundseb3DHEI(long j, long j3) {
        if (Long.compareUnsigned(j3, j) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m208boximpl(j), ULong.m208boximpl(j3)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte[] nextUBytes(Random random, int i3) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m111constructorimpl(random.nextBytes(i3));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m1259nextUBytesEVgfTAA(Random nextUBytes, byte[] bArr) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-array$0");
        nextUBytes.nextBytes(bArr);
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m1260nextUBytesWvrt4B4(Random nextUBytes, byte[] bArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-array$0");
        nextUBytes.nextBytes(bArr, i3, i10);
        return bArr;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m1261nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i3, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = UByteArray.m117getSizeimpl(bArr);
        }
        return m1260nextUBytesWvrt4B4(random, bArr, i3, i10);
    }

    @SinceKotlin(version = "1.5")
    public static final int nextUInt(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m135constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m1262nextUInta8DCA5k(Random nextUInt, int i3, int i10) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m1257checkUIntRangeBoundsJ1ME1BU(i3, i10);
        return UInt.m135constructorimpl(nextUInt.nextInt(i3 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m1263nextUIntqCasIEU(Random nextUInt, int i3) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m1262nextUInta8DCA5k(nextUInt, 0, i3);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m214constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m1264nextULongV1Xi4fY(Random nextULong, long j) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m1265nextULongjmpaWc(nextULong, 0L, j);
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m1265nextULongjmpaWc(Random nextULong, long j, long j3) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m1258checkULongRangeBoundseb3DHEI(j, j3);
        return ULong.m214constructorimpl(nextULong.nextLong(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    public static final int nextUInt(Random random, UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return Integer.compareUnsigned(range.getLast(), -1) < 0 ? m1262nextUInta8DCA5k(random, range.getFirst(), UInt.m135constructorimpl(range.getLast() + 1)) : Integer.compareUnsigned(range.getFirst(), 0) > 0 ? UInt.m135constructorimpl(m1262nextUInta8DCA5k(random, UInt.m135constructorimpl(range.getFirst() - 1), range.getLast()) + 1) : nextUInt(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @SinceKotlin(version = "1.5")
    public static final long nextULong(Random random, ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (Long.compareUnsigned(range.getLast(), -1L) < 0) {
            return m1265nextULongjmpaWc(random, range.getFirst(), ULong.m214constructorimpl(ULong.m214constructorimpl(1 & BodyPartID.bodyIdMax) + range.getLast()));
        }
        if (Long.compareUnsigned(range.getFirst(), 0L) <= 0) {
            return nextULong(random);
        }
        long first = range.getFirst();
        long j = 1 & BodyPartID.bodyIdMax;
        return ULong.m214constructorimpl(ULong.m214constructorimpl(j) + m1265nextULongjmpaWc(random, ULong.m214constructorimpl(first - ULong.m214constructorimpl(j)), range.getLast()));
    }
}

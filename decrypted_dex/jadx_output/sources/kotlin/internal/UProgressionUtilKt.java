package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1249differenceModuloWZ9TVnA(int i3, int i10, int i11) {
        int remainderUnsigned = Integer.remainderUnsigned(i3, i11);
        int remainderUnsigned2 = Integer.remainderUnsigned(i10, i11);
        int compareUnsigned = Integer.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        int m135constructorimpl = UInt.m135constructorimpl(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? m135constructorimpl : UInt.m135constructorimpl(m135constructorimpl + i11);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1250differenceModulosambcqE(long j, long j3, long j10) {
        long remainderUnsigned = Long.remainderUnsigned(j, j10);
        long remainderUnsigned2 = Long.remainderUnsigned(j3, j10);
        int compareUnsigned = Long.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        long m214constructorimpl = ULong.m214constructorimpl(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? m214constructorimpl : ULong.m214constructorimpl(m214constructorimpl + j10);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1251getProgressionLastElement7ftBX0g(long j, long j3, long j10) {
        if (j10 > 0) {
            return Long.compareUnsigned(j, j3) >= 0 ? j3 : ULong.m214constructorimpl(j3 - m1250differenceModulosambcqE(j3, j, ULong.m214constructorimpl(j10)));
        }
        if (j10 < 0) {
            return Long.compareUnsigned(j, j3) <= 0 ? j3 : ULong.m214constructorimpl(j3 + m1250differenceModulosambcqE(j, j3, ULong.m214constructorimpl(-j10)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1252getProgressionLastElementNkh28Cs(int i3, int i10, int i11) {
        if (i11 > 0) {
            if (Integer.compareUnsigned(i3, i10) < 0) {
                return UInt.m135constructorimpl(i10 - m1249differenceModuloWZ9TVnA(i10, i3, UInt.m135constructorimpl(i11)));
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compareUnsigned(i3, i10) > 0) {
                return UInt.m135constructorimpl(i10 + m1249differenceModuloWZ9TVnA(i3, i10, UInt.m135constructorimpl(-i11)));
            }
        }
        return i10;
    }
}

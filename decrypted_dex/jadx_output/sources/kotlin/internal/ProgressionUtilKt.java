package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, d2 = {"mod", "", "a", "b", "", "differenceModulo", "c", "getProgressionLastElement", "start", "end", "step", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i3, int i10, int i11) {
        return mod(mod(i3, i11) - mod(i10, i11), i11);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i3, int i10, int i11) {
        if (i11 > 0) {
            if (i3 < i10) {
                return i10 - differenceModulo(i10, i3, i11);
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i10) {
                return i10 + differenceModulo(i3, i10, -i11);
            }
        }
        return i10;
    }

    private static final int mod(int i3, int i10) {
        int i11 = i3 % i10;
        return i11 >= 0 ? i11 : i11 + i10;
    }

    private static final long differenceModulo(long j, long j3, long j10) {
        return mod(mod(j, j10) - mod(j3, j10), j10);
    }

    private static final long mod(long j, long j3) {
        long j10 = j % j3;
        return j10 >= 0 ? j10 : j10 + j3;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j, long j3, long j10) {
        if (j10 > 0) {
            return j >= j3 ? j3 : j3 - differenceModulo(j3, j, j10);
        }
        if (j10 < 0) {
            return j <= j3 ? j3 : j3 + differenceModulo(j, j3, -j10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}

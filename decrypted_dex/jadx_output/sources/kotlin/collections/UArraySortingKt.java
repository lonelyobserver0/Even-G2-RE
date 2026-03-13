package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m495partitionnroSd4(long[] jArr, int i3, int i10) {
        long m274getsVKNKU = ULongArray.m274getsVKNKU(jArr, (i3 + i10) / 2);
        while (i3 <= i10) {
            while (Long.compareUnsigned(ULongArray.m274getsVKNKU(jArr, i3), m274getsVKNKU) < 0) {
                i3++;
            }
            while (Long.compareUnsigned(ULongArray.m274getsVKNKU(jArr, i10), m274getsVKNKU) > 0) {
                i10--;
            }
            if (i3 <= i10) {
                long m274getsVKNKU2 = ULongArray.m274getsVKNKU(jArr, i3);
                ULongArray.m279setk8EXiF4(jArr, i3, ULongArray.m274getsVKNKU(jArr, i10));
                ULongArray.m279setk8EXiF4(jArr, i10, m274getsVKNKU2);
                i3++;
                i10--;
            }
        }
        return i3;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m496partition4UcCI2c(byte[] bArr, int i3, int i10) {
        int i11;
        byte m116getw2LRezQ = UByteArray.m116getw2LRezQ(bArr, (i3 + i10) / 2);
        while (i3 <= i10) {
            while (true) {
                int m116getw2LRezQ2 = UByteArray.m116getw2LRezQ(bArr, i3) & UByte.MAX_VALUE;
                i11 = m116getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m116getw2LRezQ2, i11) >= 0) {
                    break;
                }
                i3++;
            }
            while (Intrinsics.compare(UByteArray.m116getw2LRezQ(bArr, i10) & UByte.MAX_VALUE, i11) > 0) {
                i10--;
            }
            if (i3 <= i10) {
                byte m116getw2LRezQ3 = UByteArray.m116getw2LRezQ(bArr, i3);
                UByteArray.m121setVurrAj0(bArr, i3, UByteArray.m116getw2LRezQ(bArr, i10));
                UByteArray.m121setVurrAj0(bArr, i10, m116getw2LRezQ3);
                i3++;
                i10--;
            }
        }
        return i3;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m497partitionAa5vz7o(short[] sArr, int i3, int i10) {
        int i11;
        short m379getMh2AYeg = UShortArray.m379getMh2AYeg(sArr, (i3 + i10) / 2);
        while (i3 <= i10) {
            while (true) {
                int m379getMh2AYeg2 = UShortArray.m379getMh2AYeg(sArr, i3) & UShort.MAX_VALUE;
                i11 = m379getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m379getMh2AYeg2, i11) >= 0) {
                    break;
                }
                i3++;
            }
            while (Intrinsics.compare(UShortArray.m379getMh2AYeg(sArr, i10) & UShort.MAX_VALUE, i11) > 0) {
                i10--;
            }
            if (i3 <= i10) {
                short m379getMh2AYeg3 = UShortArray.m379getMh2AYeg(sArr, i3);
                UShortArray.m384set01HTLdE(sArr, i3, UShortArray.m379getMh2AYeg(sArr, i10));
                UShortArray.m384set01HTLdE(sArr, i10, m379getMh2AYeg3);
                i3++;
                i10--;
            }
        }
        return i3;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m498partitionoBK06Vg(int[] iArr, int i3, int i10) {
        int m195getpVg5ArA = UIntArray.m195getpVg5ArA(iArr, (i3 + i10) / 2);
        while (i3 <= i10) {
            while (Integer.compareUnsigned(UIntArray.m195getpVg5ArA(iArr, i3), m195getpVg5ArA) < 0) {
                i3++;
            }
            while (Integer.compareUnsigned(UIntArray.m195getpVg5ArA(iArr, i10), m195getpVg5ArA) > 0) {
                i10--;
            }
            if (i3 <= i10) {
                int m195getpVg5ArA2 = UIntArray.m195getpVg5ArA(iArr, i3);
                UIntArray.m200setVXSXFK8(iArr, i3, UIntArray.m195getpVg5ArA(iArr, i10));
                UIntArray.m200setVXSXFK8(iArr, i10, m195getpVg5ArA2);
                i3++;
                i10--;
            }
        }
        return i3;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m499quickSortnroSd4(long[] jArr, int i3, int i10) {
        int m495partitionnroSd4 = m495partitionnroSd4(jArr, i3, i10);
        int i11 = m495partitionnroSd4 - 1;
        if (i3 < i11) {
            m499quickSortnroSd4(jArr, i3, i11);
        }
        if (m495partitionnroSd4 < i10) {
            m499quickSortnroSd4(jArr, m495partitionnroSd4, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m500quickSort4UcCI2c(byte[] bArr, int i3, int i10) {
        int m496partition4UcCI2c = m496partition4UcCI2c(bArr, i3, i10);
        int i11 = m496partition4UcCI2c - 1;
        if (i3 < i11) {
            m500quickSort4UcCI2c(bArr, i3, i11);
        }
        if (m496partition4UcCI2c < i10) {
            m500quickSort4UcCI2c(bArr, m496partition4UcCI2c, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m501quickSortAa5vz7o(short[] sArr, int i3, int i10) {
        int m497partitionAa5vz7o = m497partitionAa5vz7o(sArr, i3, i10);
        int i11 = m497partitionAa5vz7o - 1;
        if (i3 < i11) {
            m501quickSortAa5vz7o(sArr, i3, i11);
        }
        if (m497partitionAa5vz7o < i10) {
            m501quickSortAa5vz7o(sArr, m497partitionAa5vz7o, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m502quickSortoBK06Vg(int[] iArr, int i3, int i10) {
        int m498partitionoBK06Vg = m498partitionoBK06Vg(iArr, i3, i10);
        int i11 = m498partitionoBK06Vg - 1;
        if (i3 < i11) {
            m502quickSortoBK06Vg(iArr, i3, i11);
        }
        if (m498partitionoBK06Vg < i10) {
            m502quickSortoBK06Vg(iArr, m498partitionoBK06Vg, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m503sortArraynroSd4(long[] jArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-array$0");
        m499quickSortnroSd4(jArr, i3, i10 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m504sortArray4UcCI2c(byte[] bArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-array$0");
        m500quickSort4UcCI2c(bArr, i3, i10 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m505sortArrayAa5vz7o(short[] sArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-array$0");
        m501quickSortAa5vz7o(sArr, i3, i10 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m506sortArrayoBK06Vg(int[] iArr, int i3, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-array$0");
        m502quickSortoBK06Vg(iArr, i3, i10 - 1);
    }
}

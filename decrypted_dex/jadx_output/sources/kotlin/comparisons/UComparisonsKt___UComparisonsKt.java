package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000e\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b,\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b-\u0010\u0017\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010\u001b\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u001e\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, d2 = {"maxOf", "Lkotlin/UInt;", "a", "b", "maxOf-J1ME1BU", "(II)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "c", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "other", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-J1ME1BU", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m1224maxOf5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 65535 & s11) >= 0 ? s10 : s11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m1225maxOfJ1ME1BU(int i3, int i10) {
        return Integer.compareUnsigned(i3, i10) >= 0 ? i3 : i10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m1226maxOfKr8caGY(byte b2, byte b10) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b10 & UByte.MAX_VALUE) >= 0 ? b2 : b10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m1227maxOfMd2H83M(int i3, int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-other$0");
        int m196getSizeimpl = UIntArray.m196getSizeimpl(iArr);
        for (int i10 = 0; i10 < m196getSizeimpl; i10++) {
            i3 = m1225maxOfJ1ME1BU(i3, UIntArray.m195getpVg5ArA(iArr, i10));
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m1228maxOfR03FKyM(long j, long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-other$0");
        int m275getSizeimpl = ULongArray.m275getSizeimpl(jArr);
        for (int i3 = 0; i3 < m275getSizeimpl; i3++) {
            j = m1233maxOfeb3DHEI(j, ULongArray.m274getsVKNKU(jArr, i3));
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m1229maxOfVKSA0NQ(short s10, short s11, short s12) {
        return m1224maxOf5PvTz6A(s10, m1224maxOf5PvTz6A(s11, s12));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m1230maxOfWZ9TVnA(int i3, int i10, int i11) {
        return m1225maxOfJ1ME1BU(i3, m1225maxOfJ1ME1BU(i10, i11));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1231maxOfWr6uiD8(byte b2, byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-other$0");
        int m117getSizeimpl = UByteArray.m117getSizeimpl(bArr);
        for (int i3 = 0; i3 < m117getSizeimpl; i3++) {
            b2 = m1226maxOfKr8caGY(b2, UByteArray.m116getw2LRezQ(bArr, i3));
        }
        return b2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m1232maxOfb33U2AM(byte b2, byte b10, byte b11) {
        return m1226maxOfKr8caGY(b2, m1226maxOfKr8caGY(b10, b11));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m1233maxOfeb3DHEI(long j, long j3) {
        return Long.compareUnsigned(j, j3) >= 0 ? j : j3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m1234maxOfsambcqE(long j, long j3, long j10) {
        return m1233maxOfeb3DHEI(j, m1233maxOfeb3DHEI(j3, j10));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m1235maxOft1qELG4(short s10, short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-other$0");
        int m380getSizeimpl = UShortArray.m380getSizeimpl(sArr);
        for (int i3 = 0; i3 < m380getSizeimpl; i3++) {
            s10 = m1224maxOf5PvTz6A(s10, UShortArray.m379getMh2AYeg(sArr, i3));
        }
        return s10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m1236minOf5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 65535 & s11) <= 0 ? s10 : s11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m1237minOfJ1ME1BU(int i3, int i10) {
        return Integer.compareUnsigned(i3, i10) <= 0 ? i3 : i10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m1238minOfKr8caGY(byte b2, byte b10) {
        return Intrinsics.compare(b2 & UByte.MAX_VALUE, b10 & UByte.MAX_VALUE) <= 0 ? b2 : b10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m1239minOfMd2H83M(int i3, int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-other$0");
        int m196getSizeimpl = UIntArray.m196getSizeimpl(iArr);
        for (int i10 = 0; i10 < m196getSizeimpl; i10++) {
            i3 = m1237minOfJ1ME1BU(i3, UIntArray.m195getpVg5ArA(iArr, i10));
        }
        return i3;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m1240minOfR03FKyM(long j, long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-other$0");
        int m275getSizeimpl = ULongArray.m275getSizeimpl(jArr);
        for (int i3 = 0; i3 < m275getSizeimpl; i3++) {
            j = m1245minOfeb3DHEI(j, ULongArray.m274getsVKNKU(jArr, i3));
        }
        return j;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m1241minOfVKSA0NQ(short s10, short s11, short s12) {
        return m1236minOf5PvTz6A(s10, m1236minOf5PvTz6A(s11, s12));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m1242minOfWZ9TVnA(int i3, int i10, int i11) {
        return m1237minOfJ1ME1BU(i3, m1237minOfJ1ME1BU(i10, i11));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m1243minOfWr6uiD8(byte b2, byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-other$0");
        int m117getSizeimpl = UByteArray.m117getSizeimpl(bArr);
        for (int i3 = 0; i3 < m117getSizeimpl; i3++) {
            b2 = m1238minOfKr8caGY(b2, UByteArray.m116getw2LRezQ(bArr, i3));
        }
        return b2;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m1244minOfb33U2AM(byte b2, byte b10, byte b11) {
        return m1238minOfKr8caGY(b2, m1238minOfKr8caGY(b10, b11));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m1245minOfeb3DHEI(long j, long j3) {
        return Long.compareUnsigned(j, j3) <= 0 ? j : j3;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m1246minOfsambcqE(long j, long j3, long j10) {
        return m1245minOfeb3DHEI(j, m1245minOfeb3DHEI(j3, j10));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m1247minOft1qELG4(short s10, short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-other$0");
        int m380getSizeimpl = UShortArray.m380getSizeimpl(sArr);
        for (int i3 = 0; i3 < m380getSizeimpl; i3++) {
            s10 = m1236minOf5PvTz6A(s10, UShortArray.m379getMh2AYeg(sArr, i3));
        }
        return s10;
    }
}

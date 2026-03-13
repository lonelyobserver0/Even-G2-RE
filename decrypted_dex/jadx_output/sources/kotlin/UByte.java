package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0017\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\"\u0010\fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b'\u0010\fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b,\u0010\fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b1\u0010\fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00107J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00107J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00107J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bO\u0010\u0005J\u0010\u0010P\u001a\u00020QH\u0087\b¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\\\u0010\u0005J\u0010\u0010]\u001a\u00020\rH\u0087\b¢\u0006\u0004\b^\u0010SJ\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "compareTo", "", "other", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(BJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(BB)B", "mod-xj2QHRw", "(BS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-w2LRezQ", "dec", "dec-w2LRezQ", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "and", "and-7apg3OU", "or", "or-7apg3OU", "xor", "xor-7apg3OU", "inv", "inv-w2LRezQ", "toByte", "toByte-impl", "toShort", "", "toShort-impl", "(B)S", "toInt", "toInt-impl", "(B)I", "toLong", "", "toLong-impl", "(B)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(B)F", "toDouble", "", "toDouble-impl", "(B)D", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UByte implements Comparable<UByte> {
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b2) {
        this.data = b2;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m51and7apg3OU(byte b2, byte b10) {
        return m58constructorimpl((byte) (b2 & b10));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m52boximpl(byte b2) {
        return new UByte(b2);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m53compareTo7apg3OU(byte b2) {
        return Intrinsics.compare(getData() & MAX_VALUE, b2 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m55compareToVKZWuLQ(byte b2, long j) {
        return Long.compareUnsigned(ULong.m214constructorimpl(b2 & 255), j);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m56compareToWZ4Q5Ns(byte b2, int i3) {
        return Integer.compareUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m57compareToxj2QHRw(byte b2, short s10) {
        return Intrinsics.compare(b2 & MAX_VALUE, s10 & UShort.MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m58constructorimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m59decw2LRezQ(byte b2) {
        return m58constructorimpl((byte) (b2 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m60div7apg3OU(byte b2, byte b10) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m61divVKZWuLQ(byte b2, long j) {
        return Long.divideUnsigned(ULong.m214constructorimpl(b2 & 255), j);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m62divWZ4Q5Ns(byte b2, int i3) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m63divxj2QHRw(byte b2, short s10) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m64equalsimpl(byte b2, Object obj) {
        return (obj instanceof UByte) && b2 == ((UByte) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m65equalsimpl0(byte b2, byte b10) {
        return b2 == b10;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m66floorDiv7apg3OU(byte b2, byte b10) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m67floorDivVKZWuLQ(byte b2, long j) {
        return Long.divideUnsigned(ULong.m214constructorimpl(b2 & 255), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m68floorDivWZ4Q5Ns(byte b2, int i3) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m69floorDivxj2QHRw(byte b2, short s10) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m70hashCodeimpl(byte b2) {
        return Byte.hashCode(b2);
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m71incw2LRezQ(byte b2) {
        return m58constructorimpl((byte) (b2 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m72invw2LRezQ(byte b2) {
        return m58constructorimpl((byte) (~b2));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m73minus7apg3OU(byte b2, byte b10) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & MAX_VALUE) - UInt.m135constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m74minusVKZWuLQ(byte b2, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(b2 & 255) - j);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m75minusWZ4Q5Ns(byte b2, int i3) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & MAX_VALUE) - i3);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m76minusxj2QHRw(byte b2, short s10) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & MAX_VALUE) - UInt.m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m77mod7apg3OU(byte b2, byte b10) {
        return m58constructorimpl((byte) Integer.remainderUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(b10 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m78modVKZWuLQ(byte b2, long j) {
        return Long.remainderUnsigned(ULong.m214constructorimpl(b2 & 255), j);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m79modWZ4Q5Ns(byte b2, int i3) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m80modxj2QHRw(byte b2, short s10) {
        return UShort.m321constructorimpl((short) Integer.remainderUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(s10 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m81or7apg3OU(byte b2, byte b10) {
        return m58constructorimpl((byte) (b2 | b10));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m82plus7apg3OU(byte b2, byte b10) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b10 & MAX_VALUE) + UInt.m135constructorimpl(b2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m83plusVKZWuLQ(byte b2, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(b2 & 255) + j);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m84plusWZ4Q5Ns(byte b2, int i3) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & MAX_VALUE) + i3);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m85plusxj2QHRw(byte b2, short s10) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & UShort.MAX_VALUE) + UInt.m135constructorimpl(b2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m86rangeTo7apg3OU(byte b2, byte b10) {
        return new UIntRange(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(b10 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m87rangeUntil7apg3OU(byte b2, byte b10) {
        return URangesKt.m1311untilJ1ME1BU(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m88rem7apg3OU(byte b2, byte b10) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m89remVKZWuLQ(byte b2, long j) {
        return Long.remainderUnsigned(ULong.m214constructorimpl(b2 & 255), j);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m90remWZ4Q5Ns(byte b2, int i3) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m91remxj2QHRw(byte b2, short s10) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(b2 & MAX_VALUE), UInt.m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m92times7apg3OU(byte b2, byte b10) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b10 & MAX_VALUE) * UInt.m135constructorimpl(b2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m93timesVKZWuLQ(byte b2, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(b2 & 255) * j);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m94timesWZ4Q5Ns(byte b2, int i3) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & MAX_VALUE) * i3);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m95timesxj2QHRw(byte b2, short s10) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & UShort.MAX_VALUE) * UInt.m135constructorimpl(b2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m96toByteimpl(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m97toDoubleimpl(byte b2) {
        return UnsignedKt.uintToDouble(b2 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m98toFloatimpl(byte b2) {
        return (float) UnsignedKt.uintToDouble(b2 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m99toIntimpl(byte b2) {
        return b2 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m100toLongimpl(byte b2) {
        return b2 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m101toShortimpl(byte b2) {
        return (short) (b2 & 255);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m102toStringimpl(byte b2) {
        return String.valueOf(b2 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m103toUBytew2LRezQ(byte b2) {
        return b2;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m104toUIntpVg5ArA(byte b2) {
        return UInt.m135constructorimpl(b2 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m105toULongsVKNKU(byte b2) {
        return ULong.m214constructorimpl(b2 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m106toUShortMh2AYeg(byte b2) {
        return UShort.m321constructorimpl((short) (b2 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m107xor7apg3OU(byte b2, byte b10) {
        return m58constructorimpl((byte) (b2 ^ b10));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    public boolean equals(Object other) {
        return m64equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m70hashCodeimpl(this.data);
    }

    public String toString() {
        return m102toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m54compareTo7apg3OU(byte b2, byte b10) {
        return Intrinsics.compare(b2 & MAX_VALUE, b10 & MAX_VALUE);
    }
}

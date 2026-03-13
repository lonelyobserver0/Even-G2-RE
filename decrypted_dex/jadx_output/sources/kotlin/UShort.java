package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u001d\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\"\u0010\rJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b'\u0010\rJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b,\u0010\rJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b1\u0010\rJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00109J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00109J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00109J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b\\\u0010QJ\u0010\u0010]\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b^\u0010\u0005J\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "compareTo-xj2QHRw", "(SS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(SJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(SB)B", "mod-xj2QHRw", "(SS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-Mh2AYeg", "dec", "dec-Mh2AYeg", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "and", "and-xj2QHRw", "or", "or-xj2QHRw", "xor", "xor-xj2QHRw", "inv", "inv-Mh2AYeg", "toByte", "", "toByte-impl", "(S)B", "toShort", "toShort-impl", "toInt", "toInt-impl", "(S)I", "toLong", "", "toLong-impl", "(S)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(S)F", "toDouble", "", "toDouble-impl", "(S)D", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UShort implements Comparable<UShort> {
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s10) {
        this.data = s10;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m314andxj2QHRw(short s10, short s11) {
        return m321constructorimpl((short) (s10 & s11));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m315boximpl(short s10) {
        return new UShort(s10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m316compareTo7apg3OU(short s10, byte b2) {
        return Intrinsics.compare(s10 & MAX_VALUE, b2 & UByte.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m317compareToVKZWuLQ(short s10, long j) {
        return Long.compareUnsigned(ULong.m214constructorimpl(s10 & 65535), j);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m318compareToWZ4Q5Ns(short s10, int i3) {
        return Integer.compareUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m319compareToxj2QHRw(short s10) {
        return Intrinsics.compare(getData() & MAX_VALUE, s10 & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m321constructorimpl(short s10) {
        return s10;
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m322decMh2AYeg(short s10) {
        return m321constructorimpl((short) (s10 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m323div7apg3OU(short s10, byte b2) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m324divVKZWuLQ(short s10, long j) {
        return Long.divideUnsigned(ULong.m214constructorimpl(s10 & 65535), j);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m325divWZ4Q5Ns(short s10, int i3) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m326divxj2QHRw(short s10, short s11) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(s11 & MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m327equalsimpl(short s10, Object obj) {
        return (obj instanceof UShort) && s10 == ((UShort) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m328equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m329floorDiv7apg3OU(short s10, byte b2) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m330floorDivVKZWuLQ(short s10, long j) {
        return Long.divideUnsigned(ULong.m214constructorimpl(s10 & 65535), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m331floorDivWZ4Q5Ns(short s10, int i3) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m332floorDivxj2QHRw(short s10, short s11) {
        return Integer.divideUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(s11 & MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m333hashCodeimpl(short s10) {
        return Short.hashCode(s10);
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m334incMh2AYeg(short s10) {
        return m321constructorimpl((short) (s10 + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m335invMh2AYeg(short s10) {
        return m321constructorimpl((short) (~s10));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m336minus7apg3OU(short s10, byte b2) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & MAX_VALUE) - UInt.m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m337minusVKZWuLQ(short s10, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(s10 & 65535) - j);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m338minusWZ4Q5Ns(short s10, int i3) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & MAX_VALUE) - i3);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m339minusxj2QHRw(short s10, short s11) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & MAX_VALUE) - UInt.m135constructorimpl(s11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m340mod7apg3OU(short s10, byte b2) {
        return UByte.m58constructorimpl((byte) Integer.remainderUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(b2 & UByte.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m341modVKZWuLQ(short s10, long j) {
        return Long.remainderUnsigned(ULong.m214constructorimpl(s10 & 65535), j);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m342modWZ4Q5Ns(short s10, int i3) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m343modxj2QHRw(short s10, short s11) {
        return m321constructorimpl((short) Integer.remainderUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(s11 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m344orxj2QHRw(short s10, short s11) {
        return m321constructorimpl((short) (s10 | s11));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m345plus7apg3OU(short s10, byte b2) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & UByte.MAX_VALUE) + UInt.m135constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m346plusVKZWuLQ(short s10, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(s10 & 65535) + j);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m347plusWZ4Q5Ns(short s10, int i3) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & MAX_VALUE) + i3);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m348plusxj2QHRw(short s10, short s11) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s11 & MAX_VALUE) + UInt.m135constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m349rangeToxj2QHRw(short s10, short s11) {
        return new UIntRange(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(s11 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m350rangeUntilxj2QHRw(short s10, short s11) {
        return URangesKt.m1311untilJ1ME1BU(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(s11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m351rem7apg3OU(short s10, byte b2) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m352remVKZWuLQ(short s10, long j) {
        return Long.remainderUnsigned(ULong.m214constructorimpl(s10 & 65535), j);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m353remWZ4Q5Ns(short s10, int i3) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), i3);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m354remxj2QHRw(short s10, short s11) {
        return Integer.remainderUnsigned(UInt.m135constructorimpl(s10 & MAX_VALUE), UInt.m135constructorimpl(s11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m355times7apg3OU(short s10, byte b2) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(b2 & UByte.MAX_VALUE) * UInt.m135constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m356timesVKZWuLQ(short s10, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(s10 & 65535) * j);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m357timesWZ4Q5Ns(short s10, int i3) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s10 & MAX_VALUE) * i3);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m358timesxj2QHRw(short s10, short s11) {
        return UInt.m135constructorimpl(UInt.m135constructorimpl(s11 & MAX_VALUE) * UInt.m135constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m359toByteimpl(short s10) {
        return (byte) s10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m360toDoubleimpl(short s10) {
        return UnsignedKt.uintToDouble(s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m361toFloatimpl(short s10) {
        return (float) UnsignedKt.uintToDouble(s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m362toIntimpl(short s10) {
        return s10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m363toLongimpl(short s10) {
        return s10 & 65535;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m364toShortimpl(short s10) {
        return s10;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m365toStringimpl(short s10) {
        return String.valueOf(s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m366toUBytew2LRezQ(short s10) {
        return UByte.m58constructorimpl((byte) s10);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m367toUIntpVg5ArA(short s10) {
        return UInt.m135constructorimpl(s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m368toULongsVKNKU(short s10) {
        return ULong.m214constructorimpl(s10 & 65535);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m369toUShortMh2AYeg(short s10) {
        return s10;
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m370xorxj2QHRw(short s10, short s11) {
        return m321constructorimpl((short) (s10 ^ s11));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    public boolean equals(Object other) {
        return m327equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m333hashCodeimpl(this.data);
    }

    public String toString() {
        return m365toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m320compareToxj2QHRw(short s10, short s11) {
        return Intrinsics.compare(s10 & MAX_VALUE, s11 & MAX_VALUE);
    }
}

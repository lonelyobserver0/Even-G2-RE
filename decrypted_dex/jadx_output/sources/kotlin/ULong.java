package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b \u0010\u0018J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u001eJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b%\u0010\u0018J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b&\u0010\u001aJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b'\u0010\u001cJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u001eJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b*\u0010\u0018J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b+\u0010\u001aJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b,\u0010\u001cJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u001eJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b/\u0010\u0018J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b0\u0010\u001aJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b1\u0010\u001cJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b2\u0010\u001eJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b4\u0010\u0018J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b5\u0010\u001aJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b6\u0010\u001cJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u001eJ\u0018\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u00108\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b=\u0010\u0013J\u0018\u00108\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b>\u0010\u001eJ\u0010\u0010?\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u0005J\u0010\u0010A\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010\u0005J\u0018\u0010C\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bH\u0010FJ\u0018\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\f¢\u0006\u0004\bK\u0010\u001cJ\u0018\u0010L\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\f¢\u0006\u0004\bM\u0010\u001cJ\u0018\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bO\u0010\u001eJ\u0018\u0010P\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bQ\u0010\u001eJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bS\u0010\u001eJ\u0010\u0010T\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\tH\u0087\b¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bb\u0010\u0005J\u0010\u0010c\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\bd\u0010YJ\u0010\u0010e\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\bf\u0010]J\u0010\u0010g\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\bh\u0010`J\u0010\u0010i\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bj\u0010\u0005J\u0010\u0010k\u001a\u00020lH\u0087\b¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020pH\u0087\b¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\u00020x2\b\u0010\n\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006|"}, d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "plus", "plus-7apg3OU", "(JB)J", "plus-xj2QHRw", "(JS)J", "plus-WZ4Q5Ns", "(JI)J", "plus-VKZWuLQ", "(JJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(JB)B", "mod-xj2QHRw", "(JS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-s-VKNKU", "dec", "dec-s-VKNKU", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "and", "and-VKZWuLQ", "or", "or-VKZWuLQ", "xor", "xor-VKZWuLQ", "inv", "inv-s-VKNKU", "toByte", "", "toByte-impl", "(J)B", "toShort", "", "toShort-impl", "(J)S", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(J)F", "toDouble", "", "toDouble-impl", "(J)D", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class ULong implements Comparable<ULong> {
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m207andVKZWuLQ(long j, long j3) {
        return m214constructorimpl(j & j3);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m208boximpl(long j) {
        return new ULong(j);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m209compareTo7apg3OU(long j, byte b2) {
        return Long.compareUnsigned(j, m214constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m210compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(getData(), j);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m212compareToWZ4Q5Ns(long j, int i3) {
        return Long.compareUnsigned(j, m214constructorimpl(i3 & BodyPartID.bodyIdMax));
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m213compareToxj2QHRw(long j, short s10) {
        return Long.compareUnsigned(j, m214constructorimpl(s10 & 65535));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m214constructorimpl(long j) {
        return j;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m215decsVKNKU(long j) {
        return m214constructorimpl(j - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m216div7apg3OU(long j, byte b2) {
        return Long.divideUnsigned(j, m214constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m217divVKZWuLQ(long j, long j3) {
        return UnsignedKt.m393ulongDivideeb3DHEI(j, j3);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m218divWZ4Q5Ns(long j, int i3) {
        return Long.divideUnsigned(j, m214constructorimpl(i3 & BodyPartID.bodyIdMax));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m219divxj2QHRw(long j, short s10) {
        return Long.divideUnsigned(j, m214constructorimpl(s10 & 65535));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m220equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m221equalsimpl0(long j, long j3) {
        return j == j3;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m222floorDiv7apg3OU(long j, byte b2) {
        return Long.divideUnsigned(j, m214constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m223floorDivVKZWuLQ(long j, long j3) {
        return Long.divideUnsigned(j, j3);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m224floorDivWZ4Q5Ns(long j, int i3) {
        return Long.divideUnsigned(j, m214constructorimpl(i3 & BodyPartID.bodyIdMax));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m225floorDivxj2QHRw(long j, short s10) {
        return Long.divideUnsigned(j, m214constructorimpl(s10 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m226hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m227incsVKNKU(long j) {
        return m214constructorimpl(j + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m228invsVKNKU(long j) {
        return m214constructorimpl(~j);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m229minus7apg3OU(long j, byte b2) {
        return m214constructorimpl(j - m214constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m230minusVKZWuLQ(long j, long j3) {
        return m214constructorimpl(j - j3);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m231minusWZ4Q5Ns(long j, int i3) {
        return m214constructorimpl(j - m214constructorimpl(i3 & BodyPartID.bodyIdMax));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m232minusxj2QHRw(long j, short s10) {
        return m214constructorimpl(j - m214constructorimpl(s10 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m233mod7apg3OU(long j, byte b2) {
        return UByte.m58constructorimpl((byte) Long.remainderUnsigned(j, m214constructorimpl(b2 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m234modVKZWuLQ(long j, long j3) {
        return Long.remainderUnsigned(j, j3);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m235modWZ4Q5Ns(long j, int i3) {
        return UInt.m135constructorimpl((int) Long.remainderUnsigned(j, m214constructorimpl(i3 & BodyPartID.bodyIdMax)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m236modxj2QHRw(long j, short s10) {
        return UShort.m321constructorimpl((short) Long.remainderUnsigned(j, m214constructorimpl(s10 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m237orVKZWuLQ(long j, long j3) {
        return m214constructorimpl(j | j3);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m238plus7apg3OU(long j, byte b2) {
        return m214constructorimpl(m214constructorimpl(b2 & 255) + j);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m239plusVKZWuLQ(long j, long j3) {
        return m214constructorimpl(j + j3);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m240plusWZ4Q5Ns(long j, int i3) {
        return m214constructorimpl(m214constructorimpl(i3 & BodyPartID.bodyIdMax) + j);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m241plusxj2QHRw(long j, short s10) {
        return m214constructorimpl(m214constructorimpl(s10 & 65535) + j);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m242rangeToVKZWuLQ(long j, long j3) {
        return new ULongRange(j, j3, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m243rangeUntilVKZWuLQ(long j, long j3) {
        return URangesKt.m1313untileb3DHEI(j, j3);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m244rem7apg3OU(long j, byte b2) {
        return Long.remainderUnsigned(j, m214constructorimpl(b2 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m245remVKZWuLQ(long j, long j3) {
        return UnsignedKt.m394ulongRemaindereb3DHEI(j, j3);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m246remWZ4Q5Ns(long j, int i3) {
        return Long.remainderUnsigned(j, m214constructorimpl(i3 & BodyPartID.bodyIdMax));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m247remxj2QHRw(long j, short s10) {
        return Long.remainderUnsigned(j, m214constructorimpl(s10 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m248shlsVKNKU(long j, int i3) {
        return m214constructorimpl(j << i3);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m249shrsVKNKU(long j, int i3) {
        return m214constructorimpl(j >>> i3);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m250times7apg3OU(long j, byte b2) {
        return m214constructorimpl(m214constructorimpl(b2 & 255) * j);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m251timesVKZWuLQ(long j, long j3) {
        return m214constructorimpl(j * j3);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m252timesWZ4Q5Ns(long j, int i3) {
        return m214constructorimpl(m214constructorimpl(i3 & BodyPartID.bodyIdMax) * j);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m253timesxj2QHRw(long j, short s10) {
        return m214constructorimpl(m214constructorimpl(s10 & 65535) * j);
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m254toByteimpl(long j) {
        return (byte) j;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m255toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m256toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m257toIntimpl(long j) {
        return (int) j;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m258toLongimpl(long j) {
        return j;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m259toShortimpl(long j) {
        return (short) j;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m260toStringimpl(long j) {
        return UnsignedKt.ulongToString(j, 10);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m261toUBytew2LRezQ(long j) {
        return UByte.m58constructorimpl((byte) j);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m262toUIntpVg5ArA(long j) {
        return UInt.m135constructorimpl((int) j);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m263toULongsVKNKU(long j) {
        return j;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m264toUShortMh2AYeg(long j) {
        return UShort.m321constructorimpl((short) j);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m265xorVKZWuLQ(long j, long j3) {
        return m214constructorimpl(j ^ j3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object other) {
        return m220equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m226hashCodeimpl(this.data);
    }

    public String toString() {
        return m260toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m211compareToVKZWuLQ(long j, long j3) {
        return UnsignedKt.ulongCompare(j, j3);
    }
}

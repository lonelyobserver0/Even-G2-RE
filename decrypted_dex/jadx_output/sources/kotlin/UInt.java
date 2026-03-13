package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001xB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0016\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0017\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001c\u0010\fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001d\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u0011J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b\u001f\u0010\u001aJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b!\u0010\fJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u0011J\u0018\u0010 \u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b$\u0010\u001aJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b&\u0010\fJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u0011J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b)\u0010\u001aJ\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\n¢\u0006\u0004\b+\u0010\fJ\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b,\u0010\u000fJ\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u0011J\u0018\u0010*\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\n¢\u0006\u0004\b.\u0010\u001aJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0087\b¢\u0006\u0004\b0\u0010\fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b1\u0010\u000fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u0010\u0011J\u0018\u0010/\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b3\u0010\u001aJ\u0018\u00104\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b7\u00108J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b9\u0010\u0011J\u0018\u00104\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\b:\u0010\u001aJ\u0010\u0010;\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b<\u0010\u0005J\u0010\u0010=\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b>\u0010\u0005J\u0018\u0010?\u001a\u00020@2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\u00020@2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010BJ\u0018\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0003H\u0087\f¢\u0006\u0004\bG\u0010\u0011J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0003H\u0087\f¢\u0006\u0004\bI\u0010\u0011J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u0010\u0011J\u0018\u0010L\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bM\u0010\u0011J\u0018\u0010N\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bO\u0010\u0011J\u0010\u0010P\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bQ\u0010\u0005J\u0010\u0010R\u001a\u00020SH\u0087\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b[\u0010\u0005J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\nH\u0087\b¢\u0006\u0004\ba\u0010UJ\u0010\u0010b\u001a\u00020\rH\u0087\b¢\u0006\u0004\bc\u0010YJ\u0010\u0010d\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\be\u0010\u0005J\u0010\u0010f\u001a\u00020\u0012H\u0087\b¢\u0006\u0004\bg\u0010_J\u0010\u0010h\u001a\u00020iH\u0087\b¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020u2\b\u0010\t\u001a\u0004\u0018\u00010vHÖ\u0003J\t\u0010w\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006y"}, d2 = {"Lkotlin/UInt;", "", "data", "", "constructor-impl", "(I)I", "getData$annotations", "()V", "compareTo", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "compareTo-WZ4Q5Ns", "(II)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(IJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(IB)B", "mod-xj2QHRw", "(IS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-pVg5ArA", "dec", "dec-pVg5ArA", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-WZ4Q5Ns", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "and", "and-WZ4Q5Ns", "or", "or-WZ4Q5Ns", "xor", "xor-WZ4Q5Ns", "inv", "inv-pVg5ArA", "toByte", "", "toByte-impl", "(I)B", "toShort", "", "toShort-impl", "(I)S", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(I)F", "toDouble", "", "toDouble-impl", "(I)D", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UInt implements Comparable<UInt> {
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UInt(int i3) {
        this.data = i3;
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m128andWZ4Q5Ns(int i3, int i10) {
        return m135constructorimpl(i3 & i10);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m129boximpl(int i3) {
        return new UInt(i3);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m130compareTo7apg3OU(int i3, byte b2) {
        return Integer.compareUnsigned(i3, m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m131compareToVKZWuLQ(int i3, long j) {
        return Long.compareUnsigned(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax), j);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m132compareToWZ4Q5Ns(int i3) {
        return UnsignedKt.uintCompare(getData(), i3);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m134compareToxj2QHRw(int i3, short s10) {
        return Integer.compareUnsigned(i3, m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m135constructorimpl(int i3) {
        return i3;
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m136decpVg5ArA(int i3) {
        return m135constructorimpl(i3 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m137div7apg3OU(int i3, byte b2) {
        return Integer.divideUnsigned(i3, m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m138divVKZWuLQ(int i3, long j) {
        return Long.divideUnsigned(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax), j);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m139divWZ4Q5Ns(int i3, int i10) {
        return UnsignedKt.m391uintDivideJ1ME1BU(i3, i10);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m140divxj2QHRw(int i3, short s10) {
        return Integer.divideUnsigned(i3, m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m141equalsimpl(int i3, Object obj) {
        return (obj instanceof UInt) && i3 == ((UInt) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m142equalsimpl0(int i3, int i10) {
        return i3 == i10;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m143floorDiv7apg3OU(int i3, byte b2) {
        return Integer.divideUnsigned(i3, m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m144floorDivVKZWuLQ(int i3, long j) {
        return Long.divideUnsigned(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m145floorDivWZ4Q5Ns(int i3, int i10) {
        return Integer.divideUnsigned(i3, i10);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m146floorDivxj2QHRw(int i3, short s10) {
        return Integer.divideUnsigned(i3, m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m147hashCodeimpl(int i3) {
        return Integer.hashCode(i3);
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m148incpVg5ArA(int i3) {
        return m135constructorimpl(i3 + 1);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m149invpVg5ArA(int i3) {
        return m135constructorimpl(~i3);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m150minus7apg3OU(int i3, byte b2) {
        return m135constructorimpl(i3 - m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m151minusVKZWuLQ(int i3, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax) - j);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m152minusWZ4Q5Ns(int i3, int i10) {
        return m135constructorimpl(i3 - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m153minusxj2QHRw(int i3, short s10) {
        return m135constructorimpl(i3 - m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m154mod7apg3OU(int i3, byte b2) {
        return UByte.m58constructorimpl((byte) Integer.remainderUnsigned(i3, m135constructorimpl(b2 & UByte.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m155modVKZWuLQ(int i3, long j) {
        return Long.remainderUnsigned(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax), j);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m156modWZ4Q5Ns(int i3, int i10) {
        return Integer.remainderUnsigned(i3, i10);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m157modxj2QHRw(int i3, short s10) {
        return UShort.m321constructorimpl((short) Integer.remainderUnsigned(i3, m135constructorimpl(s10 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m158orWZ4Q5Ns(int i3, int i10) {
        return m135constructorimpl(i3 | i10);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m159plus7apg3OU(int i3, byte b2) {
        return m135constructorimpl(m135constructorimpl(b2 & UByte.MAX_VALUE) + i3);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m160plusVKZWuLQ(int i3, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax) + j);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m161plusWZ4Q5Ns(int i3, int i10) {
        return m135constructorimpl(i3 + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m162plusxj2QHRw(int i3, short s10) {
        return m135constructorimpl(m135constructorimpl(s10 & UShort.MAX_VALUE) + i3);
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m163rangeToWZ4Q5Ns(int i3, int i10) {
        return new UIntRange(i3, i10, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m164rangeUntilWZ4Q5Ns(int i3, int i10) {
        return URangesKt.m1311untilJ1ME1BU(i3, i10);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m165rem7apg3OU(int i3, byte b2) {
        return Integer.remainderUnsigned(i3, m135constructorimpl(b2 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m166remVKZWuLQ(int i3, long j) {
        return Long.remainderUnsigned(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax), j);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m167remWZ4Q5Ns(int i3, int i10) {
        return UnsignedKt.m392uintRemainderJ1ME1BU(i3, i10);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m168remxj2QHRw(int i3, short s10) {
        return Integer.remainderUnsigned(i3, m135constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m169shlpVg5ArA(int i3, int i10) {
        return m135constructorimpl(i3 << i10);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m170shrpVg5ArA(int i3, int i10) {
        return m135constructorimpl(i3 >>> i10);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m171times7apg3OU(int i3, byte b2) {
        return m135constructorimpl(m135constructorimpl(b2 & UByte.MAX_VALUE) * i3);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m172timesVKZWuLQ(int i3, long j) {
        return ULong.m214constructorimpl(ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax) * j);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m173timesWZ4Q5Ns(int i3, int i10) {
        return m135constructorimpl(i3 * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m174timesxj2QHRw(int i3, short s10) {
        return m135constructorimpl(m135constructorimpl(s10 & UShort.MAX_VALUE) * i3);
    }

    @InlineOnly
    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m175toByteimpl(int i3) {
        return (byte) i3;
    }

    @InlineOnly
    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m176toDoubleimpl(int i3) {
        return UnsignedKt.uintToDouble(i3);
    }

    @InlineOnly
    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m177toFloatimpl(int i3) {
        return (float) UnsignedKt.uintToDouble(i3);
    }

    @InlineOnly
    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m178toIntimpl(int i3) {
        return i3;
    }

    @InlineOnly
    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m179toLongimpl(int i3) {
        return i3 & BodyPartID.bodyIdMax;
    }

    @InlineOnly
    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m180toShortimpl(int i3) {
        return (short) i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m181toStringimpl(int i3) {
        return String.valueOf(i3 & BodyPartID.bodyIdMax);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m182toUBytew2LRezQ(int i3) {
        return UByte.m58constructorimpl((byte) i3);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m183toUIntpVg5ArA(int i3) {
        return i3;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m184toULongsVKNKU(int i3) {
        return ULong.m214constructorimpl(i3 & BodyPartID.bodyIdMax);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m185toUShortMh2AYeg(int i3) {
        return UShort.m321constructorimpl((short) i3);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m186xorWZ4Q5Ns(int i3, int i10) {
        return m135constructorimpl(i3 ^ i10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(getData(), uInt.getData());
    }

    public boolean equals(Object other) {
        return m141equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m147hashCodeimpl(this.data);
    }

    public String toString() {
        return m181toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m133compareToWZ4Q5Ns(int i3, int i10) {
        return UnsignedKt.uintCompare(i3, i10);
    }
}

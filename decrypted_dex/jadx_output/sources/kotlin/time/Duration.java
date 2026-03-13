package kotlin.time;

import E1.a;
import Xa.h;
import i2.u;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;

@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Duration implements Comparable<Duration> {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m1368constructorimpl(0);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1416getDaysUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1418getDaysUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1422getHoursUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1424getHoursUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1428getMicrosecondsUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1430getMicrosecondsUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1434getMillisecondsUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1436getMillisecondsUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1440getMinutesUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1442getMinutesUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1446getNanosecondsUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1448getNanosecondsUwyO8pc$annotations(double d8) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1452getSecondsUwyO8pc(int i3) {
            return DurationKt.toDuration(i3, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1454getSecondsUwyO8pc$annotations(double d8) {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1457getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1458getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1459getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1460parseUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return parseDuration;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(a.k("Invalid duration string format: '", value, "'."), e10);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1461parseIsoStringUwyO8pc(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return parseDuration;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(a.k("Invalid ISO duration string format: '", value, "'."), e10);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m1462parseIsoStringOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return Duration.m1366boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m1463parseOrNullFghU774(String value) {
            long parseDuration;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return Duration.m1366boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1417getDaysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1419getDaysUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1423getHoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1425getHoursUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1429getMicrosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1431getMicrosecondsUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1435getMillisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1437getMillisecondsUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1441getMinutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1443getMinutesUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1447getNanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1449getNanosecondsUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1453getSecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1455getSecondsUwyO8pc$annotations(int i3) {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1415getDaysUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1420getDaysUwyO8pc$annotations(long j) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1421getHoursUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1426getHoursUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1427getMicrosecondsUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1432getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1433getMillisecondsUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1438getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1439getMinutesUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1444getMinutesUwyO8pc$annotations(long j) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1445getNanosecondsUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1450getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1451getSecondsUwyO8pc(double d8) {
            return DurationKt.toDuration(d8, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1456getSecondsUwyO8pc$annotations(long j) {
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1364addValuesMixedRangesUwyO8pc(long j, long j3, long j10) {
        long nanosToMillis;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = DurationKt.nanosToMillis(j10);
        long j11 = j3 + nanosToMillis;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j11, -4611686018427387903L, DurationKt.MAX_MILLIS));
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j12 = j10 - millisToNanos;
        millisToNanos2 = DurationKt.millisToNanos(j11);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + j12);
        return durationOfNanos;
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1365appendFractionalimpl(long j, StringBuilder sb2, int i3, int i10, int i11, String str, boolean z2) {
        String padStart;
        sb2.append(i3);
        if (i10 != 0) {
            sb2.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i10), i11, '0');
            int i12 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z2 || i14 >= 3) {
                sb2.append((CharSequence) padStart, 0, ((i12 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) padStart, 0, i14);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m1366boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1368constructorimpl(long j) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j;
        }
        if (m1392isInNanosimpl(j)) {
            long m1388getValueimpl = m1388getValueimpl(j);
            if (-4611686018426999999L > m1388getValueimpl || m1388getValueimpl >= 4611686018427000000L) {
                throw new AssertionError(h.q(new StringBuilder(), m1388getValueimpl(j), " ns is out of nanoseconds range"));
            }
            return j;
        }
        long m1388getValueimpl2 = m1388getValueimpl(j);
        if (-4611686018427387903L > m1388getValueimpl2 || m1388getValueimpl2 >= 4611686018427387904L) {
            throw new AssertionError(h.q(new StringBuilder(), m1388getValueimpl(j), " ms is out of milliseconds range"));
        }
        long m1388getValueimpl3 = m1388getValueimpl(j);
        if (-4611686018426L > m1388getValueimpl3 || m1388getValueimpl3 >= 4611686018427L) {
            return j;
        }
        throw new AssertionError(h.q(new StringBuilder(), m1388getValueimpl(j), " ms is denormalized"));
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1369divLRDsOJo(long j, long j3) {
        Comparable maxOf;
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(m1386getStorageUnitimpl(j), m1386getStorageUnitimpl(j3));
        DurationUnit durationUnit = (DurationUnit) maxOf;
        return m1404toDoubleimpl(j, durationUnit) / m1404toDoubleimpl(j3, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1371divUwyO8pc(long j, int i3) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        long durationOfNanos2;
        if (i3 == 0) {
            if (m1395isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m1394isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1392isInNanosimpl(j)) {
            durationOfNanos2 = DurationKt.durationOfNanos(m1388getValueimpl(j) / i3);
            return durationOfNanos2;
        }
        if (m1393isInfiniteimpl(j)) {
            return m1399timesUwyO8pc(j, MathKt.getSign(i3));
        }
        long j3 = i3;
        long m1388getValueimpl = m1388getValueimpl(j) / j3;
        if (-4611686018426L > m1388getValueimpl || m1388getValueimpl >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(m1388getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(m1388getValueimpl(j) - (m1388getValueimpl * j3));
        millisToNanos2 = DurationKt.millisToNanos(m1388getValueimpl);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + (millisToNanos / j3));
        return durationOfNanos;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1372equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1373equalsimpl0(long j, long j3) {
        return j == j3;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1374getAbsoluteValueUwyO8pc(long j) {
        return m1394isNegativeimpl(j) ? m1412unaryMinusUwyO8pc(j) : j;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1375getHoursComponentimpl(long j) {
        if (m1393isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1377getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1376getInWholeDaysimpl(long j) {
        return m1407toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1377getInWholeHoursimpl(long j) {
        return m1407toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1378getInWholeMicrosecondsimpl(long j) {
        return m1407toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1379getInWholeMillisecondsimpl(long j) {
        return (m1391isInMillisimpl(j) && m1390isFiniteimpl(j)) ? m1388getValueimpl(j) : m1407toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1380getInWholeMinutesimpl(long j) {
        return m1407toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1381getInWholeNanosecondsimpl(long j) {
        long millisToNanos;
        long m1388getValueimpl = m1388getValueimpl(j);
        if (m1392isInNanosimpl(j)) {
            return m1388getValueimpl;
        }
        if (m1388getValueimpl > 9223372036854L) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (m1388getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = DurationKt.millisToNanos(m1388getValueimpl);
        return millisToNanos;
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1382getInWholeSecondsimpl(long j) {
        return m1407toLongimpl(j, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1383getMinutesComponentimpl(long j) {
        if (m1393isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1380getInWholeMinutesimpl(j) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1384getNanosecondsComponentimpl(long j) {
        if (m1393isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1391isInMillisimpl(j) ? DurationKt.millisToNanos(m1388getValueimpl(j) % 1000) : m1388getValueimpl(j) % InstantKt.NANOS_PER_SECOND);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1385getSecondsComponentimpl(long j) {
        if (m1393isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1382getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m1386getStorageUnitimpl(long j) {
        return m1392isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1387getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m1388getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1389hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1390isFiniteimpl(long j) {
        return !m1393isInfiniteimpl(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1391isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1392isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1393isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1394isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1395isPositiveimpl(long j) {
        return j > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1396minusLRDsOJo(long j, long j3) {
        return m1397plusLRDsOJo(j, m1412unaryMinusUwyO8pc(j3));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1397plusLRDsOJo(long j, long j3) {
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if (m1393isInfiniteimpl(j)) {
            if (m1390isFiniteimpl(j3) || (j3 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1393isInfiniteimpl(j3)) {
            return j3;
        }
        if ((((int) j) & 1) != (((int) j3) & 1)) {
            return m1391isInMillisimpl(j) ? m1364addValuesMixedRangesUwyO8pc(j, m1388getValueimpl(j), m1388getValueimpl(j3)) : m1364addValuesMixedRangesUwyO8pc(j, m1388getValueimpl(j3), m1388getValueimpl(j));
        }
        long m1388getValueimpl = m1388getValueimpl(j) + m1388getValueimpl(j3);
        if (m1392isInNanosimpl(j)) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(m1388getValueimpl);
            return durationOfNanosNormalized;
        }
        durationOfMillisNormalized = DurationKt.durationOfMillisNormalized(m1388getValueimpl);
        return durationOfMillisNormalized;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1399timesUwyO8pc(long j, int i3) {
        long coerceIn;
        long durationOfMillis;
        long nanosToMillis;
        long millisToNanos;
        long nanosToMillis2;
        long coerceIn2;
        long durationOfMillis2;
        long durationOfNanosNormalized;
        long durationOfNanos;
        if (m1393isInfiniteimpl(j)) {
            if (i3 != 0) {
                return i3 > 0 ? j : m1412unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i3 == 0) {
            return ZERO;
        }
        long m1388getValueimpl = m1388getValueimpl(j);
        long j3 = i3;
        long j10 = m1388getValueimpl * j3;
        if (!m1392isInNanosimpl(j)) {
            if (j10 / j3 != m1388getValueimpl) {
                return MathKt.getSign(i3) * MathKt.getSign(m1388getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
            }
            coerceIn = RangesKt___RangesKt.coerceIn(j10, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS));
            durationOfMillis = DurationKt.durationOfMillis(coerceIn);
            return durationOfMillis;
        }
        if (-2147483647L <= m1388getValueimpl && m1388getValueimpl < 2147483648L) {
            durationOfNanos = DurationKt.durationOfNanos(j10);
            return durationOfNanos;
        }
        if (j10 / j3 == m1388getValueimpl) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(j10);
            return durationOfNanosNormalized;
        }
        nanosToMillis = DurationKt.nanosToMillis(m1388getValueimpl);
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j11 = nanosToMillis * j3;
        nanosToMillis2 = DurationKt.nanosToMillis((m1388getValueimpl - millisToNanos) * j3);
        long j12 = nanosToMillis2 + j11;
        if (j11 / j3 != nanosToMillis || (j12 ^ j11) < 0) {
            return MathKt.getSign(i3) * MathKt.getSign(m1388getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        coerceIn2 = RangesKt___RangesKt.coerceIn(j12, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS));
        durationOfMillis2 = DurationKt.durationOfMillis(coerceIn2);
        return durationOfMillis2;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1403toComponentsimpl(long j, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1376getInWholeDaysimpl(j)), Integer.valueOf(m1375getHoursComponentimpl(j)), Integer.valueOf(m1383getMinutesComponentimpl(j)), Integer.valueOf(m1385getSecondsComponentimpl(j)), Integer.valueOf(m1384getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1404toDoubleimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1388getValueimpl(j), m1386getStorageUnitimpl(j), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m1405toIntimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m1407toLongimpl(j, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m1406toIsoStringimpl(long j) {
        StringBuilder sb2 = new StringBuilder();
        if (m1394isNegativeimpl(j)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long m1374getAbsoluteValueUwyO8pc = m1374getAbsoluteValueUwyO8pc(j);
        long m1377getInWholeHoursimpl = m1377getInWholeHoursimpl(m1374getAbsoluteValueUwyO8pc);
        int m1383getMinutesComponentimpl = m1383getMinutesComponentimpl(m1374getAbsoluteValueUwyO8pc);
        int m1385getSecondsComponentimpl = m1385getSecondsComponentimpl(m1374getAbsoluteValueUwyO8pc);
        int m1384getNanosecondsComponentimpl = m1384getNanosecondsComponentimpl(m1374getAbsoluteValueUwyO8pc);
        long j3 = m1393isInfiniteimpl(j) ? 9999999999999L : m1377getInWholeHoursimpl;
        boolean z2 = false;
        boolean z10 = j3 != 0;
        boolean z11 = (m1385getSecondsComponentimpl == 0 && m1384getNanosecondsComponentimpl == 0) ? false : true;
        if (m1383getMinutesComponentimpl != 0 || (z11 && z10)) {
            z2 = true;
        }
        if (z10) {
            sb2.append(j3);
            sb2.append('H');
        }
        if (z2) {
            sb2.append(m1383getMinutesComponentimpl);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z2)) {
            m1365appendFractionalimpl(j, sb2, m1385getSecondsComponentimpl, m1384getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb2.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m1407toLongimpl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1388getValueimpl(j), m1386getStorageUnitimpl(j), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1408toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1394isNegativeimpl = m1394isNegativeimpl(j);
        StringBuilder sb2 = new StringBuilder();
        if (m1394isNegativeimpl) {
            sb2.append('-');
        }
        long m1374getAbsoluteValueUwyO8pc = m1374getAbsoluteValueUwyO8pc(j);
        long m1376getInWholeDaysimpl = m1376getInWholeDaysimpl(m1374getAbsoluteValueUwyO8pc);
        int m1375getHoursComponentimpl = m1375getHoursComponentimpl(m1374getAbsoluteValueUwyO8pc);
        int m1383getMinutesComponentimpl = m1383getMinutesComponentimpl(m1374getAbsoluteValueUwyO8pc);
        int m1385getSecondsComponentimpl = m1385getSecondsComponentimpl(m1374getAbsoluteValueUwyO8pc);
        int m1384getNanosecondsComponentimpl = m1384getNanosecondsComponentimpl(m1374getAbsoluteValueUwyO8pc);
        int i3 = 0;
        boolean z2 = m1376getInWholeDaysimpl != 0;
        boolean z10 = m1375getHoursComponentimpl != 0;
        boolean z11 = m1383getMinutesComponentimpl != 0;
        boolean z12 = (m1385getSecondsComponentimpl == 0 && m1384getNanosecondsComponentimpl == 0) ? false : true;
        if (z2) {
            sb2.append(m1376getInWholeDaysimpl);
            sb2.append('d');
            i3 = 1;
        }
        if (z10 || (z2 && (z11 || z12))) {
            int i10 = i3 + 1;
            if (i3 > 0) {
                sb2.append(' ');
            }
            sb2.append(m1375getHoursComponentimpl);
            sb2.append('h');
            i3 = i10;
        }
        if (z11 || (z12 && (z10 || z2))) {
            int i11 = i3 + 1;
            if (i3 > 0) {
                sb2.append(' ');
            }
            sb2.append(m1383getMinutesComponentimpl);
            sb2.append('m');
            i3 = i11;
        }
        if (z12) {
            int i12 = i3 + 1;
            if (i3 > 0) {
                sb2.append(' ');
            }
            if (m1385getSecondsComponentimpl != 0 || z2 || z10 || z11) {
                m1365appendFractionalimpl(j, sb2, m1385getSecondsComponentimpl, m1384getNanosecondsComponentimpl, 9, "s", false);
            } else if (m1384getNanosecondsComponentimpl >= 1000000) {
                m1365appendFractionalimpl(j, sb2, m1384getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m1384getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m1384getNanosecondsComponentimpl >= 1000) {
                m1365appendFractionalimpl(j, sb2, m1384getNanosecondsComponentimpl / 1000, m1384getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb2.append(m1384getNanosecondsComponentimpl);
                sb2.append("ns");
            }
            i3 = i12;
        }
        if (m1394isNegativeimpl && i3 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m1410toStringimpl$default(long j, DurationUnit durationUnit, int i3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        return m1409toStringimpl(j, durationUnit, i3);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1411truncateToUwyO8pc$kotlin_stdlib(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit m1386getStorageUnitimpl = m1386getStorageUnitimpl(j);
        if (unit.compareTo(m1386getStorageUnitimpl) <= 0 || m1393isInfiniteimpl(j)) {
            return j;
        }
        return DurationKt.toDuration(m1388getValueimpl(j) - (m1388getValueimpl(j) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, m1386getStorageUnitimpl)), m1386getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1412unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m1388getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1413compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1413compareToLRDsOJo(long j) {
        return m1367compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object other) {
        return m1372equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m1389hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m1408toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1367compareToLRDsOJo(long j, long j3) {
        long j10 = j ^ j3;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return Intrinsics.compare(j, j3);
        }
        int i3 = (((int) j) & 1) - (((int) j3) & 1);
        return m1394isNegativeimpl(j) ? -i3 : i3;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1402toComponentsimpl(long j, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1377getInWholeHoursimpl(j)), Integer.valueOf(m1383getMinutesComponentimpl(j)), Integer.valueOf(m1385getSecondsComponentimpl(j)), Integer.valueOf(m1384getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1401toComponentsimpl(long j, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1380getInWholeMinutesimpl(j)), Integer.valueOf(m1385getSecondsComponentimpl(j)), Integer.valueOf(m1384getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1400toComponentsimpl(long j, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1382getInWholeSecondsimpl(j)), Integer.valueOf(m1384getNanosecondsComponentimpl(j)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1370divUwyO8pc(long j, double d8) {
        int roundToInt = MathKt.roundToInt(d8);
        if (roundToInt == d8 && roundToInt != 0) {
            return m1371divUwyO8pc(j, roundToInt);
        }
        DurationUnit m1386getStorageUnitimpl = m1386getStorageUnitimpl(j);
        return DurationKt.toDuration(m1404toDoubleimpl(j, m1386getStorageUnitimpl) / d8, m1386getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1398timesUwyO8pc(long j, double d8) {
        int roundToInt = MathKt.roundToInt(d8);
        if (roundToInt == d8) {
            return m1399timesUwyO8pc(j, roundToInt);
        }
        DurationUnit m1386getStorageUnitimpl = m1386getStorageUnitimpl(j);
        return DurationKt.toDuration(m1404toDoubleimpl(j, m1386getStorageUnitimpl) * d8, m1386getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m1409toStringimpl(long j, DurationUnit unit, int i3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i3 >= 0) {
            double m1404toDoubleimpl = m1404toDoubleimpl(j, unit);
            if (Double.isInfinite(m1404toDoubleimpl)) {
                return String.valueOf(m1404toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(m1404toDoubleimpl, RangesKt.coerceAtMost(i3, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(u.p(i3, "decimals must be not negative, but was ").toString());
    }
}

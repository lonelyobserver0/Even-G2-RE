package kotlin.collections.unsigned;

import i2.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u0000\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0000\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014*\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014*\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014*\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014*\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010&\u001a/\u0010\u001d\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0007`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000b`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000f`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0007\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\u000b\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000f\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00070Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0007`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000b0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000b`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000f*\u00020\u00102\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000f0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000f`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020[*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010^\u001a+\u0010Z\u001a\u00020[*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010_\u001a+\u0010Z\u001a\u00020[*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010`\u001a+\u0010Z\u001a\u00020a*\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010c\u001a+\u0010Z\u001a\u00020a*\u00020\b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010d\u001a+\u0010Z\u001a\u00020a*\u00020\f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010e\u001a+\u0010Z\u001a\u00020a*\u00020\u00102\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020a06H\u0087\bø\u0001\u0000¢\u0006\u0004\bb\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"elementAt", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "index", "", "elementAt-qFRl0hI", "([II)I", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "elementAt-r7IrZao", "([JI)J", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "elementAt-PpDY95g", "([BI)B", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "elementAt-nggk6HY", "([SI)S", "asList", "", "asList--ajY-9A", "([I)Ljava/util/List;", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "element", "fromIndex", "toIndex", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-EtDCXyQ", "([SSII)I", "max", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min--ajY-9A", "min-QwZRm1k", "min-GBYM_sE", "min-rL5Bavg", "minBy", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-JOV_ifY", "minBy-xTcfx_M", "minWith", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-XMRcp5o", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class UArraysKt___UArraysJvmKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<UInt> m508asListajY9A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$asList$0");
        return new UArraysKt___UArraysJvmKt$asList$1(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m509asListGBYM_sE(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$asList$0");
        return new UArraysKt___UArraysJvmKt$asList$3(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m510asListQwZRm1k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$asList$0");
        return new UArraysKt___UArraysJvmKt$asList$2(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m511asListrL5Bavg(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$asList$0");
        return new UArraysKt___UArraysJvmKt$asList$4(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m512binarySearch2fe2U9s(int[] iArr, int i3, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$binarySearch$0");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i10, i11, UIntArray.m196getSizeimpl(iArr));
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(iArr[i13], i3);
            if (uintCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m513binarySearch2fe2U9s$default(int[] iArr, int i3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = UIntArray.m196getSizeimpl(iArr);
        }
        return m512binarySearch2fe2U9s(iArr, i3, i10, i11);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m514binarySearchEtDCXyQ(short[] sArr, short s10, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$binarySearch$0");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i3, i10, UShortArray.m380getSizeimpl(sArr));
        int i11 = s10 & UShort.MAX_VALUE;
        int i12 = i10 - 1;
        while (i3 <= i12) {
            int i13 = (i3 + i12) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(sArr[i13], i11);
            if (uintCompare < 0) {
                i3 = i13 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m515binarySearchEtDCXyQ$default(short[] sArr, short s10, int i3, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = UShortArray.m380getSizeimpl(sArr);
        }
        return m514binarySearchEtDCXyQ(sArr, s10, i3, i10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m516binarySearchK6DWlUc(long[] jArr, long j, int i3, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$binarySearch$0");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i3, i10, ULongArray.m275getSizeimpl(jArr));
        int i11 = i10 - 1;
        while (i3 <= i11) {
            int i12 = (i3 + i11) >>> 1;
            int ulongCompare = UnsignedKt.ulongCompare(jArr[i12], j);
            if (ulongCompare < 0) {
                i3 = i12 + 1;
            } else {
                if (ulongCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m517binarySearchK6DWlUc$default(long[] jArr, long j, int i3, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = ULongArray.m275getSizeimpl(jArr);
        }
        return m516binarySearchK6DWlUc(jArr, j, i3, i10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m518binarySearchWpHrYlw(byte[] bArr, byte b2, int i3, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$binarySearch$0");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i3, i10, UByteArray.m117getSizeimpl(bArr));
        int i11 = b2 & UByte.MAX_VALUE;
        int i12 = i10 - 1;
        while (i3 <= i12) {
            int i13 = (i3 + i12) >>> 1;
            int uintCompare = UnsignedKt.uintCompare(bArr[i13], i11);
            if (uintCompare < 0) {
                i3 = i13 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m519binarySearchWpHrYlw$default(byte[] bArr, byte b2, int i3, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = UByteArray.m117getSizeimpl(bArr);
        }
        return m518binarySearchWpHrYlw(bArr, b2, i3, i10);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m520elementAtPpDY95g(byte[] bArr, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$elementAt$0");
        return UByteArray.m116getw2LRezQ(bArr, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m521elementAtnggk6HY(short[] sArr, int i3) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$elementAt$0");
        return UShortArray.m379getMh2AYeg(sArr, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m522elementAtqFRl0hI(int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$elementAt$0");
        return UIntArray.m195getpVg5ArA(iArr, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m523elementAtr7IrZao(long[] jArr, int i3) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$elementAt$0");
        return ULongArray.m274getsVKNKU(jArr, i3);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m524maxajY9A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$max$0");
        return UArraysKt___UArraysKt.m896maxOrNullajY9A(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m525maxGBYM_sE(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$max$0");
        return UArraysKt___UArraysKt.m897maxOrNullGBYM_sE(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m526maxQwZRm1k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$max$0");
        return UArraysKt___UArraysKt.m898maxOrNullQwZRm1k(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m527maxrL5Bavg(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$max$0");
        return UArraysKt___UArraysKt.m899maxOrNullrL5Bavg(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m528maxByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$maxBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m119isEmptyimpl(bArr)) {
            return null;
        }
        byte m116getw2LRezQ = UByteArray.m116getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m52boximpl(m116getw2LRezQ);
        }
        R invoke = selector.invoke(UByte.m52boximpl(m116getw2LRezQ));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte m116getw2LRezQ2 = UByteArray.m116getw2LRezQ(bArr, i3);
                R invoke2 = selector.invoke(UByte.m52boximpl(m116getw2LRezQ2));
                if (invoke.compareTo(invoke2) < 0) {
                    m116getw2LRezQ = m116getw2LRezQ2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return UByte.m52boximpl(m116getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m529maxByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$maxBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m277isEmptyimpl(jArr)) {
            return null;
        }
        long m274getsVKNKU = ULongArray.m274getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m208boximpl(m274getsVKNKU);
        }
        R invoke = selector.invoke(ULong.m208boximpl(m274getsVKNKU));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long m274getsVKNKU2 = ULongArray.m274getsVKNKU(jArr, i3);
                R invoke2 = selector.invoke(ULong.m208boximpl(m274getsVKNKU2));
                if (invoke.compareTo(invoke2) < 0) {
                    m274getsVKNKU = m274getsVKNKU2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return ULong.m208boximpl(m274getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m530maxByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$maxBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m198isEmptyimpl(iArr)) {
            return null;
        }
        int m195getpVg5ArA = UIntArray.m195getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m129boximpl(m195getpVg5ArA);
        }
        R invoke = selector.invoke(UInt.m129boximpl(m195getpVg5ArA));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int m195getpVg5ArA2 = UIntArray.m195getpVg5ArA(iArr, i3);
                R invoke2 = selector.invoke(UInt.m129boximpl(m195getpVg5ArA2));
                if (invoke.compareTo(invoke2) < 0) {
                    m195getpVg5ArA = m195getpVg5ArA2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return UInt.m129boximpl(m195getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m531maxByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$maxBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m382isEmptyimpl(sArr)) {
            return null;
        }
        short m379getMh2AYeg = UShortArray.m379getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m315boximpl(m379getMh2AYeg);
        }
        R invoke = selector.invoke(UShort.m315boximpl(m379getMh2AYeg));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short m379getMh2AYeg2 = UShortArray.m379getMh2AYeg(sArr, i3);
                R invoke2 = selector.invoke(UShort.m315boximpl(m379getMh2AYeg2));
                if (invoke.compareTo(invoke2) < 0) {
                    m379getMh2AYeg = m379getMh2AYeg2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return UShort.m315boximpl(m379getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m532maxWithXMRcp5o(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$maxWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m904maxWithOrNullXMRcp5o(bArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m533maxWithYmdZ_VM(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$maxWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m905maxWithOrNullYmdZ_VM(iArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m534maxWitheOHTfZs(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$maxWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m906maxWithOrNulleOHTfZs(sArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m535maxWithzrEWJaI(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$maxWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m907maxWithOrNullzrEWJaI(jArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m536minajY9A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$min$0");
        return UArraysKt___UArraysKt.m952minOrNullajY9A(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m537minGBYM_sE(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$min$0");
        return UArraysKt___UArraysKt.m953minOrNullGBYM_sE(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m538minQwZRm1k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$min$0");
        return UArraysKt___UArraysKt.m954minOrNullQwZRm1k(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m539minrL5Bavg(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$min$0");
        return UArraysKt___UArraysKt.m955minOrNullrL5Bavg(sArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m540minByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$minBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m119isEmptyimpl(bArr)) {
            return null;
        }
        byte m116getw2LRezQ = UByteArray.m116getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m52boximpl(m116getw2LRezQ);
        }
        R invoke = selector.invoke(UByte.m52boximpl(m116getw2LRezQ));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte m116getw2LRezQ2 = UByteArray.m116getw2LRezQ(bArr, i3);
                R invoke2 = selector.invoke(UByte.m52boximpl(m116getw2LRezQ2));
                if (invoke.compareTo(invoke2) > 0) {
                    m116getw2LRezQ = m116getw2LRezQ2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return UByte.m52boximpl(m116getw2LRezQ);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m541minByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$minBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m277isEmptyimpl(jArr)) {
            return null;
        }
        long m274getsVKNKU = ULongArray.m274getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m208boximpl(m274getsVKNKU);
        }
        R invoke = selector.invoke(ULong.m208boximpl(m274getsVKNKU));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long m274getsVKNKU2 = ULongArray.m274getsVKNKU(jArr, i3);
                R invoke2 = selector.invoke(ULong.m208boximpl(m274getsVKNKU2));
                if (invoke.compareTo(invoke2) > 0) {
                    m274getsVKNKU = m274getsVKNKU2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return ULong.m208boximpl(m274getsVKNKU);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m542minByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$minBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m198isEmptyimpl(iArr)) {
            return null;
        }
        int m195getpVg5ArA = UIntArray.m195getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m129boximpl(m195getpVg5ArA);
        }
        R invoke = selector.invoke(UInt.m129boximpl(m195getpVg5ArA));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int m195getpVg5ArA2 = UIntArray.m195getpVg5ArA(iArr, i3);
                R invoke2 = selector.invoke(UInt.m129boximpl(m195getpVg5ArA2));
                if (invoke.compareTo(invoke2) > 0) {
                    m195getpVg5ArA = m195getpVg5ArA2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return UInt.m129boximpl(m195getpVg5ArA);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m543minByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$minBy$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m382isEmptyimpl(sArr)) {
            return null;
        }
        short m379getMh2AYeg = UShortArray.m379getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m315boximpl(m379getMh2AYeg);
        }
        R invoke = selector.invoke(UShort.m315boximpl(m379getMh2AYeg));
        int i3 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short m379getMh2AYeg2 = UShortArray.m379getMh2AYeg(sArr, i3);
                R invoke2 = selector.invoke(UShort.m315boximpl(m379getMh2AYeg2));
                if (invoke.compareTo(invoke2) > 0) {
                    m379getMh2AYeg = m379getMh2AYeg2;
                    invoke = invoke2;
                }
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        return UShort.m315boximpl(m379getMh2AYeg);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m544minWithXMRcp5o(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$minWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m960minWithOrNullXMRcp5o(bArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m545minWithYmdZ_VM(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$minWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m961minWithOrNullYmdZ_VM(iArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m546minWitheOHTfZs(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$minWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m962minWithOrNulleOHTfZs(sArr, comparator);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m547minWithzrEWJaI(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$minWith$0");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m963minWithOrNullzrEWJaI(jArr, comparator);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super UInt, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m196getSizeimpl = UIntArray.m196getSizeimpl(iArr);
        for (int i3 = 0; i3 < m196getSizeimpl; i3++) {
            valueOf = valueOf.add((BigDecimal) u.m(iArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super UInt, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m196getSizeimpl = UIntArray.m196getSizeimpl(iArr);
        for (int i3 = 0; i3 < m196getSizeimpl; i3++) {
            valueOf = valueOf.add((BigInteger) u.m(iArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super ULong, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m275getSizeimpl = ULongArray.m275getSizeimpl(jArr);
        for (int i3 = 0; i3 < m275getSizeimpl; i3++) {
            valueOf = valueOf.add((BigDecimal) u.n(jArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super ULong, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m275getSizeimpl = ULongArray.m275getSizeimpl(jArr);
        for (int i3 = 0; i3 < m275getSizeimpl; i3++) {
            valueOf = valueOf.add((BigInteger) u.n(jArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super UByte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m117getSizeimpl = UByteArray.m117getSizeimpl(bArr);
        for (int i3 = 0; i3 < m117getSizeimpl; i3++) {
            valueOf = valueOf.add((BigDecimal) u.l(bArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super UByte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m117getSizeimpl = UByteArray.m117getSizeimpl(bArr);
        for (int i3 = 0; i3 < m117getSizeimpl; i3++) {
            valueOf = valueOf.add((BigInteger) u.l(bArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigDecimal")
    @OverloadResolutionByLambdaReturnType
    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super UShort, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m380getSizeimpl = UShortArray.m380getSizeimpl(sArr);
        for (int i3 = 0; i3 < m380getSizeimpl; i3++) {
            valueOf = valueOf.add((BigDecimal) u.o(sArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @JvmName(name = "sumOfBigInteger")
    @OverloadResolutionByLambdaReturnType
    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super UShort, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-$this$sumOf$0");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int m380getSizeimpl = UShortArray.m380getSizeimpl(sArr);
        for (int i3 = 0; i3 < m380getSizeimpl; i3++) {
            valueOf = valueOf.add((BigInteger) u.o(sArr, i3, selector));
            Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }
}

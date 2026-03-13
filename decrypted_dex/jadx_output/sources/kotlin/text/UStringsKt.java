package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u0019\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toUByteOrNull", "toUShortOrNull", "toUIntOrNull", "toULongOrNull", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName(name = "UStringsKt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m1354toStringJSWoG40(long j, int i3) {
        return UnsignedKt.ulongToString(j, CharsKt__CharJVMKt.checkRadix(i3));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m1355toStringLxnNnR4(byte b2, int i3) {
        String num = Integer.toString(b2 & UByte.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m1356toStringV7xB4Y4(int i3, int i10) {
        return UnsignedKt.ulongToString(i3 & BodyPartID.bodyIdMax, CharsKt__CharJVMKt.checkRadix(i10));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m1357toStringolVBNx4(short s10, int i3) {
        String num = Integer.toString(s10 & UShort.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UByte toUByteOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UInt toUIntOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final ULong toULongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UShort toUShortOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i3);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UByte toUByteOrNull(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i3);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compareUnsigned(data, UInt.m135constructorimpl(255)) > 0) {
            return null;
        }
        return UByte.m52boximpl(UByte.m58constructorimpl((byte) data));
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i3);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UInt toUIntOrNull(String str, int i3) {
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i3);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i10 = 0;
        }
        int m135constructorimpl = UInt.m135constructorimpl(i3);
        int i12 = 119304647;
        while (i10 < length) {
            int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i10), i3);
            if (digitOf < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i11, i12) > 0) {
                if (i12 == 119304647) {
                    i12 = Integer.divideUnsigned(-1, m135constructorimpl);
                    if (Integer.compareUnsigned(i11, i12) > 0) {
                    }
                }
                return null;
            }
            int m135constructorimpl2 = UInt.m135constructorimpl(i11 * m135constructorimpl);
            int m135constructorimpl3 = UInt.m135constructorimpl(UInt.m135constructorimpl(digitOf) + m135constructorimpl2);
            if (Integer.compareUnsigned(m135constructorimpl3, m135constructorimpl2) < 0) {
                return null;
            }
            i10++;
            i11 = m135constructorimpl3;
        }
        return UInt.m129boximpl(i11);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i3);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final ULong toULongOrNull(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i3);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long m214constructorimpl = ULong.m214constructorimpl(i3);
        long j = 0;
        long j3 = 512409557603043100L;
        while (i10 < length) {
            if (CharsKt__CharJVMKt.digitOf(str.charAt(i10), i3) < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, j3) > 0) {
                if (j3 == 512409557603043100L) {
                    j3 = Long.divideUnsigned(-1L, m214constructorimpl);
                    if (Long.compareUnsigned(j, j3) > 0) {
                    }
                }
                return null;
            }
            long m214constructorimpl2 = ULong.m214constructorimpl(j * m214constructorimpl);
            long m214constructorimpl3 = ULong.m214constructorimpl(ULong.m214constructorimpl(UInt.m135constructorimpl(r13) & BodyPartID.bodyIdMax) + m214constructorimpl2);
            if (Long.compareUnsigned(m214constructorimpl3, m214constructorimpl2) < 0) {
                return null;
            }
            i10++;
            j = m214constructorimpl3;
        }
        return ULong.m208boximpl(j);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i3);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    public static final UShort toUShortOrNull(String str, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i3);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compareUnsigned(data, UInt.m135constructorimpl(Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) > 0) {
            return null;
        }
        return UShort.m315boximpl(UShort.m321constructorimpl((short) data));
    }
}

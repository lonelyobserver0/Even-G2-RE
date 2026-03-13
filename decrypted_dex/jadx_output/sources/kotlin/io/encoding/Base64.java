package kotlin.io.encoding;

import Xa.h;
import i2.u;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import p0.AbstractC1482f;

@SinceKotlin(version = "2.2")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u0000 B2\u00020\u0001:\u0002ABB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J=\u0010\u001f\u001a\u0002H \"\f\b\u0000\u0010 *\u00060!j\u0002`\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u0002H 2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006¢\u0006\u0002\u0010#J\"\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J\"\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020&2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J%\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b(J5\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020\u0003H\u0002J0\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J%\u00100\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b1J%\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0002\b5J(\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00107\u001a\u00020\u0006H\u0002J \u0010;\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J%\u0010<\u001a\u00020:2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b=J \u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "mimeLineLength", "", "paddingOption", "Lkotlin/io/encoding/Base64$PaddingOption;", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", "isUrlSafe$kotlin_stdlib", "()Z", "isMimeScheme$kotlin_stdlib", "getMimeLineLength$kotlin_stdlib", "()I", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "mimeGroupsPerLine", "withPadding", "option", "encodeToByteArray", "", "source", "startIndex", "endIndex", "encodeIntoByteArray", "destination", "destinationOffset", "encode", "", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "sourceSize", "encodeSize$kotlin_stdlib", "shouldPadOnEncode", "decodeImpl", "decodeSize", "decodeSize$kotlin_stdlib", "charsToBytesImpl", "charsToBytesImpl$kotlin_stdlib", "bytesToStringImpl", "bytesToStringImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "checkPaddingIsAllowed", "", "skipIllegalSymbolsIfMime", "checkSourceBounds", "checkSourceBounds$kotlin_stdlib", "checkDestinationBounds", "destinationSize", "capacityNeeded", "PaddingOption", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalEncodingApi.class})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Base64 {
    private static final Base64 Mime;
    private static final Base64 Pem;
    private static final Base64 UrlSafe;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int lineLengthMime = 76;
    private static final int lineLengthPem = 64;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    private final int mimeGroupsPerLine;
    private final int mimeLineLength;
    private final PaddingOption paddingOption;

    /* renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "padSymbol", "", "lineLengthMime", "lineLengthPem", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "UrlSafe", "getUrlSafe", "()Lkotlin/io/encoding/Base64;", "Mime", "getMime", "Pem", "getPem", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    public static final class Companion extends Base64 {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Base64 getMime() {
            return Base64.Mime;
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        public final Base64 getPem() {
            return Base64.Pem;
        }

        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }

        private Companion() {
            super(false, false, -1, PaddingOption.PRESENT, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @SinceKotlin(version = "2.0")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaddingOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaddingOption[] $VALUES;
        public static final PaddingOption PRESENT = new PaddingOption("PRESENT", 0);
        public static final PaddingOption ABSENT = new PaddingOption("ABSENT", 1);
        public static final PaddingOption PRESENT_OPTIONAL = new PaddingOption("PRESENT_OPTIONAL", 2);
        public static final PaddingOption ABSENT_OPTIONAL = new PaddingOption("ABSENT_OPTIONAL", 3);

        private static final /* synthetic */ PaddingOption[] $values() {
            return new PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        static {
            PaddingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private PaddingOption(String str, int i3) {
        }

        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) $VALUES.clone();
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        UrlSafe = new Base64(true, false, -1, paddingOption);
        Mime = new Base64(false, true, 76, paddingOption);
        Pem = new Base64(false, true, 64, paddingOption);
    }

    public /* synthetic */ Base64(boolean z2, boolean z10, int i3, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z10, i3, paddingOption);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new IndexOutOfBoundsException(h.o("destination offset: ", destinationOffset, destinationSize, ", destination size: "));
        }
        int i3 = destinationOffset + capacityNeeded;
        if (i3 < 0 || i3 > destinationSize) {
            StringBuilder l9 = AbstractC1482f.l(destinationOffset, "The destination array does not have enough capacity, destination offset: ", destinationSize, ", destination size: ", ", capacity needed: ");
            l9.append(capacityNeeded);
            throw new IndexOutOfBoundsException(l9.toString());
        }
    }

    private final void checkPaddingIsAllowed(int padIndex) {
        if (this.paddingOption == PaddingOption.ABSENT) {
            throw new IllegalArgumentException(u.p(padIndex, "The padding option is set to ABSENT, but the input has a pad character at index "));
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i3, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return base64.decode(bArr, i3, i10);
    }

    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i3;
        int i10;
        int i11;
        int[] iArr = this.isUrlSafe ? Base64Kt.base64UrlDecodeMap : Base64Kt.base64DecodeMap;
        int i12 = -8;
        int i13 = destinationOffset;
        int i14 = startIndex;
        int i15 = -8;
        int i16 = 0;
        while (true) {
            if (i14 >= endIndex) {
                i3 = 8;
                i10 = 0;
                break;
            }
            if (i15 != i12 || i14 + 3 >= endIndex) {
                i3 = 8;
                i11 = 1;
            } else {
                i3 = 8;
                i11 = 1;
                int i17 = i14 + 4;
                int i18 = (iArr[source[i14 + 1] & UByte.MAX_VALUE] << 12) | (iArr[source[i14] & UByte.MAX_VALUE] << 18) | (iArr[source[i14 + 2] & UByte.MAX_VALUE] << 6) | iArr[source[i14 + 3] & UByte.MAX_VALUE];
                if (i18 >= 0) {
                    destination[i13] = (byte) (i18 >> 16);
                    int i19 = i13 + 2;
                    destination[i13 + 1] = (byte) (i18 >> 8);
                    i13 += 3;
                    destination[i19] = (byte) i18;
                    i14 = i17;
                    i12 = -8;
                }
            }
            int i20 = source[i14] & UByte.MAX_VALUE;
            int i21 = iArr[i20];
            if (i21 >= 0) {
                i14++;
                i16 = (i16 << 6) | i21;
                int i22 = i15 + 6;
                if (i22 >= 0) {
                    destination[i13] = (byte) (i16 >>> i22);
                    i16 &= (i11 << i22) - 1;
                    i15 -= 2;
                    i13++;
                } else {
                    i15 = i22;
                }
            } else {
                if (i21 == -2) {
                    i14 = handlePaddingSymbol(source, i14, endIndex, i15);
                    i10 = i11;
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                    sb2.append((char) i20);
                    sb2.append("'(");
                    String num = Integer.toString(i20, CharsKt.checkRadix(i3));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    sb2.append(num);
                    sb2.append(") at index ");
                    sb2.append(i14);
                    throw new IllegalArgumentException(sb2.toString());
                }
                i14++;
            }
            i12 = -8;
        }
        if (i15 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i15 != -8 && i10 == 0 && this.paddingOption == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i16 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int skipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, i14, endIndex);
        if (skipIllegalSymbolsIfMime >= endIndex) {
            return i13 - destinationOffset;
        }
        int i23 = source[skipIllegalSymbolsIfMime] & UByte.MAX_VALUE;
        StringBuilder sb3 = new StringBuilder("Symbol '");
        sb3.append((char) i23);
        sb3.append("'(");
        String num2 = Integer.toString(i23, CharsKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(num2, "toString(...)");
        sb3.append(num2);
        sb3.append(") at index ");
        throw new IllegalArgumentException(AbstractC1482f.f(skipIllegalSymbolsIfMime - 1, " is prohibited after the pad character", sb3));
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i3, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i12 & 4) != 0) {
            i3 = 0;
        }
        if ((i12 & 8) != 0) {
            i10 = 0;
        }
        if ((i12 & 16) != 0) {
            i11 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i3, i10, i11);
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i3, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return base64.encode(bArr, i3, i10);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i3, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i12 & 4) != 0) {
            i3 = 0;
        }
        if ((i12 & 8) != 0) {
            i10 = 0;
        }
        if ((i12 & 16) != 0) {
            i11 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i3, i10, i11);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i3, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i11 & 4) != 0) {
            i3 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i3, i10);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i3, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i3, i10);
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException(u.p(padIndex, "Redundant pad character at index "));
        }
        if (byteStart == -6) {
            checkPaddingIsAllowed(padIndex);
            return padIndex + 1;
        }
        if (byteStart != -4) {
            if (byteStart == -2) {
                return padIndex + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        checkPaddingIsAllowed(padIndex);
        int skipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
        if (skipIllegalSymbolsIfMime == endIndex || source[skipIllegalSymbolsIfMime] != 61) {
            throw new IllegalArgumentException(u.p(skipIllegalSymbolsIfMime, "Missing one pad character at index "));
        }
        return skipIllegalSymbolsIfMime + 1;
    }

    private final boolean shouldPadOnEncode() {
        PaddingOption paddingOption = this.paddingOption;
        return paddingOption == PaddingOption.PRESENT || paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            int i3 = source[startIndex] & UByte.MAX_VALUE;
            iArr = Base64Kt.base64DecodeMap;
            if (iArr[i3] != -1) {
                break;
            }
            startIndex++;
        }
        return startIndex;
    }

    public final String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b2 : source) {
            sb2.append((char) b2);
        }
        return sb2.toString();
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i3 = 0;
        while (startIndex < endIndex) {
            char charAt = source.charAt(startIndex);
            if (charAt <= 255) {
                bArr[i3] = (byte) charAt;
                i3++;
            } else {
                bArr[i3] = 63;
                i3++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    public final byte[] decode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize$kotlin_stdlib = decodeSize$kotlin_stdlib(source, startIndex, endIndex);
        byte[] bArr = new byte[decodeSize$kotlin_stdlib];
        if (decodeImpl(source, bArr, 0, startIndex, endIndex) == decodeSize$kotlin_stdlib) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize$kotlin_stdlib(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final int decodeSize$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = endIndex - startIndex;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            throw new IllegalArgumentException(h.o("Input should have at least 2 symbols for Base64 decoding, startIndex: ", startIndex, endIndex, ", endIndex: "));
        }
        if (this.isMimeScheme) {
            while (true) {
                if (startIndex >= endIndex) {
                    break;
                }
                int i10 = source[startIndex] & UByte.MAX_VALUE;
                iArr = Base64Kt.base64DecodeMap;
                int i11 = iArr[i10];
                if (i11 < 0) {
                    if (i11 == -2) {
                        i3 -= endIndex - startIndex;
                        break;
                    }
                    i3--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i3 = source[endIndex + (-2)] == 61 ? i3 - 2 : i3 - 1;
        }
        return (int) ((i3 * 6) / 8);
    }

    public final String encode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i3 = startIndex;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i3, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize$kotlin_stdlib(endIndex - i3));
        byte[] bArr = this.isUrlSafe ? Base64Kt.base64UrlEncodeMap : Base64Kt.base64EncodeMap;
        int i10 = this.isMimeScheme ? this.mimeGroupsPerLine : IntCompanionObject.MAX_VALUE;
        int i11 = destinationOffset;
        while (i3 + 2 < endIndex) {
            int min = Math.min((endIndex - i3) / 3, i10);
            for (int i12 = 0; i12 < min; i12++) {
                int i13 = source[i3] & UByte.MAX_VALUE;
                int i14 = i3 + 2;
                int i15 = source[i3 + 1] & UByte.MAX_VALUE;
                i3 += 3;
                int i16 = (i15 << 8) | (i13 << 16) | (source[i14] & UByte.MAX_VALUE);
                destination[i11] = bArr[i16 >>> 18];
                destination[i11 + 1] = bArr[(i16 >>> 12) & 63];
                int i17 = i11 + 3;
                destination[i11 + 2] = bArr[(i16 >>> 6) & 63];
                i11 += 4;
                destination[i17] = bArr[i16 & 63];
            }
            if (min == i10 && i3 != endIndex) {
                int i18 = i11 + 1;
                byte[] bArr2 = mimeLineSeparatorSymbols;
                destination[i11] = bArr2[0];
                i11 += 2;
                destination[i18] = bArr2[1];
            }
        }
        int i19 = endIndex - i3;
        if (i19 == 1) {
            int i20 = i3 + 1;
            int i21 = (source[i3] & UByte.MAX_VALUE) << 4;
            destination[i11] = bArr[i21 >>> 6];
            int i22 = i11 + 2;
            destination[i11 + 1] = bArr[i21 & 63];
            if (shouldPadOnEncode()) {
                int i23 = i11 + 3;
                destination[i22] = padSymbol;
                i11 += 4;
                destination[i23] = padSymbol;
                i3 = i20;
            } else {
                i3 = i20;
                i11 = i22;
            }
        } else if (i19 == 2) {
            int i24 = i3 + 1;
            int i25 = source[i3] & UByte.MAX_VALUE;
            i3 += 2;
            int i26 = ((source[i24] & UByte.MAX_VALUE) << 2) | (i25 << 10);
            destination[i11] = bArr[i26 >>> 12];
            destination[i11 + 1] = bArr[(i26 >>> 6) & 63];
            int i27 = i11 + 3;
            destination[i11 + 2] = bArr[i26 & 63];
            if (shouldPadOnEncode()) {
                i11 += 4;
                destination[i27] = padSymbol;
            } else {
                i11 = i27;
            }
        }
        if (i3 == endIndex) {
            return i11 - destinationOffset;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int encodeSize$kotlin_stdlib(int sourceSize) {
        int i3 = sourceSize / 3;
        int i10 = sourceSize % 3;
        int i11 = i3 * 4;
        if (i10 != 0) {
            i11 += shouldPadOnEncode() ? 4 : i10 + 1;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.isMimeScheme) {
            i11 += ((i11 - 1) / this.mimeLineLength) * 2;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final <A extends Appendable> A encodeToAppendable(byte[] source, A destination, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1));
        return destination;
    }

    public final byte[] encodeToByteArray(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[encodeSize$kotlin_stdlib(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    /* renamed from: getMimeLineLength$kotlin_stdlib, reason: from getter */
    public final int getMimeLineLength() {
        return this.mimeLineLength;
    }

    /* renamed from: getPaddingOption$kotlin_stdlib, reason: from getter */
    public final PaddingOption getPaddingOption() {
        return this.paddingOption;
    }

    /* renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    @SinceKotlin(version = "2.0")
    public final Base64 withPadding(PaddingOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        return this.paddingOption == option ? this : new Base64(this.isUrlSafe, this.isMimeScheme, this.mimeLineLength, option);
    }

    private Base64(boolean z2, boolean z10, int i3, PaddingOption paddingOption) {
        this.isUrlSafe = z2;
        this.isMimeScheme = z10;
        this.mimeLineLength = i3;
        this.paddingOption = paddingOption;
        if (z2 && z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.mimeGroupsPerLine = i3 / 4;
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i3, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = charSequence.length();
        }
        return base64.decode(charSequence, i3, i10);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i3, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i12 & 4) != 0) {
            i3 = 0;
        }
        if ((i12 & 8) != 0) {
            i10 = 0;
        }
        if ((i12 & 16) != 0) {
            i11 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i3, i10, i11);
    }

    public final int decodeIntoByteArray(CharSequence source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            String str = (String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), startIndex, endIndex);
            String substring = str.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, charsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (Object) null);
    }

    public final byte[] decode(CharSequence source, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), startIndex, endIndex);
            String substring = str.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, charsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}

package wc;

import Kc.C0101h;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class m implements InterfaceC1885b {

    /* renamed from: b, reason: collision with root package name */
    public static final m f22411b = new m();

    /* renamed from: c, reason: collision with root package name */
    public static final m f22412c = new m();

    public static final C1891h a(m mVar, String str) {
        C1891h c1891h = new C1891h(str);
        C1891h.f22375d.put(str, c1891h);
        return c1891h;
    }

    public static String b(String str, int i3, int i10, String encodeSet, int i11) {
        boolean contains$default;
        boolean contains$default2;
        int i12 = (i11 & 1) != 0 ? 0 : i3;
        int length = (i11 & 2) != 0 ? str.length() : i10;
        boolean z2 = (i11 & 8) == 0;
        boolean z10 = (i11 & 16) == 0;
        boolean z11 = (i11 & 32) == 0;
        boolean z12 = (i11 & 64) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i13 = i12;
        while (i13 < length) {
            int codePointAt = str.codePointAt(i13);
            int i14 = 32;
            int i15 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z12)) {
                contains$default2 = StringsKt__StringsKt.contains$default(encodeSet, (char) codePointAt, false, 2, (Object) null);
                if (!contains$default2 && ((codePointAt != 37 || (z2 && (!z10 || d(i13, length, str)))) && (codePointAt != 43 || !z11))) {
                    i13 += Character.charCount(codePointAt);
                }
            }
            C0101h c0101h = new C0101h();
            c0101h.V(i12, i13, str);
            C0101h c0101h2 = null;
            while (i13 < length) {
                int codePointAt2 = str.codePointAt(i13);
                if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                    if (codePointAt2 == 43 && z11) {
                        c0101h.W(z2 ? StubApp.getString2(4966) : StubApp.getString2(35567));
                    } else {
                        if (codePointAt2 >= i14 && codePointAt2 != 127 && (codePointAt2 < i15 || z12)) {
                            contains$default = StringsKt__StringsKt.contains$default(encodeSet, (char) codePointAt2, false, 2, (Object) null);
                            if (!contains$default && (codePointAt2 != 37 || (z2 && (!z10 || d(i13, length, str))))) {
                                c0101h.X(codePointAt2);
                            }
                        }
                        if (c0101h2 == null) {
                            c0101h2 = new C0101h();
                        }
                        c0101h2.X(codePointAt2);
                        while (!c0101h2.e()) {
                            byte readByte = c0101h2.readByte();
                            int i16 = readByte & UByte.MAX_VALUE;
                            c0101h.Q(37);
                            char[] cArr = t.j;
                            c0101h.Q(cArr[(i16 >> 4) & 15]);
                            c0101h.Q(cArr[readByte & 15]);
                        }
                    }
                }
                i13 += Character.charCount(codePointAt2);
                i14 = 32;
                i15 = 128;
            }
            return c0101h.K();
        }
        String substring = str.substring(i12, length);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i3, int i10, String str) {
        int i11 = i3 + 2;
        return i11 < i10 && str.charAt(i3) == '%' && xc.b.r(str.charAt(i3 + 1)) != -1 && xc.b.r(str.charAt(i11)) != -1;
    }

    public static String e(int i3, int i10, int i11, String str) {
        int i12;
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z2 = (i11 & 4) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i13 = i3;
        while (i13 < i10) {
            int i14 = i13 + 1;
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z2)) {
                C0101h c0101h = new C0101h();
                c0101h.V(i3, i13, str);
                while (i13 < i10) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt != 37 || (i12 = i13 + 2) >= i10) {
                        if (codePointAt == 43 && z2) {
                            c0101h.Q(32);
                            i13++;
                        }
                        c0101h.X(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        int r8 = xc.b.r(str.charAt(i13 + 1));
                        int r10 = xc.b.r(str.charAt(i12));
                        if (r8 != -1 && r10 != -1) {
                            c0101h.Q((r8 << 4) + r10);
                            i13 = Character.charCount(codePointAt) + i12;
                        }
                        c0101h.X(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return c0101h.K();
            }
            i13 = i14;
        }
        String substring = str.substring(i3, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        int indexOf$default;
        int indexOf$default2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 <= str.length()) {
            indexOf$default = StringsKt__StringsKt.indexOf$default(str, Typography.amp, i3, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i3, false, 4, (Object) null);
            String string2 = StubApp.getString2(25010);
            if (indexOf$default2 == -1 || indexOf$default2 > indexOf$default) {
                String substring = str.substring(i3, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, string2);
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i3, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring2, string2);
                arrayList.add(substring2);
                String substring3 = str.substring(indexOf$default2 + 1, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring3, string2);
                arrayList.add(substring3);
            }
            i3 = indexOf$default + 1;
        }
        return arrayList;
    }

    public synchronized C1891h c(String javaName) {
        C1891h c1891h;
        String str;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = C1891h.f22375d;
            c1891h = (C1891h) linkedHashMap.get(javaName);
            if (c1891h == null) {
                String string2 = StubApp.getString2("35568");
                boolean O7 = StringsKt.O(javaName, string2);
                String string22 = StubApp.getString2("633");
                String string23 = StubApp.getString2("35569");
                if (O7) {
                    String substring = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring, string22);
                    str = Intrinsics.stringPlus(string23, substring);
                } else if (StringsKt.O(javaName, string23)) {
                    String substring2 = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring2, string22);
                    str = Intrinsics.stringPlus(string2, substring2);
                } else {
                    str = javaName;
                }
                c1891h = (C1891h) linkedHashMap.get(str);
                if (c1891h == null) {
                    c1891h = new C1891h(javaName);
                }
                linkedHashMap.put(javaName, c1891h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1891h;
    }
}

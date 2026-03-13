package Dc;

import Kc.C0104k;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0104k f1583a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1584b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1585c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1586d;

    static {
        String replace$default;
        C0104k c0104k = C0104k.f3820d;
        f1583a = u5.d.r(StubApp.getString2(25141));
        f1584b = new String[]{StubApp.getString2(25143), StubApp.getString2(25144), StubApp.getString2(25145), StubApp.getString2(25146), StubApp.getString2(25147), StubApp.getString2(25148), StubApp.getString2(13570), StubApp.getString2(25142), StubApp.getString2(25149), StubApp.getString2(13568)};
        f1585c = new String[64];
        String[] strArr = new String[256];
        int i3 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(it)");
            replace$default = StringsKt__StringsJVMKt.replace$default(xc.b.i(StubApp.getString2(25150), binaryString), ' ', '0', false, 4, (Object) null);
            strArr[i10] = replace$default;
        }
        f1586d = strArr;
        String[] strArr2 = f1585c;
        strArr2[0] = "";
        strArr2[1] = StubApp.getString2(25151);
        int[] iArr = {1};
        strArr2[8] = StubApp.getString2(25152);
        int i11 = iArr[0];
        strArr2[i11 | 8] = Intrinsics.stringPlus(strArr2[i11], "|PADDED");
        strArr2[4] = StubApp.getString2(25153);
        strArr2[32] = StubApp.getString2(25145);
        strArr2[36] = StubApp.getString2(25154);
        int[] iArr2 = {4, 32, 36};
        int i12 = 0;
        while (i12 < 3) {
            int i13 = iArr2[i12];
            i12++;
            int i14 = iArr[0];
            String[] strArr3 = f1585c;
            int i15 = i14 | i13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) strArr3[i14]);
            sb2.append('|');
            sb2.append((Object) strArr3[i13]);
            strArr3[i15] = sb2.toString();
            strArr3[i15 | 8] = ((Object) strArr3[i14]) + '|' + ((Object) strArr3[i13]) + "|PADDED";
        }
        int length = f1585c.length;
        while (i3 < length) {
            int i16 = i3 + 1;
            String[] strArr4 = f1585c;
            if (strArr4[i3] == null) {
                strArr4[i3] = f1586d[i3];
            }
            i3 = i16;
        }
    }

    public static String a(int i3, int i10, int i11, boolean z2, int i12) {
        String str;
        String str2;
        String[] strArr = f1584b;
        String i13 = i11 < strArr.length ? strArr[i11] : xc.b.i(StubApp.getString2(25155), Integer.valueOf(i11));
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr2 = f1586d;
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4 || i11 == 6) {
                    str = i12 == 1 ? StubApp.getString2(25157) : strArr2[i12];
                } else if (i11 != 7 && i11 != 8) {
                    String[] strArr3 = f1585c;
                    if (i12 < strArr3.length) {
                        str2 = strArr3[i12];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = strArr2[i12];
                    }
                    str = (i11 != 5 || (i12 & 4) == 0) ? (i11 != 0 || (i12 & 32) == 0) ? str2 : StringsKt__StringsJVMKt.replace$default(str2, StubApp.getString2(25145), StubApp.getString2(25156), false, 4, (Object) null) : StringsKt__StringsJVMKt.replace$default(str2, StubApp.getString2(25144), StubApp.getString2(25148), false, 4, (Object) null);
                }
            }
            str = strArr2[i12];
        }
        return xc.b.i(StubApp.getString2(25158), z2 ? StubApp.getString2(25069) : StubApp.getString2(8602), Integer.valueOf(i3), Integer.valueOf(i10), i13, str);
    }
}

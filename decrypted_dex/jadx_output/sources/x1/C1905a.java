package x1;

import M4.G;
import M4.I;
import M4.Z;
import Xa.h;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.UByte;
import p0.AbstractC1482f;
import q0.C1504b;
import q1.C1505a;
import q1.k;
import q1.l;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.InterfaceC1542c;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1905a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f22831a = new C1553n();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22834d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22835e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22836f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22837g;

    public C1905a(List list) {
        int size = list.size();
        String string2 = StubApp.getString2(1999);
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f22833c = 0;
            this.f22834d = -1;
            this.f22835e = string2;
            this.f22832b = false;
            this.f22836f = 0.85f;
            this.f22837g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f22833c = bArr[24];
        this.f22834d = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
        this.f22835e = StubApp.getString2(24147).equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? StubApp.getString2(13911) : string2;
        int i3 = bArr[25] * 20;
        this.f22837g = i3;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f22832b = z2;
        if (z2) {
            this.f22836f = AbstractC1560u.h(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i3, 0.0f, 0.95f);
        } else {
            this.f22836f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i3, int i10, int i11, int i12, int i13) {
        if (i3 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i3 >>> 8) | ((i3 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i3, int i10, int i11, int i12, int i13) {
        if (i3 != i10) {
            int i14 = i13 | 33;
            boolean z2 = (i3 & 1) != 0;
            boolean z10 = (i3 & 2) != 0;
            if (z2) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            boolean z11 = (i3 & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z2 || z10) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q1.l
    public final void n(byte[] bArr, int i3, int i10, k kVar, InterfaceC1542c interfaceC1542c) {
        String s10;
        int i11;
        int i12;
        int i13;
        int i14 = 1;
        C1553n c1553n = this.f22831a;
        c1553n.E(i3 + i10, bArr);
        c1553n.G(i3);
        int i15 = 2;
        int i16 = 0;
        AbstractC1550k.c(c1553n.a() >= 2);
        int A4 = c1553n.A();
        if (A4 == 0) {
            s10 = "";
        } else {
            int i17 = c1553n.f20177b;
            Charset C10 = c1553n.C();
            int i18 = A4 - (c1553n.f20177b - i17);
            if (C10 == null) {
                C10 = StandardCharsets.UTF_8;
            }
            s10 = c1553n.s(i18, C10);
        }
        if (s10.isEmpty()) {
            G g10 = I.f4549b;
            interfaceC1542c.accept(new C1505a(Z.f4578e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s10);
        b(spannableStringBuilder, this.f22833c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f22834d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String string2 = StubApp.getString2(1999);
        String str = this.f22835e;
        if (str != string2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.f22836f;
        while (c1553n.a() >= 8) {
            int i19 = c1553n.f20177b;
            int h2 = c1553n.h();
            int h4 = c1553n.h();
            if (h4 == 1937013100) {
                AbstractC1550k.c(c1553n.a() >= i15 ? i14 : i16);
                int A5 = c1553n.A();
                int i20 = i16;
                while (i20 < A5) {
                    AbstractC1550k.c(c1553n.a() >= 12 ? i14 : i16);
                    int A7 = c1553n.A();
                    int A10 = c1553n.A();
                    c1553n.H(i15);
                    int i21 = i20;
                    int u2 = c1553n.u();
                    c1553n.H(i14);
                    int h5 = c1553n.h();
                    int length2 = spannableStringBuilder.length();
                    int i22 = i14;
                    String string22 = StubApp.getString2(1920);
                    String string23 = StubApp.getString2(24148);
                    if (A10 > length2) {
                        StringBuilder u10 = h.u(A10, StubApp.getString2(24149), StubApp.getString2(24150));
                        u10.append(spannableStringBuilder.length());
                        u10.append(string22);
                        AbstractC1550k.w(string23, u10.toString());
                        A10 = spannableStringBuilder.length();
                    }
                    if (A7 >= A10) {
                        AbstractC1550k.w(string23, AbstractC1482f.e(A7, StubApp.getString2(24151), A10, StubApp.getString2(24152), string22));
                        i13 = i21;
                    } else {
                        i13 = i21;
                        int i23 = A10;
                        b(spannableStringBuilder, u2, this.f22833c, A7, i23, 0);
                        a(spannableStringBuilder, h5, this.f22834d, A7, i23, 0);
                    }
                    i20 = i13 + 1;
                    i14 = i22;
                    i15 = 2;
                    i16 = 0;
                }
                i11 = i14;
                i12 = i15;
            } else {
                i11 = i14;
                if (h4 == 1952608120 && this.f22832b) {
                    i12 = 2;
                    AbstractC1550k.c(c1553n.a() >= 2 ? i11 : 0);
                    f10 = AbstractC1560u.h(c1553n.A() / this.f22837g, 0.0f, 0.95f);
                } else {
                    i12 = 2;
                }
            }
            c1553n.G(i19 + h2);
            i15 = i12;
            i16 = 0;
            i14 = i11;
        }
        interfaceC1542c.accept(new C1505a(I.q(new C1504b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // q1.l
    public final int p() {
        return 2;
    }
}

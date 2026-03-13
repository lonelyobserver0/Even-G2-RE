package r1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import q0.C1504b;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1562b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20208a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20209b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f20210c;

    /* renamed from: d, reason: collision with root package name */
    public int f20211d;

    /* renamed from: e, reason: collision with root package name */
    public int f20212e;

    /* renamed from: f, reason: collision with root package name */
    public int f20213f;

    /* renamed from: g, reason: collision with root package name */
    public int f20214g;

    /* renamed from: h, reason: collision with root package name */
    public int f20215h;

    public C1562b(int i3, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f20208a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f20209b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f20210c = sb2;
        this.f20214g = i3;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f20211d = 15;
        this.f20212e = 0;
        this.f20213f = 0;
        this.f20215h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f20210c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f20210c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f20208a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1561a c1561a = (C1561a) arrayList.get(size);
                int i3 = c1561a.f20207c;
                if (i3 != length) {
                    return;
                }
                c1561a.f20207c = i3 - 1;
            }
        }
    }

    public final C1504b c(int i3) {
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f20209b;
            if (i10 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
            spannableStringBuilder.append('\n');
            i10++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i11 = this.f20212e + this.f20213f;
        int length = (32 - i11) - spannableStringBuilder.length();
        int i12 = i11 - length;
        int i13 = i3 != Integer.MIN_VALUE ? i3 : (this.f20214g != 2 || (Math.abs(i12) >= 3 && length >= 0)) ? (this.f20214g != 2 || i12 <= 0) ? 0 : 2 : 1;
        if (i13 != 1) {
            if (i13 == 2) {
                i11 = 32 - length;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i14 = this.f20211d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f20214g == 1) {
            i14 -= this.f20215h - 1;
        }
        return new C1504b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f11, i13, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f20210c);
        int length = spannableStringBuilder.length();
        int i3 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f20208a;
            if (i13 >= arrayList.size()) {
                break;
            }
            C1561a c1561a = (C1561a) arrayList.get(i13);
            boolean z10 = c1561a.f20206b;
            int i15 = c1561a.f20205a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.f20217B[i15];
                }
                z2 = z11;
            }
            int i16 = c1561a.f20207c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((C1561a) arrayList.get(i13)).f20207c : length)) {
                if (i3 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i16, 33);
                    i3 = -1;
                } else if (i3 == -1 && z10) {
                    i3 = i16;
                }
                if (i10 != -1 && !z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z2) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f20208a.isEmpty() && this.f20209b.isEmpty() && this.f20210c.length() == 0;
    }
}

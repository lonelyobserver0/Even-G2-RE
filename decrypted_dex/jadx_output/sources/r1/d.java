package r1;

import H0.C0067j;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import q0.C1504b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0067j f20241c = new C0067j(16);

    /* renamed from: a, reason: collision with root package name */
    public final C1504b f20242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20243b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i3, float f11, int i10, boolean z2, int i11, int i12) {
        boolean z10;
        int i13;
        if (z2) {
            z10 = true;
            i13 = i11;
        } else {
            z10 = false;
            i13 = -16777216;
        }
        this.f20242a = new C1504b(spannableStringBuilder, alignment, null, null, f10, 0, i3, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z10, i13, Integer.MIN_VALUE, 0.0f);
        this.f20243b = i12;
    }
}

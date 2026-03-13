package C;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0030g {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f834a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f835b;

    /* renamed from: c, reason: collision with root package name */
    public final M[] f836c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f837d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f838e;

    /* renamed from: f, reason: collision with root package name */
    public final int f839f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f840g;

    /* renamed from: h, reason: collision with root package name */
    public final int f841h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f842i;
    public final PendingIntent j;

    public C0030g(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, M[] mArr, M[] mArr2, boolean z2, int i3, boolean z10, boolean z11) {
        this.f838e = true;
        this.f835b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f9662a;
            if ((i10 == -1 ? ((Icon) iconCompat.f9663b).getType() : i10) == 2) {
                this.f841h = iconCompat.f();
            }
        }
        this.f842i = C0036m.c(charSequence);
        this.j = pendingIntent;
        this.f834a = bundle == null ? new Bundle() : bundle;
        this.f836c = mArr;
        this.f837d = z2;
        this.f839f = i3;
        this.f838e = z10;
        this.f840g = z11;
    }

    public final IconCompat a() {
        int i3;
        if (this.f835b == null && (i3 = this.f841h) != 0) {
            this.f835b = IconCompat.e(null, "", i3);
        }
        return this.f835b;
    }
}

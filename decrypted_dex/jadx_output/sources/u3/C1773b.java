package u3;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1773b {

    /* renamed from: a, reason: collision with root package name */
    public final int f21433a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f21434b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f21435c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21436d;

    /* renamed from: e, reason: collision with root package name */
    public int f21437e;

    public C1773b(int i3, Bitmap bitmap, RectF rectF, boolean z2, int i10) {
        this.f21433a = i3;
        this.f21434b = bitmap;
        this.f21435c = rectF;
        this.f21436d = z2;
        this.f21437e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1773b)) {
            return false;
        }
        C1773b c1773b = (C1773b) obj;
        if (c1773b.f21433a == this.f21433a) {
            RectF rectF = c1773b.f21435c;
            float f10 = rectF.left;
            RectF rectF2 = this.f21435c;
            if (f10 == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom) {
                return true;
            }
        }
        return false;
    }
}

package x3;

import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1907a f22842a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f22843b;

    /* renamed from: c, reason: collision with root package name */
    public final SizeF f22844c;

    /* renamed from: d, reason: collision with root package name */
    public final SizeF f22845d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22846e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22848g;

    public b(EnumC1907a enumC1907a, Size size, Size size2, Size size3, boolean z2) {
        this.f22842a = enumC1907a;
        this.f22843b = size3;
        this.f22848g = z2;
        int ordinal = enumC1907a.ordinal();
        int i3 = size3.f12763b;
        if (ordinal == 1) {
            SizeF b2 = b(size2, i3);
            this.f22845d = b2;
            float f10 = b2.f12765b / size2.f12763b;
            this.f22847f = f10;
            this.f22844c = b(size, size.f12763b * f10);
            return;
        }
        int i10 = size3.f12762a;
        if (ordinal != 2) {
            SizeF c10 = c(size, i10);
            this.f22844c = c10;
            float f11 = c10.f12764a / size.f12762a;
            this.f22846e = f11;
            this.f22845d = c(size2, size2.f12762a * f11);
            return;
        }
        float f12 = i3;
        SizeF a3 = a(size, i10, f12);
        float f13 = size.f12762a;
        SizeF a9 = a(size2, size2.f12762a * (a3.f12764a / f13), f12);
        this.f22845d = a9;
        float f14 = a9.f12765b / size2.f12763b;
        this.f22847f = f14;
        SizeF a10 = a(size, i10, size.f12763b * f14);
        this.f22844c = a10;
        this.f22846e = a10.f12764a / f13;
    }

    public static SizeF a(Size size, float f10, float f11) {
        float f12 = size.f12762a / size.f12763b;
        float floor = (float) Math.floor(f10 / f12);
        if (floor > f11) {
            f10 = (float) Math.floor(f12 * f11);
        } else {
            f11 = floor;
        }
        return new SizeF(f10, f11);
    }

    public static SizeF b(Size size, float f10) {
        return new SizeF((float) Math.floor(f10 / (size.f12763b / size.f12762a)), f10);
    }

    public static SizeF c(Size size, float f10) {
        return new SizeF(f10, (float) Math.floor(f10 / (size.f12762a / size.f12763b)));
    }
}

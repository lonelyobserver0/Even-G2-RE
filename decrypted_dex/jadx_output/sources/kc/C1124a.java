package kc;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.BarcodeView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C1124a extends BarcodeView {

    /* renamed from: K, reason: collision with root package name */
    public int f15562K;

    @Override // m6.e
    public final Rect b(Rect container, Rect surface) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Rect rect = new Rect(container);
        rect.intersect(surface);
        Rect b2 = super.b(container, surface);
        if (this.f15562K != -1) {
            Rect rect2 = new Rect(b2);
            int i3 = rect2.bottom;
            int i10 = this.f15562K;
            rect2.bottom = i3 - i10;
            rect2.top -= i10;
            if (rect2.intersect(rect)) {
                return rect2;
            }
        }
        Intrinsics.checkNotNull(b2);
        return b2;
    }
}

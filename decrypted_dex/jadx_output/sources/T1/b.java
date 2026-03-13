package T1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public Rect f7088a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f7088a);
        return new PointF(r0.left, r0.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f7088a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}

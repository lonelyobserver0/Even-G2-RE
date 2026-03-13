package I4;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f3130a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3131b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3130a;
            f10 += ((b) cVar).f3131b;
        }
        this.f3130a = cVar;
        this.f3131b = f10;
    }

    @Override // I4.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f3130a.a(rectF) + this.f3131b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3130a.equals(bVar.f3130a) && this.f3131b == bVar.f3131b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3130a, Float.valueOf(this.f3131b)});
    }
}

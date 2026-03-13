package I4;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3171a;

    public h(float f10) {
        this.f3171a = f10;
    }

    @Override // I4.c
    public final float a(RectF rectF) {
        return rectF.height() * this.f3171a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f3171a == ((h) obj).f3171a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3171a)});
    }
}

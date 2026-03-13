package I4;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f3129a;

    public a(float f10) {
        this.f3129a = f10;
    }

    @Override // I4.c
    public final float a(RectF rectF) {
        return this.f3129a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3129a == ((a) obj).f3129a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3129a)});
    }
}

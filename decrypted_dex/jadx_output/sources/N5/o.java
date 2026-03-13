package N5;

import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f4926a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4927b;

    public o(float f10, float f11) {
        this.f4926a = f10;
        this.f4927b = f11;
    }

    public static float a(o oVar, o oVar2) {
        return AbstractC0624h2.f(oVar.f4926a, oVar.f4927b, oVar2.f4926a, oVar2.f4927b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f4926a == oVar.f4926a && this.f4927b == oVar.f4927b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4927b) + (Float.floatToIntBits(this.f4926a) * 31);
    }

    public final String toString() {
        return StubApp.getString2(2830) + this.f4926a + ',' + this.f4927b + ')';
    }
}

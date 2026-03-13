package n6;

import android.graphics.Rect;
import android.util.Log;
import com.stub.StubApp;
import m6.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17848a;

    @Override // n6.l
    public final float a(q qVar, q qVar2) {
        int i3;
        switch (this.f17848a) {
            case 0:
                if (qVar.f17120a <= 0 || qVar.f17121b <= 0) {
                    return 0.0f;
                }
                q a3 = qVar.a(qVar2);
                float f10 = a3.f17120a * 1.0f;
                float f11 = f10 / qVar.f17120a;
                if (f11 > 1.0f) {
                    f11 = (float) Math.pow(1.0f / f11, 1.1d);
                }
                float f12 = ((a3.f17121b * 1.0f) / qVar2.f17121b) + (f10 / qVar2.f17120a);
                return ((1.0f / f12) / f12) * f11;
            case 1:
                if (qVar.f17120a <= 0 || qVar.f17121b <= 0) {
                    return 0.0f;
                }
                float f13 = qVar.b(qVar2).f17120a;
                float f14 = (f13 * 1.0f) / qVar.f17120a;
                if (f14 > 1.0f) {
                    f14 = (float) Math.pow(1.0f / f14, 1.1d);
                }
                float f15 = ((qVar2.f17121b * 1.0f) / r0.f17121b) * ((qVar2.f17120a * 1.0f) / f13);
                return (((1.0f / f15) / f15) / f15) * f14;
            default:
                int i10 = qVar.f17120a;
                if (i10 <= 0 || (i3 = qVar.f17121b) <= 0) {
                    return 0.0f;
                }
                int i11 = qVar2.f17120a;
                float f16 = (i10 * 1.0f) / i11;
                if (f16 < 1.0f) {
                    f16 = 1.0f / f16;
                }
                float f17 = i3;
                float f18 = qVar2.f17121b;
                float f19 = (f17 * 1.0f) / f18;
                if (f19 < 1.0f) {
                    f19 = 1.0f / f19;
                }
                float f20 = (1.0f / f16) / f19;
                float f21 = ((i10 * 1.0f) / f17) / ((i11 * 1.0f) / f18);
                if (f21 < 1.0f) {
                    f21 = 1.0f / f21;
                }
                return (((1.0f / f21) / f21) / f21) * f20;
        }
    }

    @Override // n6.l
    public final Rect b(q qVar, q qVar2) {
        String string2 = StubApp.getString2(4934);
        String string22 = StubApp.getString2(21441);
        String string23 = StubApp.getString2(21442);
        String string24 = StubApp.getString2(21443);
        switch (this.f17848a) {
            case 0:
                q a3 = qVar.a(qVar2);
                Log.i(string2, string24 + qVar + string23 + a3 + string22 + qVar2);
                int i3 = qVar2.f17120a;
                int i10 = a3.f17120a;
                int i11 = (i10 - i3) / 2;
                int i12 = qVar2.f17121b;
                int i13 = a3.f17121b;
                int i14 = (i13 - i12) / 2;
                return new Rect(-i11, -i14, i10 - i11, i13 - i14);
            case 1:
                q b2 = qVar.b(qVar2);
                Log.i(string2, string24 + qVar + string23 + b2 + string22 + qVar2);
                int i15 = qVar2.f17120a;
                int i16 = b2.f17120a;
                int i17 = (i16 - i15) / 2;
                int i18 = qVar2.f17121b;
                int i19 = b2.f17121b;
                int i20 = (i19 - i18) / 2;
                return new Rect(-i17, -i20, i16 - i17, i19 - i20);
            default:
                return new Rect(0, 0, qVar2.f17120a, qVar2.f17121b);
        }
    }
}

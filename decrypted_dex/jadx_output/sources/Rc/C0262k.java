package Rc;

import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;

/* renamed from: Rc.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0262k extends F1 {

    /* renamed from: e, reason: collision with root package name */
    public final int f6402e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6403f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6404g = false;

    public C0262k(int i3, int i10) {
        this.f6403f = i10;
        this.f6402e = i3;
    }

    @Override // com.google.android.gms.internal.measurement.F1
    public final Object s(String str, Qc.c cVar, Qc.g gVar, boolean z2) {
        String string2 = StubApp.getString2(25592);
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= this.f6402e && parseInt <= this.f6403f && (!this.f6404g || parseInt != 0)) {
                return Integer.valueOf(parseInt);
            }
            throw new C0260i(string2 + parseInt);
        } catch (NumberFormatException unused) {
            throw new C0260i(E1.a.j(StubApp.getString2(25593), str));
        }
    }
}

package k0;

import androidx.lifecycle.S;
import com.mapbox.common.b;
import d0.O;
import t.C1698k;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1102a extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final O f15420c = new O(1);

    /* renamed from: b, reason: collision with root package name */
    public final C1698k f15421b = new C1698k();

    @Override // androidx.lifecycle.S
    public final void b() {
        C1698k c1698k = this.f15421b;
        int i3 = c1698k.f21043c;
        if (i3 > 0) {
            throw b.d(c1698k.f21042b[0]);
        }
        Object[] objArr = c1698k.f21042b;
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = null;
        }
        c1698k.f21043c = 0;
    }
}

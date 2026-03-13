package U4;

import F5.c;
import M4.M;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.HashSet;
import java.util.Objects;
import l4.A0;
import l4.B0;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements B0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7458a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7459b;

    public b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f7459b = cVar;
    }

    @Override // l4.B0
    public final void a(long j, Bundle bundle, String str, String str2) {
        Object obj = this.f7459b;
        switch (this.f7458a) {
            case 0:
                E0 e02 = (E0) obj;
                if (((HashSet) e02.f16037b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    M m4 = a.f7454a;
                    String g10 = A0.g(A0.f15901c, str2, A0.f15899a);
                    if (g10 != null) {
                        str2 = g10;
                    }
                    bundle2.putString(StubApp.getString2(973), str2);
                    ((V6.b) e02.f16038c).M(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f7454a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), str2);
                    bundle3.putLong(StubApp.getString2(6367), j);
                    bundle3.putBundle(StubApp.getString2(6368), bundle);
                    ((V6.b) ((c) obj).f2238b).M(3, bundle3);
                    break;
                }
                break;
        }
    }

    public b(E0 e02) {
        Objects.requireNonNull(e02);
        this.f7459b = e02;
    }
}

package hb;

import com.google.android.gms.internal.measurement.C0597c0;
import com.google.android.gms.internal.measurement.C0607e0;
import com.google.android.gms.internal.measurement.C0657o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import q4.k;
import q4.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f14490c;

    public /* synthetic */ g(i iVar, k kVar) {
        this.f14488a = 2;
        this.f14490c = iVar;
        this.f14489b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s l9;
        s l10;
        switch (this.f14488a) {
            case 0:
                k kVar = this.f14489b;
                try {
                    FirebaseAnalytics firebaseAnalytics = this.f14490c.f14495a;
                    if (firebaseAnalytics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics = null;
                    }
                    firebaseAnalytics.getClass();
                    try {
                        l9 = a4.f.e(firebaseAnalytics.b(), new S4.d(firebaseAnalytics, 1));
                    } catch (RuntimeException e10) {
                        C0657o0 c0657o0 = firebaseAnalytics.f12042a;
                        String string2 = StubApp.getString2("18330");
                        c0657o0.getClass();
                        c0657o0.a(new C0607e0(c0657o0, string2, (Exception) null));
                        l9 = a4.f.l(e10);
                    }
                    kVar.b(a4.f.b(l9));
                    break;
                } catch (Exception e11) {
                    kVar.a(e11);
                    return;
                }
            case 1:
                k kVar2 = this.f14489b;
                try {
                    FirebaseAnalytics firebaseAnalytics2 = this.f14490c.f14495a;
                    if (firebaseAnalytics2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics2 = null;
                    }
                    firebaseAnalytics2.getClass();
                    try {
                        l10 = a4.f.e(firebaseAnalytics2.b(), new S4.d(firebaseAnalytics2, 0));
                    } catch (RuntimeException e12) {
                        C0657o0 c0657o02 = firebaseAnalytics2.f12042a;
                        String string22 = StubApp.getString2("18329");
                        c0657o02.getClass();
                        c0657o02.a(new C0607e0(c0657o02, string22, (Exception) null));
                        l10 = a4.f.l(e12);
                    }
                    kVar2.b(a4.f.b(l10));
                    break;
                } catch (Exception e13) {
                    kVar2.a(e13);
                    return;
                }
            default:
                i iVar = this.f14490c;
                k kVar3 = this.f14489b;
                try {
                    FirebaseAnalytics firebaseAnalytics3 = iVar.f14495a;
                    if (firebaseAnalytics3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("analytics");
                        firebaseAnalytics3 = null;
                    }
                    C0657o0 c0657o03 = firebaseAnalytics3.f12042a;
                    c0657o03.getClass();
                    c0657o03.a(new C0597c0(c0657o03));
                    kVar3.b(null);
                    break;
                } catch (Exception e14) {
                    kVar3.a(e14);
                }
        }
    }

    public /* synthetic */ g(k kVar, i iVar, int i3) {
        this.f14488a = i3;
        this.f14489b = kVar;
        this.f14490c = iVar;
    }
}

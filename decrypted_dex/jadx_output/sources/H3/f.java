package H3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B3.j f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f2717d;

    public /* synthetic */ f(i iVar, B3.j jVar, int i3, Runnable runnable) {
        this.f2714a = iVar;
        this.f2715b = jVar;
        this.f2716c = i3;
        this.f2717d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B3.j jVar = this.f2715b;
        int i3 = this.f2716c;
        Runnable runnable = this.f2717d;
        i iVar = this.f2714a;
        J3.c cVar = iVar.f2729f;
        try {
            try {
                I3.d dVar = iVar.f2726c;
                Objects.requireNonNull(dVar);
                ((I3.h) cVar).p(new C2.d(dVar, 13));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar.f2724a.getSystemService(StubApp.getString2("1008"))).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((I3.h) cVar).p(new g(iVar, jVar, i3));
                } else {
                    iVar.a(jVar, i3);
                }
                runnable.run();
            } catch (J3.a unused) {
                iVar.f2727d.a(jVar, i3 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}

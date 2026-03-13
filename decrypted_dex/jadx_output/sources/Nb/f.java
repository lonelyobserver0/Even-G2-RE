package Nb;

import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4987a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4988b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4989c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4990d;

    public f(Gb.c cVar, d dVar) {
        this.f4987a = 0;
        this.f4990d = cVar;
        this.f4989c = dVar;
        this.f4988b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4987a) {
            case 0:
                d dVar = (d) this.f4989c;
                try {
                    dVar.call();
                    break;
                } catch (Db.a e10) {
                    boolean z2 = this.f4988b;
                    D5.u uVar = dVar.f4984a;
                    if (!z2) {
                        E0 e02 = (E0) uVar.f1460d;
                        ((Mb.a) e02.f16037b).i((Cb.l) e02.f16038c, e10);
                        return;
                    }
                    Gb.c cVar = (Gb.c) this.f4990d;
                    int i3 = cVar.f21911c;
                    int i10 = e10.f1530a;
                    if (i3 == i10) {
                        i10--;
                    }
                    if (!cVar.c(i10)) {
                        E0 e03 = (E0) uVar.f1460d;
                        ((Mb.a) e03.f16037b).i((Cb.l) e03.f16038c, e10);
                        return;
                    } else {
                        uVar.f1457a = 0;
                        this.f4988b = false;
                        run();
                        return;
                    }
                }
            default:
                if (!this.f4988b) {
                    ((C0446v) this.f4989c).e((EnumC0438m) this.f4990d);
                    this.f4988b = true;
                    break;
                }
                break;
        }
    }

    public f(C0446v registry, EnumC0438m event) {
        this.f4987a = 1;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4989c = registry;
        this.f4990d = event;
    }
}

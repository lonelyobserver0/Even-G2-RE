package Q2;

import P1.k;
import com.even.even_core.utils.room.EvDatabase_Impl;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f5708b;

    public f(g gVar, int i3) {
        this.f5708b = gVar;
        this.f5707a = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        g gVar = this.f5708b;
        EvDatabase_Impl evDatabase_Impl = (EvDatabase_Impl) gVar.f5711b;
        e eVar = (e) gVar.f5713d;
        k a3 = eVar.a();
        a3.m(1, this.f5707a);
        try {
            evDatabase_Impl.c();
            try {
                a3.d();
                evDatabase_Impl.n();
                return Unit.INSTANCE;
            } finally {
                evDatabase_Impl.j();
            }
        } finally {
            eVar.d(a3);
        }
    }
}

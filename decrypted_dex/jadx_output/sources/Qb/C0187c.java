package Qb;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.Volatile;

/* renamed from: Qb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0187c extends AbstractC0229x0 {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5851h = AtomicReferenceFieldUpdater.newUpdater(C0187c.class, Object.class, StubApp.getString2(25497));

    @Volatile
    private volatile Object _disposer;

    /* renamed from: e, reason: collision with root package name */
    public final C0203k f5852e;

    /* renamed from: f, reason: collision with root package name */
    public Y f5853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0191e f5854g;

    public C0187c(C0191e c0191e, C0203k c0203k) {
        this.f5854g = c0191e;
        this.f5852e = c0203k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // Qb.AbstractC0229x0
    public final void j(Throwable th) {
        C0203k c0203k = this.f5852e;
        if (th != null) {
            c0203k.getClass();
            F5.c E10 = c0203k.E(new C0220t(th, false), null);
            if (E10 != null) {
                c0203k.l(E10);
                C0189d c0189d = (C0189d) f5851h.get(this);
                if (c0189d != null) {
                    c0189d.c();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0191e.f5859b;
        C0191e c0191e = this.f5854g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0191e) == 0) {
            O[] oArr = c0191e.f5860a;
            ArrayList arrayList = new ArrayList(oArr.length);
            for (O o5 : oArr) {
                arrayList.add(o5.e());
            }
            c0203k.resumeWith(Result.m40constructorimpl(arrayList));
        }
    }
}

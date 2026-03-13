package X4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f8385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8388f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j, long j3, TimeUnit timeUnit, int i3) {
        this.f8383a = i3;
        this.f8384b = fVar;
        this.f8385c = runnable;
        this.f8386d = j;
        this.f8387e = j3;
        this.f8388f = timeUnit;
    }

    @Override // X4.g
    public final ScheduledFuture a(A0.c cVar) {
        switch (this.f8383a) {
            case 0:
                f fVar = this.f8384b;
                return fVar.f8397b.scheduleAtFixedRate(new d(fVar, this.f8385c, cVar, 0), this.f8386d, this.f8387e, this.f8388f);
            default:
                f fVar2 = this.f8384b;
                return fVar2.f8397b.scheduleWithFixedDelay(new d(fVar2, this.f8385c, cVar, 2), this.f8386d, this.f8387e, this.f8388f);
        }
    }
}

package R4;

import Qb.C0206l0;
import W4.q;
import W4.s;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements W4.e {

    /* renamed from: b, reason: collision with root package name */
    public static final c f6178b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f6179c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f6180d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f6181e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f6182f = new c(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6183a;

    public /* synthetic */ c(int i3) {
        this.f6183a = i3;
    }

    @Override // W4.e
    public Object h(s sVar) {
        switch (this.f6183a) {
            case 1:
                Object e10 = sVar.e(new q(V4.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e10);
            case 2:
                Object e11 = sVar.e(new q(V4.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e11);
            case 3:
                Object e12 = sVar.e(new q(V4.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e12);
            default:
                Object e13 = sVar.e(new q(V4.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e13);
        }
    }
}

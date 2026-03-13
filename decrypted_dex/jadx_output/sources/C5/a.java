package C5;

import Qb.C0206l0;
import V4.b;
import V4.c;
import V4.d;
import W4.e;
import W4.q;
import W4.s;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1120b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1121c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f1122d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f1123e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1124a;

    public /* synthetic */ a(int i3) {
        this.f1124a = i3;
    }

    @Override // W4.e
    public final Object h(s sVar) {
        switch (this.f1124a) {
            case 0:
                Object e10 = sVar.e(new q(V4.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e10);
            case 1:
                Object e11 = sVar.e(new q(c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e11);
            case 2:
                Object e12 = sVar.e(new q(b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e12);
            default:
                Object e13 = sVar.e(new q(d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0206l0((Executor) e13);
        }
    }
}

package kc;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: kc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class C1126c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1128e f15564b;

    public /* synthetic */ C1126c(C1128e c1128e, int i3) {
        this.f15563a = i3;
        this.f15564b = c1128e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1124a c1124a;
        C1124a c1124a2;
        switch (this.f15563a) {
            case 0:
                C1128e c1128e = this.f15564b;
                if (!c1128e.f15573g && c1128e.c() && (c1124a = c1128e.f15574h) != null) {
                    c1124a.i();
                }
                break;
            default:
                C1128e c1128e2 = this.f15564b;
                if (!c1128e2.c()) {
                    c1128e2.b();
                } else if (!c1128e2.f15573g && c1128e2.c() && (c1124a2 = c1128e2.f15574h) != null) {
                    c1124a2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

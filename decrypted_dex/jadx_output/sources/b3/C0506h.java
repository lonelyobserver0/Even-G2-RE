package b3;

import com.stub.StubApp;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0506h implements l7.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10627b;

    public /* synthetic */ C0506h(Object obj, int i3) {
        this.f10626a = i3;
        this.f10627b = obj;
    }

    @Override // l7.x
    public final void a(double d8) {
        switch (this.f10626a) {
            case 0:
                ((X2.w) ((C0498N) this.f10627b).f10571d.f2238b).f8338k = Double.valueOf(d8);
                break;
            default:
                String string2 = StubApp.getString2(392);
                l7.r rVar = (l7.r) this.f10627b;
                Intrinsics.checkNotNullParameter(rVar, string2);
                rVar.f16792f = Double.valueOf(d8);
                Iterator it = rVar.f16794h.iterator();
                while (it.hasNext()) {
                    ((l7.x) it.next()).a(d8);
                }
                break;
        }
    }
}

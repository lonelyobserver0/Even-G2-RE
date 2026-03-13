package T;

import com.stub.StubApp;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: T.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0299o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0299o(Q q10, int i3) {
        super(0);
        this.f6888a = i3;
        this.f6889b = q10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6888a) {
            case 0:
                return ((V.h) this.f6889b.j.getValue()).f7663c;
            default:
                V.e eVar = this.f6889b.f6798a;
                String string2 = StubApp.getString2(6089);
                String s10 = ((Kc.y) eVar.f7647d.getValue()).f3859a.s();
                synchronized (V.e.f7643f) {
                    LinkedHashSet linkedHashSet = V.e.f7642e;
                    if (linkedHashSet.contains(s10)) {
                        throw new IllegalStateException((string2 + s10 + StubApp.getString2("6090")).toString());
                    }
                    linkedHashSet.add(s10);
                }
                return new V.h(eVar.f7644a, (Kc.y) eVar.f7647d.getValue(), (d0) eVar.f7645b.invoke((Kc.y) eVar.f7647d.getValue(), eVar.f7644a), new V.d(eVar, 1));
        }
    }
}

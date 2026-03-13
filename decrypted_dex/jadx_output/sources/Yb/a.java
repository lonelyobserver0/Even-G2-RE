package Yb;

import Qb.Y;
import Vb.v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Sb.e f8895a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f8896b;

    /* renamed from: c, reason: collision with root package name */
    public final Function3 f8897c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f8898d;

    /* renamed from: e, reason: collision with root package name */
    public v f8899e;

    /* renamed from: f, reason: collision with root package name */
    public int f8900f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f8901g;

    public a(c cVar, Sb.e eVar, Function3 function3, Function3 function32, Function2 function2, Sb.d dVar) {
        this.f8901g = cVar;
        this.f8895a = eVar;
        this.f8896b = function3;
        this.f8897c = function32;
        this.f8898d = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        v vVar = this.f8899e;
        if (vVar != 0) {
            vVar.g(this.f8900f, this.f8901g.f8907a);
            return;
        }
        Y y10 = vVar instanceof Y ? (Y) vVar : null;
        if (y10 != null) {
            y10.dispose();
        }
    }
}

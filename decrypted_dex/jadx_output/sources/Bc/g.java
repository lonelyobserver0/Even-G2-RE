package Bc;

import Ac.j;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import wc.C1881F;
import wc.u;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final j f753a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f754b;

    /* renamed from: c, reason: collision with root package name */
    public final int f755c;

    /* renamed from: d, reason: collision with root package name */
    public final Ac.e f756d;

    /* renamed from: e, reason: collision with root package name */
    public final z f757e;

    /* renamed from: f, reason: collision with root package name */
    public final int f758f;

    /* renamed from: g, reason: collision with root package name */
    public final int f759g;

    /* renamed from: h, reason: collision with root package name */
    public final int f760h;

    /* renamed from: i, reason: collision with root package name */
    public int f761i;

    public g(j call, ArrayList interceptors, int i3, Ac.e eVar, z request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f753a = call;
        this.f754b = interceptors;
        this.f755c = i3;
        this.f756d = eVar;
        this.f757e = request;
        this.f758f = i10;
        this.f759g = i11;
        this.f760h = i12;
    }

    public static g a(g gVar, int i3, Ac.e eVar, z zVar, int i10) {
        if ((i10 & 1) != 0) {
            i3 = gVar.f755c;
        }
        int i11 = i3;
        if ((i10 & 2) != 0) {
            eVar = gVar.f756d;
        }
        Ac.e eVar2 = eVar;
        if ((i10 & 4) != 0) {
            zVar = gVar.f757e;
        }
        z request = zVar;
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(gVar.f753a, gVar.f754b, i11, eVar2, request, gVar.f758f, gVar.f759g, gVar.f760h);
    }

    public final C1881F b(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f754b;
        int size = arrayList.size();
        int i3 = this.f755c;
        if (i3 >= size) {
            throw new IllegalStateException(StubApp.getString2(6068));
        }
        this.f761i++;
        String string2 = StubApp.getString2(25061);
        Ac.e eVar = this.f756d;
        String string22 = StubApp.getString2(25062);
        if (eVar != null) {
            if (!((Ac.f) eVar.f317d).b(request.f22493a)) {
                throw new IllegalStateException((string22 + arrayList.get(i3 - 1) + StubApp.getString2(25063)).toString());
            }
            if (this.f761i != 1) {
                throw new IllegalStateException((string22 + arrayList.get(i3 - 1) + string2).toString());
            }
        }
        int i10 = i3 + 1;
        g a3 = a(this, i10, null, request, 58);
        u uVar = (u) arrayList.get(i3);
        C1881F a9 = uVar.a(a3);
        String string23 = StubApp.getString2(25064);
        if (a9 == null) {
            throw new NullPointerException(string23 + uVar + StubApp.getString2(25066));
        }
        if (eVar != null && i10 < arrayList.size() && a3.f761i != 1) {
            throw new IllegalStateException((string22 + uVar + string2).toString());
        }
        if (a9.f22331g != null) {
            return a9;
        }
        throw new IllegalStateException((string23 + uVar + StubApp.getString2(25065)).toString());
    }
}

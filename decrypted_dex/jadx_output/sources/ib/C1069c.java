package ib;

import android.content.Context;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import java.util.HashMap;

/* renamed from: ib.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1069c implements InterfaceC0825b, o, k {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f14975c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public Context f14976a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14977b = false;

    public static e c(R4.j jVar) {
        String str = jVar.f6203a;
        String str2 = jVar.f6207e;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = jVar.f6209g;
        if (str3 == null) {
            str3 = null;
        }
        e eVar = new e();
        if (str == null) {
            throw new IllegalStateException(StubApp.getString2(18615));
        }
        eVar.f14981a = str;
        String str4 = jVar.f6204b;
        if (str4 == null) {
            throw new IllegalStateException(StubApp.getString2(18614));
        }
        eVar.f14982b = str4;
        if (str2 == null) {
            throw new IllegalStateException(StubApp.getString2(18613));
        }
        eVar.f14983c = str2;
        if (str3 == null) {
            throw new IllegalStateException(StubApp.getString2(18612));
        }
        eVar.f14984d = str3;
        eVar.f14985e = null;
        eVar.f14986f = jVar.f6205c;
        eVar.f14987g = jVar.f6208f;
        eVar.f14988h = null;
        eVar.f14989i = jVar.f6206d;
        eVar.j = null;
        eVar.f14990k = null;
        eVar.f14991l = null;
        eVar.f14992m = null;
        eVar.f14993n = null;
        return eVar;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        o.a(c0824a.f13554b, this);
        k.b(c0824a.f13554b, this);
        this.f14976a = c0824a.f13553a;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f14976a = null;
        o.a(c0824a.f13554b, null);
        k.b(c0824a.f13554b, null);
    }
}

package K2;

import M4.G;
import M4.I;
import M4.Z;
import R0.n;
import Xa.AbstractActivityC0364d;
import Xa.g;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.C0446v;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.embedding.engine.renderer.l;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import r0.C1555p;
import tb.AbstractC1748a;
import x0.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3637a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3638b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3639c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3640d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3641e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3642f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3643g;

    /* renamed from: h, reason: collision with root package name */
    public Object f3644h;

    public c(String eventTitle, String startTime, String endTime, String description, String location, String week, boolean z2) {
        this.f3637a = 0;
        Intrinsics.checkNotNullParameter(eventTitle, "eventTitle");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(week, "week");
        this.f3639c = eventTitle;
        this.f3640d = startTime;
        this.f3641e = endTime;
        this.f3642f = description;
        this.f3643g = location;
        this.f3644h = week;
        this.f3638b = z2;
    }

    public void a(InterfaceC0825b interfaceC0825b) {
        String string2 = StubApp.getString2(3241);
        AbstractC1748a.d(StubApp.getString2(3242).concat(interfaceC0825b.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0825b.getClass();
            HashMap hashMap = (HashMap) this.f3639c;
            if (hashMap.containsKey(cls)) {
                Log.w(StubApp.getString2("3243"), string2 + interfaceC0825b + StubApp.getString2("3244") + ((Ya.c) this.f3640d) + StubApp.getString2("1920"));
                Trace.endSection();
                return;
            }
            interfaceC0825b.toString();
            hashMap.put(interfaceC0825b.getClass(), interfaceC0825b);
            interfaceC0825b.onAttachedToEngine((C0824a) this.f3641e);
            if (interfaceC0825b instanceof eb.a) {
                eb.a aVar = (eb.a) interfaceC0825b;
                ((HashMap) this.f3642f).put(interfaceC0825b.getClass(), aVar);
                if (e()) {
                    aVar.onAttachedToActivity((Ya.d) this.f3644h);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(AbstractActivityC0364d abstractActivityC0364d, C0446v c0446v) {
        this.f3644h = new Ya.d(abstractActivityC0364d, c0446v);
        boolean booleanExtra = abstractActivityC0364d.getIntent() != null ? abstractActivityC0364d.getIntent().getBooleanExtra(StubApp.getString2(19), false) : false;
        Ya.c cVar = (Ya.c) this.f3640d;
        cVar.f8877r.setSoftwareRendering(booleanExtra);
        PlatformViewsController platformViewsController = cVar.f8877r;
        l lVar = cVar.f8862b;
        Za.d dVar = cVar.f8863c;
        platformViewsController.attach(abstractActivityC0364d, lVar, dVar);
        cVar.f8878s.attach(abstractActivityC0364d, dVar);
        for (eb.a aVar : ((HashMap) this.f3642f).values()) {
            if (this.f3638b) {
                aVar.onReattachedToActivityForConfigChanges((Ya.d) this.f3644h);
            } else {
                aVar.onAttachedToActivity((Ya.d) this.f3644h);
            }
        }
        this.f3638b = false;
    }

    public void c() {
        if (!e()) {
            Log.e(StubApp.getString2(3243), StubApp.getString2(3246));
            return;
        }
        AbstractC1748a.d(StubApp.getString2(3245));
        try {
            Iterator it = ((HashMap) this.f3642f).values().iterator();
            while (it.hasNext()) {
                ((eb.a) it.next()).onDetachedFromActivity();
            }
            Ya.c cVar = (Ya.c) this.f3640d;
            cVar.f8877r.detach();
            cVar.f8878s.detach();
            this.f3643g = null;
            this.f3644h = null;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void d() {
        if (e()) {
            c();
        }
    }

    public boolean e() {
        return ((g) this.f3643g) != null;
    }

    public String toString() {
        switch (this.f3637a) {
            case 0:
                return StubApp.getString2(3247) + ((String) this.f3639c) + StubApp.getString2(3248) + ((String) this.f3640d) + StubApp.getString2(3249) + ((String) this.f3641e) + StubApp.getString2(3250) + ((String) this.f3642f) + StubApp.getString2(3251) + ((String) this.f3643g) + StubApp.getString2(3252) + ((String) this.f3644h) + StubApp.getString2(3253) + this.f3638b + StubApp.getString2(3254);
            default:
                return super.toString();
        }
    }

    public c(Context context, Ya.c cVar, bb.d dVar) {
        this.f3637a = 2;
        this.f3639c = new HashMap();
        this.f3642f = new HashMap();
        this.f3638b = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f3640d = cVar;
        this.f3641e = new C0824a(context, cVar.f8863c, cVar.f8862b, cVar.f8877r.getRegistry(), new F5.c(dVar, 28));
    }

    public c(Context context, n nVar) {
        this.f3637a = 1;
        this.f3639c = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f3640d = nVar;
        G g10 = I.f4549b;
        this.f3643g = Z.f4578e;
        this.f3644h = C1555p.f20182a;
    }

    public c(Context context) {
        this.f3637a = 3;
        this.f3639c = context;
        this.f3640d = x0.b.f22641c;
        this.f3642f = t.f22792a;
        this.f3643g = t.f22793b;
    }
}

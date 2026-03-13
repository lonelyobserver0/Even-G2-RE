package o2;

import com.stub.StubApp;
import i2.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n2.C1382c;
import n2.InterfaceC1381b;
import r2.f;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1455b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18358a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f18359b;

    /* renamed from: c, reason: collision with root package name */
    public final p2.d f18360c;

    /* renamed from: d, reason: collision with root package name */
    public C1382c f18361d;

    public AbstractC1455b(p2.d dVar) {
        this.f18360c = dVar;
    }

    public abstract boolean a(f fVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f18358a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (a(fVar)) {
                this.f18358a.add(fVar.f20302a);
            }
        }
        if (this.f18358a.isEmpty()) {
            this.f18360c.b(this);
        } else {
            p2.d dVar = this.f18360c;
            synchronized (dVar.f19662c) {
                try {
                    if (dVar.f19663d.add(this)) {
                        if (dVar.f19663d.size() == 1) {
                            dVar.f19664e = dVar.a();
                            o.e().b(p2.d.f19659f, String.format(StubApp.getString2("21611"), dVar.getClass().getSimpleName(), dVar.f19664e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f19664e;
                        this.f18359b = obj;
                        d(this.f18361d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f18361d, this.f18359b);
    }

    public final void d(C1382c c1382c, Object obj) {
        if (this.f18358a.isEmpty() || c1382c == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f18358a;
            synchronized (c1382c.f17802c) {
                InterfaceC1381b interfaceC1381b = c1382c.f17800a;
                if (interfaceC1381b != null) {
                    interfaceC1381b.e(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f18358a;
        synchronized (c1382c.f17802c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c1382c.a(str)) {
                        o.e().b(C1382c.f17799d, StubApp.getString2("21612") + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                InterfaceC1381b interfaceC1381b2 = c1382c.f17800a;
                if (interfaceC1381b2 != null) {
                    interfaceC1381b2.f(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

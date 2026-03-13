package m8;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static volatile r f17247b;

    /* renamed from: a, reason: collision with root package name */
    public static final s f17246a = new s();

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArrayList f17248c = new CopyOnWriteArrayList();

    public static final void a() {
        D9.l.d(StubApp.getString2(21152), StubApp.getString2(2698));
        r rVar = f17247b;
        if (rVar != null) {
            rVar.i();
            Iterator it = f17248c.iterator();
            while (it.hasNext()) {
                ((H8.d) it.next()).a(rVar);
            }
        }
        f17247b = null;
    }
}

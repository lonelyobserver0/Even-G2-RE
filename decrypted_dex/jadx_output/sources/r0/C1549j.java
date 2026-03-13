package r0;

import aa.C0398e;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o0.C1436k;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1549j {

    /* renamed from: a, reason: collision with root package name */
    public final C1555p f20156a;

    /* renamed from: b, reason: collision with root package name */
    public final C1557r f20157b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1547h f20158c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f20159d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f20160e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f20161f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f20162g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20163h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20164i;

    public C1549j(Looper looper, C1555p c1555p, InterfaceC1547h interfaceC1547h) {
        this(new CopyOnWriteArraySet(), looper, c1555p, interfaceC1547h, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f20162g) {
            try {
                if (this.f20163h) {
                    return;
                }
                this.f20159d.add(new C1548i(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f20161f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C1557r c1557r = this.f20157b;
        if (!c1557r.f20185a.hasMessages(1)) {
            c1557r.getClass();
            C1556q b2 = C1557r.b();
            b2.f20183a = c1557r.f20185a.obtainMessage(1);
            c1557r.getClass();
            Message message = b2.f20183a;
            message.getClass();
            c1557r.f20185a.sendMessageAtFrontOfQueue(message);
            b2.a();
        }
        ArrayDeque arrayDeque2 = this.f20160e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i3, InterfaceC1546g interfaceC1546g) {
        f();
        this.f20161f.add(new H1.a(i3, 3, new CopyOnWriteArraySet(this.f20159d), interfaceC1546g));
    }

    public final void d() {
        f();
        synchronized (this.f20162g) {
            this.f20163h = true;
        }
        Iterator it = this.f20159d.iterator();
        while (it.hasNext()) {
            C1548i c1548i = (C1548i) it.next();
            InterfaceC1547h interfaceC1547h = this.f20158c;
            c1548i.f20155d = true;
            if (c1548i.f20154c) {
                c1548i.f20154c = false;
                interfaceC1547h.a(c1548i.f20152a, c1548i.f20153b.e());
            }
        }
        this.f20159d.clear();
    }

    public final void e(int i3, InterfaceC1546g interfaceC1546g) {
        c(i3, interfaceC1546g);
        b();
    }

    public final void f() {
        if (this.f20164i) {
            AbstractC1550k.g(Thread.currentThread() == this.f20157b.f20185a.getLooper().getThread());
        }
    }

    public C1549j(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C1555p c1555p, InterfaceC1547h interfaceC1547h, boolean z2) {
        this.f20156a = c1555p;
        this.f20159d = copyOnWriteArraySet;
        this.f20158c = interfaceC1547h;
        this.f20162g = new Object();
        this.f20160e = new ArrayDeque();
        this.f20161f = new ArrayDeque();
        this.f20157b = c1555p.a(looper, new Handler.Callback() { // from class: r0.f
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C1549j c1549j = C1549j.this;
                Iterator it = c1549j.f20159d.iterator();
                while (it.hasNext()) {
                    C1548i c1548i = (C1548i) it.next();
                    if (!c1548i.f20155d && c1548i.f20154c) {
                        C1436k e10 = c1548i.f20153b.e();
                        c1548i.f20153b = new C0398e(10, false);
                        c1548i.f20154c = false;
                        c1549j.f20158c.a(c1548i.f20152a, e10);
                    }
                    if (c1549j.f20157b.f20185a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f20164i = z2;
    }
}

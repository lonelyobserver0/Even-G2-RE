package zc;

import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import f4.C0882f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f24141a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24142b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24143c;

    /* renamed from: d, reason: collision with root package name */
    public a f24144d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24145e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24146f;

    public b(c taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f24141a = taskRunner;
        this.f24142b = name;
        this.f24145e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = xc.b.f23179a;
        synchronized (this.f24141a) {
            try {
                if (b()) {
                    this.f24141a.d(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f24144d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.f24138b) {
                this.f24146f = true;
            }
        }
        ArrayList arrayList = this.f24145e;
        int size = arrayList.size() - 1;
        boolean z2 = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i3 = size - 1;
            if (((a) arrayList.get(size)).f24138b) {
                a aVar2 = (a) arrayList.get(size);
                if (c.f24148i.isLoggable(Level.FINE)) {
                    D1.a(aVar2, this, StubApp.getString2(105));
                }
                arrayList.remove(size);
                z2 = true;
            }
            if (i3 < 0) {
                return z2;
            }
            size = i3;
        }
    }

    public final void c(a task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f24141a) {
            if (!this.f24143c) {
                if (d(task, j, false)) {
                    this.f24141a.d(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.f24138b) {
                if (c.f24148i.isLoggable(Level.FINE)) {
                    D1.a(task, this, StubApp.getString2("35630"));
                }
            } else {
                if (c.f24148i.isLoggable(Level.FINE)) {
                    D1.a(task, this, StubApp.getString2("35631"));
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j, boolean z2) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        b bVar = task.f24139c;
        if (bVar != this) {
            if (bVar != null) {
                throw new IllegalStateException(StubApp.getString2(35633));
            }
            task.f24139c = this;
        }
        C0882f c0882f = this.f24141a.f24149a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j;
        ArrayList arrayList = this.f24145e;
        int indexOf = arrayList.indexOf(task);
        if (indexOf != -1) {
            if (task.f24140d <= j3) {
                if (c.f24148i.isLoggable(Level.FINE)) {
                    D1.a(task, this, StubApp.getString2(35632));
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        task.f24140d = j3;
        if (c.f24148i.isLoggable(Level.FINE)) {
            D1.a(task, this, z2 ? Intrinsics.stringPlus("run again after ", D1.h(j3 - nanoTime)) : Intrinsics.stringPlus("scheduled after ", D1.h(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((a) it.next()).f24140d - nanoTime > j) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            i3 = arrayList.size();
        }
        arrayList.add(i3, task);
        return i3 == 0;
    }

    public final void e() {
        byte[] bArr = xc.b.f23179a;
        synchronized (this.f24141a) {
            try {
                this.f24143c = true;
                if (b()) {
                    this.f24141a.d(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f24142b;
    }
}

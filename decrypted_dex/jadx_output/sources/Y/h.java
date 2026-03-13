package Y;

import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import t.C1693f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile h f8658k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f8659a;

    /* renamed from: b, reason: collision with root package name */
    public final C1693f f8660b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f8661c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8662d;

    /* renamed from: e, reason: collision with root package name */
    public final R3.l f8663e;

    /* renamed from: f, reason: collision with root package name */
    public final g f8664f;

    /* renamed from: g, reason: collision with root package name */
    public final u5.d f8665g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8666h;

    /* renamed from: i, reason: collision with root package name */
    public final c f8667i;

    public h(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8659a = reentrantReadWriteLock;
        this.f8661c = 3;
        g gVar = (g) qVar.f8656b;
        this.f8664f = gVar;
        int i3 = qVar.f8655a;
        this.f8666h = i3;
        this.f8667i = (c) qVar.f8657c;
        this.f8662d = new Handler(Looper.getMainLooper());
        this.f8660b = new C1693f(0);
        this.f8665g = new u5.d(22);
        R3.l lVar = new R3.l(this);
        this.f8663e = lVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f8661c = 0;
            } catch (Throwable th) {
                this.f8659a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new d(lVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (j) {
            try {
                hVar = f8658k;
                boolean z2 = hVar != null;
                String string2 = StubApp.getString2("7462");
                if (!z2) {
                    throw new IllegalStateException(string2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public final int b() {
        this.f8659a.readLock().lock();
        try {
            return this.f8661c;
        } finally {
            this.f8659a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f8666h == 1)) {
            throw new IllegalStateException(StubApp.getString2(7463));
        }
        if (b() == 1) {
            return;
        }
        this.f8659a.writeLock().lock();
        try {
            if (this.f8661c == 0) {
                return;
            }
            this.f8661c = 0;
            this.f8659a.writeLock().unlock();
            R3.l lVar = this.f8663e;
            h hVar = (h) lVar.f6140a;
            try {
                hVar.f8664f.a(new d(lVar));
            } catch (Throwable th) {
                hVar.d(th);
            }
        } finally {
            this.f8659a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f8659a.writeLock().lock();
        try {
            this.f8661c = 2;
            arrayList.addAll(this.f8660b);
            this.f8660b.clear();
            this.f8659a.writeLock().unlock();
            this.f8662d.post(new K.a(arrayList, this.f8661c, th));
        } catch (Throwable th2) {
            this.f8659a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:28:0x006c, B:31:0x0071, B:33:0x0075, B:35:0x0082, B:37:0x00a1, B:39:0x00ab, B:41:0x00ae, B:43:0x00b1, B:45:0x00c1, B:46:0x00c4), top: B:27:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.h.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(f fVar) {
        M.d.e(fVar, StubApp.getString2(7470));
        this.f8659a.writeLock().lock();
        try {
            if (this.f8661c != 1 && this.f8661c != 2) {
                this.f8660b.add(fVar);
                this.f8659a.writeLock().unlock();
            }
            this.f8662d.post(new K.a(Arrays.asList(fVar), this.f8661c, (Throwable) null));
            this.f8659a.writeLock().unlock();
        } catch (Throwable th) {
            this.f8659a.writeLock().unlock();
            throw th;
        }
    }
}

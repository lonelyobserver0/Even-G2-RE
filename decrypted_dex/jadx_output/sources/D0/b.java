package D0;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlin.jvm.internal.LongCompanionObject;
import q1.i;
import q1.l;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements q1.e, u0.c {

    /* renamed from: a, reason: collision with root package name */
    public final M3.b f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1226b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f1227c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f1228d;

    /* renamed from: e, reason: collision with root package name */
    public final u0.e[] f1229e;

    /* renamed from: f, reason: collision with root package name */
    public final u0.f[] f1230f;

    /* renamed from: g, reason: collision with root package name */
    public int f1231g;

    /* renamed from: h, reason: collision with root package name */
    public int f1232h;

    /* renamed from: i, reason: collision with root package name */
    public u0.e f1233i;
    public V2.f j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1234k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1235l;

    /* renamed from: m, reason: collision with root package name */
    public long f1236m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1237n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1238o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        this(new i[2], new q1.c[2]);
        this.f1237n = 1;
        int i3 = this.f1231g;
        u0.e[] eVarArr = this.f1229e;
        AbstractC1550k.g(i3 == eVarArr.length);
        for (u0.e eVar : eVarArr) {
            eVar.u(1024);
        }
        this.f1238o = lVar;
    }

    @Override // u0.c
    public final void b(long j) {
        boolean z2;
        synchronized (this.f1226b) {
            try {
                if (this.f1231g != this.f1229e.length && !this.f1234k) {
                    z2 = false;
                    AbstractC1550k.g(z2);
                    this.f1236m = j;
                }
                z2 = true;
                AbstractC1550k.g(z2);
                this.f1236m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q1.e
    public void c(long j) {
    }

    @Override // u0.c
    public final Object e() {
        u0.e eVar;
        synchronized (this.f1226b) {
            try {
                V2.f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                AbstractC1550k.g(this.f1233i == null);
                int i3 = this.f1231g;
                if (i3 == 0) {
                    eVar = null;
                } else {
                    u0.e[] eVarArr = this.f1229e;
                    int i10 = i3 - 1;
                    this.f1231g = i10;
                    eVar = eVarArr[i10];
                }
                this.f1233i = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final V2.f f(Throwable th) {
        switch (this.f1237n) {
            case 0:
                return new d(StubApp.getString2(1278), th);
            default:
                return new q1.f(StubApp.getString2(1278), th);
        }
    }

    @Override // u0.c
    public final void flush() {
        synchronized (this.f1226b) {
            try {
                this.f1234k = true;
                u0.e eVar = this.f1233i;
                if (eVar != null) {
                    eVar.s();
                    int i3 = this.f1231g;
                    this.f1231g = i3 + 1;
                    this.f1229e[i3] = eVar;
                    this.f1233i = null;
                }
                while (!this.f1227c.isEmpty()) {
                    u0.e eVar2 = (u0.e) this.f1227c.removeFirst();
                    eVar2.s();
                    int i10 = this.f1231g;
                    this.f1231g = i10 + 1;
                    this.f1229e[i10] = eVar2;
                }
                while (!this.f1228d.isEmpty()) {
                    ((u0.f) this.f1228d.removeFirst()).t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final V2.f g(u0.e eVar, u0.f fVar, boolean z2) {
        switch (this.f1237n) {
            case 0:
                a aVar = (a) fVar;
                try {
                    ByteBuffer byteBuffer = eVar.f21396e;
                    byteBuffer.getClass();
                    AbstractC1550k.g(byteBuffer.hasArray());
                    AbstractC1550k.c(byteBuffer.arrayOffset() == 0);
                    A1.a aVar2 = (A1.a) this.f1238o;
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    aVar2.getClass();
                    aVar.f1223e = A1.a.g(remaining, array);
                    aVar.f21400c = eVar.f21398g;
                    return null;
                } catch (d e10) {
                    return e10;
                }
            default:
                i iVar = (i) eVar;
                q1.c cVar = (q1.c) fVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f21396e;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    l lVar = (l) this.f1238o;
                    if (z2) {
                        lVar.reset();
                    }
                    q1.d g10 = lVar.g(0, limit, array2);
                    long j = iVar.f21398g;
                    long j3 = iVar.f19901k;
                    cVar.f21400c = j;
                    cVar.f19886e = g10;
                    if (j3 != LongCompanionObject.MAX_VALUE) {
                        j = j3;
                    }
                    cVar.f19887f = j;
                    cVar.f21401d = false;
                    return null;
                } catch (q1.f e11) {
                    return e11;
                }
        }
    }

    public final boolean h() {
        boolean z2;
        V2.f f10;
        synchronized (this.f1226b) {
            while (!this.f1235l) {
                try {
                    if (!this.f1227c.isEmpty() && this.f1232h > 0) {
                        break;
                    }
                    this.f1226b.wait();
                } finally {
                }
            }
            if (this.f1235l) {
                return false;
            }
            u0.e eVar = (u0.e) this.f1227c.removeFirst();
            u0.f[] fVarArr = this.f1230f;
            int i3 = this.f1232h - 1;
            this.f1232h = i3;
            u0.f fVar = fVarArr[i3];
            boolean z10 = this.f1234k;
            this.f1234k = false;
            if (eVar.k(4)) {
                fVar.a(4);
            } else {
                fVar.f21400c = eVar.f21398g;
                if (eVar.k(134217728)) {
                    fVar.a(134217728);
                }
                long j = eVar.f21398g;
                synchronized (this.f1226b) {
                    long j3 = this.f1236m;
                    if (j3 != -9223372036854775807L && j < j3) {
                        z2 = false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    fVar.f21401d = true;
                }
                try {
                    f10 = g(eVar, fVar, z10);
                } catch (OutOfMemoryError e10) {
                    f10 = f(e10);
                } catch (RuntimeException e11) {
                    f10 = f(e11);
                }
                if (f10 != null) {
                    synchronized (this.f1226b) {
                        this.j = f10;
                    }
                    return false;
                }
            }
            synchronized (this.f1226b) {
                try {
                    if (this.f1234k) {
                        fVar.t();
                    } else if (fVar.f21401d) {
                        fVar.t();
                    } else {
                        this.f1228d.addLast(fVar);
                    }
                    eVar.s();
                    int i10 = this.f1231g;
                    this.f1231g = i10 + 1;
                    this.f1229e[i10] = eVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // u0.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final u0.f d() {
        synchronized (this.f1226b) {
            try {
                V2.f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                if (this.f1228d.isEmpty()) {
                    return null;
                }
                return (u0.f) this.f1228d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u0.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void a(u0.e eVar) {
        synchronized (this.f1226b) {
            try {
                V2.f fVar = this.j;
                if (fVar != null) {
                    throw fVar;
                }
                AbstractC1550k.c(eVar == this.f1233i);
                this.f1227c.addLast(eVar);
                if (!this.f1227c.isEmpty() && this.f1232h > 0) {
                    this.f1226b.notify();
                }
                this.f1233i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(u0.f fVar) {
        synchronized (this.f1226b) {
            fVar.s();
            int i3 = this.f1232h;
            this.f1232h = i3 + 1;
            this.f1230f[i3] = fVar;
            if (!this.f1227c.isEmpty() && this.f1232h > 0) {
                this.f1226b.notify();
            }
        }
    }

    @Override // u0.c
    public final void release() {
        synchronized (this.f1226b) {
            this.f1235l = true;
            this.f1226b.notify();
        }
        try {
            this.f1225a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public b(u0.e[] eVarArr, u0.f[] fVarArr) {
        u0.f aVar;
        u0.e eVar;
        this.f1226b = new Object();
        this.f1236m = -9223372036854775807L;
        this.f1227c = new ArrayDeque();
        this.f1228d = new ArrayDeque();
        this.f1229e = eVarArr;
        this.f1231g = eVarArr.length;
        for (int i3 = 0; i3 < this.f1231g; i3++) {
            u0.e[] eVarArr2 = this.f1229e;
            switch (this.f1237n) {
                case 0:
                    eVar = new u0.e(1);
                    break;
                default:
                    eVar = new i(1);
                    break;
            }
            eVarArr2[i3] = eVar;
        }
        this.f1230f = fVarArr;
        this.f1232h = fVarArr.length;
        for (int i10 = 0; i10 < this.f1232h; i10++) {
            u0.f[] fVarArr2 = this.f1230f;
            switch (this.f1237n) {
                case 0:
                    aVar = new a(this);
                    break;
                default:
                    aVar = new q1.c(this);
                    break;
            }
            fVarArr2[i10] = aVar;
        }
        M3.b bVar = new M3.b(this);
        this.f1225a = bVar;
        bVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(A1.a aVar) {
        this(new u0.e[1], new a[1]);
        this.f1237n = 0;
        this.f1238o = aVar;
    }
}

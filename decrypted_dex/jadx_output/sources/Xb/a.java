package Xb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(a.class, StubApp.getString2(25907));

    /* renamed from: a, reason: collision with root package name */
    public final l f8610a;

    /* renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef f8611b;

    /* renamed from: c, reason: collision with root package name */
    public int f8612c;

    /* renamed from: d, reason: collision with root package name */
    public long f8613d;

    /* renamed from: e, reason: collision with root package name */
    public long f8614e;

    /* renamed from: f, reason: collision with root package name */
    public int f8615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f8617h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    @Volatile
    private volatile int workerCtl;

    public a(b bVar, int i3) {
        this.f8617h = bVar;
        setDaemon(true);
        this.f8610a = new l();
        this.f8611b = new Ref.ObjectRef();
        this.f8612c = 4;
        this.nextParkedWorker = b.f8620l;
        this.f8615f = Random.INSTANCE.nextInt();
        f(i3);
    }

    public final h a(boolean z2) {
        h e10;
        h e11;
        b bVar;
        long j3;
        int i3 = this.f8612c;
        h hVar = null;
        l lVar = this.f8610a;
        b bVar2 = this.f8617h;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.j;
            do {
                bVar = this.f8617h;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f8645b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f8634b.f14746a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i10 = l.f8647d.get(lVar);
                    int i11 = l.f8646c.get(lVar);
                    while (true) {
                        if (i10 == i11 || l.f8648e.get(lVar) == 0) {
                            break;
                        }
                        i11--;
                        h c10 = lVar.c(i11, true);
                        if (c10 != null) {
                            hVar = c10;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f8626f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.j.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f8612c = 1;
        }
        if (z2) {
            boolean z10 = d(bVar2.f8621a * 2) == 0;
            if (z10 && (e11 = e()) != null) {
                return e11;
            }
            lVar.getClass();
            h hVar4 = (h) l.f8645b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z10 && (e10 = e()) != null) {
                return e10;
            }
        } else {
            h e12 = e();
            if (e12 != null) {
                return e12;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i10 = this.f8615f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f8615f = i13;
        int i14 = i3 - 1;
        return (i14 & i3) == 0 ? i13 & i14 : (i13 & IntCompanionObject.MAX_VALUE) % i3;
    }

    public final h e() {
        int d8 = d(2);
        b bVar = this.f8617h;
        if (d8 == 0) {
            h hVar = (h) bVar.f8625e.d();
            return hVar != null ? hVar : (h) bVar.f8626f.d();
        }
        h hVar2 = (h) bVar.f8626f.d();
        return hVar2 != null ? hVar2 : (h) bVar.f8625e.d();
    }

    public final void f(int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8617h.f8624d);
        sb2.append(StubApp.getString2(25908));
        sb2.append(i3 == 0 ? StubApp.getString2(25909) : String.valueOf(i3));
        setName(sb2.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i10 = this.f8612c;
        boolean z2 = i10 == 1;
        if (z2) {
            b.j.addAndGet(this.f8617h, 4398046511104L);
        }
        if (i10 != i3) {
            this.f8612c = i3;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, Xb.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [Xb.h] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [Xb.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Xb.h i(int r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xb.a.i(int):Xb.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xb.a.run():void");
    }
}

package zc;

import com.stub.StubApp;
import f4.C0882f;
import i.RunnableC1018B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f24147h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f24148i;

    /* renamed from: a, reason: collision with root package name */
    public final C0882f f24149a;

    /* renamed from: b, reason: collision with root package name */
    public int f24150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24151c;

    /* renamed from: d, reason: collision with root package name */
    public long f24152d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24153e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24154f;

    /* renamed from: g, reason: collision with root package name */
    public final RunnableC1018B f24155g;

    static {
        String name = Intrinsics.stringPlus(xc.b.f23184f, " TaskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        f24147h = new c(new C0882f(new xc.a(name, true)));
        Logger logger = Logger.getLogger(c.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f24148i = logger;
    }

    public c(C0882f backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f24149a = backend;
        this.f24150b = 10000;
        this.f24153e = new ArrayList();
        this.f24154f = new ArrayList();
        this.f24155g = new RunnableC1018B(this, 18);
    }

    public static final void a(c cVar, a aVar) {
        cVar.getClass();
        byte[] bArr = xc.b.f23179a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f24137a);
        try {
            long a3 = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, a3);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = xc.b.f23179a;
        b bVar = aVar.f24139c;
        Intrinsics.checkNotNull(bVar);
        if (bVar.f24144d != aVar) {
            throw new IllegalStateException(StubApp.getString2(6068));
        }
        boolean z2 = bVar.f24146f;
        bVar.f24146f = false;
        bVar.f24144d = null;
        this.f24153e.remove(bVar);
        if (j != -1 && !z2 && !bVar.f24143c) {
            bVar.d(aVar, j, true);
        }
        if (bVar.f24145e.isEmpty()) {
            return;
        }
        this.f24154f.add(bVar);
    }

    public final a c() {
        long j;
        a aVar;
        boolean z2;
        byte[] bArr = xc.b.f23179a;
        while (true) {
            ArrayList arrayList = this.f24154f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0882f c0882f = this.f24149a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j3 = LongCompanionObject.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j = nanoTime;
                    aVar = null;
                    z2 = false;
                    break;
                }
                a aVar3 = (a) ((b) it.next()).f24145e.get(0);
                j = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f24140d - j);
                if (max > 0) {
                    j3 = Math.min(max, j3);
                } else {
                    if (aVar2 != null) {
                        z2 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.f24153e;
            if (aVar2 != null) {
                byte[] bArr2 = xc.b.f23179a;
                aVar2.f24140d = -1L;
                b bVar = aVar2.f24139c;
                Intrinsics.checkNotNull(bVar);
                bVar.f24145e.remove(aVar2);
                arrayList.remove(bVar);
                bVar.f24144d = aVar2;
                arrayList2.add(bVar);
                if (z2 || (!this.f24151c && !arrayList.isEmpty())) {
                    String string2 = StubApp.getString2(35634);
                    RunnableC1018B runnableC1018B = this.f24155g;
                    Intrinsics.checkNotNullParameter(runnableC1018B, string2);
                    ((ThreadPoolExecutor) c0882f.f13748b).execute(runnableC1018B);
                }
                return aVar2;
            }
            boolean z10 = this.f24151c;
            String string22 = StubApp.getString2(35635);
            if (z10) {
                if (j3 >= this.f24152d - j) {
                    return aVar;
                }
                Intrinsics.checkNotNullParameter(this, string22);
                notify();
                return aVar;
            }
            this.f24151c = true;
            this.f24152d = j + j3;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, string22);
                    long j10 = j3 / 1000000;
                    long j11 = j3 - (1000000 * j10);
                    if (j10 > 0 || j3 > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            ((b) arrayList2.get(size)).b();
                            if (i3 < 0) {
                                break;
                            }
                            size = i3;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i10 = size2 - 1;
                            b bVar2 = (b) arrayList.get(size2);
                            bVar2.b();
                            if (bVar2.f24145e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size2 = i10;
                        }
                    }
                }
            } finally {
                this.f24151c = false;
            }
        }
    }

    public final void d(b taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = xc.b.f23179a;
        if (taskQueue.f24144d == null) {
            boolean isEmpty = taskQueue.f24145e.isEmpty();
            ArrayList arrayList = this.f24154f;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z2 = this.f24151c;
        C0882f c0882f = this.f24149a;
        if (z2) {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        } else {
            String string2 = StubApp.getString2(35634);
            RunnableC1018B runnableC1018B = this.f24155g;
            Intrinsics.checkNotNullParameter(runnableC1018B, string2);
            ((ThreadPoolExecutor) c0882f.f13748b).execute(runnableC1018B);
        }
    }

    public final b e() {
        int i3;
        synchronized (this) {
            i3 = this.f24150b;
            this.f24150b = i3 + 1;
        }
        return new b(this, Intrinsics.stringPlus(StubApp.getString2(4921), Integer.valueOf(i3)));
    }
}

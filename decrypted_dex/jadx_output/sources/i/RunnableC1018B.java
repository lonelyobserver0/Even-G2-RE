package i;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.stub.StubApp;
import java.util.Collections;
import java.util.Objects;
import l4.F1;
import l4.O0;
import l4.ServiceConnectionC1186i1;
import l4.Y;
import n2.C1382c;
import p4.C1489a;
import q4.InterfaceC1522c;

/* renamed from: i.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1018B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14503b;

    public /* synthetic */ RunnableC1018B(Object obj, int i3) {
        this.f14502a = i3;
        this.f14503b = obj;
    }

    private final void a() {
        C1489a c1489a = (C1489a) this.f14503b;
        synchronized (c1489a.f19679a) {
            try {
                if (c1489a.b()) {
                    Log.e(StubApp.getString2("18340"), String.valueOf(c1489a.j).concat(StubApp.getString2("18341")));
                    c1489a.d();
                    if (c1489a.b()) {
                        c1489a.f19681c = 1;
                        c1489a.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((q4.p) this.f14503b).f20069c) {
            try {
                InterfaceC1522c interfaceC1522c = (InterfaceC1522c) ((q4.p) this.f14503b).f20070d;
                if (interfaceC1522c != null) {
                    interfaceC1522c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f14503b;
        String b2 = constraintTrackingWorker.f10356b.f10363b.b(StubApp.getString2(18342));
        if (TextUtils.isEmpty(b2)) {
            i2.o.e().d(ConstraintTrackingWorker.f10393l, StubApp.getString2(18343), new Throwable[0]);
            constraintTrackingWorker.j.j(new i2.k());
            return;
        }
        i2.v vVar = constraintTrackingWorker.f10356b.f10367f;
        Context context = constraintTrackingWorker.f10355a;
        WorkerParameters workerParameters = constraintTrackingWorker.f10394f;
        vVar.getClass();
        ListenableWorker a3 = i2.v.a(context, b2, workerParameters);
        constraintTrackingWorker.f10397k = a3;
        if (a3 == null) {
            i2.o.e().b(ConstraintTrackingWorker.f10393l, StubApp.getString2(18343), new Throwable[0]);
            constraintTrackingWorker.j.j(new i2.k());
            return;
        }
        r2.f k3 = j2.k.L(constraintTrackingWorker.f10355a).f15298e.u().k(constraintTrackingWorker.f10356b.f10362a.toString());
        if (k3 == null) {
            constraintTrackingWorker.j.j(new i2.k());
            return;
        }
        Context context2 = constraintTrackingWorker.f10355a;
        C1382c c1382c = new C1382c(context2, j2.k.L(context2).f15299f, constraintTrackingWorker);
        c1382c.b(Collections.singletonList(k3));
        if (!c1382c.a(constraintTrackingWorker.f10356b.f10362a.toString())) {
            i2.o.e().b(ConstraintTrackingWorker.f10393l, E1.a.k(StubApp.getString2(18348), b2, StubApp.getString2(18349)), new Throwable[0]);
            constraintTrackingWorker.j.j(new i2.l());
            return;
        }
        i2.o.e().b(ConstraintTrackingWorker.f10393l, E1.a.j(StubApp.getString2(18344), b2), new Throwable[0]);
        try {
            t2.j d8 = constraintTrackingWorker.f10397k.d();
            d8.a(new O0(constraintTrackingWorker, d8, 19, false), constraintTrackingWorker.f10356b.f10365d);
        } catch (Throwable th) {
            i2.o e10 = i2.o.e();
            String str = ConstraintTrackingWorker.f10393l;
            e10.b(str, E1.a.k(StubApp.getString2(18345), b2, StubApp.getString2(18346)), th);
            synchronized (constraintTrackingWorker.f10395g) {
                try {
                    if (constraintTrackingWorker.f10396h) {
                        i2.o.e().b(str, StubApp.getString2("18347"), new Throwable[0]);
                        constraintTrackingWorker.j.j(new i2.l());
                    } else {
                        constraintTrackingWorker.j.j(new i2.k());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02f2, code lost:
    
        if (r4.Q() >= 242600) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0496 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.RunnableC1018B.run():void");
    }

    public RunnableC1018B(Y y10, boolean z2) {
        this.f14502a = 5;
        this.f14503b = y10;
    }

    public RunnableC1018B(ServiceConnectionC1186i1 serviceConnectionC1186i1) {
        this.f14502a = 6;
        Objects.requireNonNull(serviceConnectionC1186i1);
        this.f14503b = serviceConnectionC1186i1;
    }

    public RunnableC1018B(F1 f12, Y3.b bVar) {
        this.f14502a = 9;
        Objects.requireNonNull(f12);
        this.f14503b = f12;
    }
}

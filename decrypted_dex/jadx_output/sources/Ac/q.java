package Ac;

import android.hardware.display.DisplayManager;
import android.os.Bundle;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l4.C1166c;
import l4.C1213u;
import l4.C1215v;
import p0.AbstractC1482f;
import wc.C1884a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static q f378f;

    /* renamed from: g, reason: collision with root package name */
    public static R0.o f379g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f380a;

    /* renamed from: b, reason: collision with root package name */
    public long f381b;

    /* renamed from: c, reason: collision with root package name */
    public Object f382c;

    /* renamed from: d, reason: collision with root package name */
    public Object f383d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f384e;

    public q(long j, Bundle bundle, String str, String str2) {
        this.f380a = 2;
        this.f382c = str;
        this.f383d = str2;
        this.f384e = bundle;
        this.f381b = j;
    }

    public static q b(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f378f == null) {
            f378f = new q(flutterJNI);
        }
        if (f379g == null) {
            q qVar = f378f;
            Objects.requireNonNull(qVar);
            R0.o oVar = new R0.o(qVar, displayManager, 1);
            f379g = oVar;
            displayManager.registerDisplayListener(oVar, null);
        }
        if (f378f.f381b == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f378f.f381b = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f378f;
    }

    public static q d(C1215v c1215v) {
        Bundle i3 = c1215v.f16639b.i();
        return new q(c1215v.f16641d, i3, c1215v.f16638a, c1215v.f16640c);
    }

    public boolean a(C1884a address, j call, ArrayList arrayList, boolean z2) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = ((ConcurrentLinkedQueue) this.f384e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            o connection = (o) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z2) {
                    if (!(connection.f366g != null)) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (connection.h(address, arrayList)) {
                    call.b(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public int c(o oVar, long j) {
        byte[] bArr = xc.b.f23179a;
        ArrayList arrayList = oVar.f374p;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i3);
            if (reference.get() != null) {
                i3++;
            } else {
                String str = StubApp.getString2(24995) + oVar.f361b.f22337a.f22354h + StubApp.getString2(24996);
                Ec.n nVar = Ec.n.f2161a;
                Ec.n.f2161a.j(((h) reference).f332a, str);
                arrayList.remove(i3);
                oVar.j = true;
                if (arrayList.isEmpty()) {
                    oVar.f375q = j - this.f381b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014b, code lost:
    
        if (r9 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.C0613f1 e(com.google.android.gms.internal.measurement.C0613f1 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.q.e(com.google.android.gms.internal.measurement.f1, java.lang.String):com.google.android.gms.internal.measurement.f1");
    }

    public C1215v f() {
        C1213u c1213u = new C1213u(new Bundle((Bundle) this.f384e));
        return new C1215v((String) this.f382c, c1213u, (String) this.f383d, this.f381b);
    }

    public String toString() {
        switch (this.f380a) {
            case 2:
                String obj = ((Bundle) this.f384e).toString();
                String str = (String) this.f383d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f382c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                E1.a.v(sb2, StubApp.getString2(20054), str, StubApp.getString2(17735), str2);
                return AbstractC1482f.k(sb2, StubApp.getString2(20055), obj);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q(C1166c c1166c) {
        this.f380a = 3;
        Objects.requireNonNull(c1166c);
        this.f384e = c1166c;
    }

    public q(zc.c taskRunner) {
        this.f380a = 0;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f381b = timeUnit.toNanos(5L);
        this.f382c = taskRunner.e();
        this.f383d = new p(this, Intrinsics.stringPlus(xc.b.f23184f, " ConnectionPool"));
        this.f384e = new ConcurrentLinkedQueue();
    }

    public q(FlutterJNI flutterJNI) {
        this.f380a = 1;
        this.f381b = -1L;
        this.f383d = new io.flutter.view.s(this, 0L);
        this.f384e = new io.flutter.view.b(this);
        this.f382c = flutterJNI;
    }
}

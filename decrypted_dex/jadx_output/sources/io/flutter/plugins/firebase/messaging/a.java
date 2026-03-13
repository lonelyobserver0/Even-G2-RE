package io.flutter.plugins.firebase.messaging;

import a5.c;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import c7.f;
import com.stub.StubApp;
import i.RunnableC1018B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kb.i;
import kb.j;
import kb.m;
import kb.n;
import kb.o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class a extends Service {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15087f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f15088g = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public m f15089a;

    /* renamed from: b, reason: collision with root package name */
    public o f15090b;

    /* renamed from: c, reason: collision with root package name */
    public c f15091c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15092d = false;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15093e = new ArrayList();

    public static o b(Context context, ComponentName componentName, boolean z2, int i3, boolean z10) {
        o iVar;
        f fVar = new f(8);
        HashMap hashMap = f15088g;
        o oVar = (o) hashMap.get(fVar);
        if (oVar != null) {
            return oVar;
        }
        if (z10) {
            iVar = new i(context, componentName);
        } else {
            if (!z2) {
                throw new IllegalArgumentException(StubApp.getString2(18889));
            }
            iVar = new n(context, componentName, i3);
        }
        hashMap.put(fVar, iVar);
        return iVar;
    }

    public final void a(boolean z2) {
        if (this.f15091c == null) {
            this.f15091c = new c(this);
            o oVar = this.f15090b;
            if (oVar != null && z2) {
                oVar.d();
            }
            c cVar = this.f15091c;
            ((ExecutorService) cVar.f9282b).execute(new RunnableC1018B(cVar, 4));
        }
    }

    public final void c() {
        ArrayList arrayList = this.f15093e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f15091c = null;
                    ArrayList arrayList2 = this.f15093e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f15092d) {
                        this.f15090b.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m mVar = this.f15089a;
        if (mVar != null) {
            return mVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f15089a = new m(this);
        this.f15090b = null;
        this.f15090b = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f15091c;
        if (cVar != null) {
            ((a) cVar.f9284d).c();
        }
        synchronized (this.f15093e) {
            this.f15092d = true;
            this.f15090b.c();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        this.f15090b.e();
        synchronized (this.f15093e) {
            ArrayList arrayList = this.f15093e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new j(this, intent, i10));
            a(true);
        }
        return 3;
    }
}

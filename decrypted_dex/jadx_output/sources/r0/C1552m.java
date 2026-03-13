package r0;

import R3.C0241j;
import S3.D;
import Z9.C;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.E0;

/* renamed from: r0.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1552m implements m6.j {

    /* renamed from: e, reason: collision with root package name */
    public static C1552m f20167e;

    /* renamed from: f, reason: collision with root package name */
    public static C1552m f20168f;

    /* renamed from: a, reason: collision with root package name */
    public int f20169a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20170b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20171c;

    /* renamed from: d, reason: collision with root package name */
    public Object f20172d;

    public C1552m(Collection collection, EnumMap enumMap, String str, int i3) {
        this.f20170b = collection;
        this.f20171c = enumMap;
        this.f20172d = str;
        this.f20169a = i3;
    }

    public static void a(int i3, C1552m c1552m) {
        synchronized (c1552m.f20172d) {
            try {
                if (c1552m.f20169a == i3) {
                    return;
                }
                c1552m.f20169a = i3;
                Iterator it = ((CopyOnWriteArrayList) c1552m.f20171c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    P0.f fVar = (P0.f) weakReference.get();
                    if (fVar != null) {
                        fVar.a(i3);
                    } else {
                        ((CopyOnWriteArrayList) c1552m.f20171c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C1552m e(Context context) {
        C1552m c1552m;
        synchronized (C1552m.class) {
            try {
                if (f20167e == null) {
                    f20167e = new C1552m(context);
                }
                c1552m = f20167e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1552m;
    }

    public E0 b() {
        D.a(StubApp.getString2(22535), ((R3.n) this.f20170b) != null);
        D.a(StubApp.getString2(22536), ((R3.n) this.f20171c) != null);
        D.a(StubApp.getString2(22537), ((R3.l) this.f20172d) != null);
        C0241j c0241j = (C0241j) ((R3.l) this.f20172d).f6142c;
        D.i(c0241j, StubApp.getString2(22538));
        return new E0(18, new Bc.i(this.f20169a, 7, this, (R3.l) this.f20172d), new C(this, c0241j, 22, false));
    }

    public void c() {
        synchronized (this.f20172d) {
            try {
                if (((Handler) this.f20170b) == null) {
                    if (this.f20169a <= 0) {
                        throw new IllegalStateException(StubApp.getString2("22540"));
                    }
                    HandlerThread handlerThread = new HandlerThread(StubApp.getString2("22539"));
                    this.f20171c = handlerThread;
                    handlerThread.start();
                    this.f20170b = new Handler(((HandlerThread) this.f20171c).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable) {
        synchronized (this.f20172d) {
            c();
            ((Handler) this.f20170b).post(runnable);
        }
    }

    public int f() {
        int i3;
        synchronized (this.f20172d) {
            i3 = this.f20169a;
        }
        return i3;
    }

    public int g() {
        int i3 = this.f20169a;
        if (i3 != 2) {
            return i3 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public C1552m(Context context) {
        this.f20170b = new Handler(Looper.getMainLooper());
        this.f20171c = new CopyOnWriteArrayList();
        this.f20172d = new Object();
        this.f20169a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(1355));
        context.registerReceiver(new R5.f(this, 6), intentFilter);
    }

    public C1552m(int i3, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f20170b = str;
        this.f20169a = i10;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f20171c = unmodifiableList;
        this.f20172d = bArr;
    }
}

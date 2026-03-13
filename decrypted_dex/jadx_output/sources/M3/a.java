package M3;

import J1.t;
import S3.D;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b4.AbstractC0519a;
import b4.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.common.a f4522a;

    /* renamed from: b, reason: collision with root package name */
    public d f4523b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4524c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4525d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f4526e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f4527f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4528g;

    public a(Context context) {
        D.h(context);
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f4527f = origApplicationContext != null ? origApplicationContext : context;
        this.f4524c = false;
        this.f4528g = -1L;
    }

    public static t a(Context context) {
        a aVar = new a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            t e10 = aVar.e();
            d(e10, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e10;
        } finally {
        }
    }

    public static void d(t tVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String string2 = StubApp.getString2(3511);
            String string22 = StubApp.getString2(878);
            hashMap.put(string2, string22);
            if (tVar != null) {
                if (true != tVar.f3379c) {
                    string22 = StubApp.getString2(824);
                }
                hashMap.put(StubApp.getString2(3512), string22);
                String str = tVar.f3378b;
                if (str != null) {
                    hashMap.put(StubApp.getString2(3513), Integer.toString(str.length()));
                }
            }
            if (th != null) {
                hashMap.put(StubApp.getString2(435), th.getClass().getName());
            }
            hashMap.put(StubApp.getString2(3514), StubApp.getString2(3515));
            hashMap.put(StubApp.getString2(3516), Long.toString(j));
            new b(hashMap, 0).start();
        }
    }

    public final void b() {
        D.g(StubApp.getString2(3517));
        synchronized (this) {
            try {
                if (this.f4527f == null || this.f4522a == null) {
                    return;
                }
                try {
                    if (this.f4524c) {
                        V3.a.b().c(this.f4527f, this.f4522a);
                    }
                } catch (Throwable th) {
                    Log.i(StubApp.getString2("3515"), StubApp.getString2("3518"), th);
                }
                this.f4524c = false;
                this.f4523b = null;
                this.f4522a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        D.g(StubApp.getString2(3517));
        synchronized (this) {
            try {
                if (this.f4524c) {
                    b();
                }
                Context context = this.f4527f;
                try {
                    context.getPackageManager().getPackageInfo(StubApp.getString2("3519"), 0);
                    int isGooglePlayServicesAvailable = e.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                    if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                        throw new IOException(StubApp.getString2("3520"));
                    }
                    com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                    Intent intent = new Intent(StubApp.getString2("3521"));
                    intent.setPackage(StubApp.getString2("0"));
                    try {
                        if (!V3.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException(StubApp.getString2("3524"));
                        }
                        this.f4522a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder a3 = aVar.a();
                            int i3 = b4.c.f10666e;
                            IInterface queryLocalInterface = a3.queryLocalInterface(StubApp.getString2("3522"));
                            this.f4523b = queryLocalInterface instanceof d ? (d) queryLocalInterface : new b4.b(a3);
                            this.f4524c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException(StubApp.getString2("3523"));
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final t e() {
        t tVar;
        D.g(StubApp.getString2(3517));
        synchronized (this) {
            try {
                if (!this.f4524c) {
                    synchronized (this.f4525d) {
                        c cVar = this.f4526e;
                        if (cVar == null || !cVar.f4534d) {
                            throw new IOException(StubApp.getString2("3526"));
                        }
                    }
                    try {
                        c();
                        if (!this.f4524c) {
                            throw new IOException(StubApp.getString2("3525"));
                        }
                    } catch (Exception e10) {
                        throw new IOException(StubApp.getString2("3525"), e10);
                    }
                }
                D.h(this.f4522a);
                D.h(this.f4523b);
                try {
                    b4.b bVar = (b4.b) this.f4523b;
                    bVar.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(StubApp.getString2("3522"));
                    Parcel e11 = bVar.e(obtain, 1);
                    String readString = e11.readString();
                    e11.recycle();
                    b4.b bVar2 = (b4.b) this.f4523b;
                    bVar2.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken(StubApp.getString2("3522"));
                    int i3 = AbstractC0519a.f10664a;
                    obtain2.writeInt(1);
                    Parcel e12 = bVar2.e(obtain2, 2);
                    boolean z2 = e12.readInt() != 0;
                    e12.recycle();
                    tVar = new t(readString, z2, 1);
                } catch (RemoteException e13) {
                    Log.i(StubApp.getString2("3515"), StubApp.getString2("3527"), e13);
                    throw new IOException(StubApp.getString2("3528"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4525d) {
            c cVar2 = this.f4526e;
            if (cVar2 != null) {
                cVar2.f4533c.countDown();
                try {
                    this.f4526e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.f4528g;
            if (j > 0) {
                this.f4526e = new c(this, j);
            }
        }
        return tVar;
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}

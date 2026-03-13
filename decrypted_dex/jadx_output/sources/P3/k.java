package P3;

import D5.A;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f5515a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f5516b;

    /* renamed from: c, reason: collision with root package name */
    public E0 f5517c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f5518d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f5519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f5520f;

    public k(m mVar) {
        this.f5520f = mVar;
        c4.h hVar = new c4.h(Looper.getMainLooper(), new J4.e(this, 1));
        Looper.getMainLooper();
        this.f5516b = new Messenger(hVar);
        this.f5518d = new ArrayDeque();
        this.f5519e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable(StubApp.getString2("3016"), 3)) {
                String valueOf = String.valueOf(str);
                Log.d(StubApp.getString2("3016"), StubApp.getString2("4883").concat(valueOf));
            }
            int i3 = this.f5515a;
            if (i3 == 0) {
                throw new IllegalStateException();
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                this.f5515a = 4;
                return;
            }
            if (Log.isLoggable(StubApp.getString2("3016"), 2)) {
                Log.v(StubApp.getString2("3016"), StubApp.getString2("4884"));
            }
            this.f5515a = 4;
            V3.a.b().c((Context) this.f5520f.f5529c, this);
            A a3 = new A(str, securityException);
            Iterator it = this.f5518d.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(a3);
            }
            this.f5518d.clear();
            for (int i10 = 0; i10 < this.f5519e.size(); i10++) {
                ((l) this.f5519e.valueAt(i10)).b(a3);
            }
            this.f5519e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f5515a == 2 && this.f5518d.isEmpty() && this.f5519e.size() == 0) {
                if (Log.isLoggable(StubApp.getString2("3016"), 2)) {
                    Log.v(StubApp.getString2("3016"), StubApp.getString2("4885"));
                }
                this.f5515a = 3;
                V3.a.b().c((Context) this.f5520f.f5529c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l lVar) {
        int i3 = this.f5515a;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f5518d.add(lVar);
                return true;
            }
            if (i3 != 2) {
                return false;
            }
            this.f5518d.add(lVar);
            ((ScheduledExecutorService) this.f5520f.f5530d).execute(new j(this, 0));
            return true;
        }
        this.f5518d.add(lVar);
        if (this.f5515a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable(StubApp.getString2("3016"), 2)) {
            Log.v(StubApp.getString2("3016"), StubApp.getString2("4886"));
        }
        this.f5515a = 1;
        Intent intent = new Intent(StubApp.getString2("4847"));
        intent.setPackage(StubApp.getString2("0"));
        try {
            if (V3.a.b().a((Context) this.f5520f.f5529c, intent, this, 1)) {
                ((ScheduledExecutorService) this.f5520f.f5530d).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a(StubApp.getString2("4887"));
            }
        } catch (SecurityException e10) {
            b(StubApp.getString2("4887"), e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String string2 = StubApp.getString2(3016);
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, StubApp.getString2(4888));
        }
        ((ScheduledExecutorService) this.f5520f.f5530d).execute(new Q4.b(8, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        String string2 = StubApp.getString2(3016);
        if (Log.isLoggable(string2, 2)) {
            Log.v(string2, StubApp.getString2(4878));
        }
        ((ScheduledExecutorService) this.f5520f.f5530d).execute(new j(this, 2));
    }
}

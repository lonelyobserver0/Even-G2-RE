package kb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends o {

    /* renamed from: d, reason: collision with root package name */
    public final Context f15544d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f15545e;

    /* renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f15546f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15547g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15548h;

    public i(Context context, ComponentName componentName) {
        super(componentName);
        this.f15544d = StubApp.getOrigApplicationContext(context.getApplicationContext());
        PowerManager powerManager = (PowerManager) context.getSystemService(StubApp.getString2(1358));
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + StubApp.getString2(19191));
        this.f15545e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + StubApp.getString2(19192));
        this.f15546f = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // kb.o
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f15559a);
        if (this.f15544d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f15547g) {
                        this.f15547g = true;
                        if (!this.f15548h) {
                            this.f15545e.acquire(60000L);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // kb.o
    public final void c() {
        synchronized (this) {
            try {
                if (this.f15548h) {
                    if (this.f15547g) {
                        this.f15545e.acquire(60000L);
                    }
                    this.f15548h = false;
                    this.f15546f.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kb.o
    public final void d() {
        synchronized (this) {
            try {
                if (!this.f15548h) {
                    this.f15548h = true;
                    this.f15546f.acquire(600000L);
                    this.f15545e.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kb.o
    public final void e() {
        synchronized (this) {
            this.f15547g = false;
        }
    }
}

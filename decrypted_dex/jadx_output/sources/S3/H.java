package S3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f6458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0271e f6459b;

    public H(AbstractC0271e abstractC0271e, int i3) {
        this.f6459b = abstractC0271e;
        this.f6458a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i3;
        int i10;
        AbstractC0271e abstractC0271e = this.f6459b;
        if (iBinder == null) {
            synchronized (abstractC0271e.f6497g) {
                i3 = abstractC0271e.f6503p;
            }
            if (i3 == 3) {
                abstractC0271e.f6510x = true;
                i10 = 5;
            } else {
                i10 = 4;
            }
            F f10 = abstractC0271e.f6496f;
            f10.sendMessage(f10.obtainMessage(i10, abstractC0271e.f6512z.get(), 16));
            return;
        }
        synchronized (abstractC0271e.f6498h) {
            try {
                AbstractC0271e abstractC0271e2 = this.f6459b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface(StubApp.getString2("5941"));
                abstractC0271e2.j = (queryLocalInterface == null || !(queryLocalInterface instanceof z)) ? new z(iBinder) : (z) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0271e abstractC0271e3 = this.f6459b;
        int i11 = this.f6458a;
        abstractC0271e3.getClass();
        J j = new J(abstractC0271e3, 0, null);
        F f11 = abstractC0271e3.f6496f;
        f11.sendMessage(f11.obtainMessage(7, i11, -1, j));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0271e abstractC0271e;
        synchronized (this.f6459b.f6498h) {
            abstractC0271e = this.f6459b;
            abstractC0271e.j = null;
        }
        int i3 = this.f6458a;
        F f10 = abstractC0271e.f6496f;
        f10.sendMessage(f10.obtainMessage(6, i3, 1));
    }
}

package R3;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f6164a;

    public w(int i3) {
        this.f6164a = i3;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + StubApp.getString2(994) + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(r rVar);

    public abstract com.google.android.gms.common.d[] b(r rVar);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(r rVar);

    public abstract void f(E0 e02, boolean z2);
}

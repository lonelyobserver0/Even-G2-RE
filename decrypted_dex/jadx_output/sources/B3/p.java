package B3;

import android.os.Process;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f642a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f643b;

    public /* synthetic */ p(Runnable runnable, int i3) {
        this.f642a = i3;
        this.f643b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f642a) {
            case 0:
                try {
                    this.f643b.run();
                    break;
                } catch (Exception e10) {
                    D1.f(StubApp.getString2(592), StubApp.getString2(593), e10);
                    return;
                }
            case 1:
                Process.setThreadPriority(0);
                this.f643b.run();
                break;
            default:
                this.f643b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f642a) {
            case 2:
                return this.f643b.toString();
            default:
                return super.toString();
        }
    }
}

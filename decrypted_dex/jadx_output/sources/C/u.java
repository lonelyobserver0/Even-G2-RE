package C;

import android.app.Notification;
import android.os.Build;
import com.stub.StubApp;
import n0.AbstractC1377a;
import n0.AbstractC1378b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends C {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f894e;

    @Override // C.C
    public final void b(E e10) {
        switch (this.f894e) {
            case 0:
                ((Notification.Builder) e10.f786c).setStyle(t.a());
                break;
            default:
                int i3 = Build.VERSION.SDK_INT;
                Notification.Builder builder = (Notification.Builder) e10.f786c;
                if (i3 < 34) {
                    AbstractC1377a.d(builder, AbstractC1377a.b(AbstractC1377a.a(), null, null));
                    break;
                } else {
                    AbstractC1377a.d(builder, AbstractC1377a.b(AbstractC1378b.a(AbstractC1377a.a(), null, 0, null, Boolean.FALSE), null, null));
                    break;
                }
        }
    }

    @Override // C.C
    public String c() {
        switch (this.f894e) {
            case 0:
                return StubApp.getString2(711);
            default:
                return super.c();
        }
    }
}

package S3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.stub.StubApp;
import e4.AbstractC0841a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G extends c4.b {

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0271e f6456f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6457g;

    public G(AbstractC0271e abstractC0271e, int i3) {
        super(StubApp.getString2(5937), 1);
        this.f6456f = abstractC0271e;
        this.f6457g = i3;
    }

    @Override // c4.b
    public final boolean L(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC0841a.a(parcel, Bundle.CREATOR);
            AbstractC0841a.b(parcel);
            D.i(this.f6456f, StubApp.getString2(5939));
            AbstractC0271e abstractC0271e = this.f6456f;
            abstractC0271e.getClass();
            I i10 = new I(abstractC0271e, readInt, readStrongBinder, bundle);
            F f10 = abstractC0271e.f6496f;
            f10.sendMessage(f10.obtainMessage(1, this.f6457g, -1, i10));
            this.f6456f = null;
        } else if (i3 == 2) {
            parcel.readInt();
            AbstractC0841a.b(parcel);
            Log.wtf(StubApp.getString2(5933), StubApp.getString2(5940), new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            K k3 = (K) AbstractC0841a.a(parcel, K.CREATOR);
            AbstractC0841a.b(parcel);
            AbstractC0271e abstractC0271e2 = this.f6456f;
            D.i(abstractC0271e2, StubApp.getString2(5938));
            D.h(k3);
            abstractC0271e2.f6511y = k3;
            if (abstractC0271e2.y()) {
                C0273g c0273g = k3.f6466d;
                C0280n b2 = C0280n.b();
                C0281o c0281o = c0273g == null ? null : c0273g.f6515a;
                synchronized (b2) {
                    if (c0281o == null) {
                        c0281o = C0280n.f6547c;
                    } else {
                        C0281o c0281o2 = (C0281o) b2.f6548a;
                        if (c0281o2 != null) {
                            if (c0281o2.f6549a < c0281o.f6549a) {
                            }
                        }
                    }
                    b2.f6548a = c0281o;
                }
            }
            Bundle bundle2 = k3.f6463a;
            D.i(this.f6456f, StubApp.getString2(5939));
            AbstractC0271e abstractC0271e3 = this.f6456f;
            abstractC0271e3.getClass();
            I i11 = new I(abstractC0271e3, readInt2, readStrongBinder2, bundle2);
            F f11 = abstractC0271e3.f6496f;
            f11.sendMessage(f11.obtainMessage(1, this.f6457g, -1, i11));
            this.f6456f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

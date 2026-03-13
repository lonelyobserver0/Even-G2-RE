package A;

import K4.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.Y;
import com.stub.StubApp;
import n.X0;
import w4.C1863b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23a;

    public /* synthetic */ g(int i3) {
        this.f23a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f23a) {
            case 0:
                return new h(parcel, classLoader);
            case 1:
                return new D4.b(parcel, classLoader);
            case 2:
                return new w(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return R.b.f5919b;
                }
                throw new IllegalStateException(StubApp.getString2(3));
            case 4:
                return new Y(parcel, classLoader);
            case 5:
                return new X0(parcel, classLoader);
            default:
                return new C1863b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f23a) {
            case 0:
                return new h[i3];
            case 1:
                return new D4.b[i3];
            case 2:
                return new w[i3];
            case 3:
                return new R.b[i3];
            case 4:
                return new Y[i3];
            case 5:
                return new X0[i3];
            default:
                return new C1863b[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f23a) {
            case 0:
                return new h(parcel, null);
            case 1:
                return new D4.b(parcel, null);
            case 2:
                return new w(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return R.b.f5919b;
                }
                throw new IllegalStateException(StubApp.getString2(3));
            case 4:
                return new Y(parcel, null);
            case 5:
                return new X0(parcel, null);
            default:
                return new C1863b(parcel, null);
        }
    }
}

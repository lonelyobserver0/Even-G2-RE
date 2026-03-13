package C;

import android.app.Notification;
import android.os.Parcel;
import b.C0473a;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f790b;

    /* renamed from: c, reason: collision with root package name */
    public final String f791c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification f792d;

    public F(String str, int i3, String str2, Notification notification) {
        this.f789a = str;
        this.f790b = i3;
        this.f791c = str2;
        this.f792d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f789a;
        int i3 = this.f790b;
        String str2 = this.f791c;
        C0473a c0473a = (C0473a) cVar;
        c0473a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f10401c);
            obtain.writeString(str);
            obtain.writeInt(i3);
            obtain.writeString(str2);
            Notification notification = this.f792d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0473a.f10399e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(758));
        sb2.append(this.f789a);
        sb2.append(StubApp.getString2(759));
        sb2.append(this.f790b);
        sb2.append(StubApp.getString2(760));
        return AbstractC1482f.k(sb2, this.f791c, StubApp.getString2(511));
    }
}

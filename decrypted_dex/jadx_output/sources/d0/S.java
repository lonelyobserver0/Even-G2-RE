package d0;

import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class S implements Parcelable {
    public static final Parcelable.Creator<S> CREATOR = new com.google.android.material.datepicker.l(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f13199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13200b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13202d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13203e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13204f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13205g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13206h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13207k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13208l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13209m;

    /* renamed from: n, reason: collision with root package name */
    public final int f13210n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13211p;

    public S(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t) {
        this.f13199a = abstractComponentCallbacksC0789t.getClass().getName();
        this.f13200b = abstractComponentCallbacksC0789t.f13368e;
        this.f13201c = abstractComponentCallbacksC0789t.f13379p;
        this.f13202d = abstractComponentCallbacksC0789t.f13388z;
        this.f13203e = abstractComponentCallbacksC0789t.f13346A;
        this.f13204f = abstractComponentCallbacksC0789t.f13347B;
        this.f13205g = abstractComponentCallbacksC0789t.f13350E;
        this.f13206h = abstractComponentCallbacksC0789t.f13376m;
        this.j = abstractComponentCallbacksC0789t.f13349D;
        this.f13207k = abstractComponentCallbacksC0789t.f13348C;
        this.f13208l = abstractComponentCallbacksC0789t.f13361X.ordinal();
        this.f13209m = abstractComponentCallbacksC0789t.f13371h;
        this.f13210n = abstractComponentCallbacksC0789t.j;
        this.f13211p = abstractComponentCallbacksC0789t.f13356L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(StubApp.getString2(16564));
        sb2.append(this.f13199a);
        sb2.append(StubApp.getString2(1561));
        sb2.append(this.f13200b);
        sb2.append(StubApp.getString2(16565));
        if (this.f13201c) {
            sb2.append(StubApp.getString2(16566));
        }
        int i3 = this.f13203e;
        if (i3 != 0) {
            sb2.append(StubApp.getString2(16567));
            sb2.append(Integer.toHexString(i3));
        }
        String str = this.f13204f;
        if (str != null && !str.isEmpty()) {
            sb2.append(StubApp.getString2(16568));
            sb2.append(str);
        }
        if (this.f13205g) {
            sb2.append(StubApp.getString2(16569));
        }
        if (this.f13206h) {
            sb2.append(StubApp.getString2(16570));
        }
        if (this.j) {
            sb2.append(StubApp.getString2(16571));
        }
        if (this.f13207k) {
            sb2.append(StubApp.getString2(16572));
        }
        String str2 = this.f13209m;
        if (str2 != null) {
            sb2.append(StubApp.getString2(16573));
            sb2.append(str2);
            sb2.append(StubApp.getString2(16574));
            sb2.append(this.f13210n);
        }
        if (this.f13211p) {
            sb2.append(StubApp.getString2(16575));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f13199a);
        parcel.writeString(this.f13200b);
        parcel.writeInt(this.f13201c ? 1 : 0);
        parcel.writeInt(this.f13202d);
        parcel.writeInt(this.f13203e);
        parcel.writeString(this.f13204f);
        parcel.writeInt(this.f13205g ? 1 : 0);
        parcel.writeInt(this.f13206h ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f13207k ? 1 : 0);
        parcel.writeInt(this.f13208l);
        parcel.writeString(this.f13209m);
        parcel.writeInt(this.f13210n);
        parcel.writeInt(this.f13211p ? 1 : 0);
    }

    public S(Parcel parcel) {
        this.f13199a = parcel.readString();
        this.f13200b = parcel.readString();
        this.f13201c = parcel.readInt() != 0;
        this.f13202d = parcel.readInt();
        this.f13203e = parcel.readInt();
        this.f13204f = parcel.readString();
        this.f13205g = parcel.readInt() != 0;
        this.f13206h = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.f13207k = parcel.readInt() != 0;
        this.f13208l = parcel.readInt();
        this.f13209m = parcel.readString();
        this.f13210n = parcel.readInt();
        this.f13211p = parcel.readInt() != 0;
    }
}

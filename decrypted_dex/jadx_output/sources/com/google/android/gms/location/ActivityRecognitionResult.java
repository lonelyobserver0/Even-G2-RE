package com.google.android.gms.location;

import S3.D;
import T3.a;
import a4.f;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.stub.StubApp;
import h1.n;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActivityRecognitionResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new n(18);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f11774a;

    /* renamed from: b, reason: collision with root package name */
    public long f11775b;

    /* renamed from: c, reason: collision with root package name */
    public long f11776c;

    /* renamed from: d, reason: collision with root package name */
    public int f11777d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f11778e;

    public static ArrayList d(Intent intent) {
        if (intent == null) {
            return null;
        }
        String string2 = StubApp.getString2(12330);
        if (!intent.hasExtra(string2)) {
            return null;
        }
        Parcelable.Creator<ActivityRecognitionResult> creator = CREATOR;
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(string2);
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(b.n((byte[]) arrayList.get(i3), creator));
        }
        return arrayList2;
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!f(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i3 = 0; i3 < length; i3++) {
                            if (D.k(Array.get(obj, i3), Array.get(obj2, i3))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.f11775b == activityRecognitionResult.f11775b && this.f11776c == activityRecognitionResult.f11776c && this.f11777d == activityRecognitionResult.f11777d && D.k(this.f11774a, activityRecognitionResult.f11774a) && f(this.f11778e, activityRecognitionResult.f11778e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11775b), Long.valueOf(this.f11776c), Integer.valueOf(this.f11777d), this.f11774a, this.f11778e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11774a);
        int length = valueOf.length();
        long j = this.f11775b;
        int length2 = String.valueOf(j).length();
        long j3 = this.f11776c;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 24 + String.valueOf(j3).length() + 1);
        sb2.append(StubApp.getString2(12331));
        sb2.append(valueOf);
        sb2.append(StubApp.getString2(12332));
        sb2.append(j);
        sb2.append(StubApp.getString2(12333));
        sb2.append(j3);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int I10 = f.I(parcel, 20293);
        f.H(parcel, 1, this.f11774a);
        f.P(parcel, 2, 8);
        parcel.writeLong(this.f11775b);
        f.P(parcel, 3, 8);
        parcel.writeLong(this.f11776c);
        f.P(parcel, 4, 4);
        parcel.writeInt(this.f11777d);
        f.B(parcel, 5, this.f11778e);
        f.N(parcel, I10);
    }
}

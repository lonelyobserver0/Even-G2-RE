package S3;

import android.net.Uri;
import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class L {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f6467d = new Uri.Builder().scheme(StubApp.getString2(1248)).authority(StubApp.getString2(5945)).build();

    /* renamed from: a, reason: collision with root package name */
    public final String f6468a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6469b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6470c;

    public L(String str, boolean z2) {
        D.e(str);
        this.f6468a = str;
        String string2 = StubApp.getString2(0);
        D.e(string2);
        this.f6469b = string2;
        this.f6470c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent a(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 5946(0x173a, float:8.332E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 0
            java.lang.String r2 = r5.f6468a
            if (r2 == 0) goto Ld3
            boolean r3 = r5.f6470c
            if (r3 == 0) goto Lc4
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = 5947(0x173b, float:8.334E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r3.putString(r4, r2)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            android.net.Uri r4 = S3.L.f6467d     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            if (r6 == 0) goto L46
            java.lang.String r4 = "5948"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L3d
            android.os.Bundle r3 = r6.call(r4, r1, r3)     // Catch: java.lang.Throwable -> L3d
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L39 android.os.RemoteException -> L3b
            goto L65
        L39:
            r6 = move-exception
            goto L53
        L3b:
            r6 = move-exception
            goto L53
        L3d:
            r3 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            throw r3     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
        L42:
            r6 = move-exception
            goto L52
        L44:
            r6 = move-exception
            goto L52
        L46:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            java.lang.String r3 = "5949"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            r6.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
            throw r6     // Catch: java.lang.IllegalArgumentException -> L42 android.os.RemoteException -> L44
        L52:
            r3 = r1
        L53:
            r4 = 5950(0x173e, float:8.338E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r4.concat(r6)
            android.util.Log.w(r0, r6)
        L65:
            if (r3 == 0) goto Lb4
            r6 = 5951(0x173f, float:8.339E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            android.os.Parcelable r6 = r3.getParcelable(r6)
            r1 = r6
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto Lb4
            r6 = 5952(0x1740, float:8.34E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            android.os.Parcelable r6 = r3.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L87
            goto Lb4
        L87:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 5953(0x1741, float:8.342E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r1.<init>(r3)
            r1.append(r2)
            r2 = 5954(0x1742, float:8.343E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            S3.E r0 = new S3.E
            com.google.android.gms.common.b r1 = new com.google.android.gms.common.b
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        Lb4:
            if (r1 != 0) goto Lc4
            r6 = 5955(0x1743, float:8.345E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            java.lang.String r6 = r6.concat(r2)
            android.util.Log.w(r0, r6)
        Lc4:
            if (r1 != 0) goto Ld2
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r2)
            java.lang.String r0 = r5.f6469b
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        Ld2:
            return r1
        Ld3:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Intent r6 = r6.setComponent(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.L.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l9 = (L) obj;
        return D.k(this.f6468a, l9.f6468a) && D.k(this.f6469b, l9.f6469b) && D.k(null, null) && this.f6470c == l9.f6470c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6468a, this.f6469b, null, 4225, Boolean.valueOf(this.f6470c)});
    }

    public final String toString() {
        String str = this.f6468a;
        if (str != null) {
            return str;
        }
        D.h(null);
        throw null;
    }
}

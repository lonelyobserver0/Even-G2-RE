package C;

import android.net.Uri;
import android.os.Bundle;
import com.stub.StubApp;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f769a;

    /* renamed from: b, reason: collision with root package name */
    public final long f770b;

    /* renamed from: c, reason: collision with root package name */
    public final K f771c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f772d = new Bundle();

    /* renamed from: e, reason: collision with root package name */
    public String f773e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f774f;

    public A(CharSequence charSequence, long j, K k3) {
        this.f769a = charSequence;
        this.f770b = j;
        this.f771c = k3;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            A a3 = (A) arrayList.get(i3);
            a3.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = a3.f769a;
            if (charSequence != null) {
                bundle.putCharSequence(StubApp.getString2(613), charSequence);
            }
            bundle.putLong(StubApp.getString2(699), a3.f770b);
            K k3 = a3.f771c;
            if (k3 != null) {
                bundle.putCharSequence(StubApp.getString2(700), k3.f811a);
                bundle.putParcelable(StubApp.getString2(701), z.a(k3.c()));
            }
            String str = a3.f773e;
            if (str != null) {
                bundle.putString(StubApp.getString2(660), str);
            }
            Uri uri = a3.f774f;
            if (uri != null) {
                bundle.putParcelable(StubApp.getString2(614), uri);
            }
            Bundle bundle2 = a3.f772d;
            if (bundle2 != null) {
                bundle.putBundle(StubApp.getString2(702), bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r0.add(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(android.os.Parcelable[] r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L8:
            int r3 = r14.length
            if (r2 >= r3) goto Ld8
            r3 = r14[r2]
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto Ld4
            android.os.Bundle r3 = (android.os.Bundle) r3
            r4 = 702(0x2be, float:9.84E-43)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r5 = 614(0x266, float:8.6E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r6 = 660(0x294, float:9.25E-43)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r7 = 700(0x2bc, float:9.81E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r8 = 701(0x2bd, float:9.82E-43)
            java.lang.String r8 = com.stub.StubApp.getString2(r8)
            r9 = 703(0x2bf, float:9.85E-43)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r10 = 699(0x2bb, float:9.8E-43)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r11 = 613(0x265, float:8.59E-43)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            r12 = 0
            boolean r13 = r3.containsKey(r11)     // Catch: java.lang.ClassCastException -> Lcf
            if (r13 == 0) goto Lcf
            boolean r13 = r3.containsKey(r10)     // Catch: java.lang.ClassCastException -> Lcf
            if (r13 != 0) goto L5a
            goto Lcf
        L5a:
            boolean r13 = r3.containsKey(r9)     // Catch: java.lang.ClassCastException -> Lcf
            if (r13 == 0) goto L69
            android.os.Bundle r7 = r3.getBundle(r9)     // Catch: java.lang.ClassCastException -> Lcf
            C.K r7 = C.K.b(r7)     // Catch: java.lang.ClassCastException -> Lcf
            goto L98
        L69:
            boolean r9 = r3.containsKey(r8)     // Catch: java.lang.ClassCastException -> Lcf
            if (r9 == 0) goto L7a
            android.os.Parcelable r7 = r3.getParcelable(r8)     // Catch: java.lang.ClassCastException -> Lcf
            android.app.Person r7 = (android.app.Person) r7     // Catch: java.lang.ClassCastException -> Lcf
            C.K r7 = C.K.a(r7)     // Catch: java.lang.ClassCastException -> Lcf
            goto L98
        L7a:
            boolean r8 = r3.containsKey(r7)     // Catch: java.lang.ClassCastException -> Lcf
            if (r8 == 0) goto L97
            java.lang.CharSequence r7 = r3.getCharSequence(r7)     // Catch: java.lang.ClassCastException -> Lcf
            C.K r8 = new C.K     // Catch: java.lang.ClassCastException -> Lcf
            r8.<init>()     // Catch: java.lang.ClassCastException -> Lcf
            r8.f811a = r7     // Catch: java.lang.ClassCastException -> Lcf
            r8.f812b = r12     // Catch: java.lang.ClassCastException -> Lcf
            r8.f813c = r12     // Catch: java.lang.ClassCastException -> Lcf
            r8.f814d = r12     // Catch: java.lang.ClassCastException -> Lcf
            r8.f815e = r1     // Catch: java.lang.ClassCastException -> Lcf
            r8.f816f = r1     // Catch: java.lang.ClassCastException -> Lcf
            r7 = r8
            goto L98
        L97:
            r7 = r12
        L98:
            C.A r8 = new C.A     // Catch: java.lang.ClassCastException -> Lcf
            java.lang.CharSequence r9 = r3.getCharSequence(r11)     // Catch: java.lang.ClassCastException -> Lcf
            long r10 = r3.getLong(r10)     // Catch: java.lang.ClassCastException -> Lcf
            r8.<init>(r9, r10, r7)     // Catch: java.lang.ClassCastException -> Lcf
            boolean r7 = r3.containsKey(r6)     // Catch: java.lang.ClassCastException -> Lcf
            if (r7 == 0) goto Lbf
            boolean r7 = r3.containsKey(r5)     // Catch: java.lang.ClassCastException -> Lcf
            if (r7 == 0) goto Lbf
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.ClassCastException -> Lcf
            android.os.Parcelable r5 = r3.getParcelable(r5)     // Catch: java.lang.ClassCastException -> Lcf
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.ClassCastException -> Lcf
            r8.f773e = r6     // Catch: java.lang.ClassCastException -> Lcf
            r8.f774f = r5     // Catch: java.lang.ClassCastException -> Lcf
        Lbf:
            boolean r5 = r3.containsKey(r4)     // Catch: java.lang.ClassCastException -> Lcf
            if (r5 == 0) goto Lce
            android.os.Bundle r5 = r8.f772d     // Catch: java.lang.ClassCastException -> Lcf
            android.os.Bundle r3 = r3.getBundle(r4)     // Catch: java.lang.ClassCastException -> Lcf
            r5.putAll(r3)     // Catch: java.lang.ClassCastException -> Lcf
        Lce:
            r12 = r8
        Lcf:
            if (r12 == 0) goto Ld4
            r0.add(r12)
        Ld4:
            int r2 = r2 + 1
            goto L8
        Ld8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.A.b(android.os.Parcelable[]):java.util.ArrayList");
    }
}

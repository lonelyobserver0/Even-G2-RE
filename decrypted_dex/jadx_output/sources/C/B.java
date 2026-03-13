package C;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class B extends C {

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f775e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f776f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public K f777g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f778h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f779i;

    public B() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C.B e(android.app.Notification r6) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.B.e(android.app.Notification):C.B");
    }

    @Override // C.C
    public final void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        bundle.putCharSequence(StubApp.getString2(712), this.f777g.f811a);
        K k3 = this.f777g;
        k3.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putCharSequence(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), k3.f811a);
        IconCompat iconCompat = k3.f812b;
        if (iconCompat != null) {
            bundle2 = new Bundle();
            int i3 = iconCompat.f9662a;
            String string2 = StubApp.getString2(720);
            switch (i3) {
                case -1:
                    bundle2.putParcelable(string2, (Parcelable) iconCompat.f9663b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException(StubApp.getString2(721));
                case 1:
                case 5:
                    bundle2.putParcelable(string2, (Bitmap) iconCompat.f9663b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle2.putString(string2, (String) iconCompat.f9663b);
                    break;
                case 3:
                    bundle2.putByteArray(string2, (byte[]) iconCompat.f9663b);
                    break;
            }
            bundle2.putInt(StubApp.getString2(660), iconCompat.f9662a);
            bundle2.putInt(StubApp.getString2(722), iconCompat.f9666e);
            bundle2.putInt(StubApp.getString2(723), iconCompat.f9667f);
            bundle2.putString(StubApp.getString2(724), iconCompat.j);
            ColorStateList colorStateList = iconCompat.f9668g;
            if (colorStateList != null) {
                bundle2.putParcelable(StubApp.getString2(725), colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f9669h;
            if (mode != IconCompat.f9661k) {
                bundle2.putString(StubApp.getString2(726), mode.name());
            }
        } else {
            bundle2 = null;
        }
        bundle3.putBundle(StubApp.getString2(727), bundle2);
        bundle3.putString(StubApp.getString2(614), k3.f813c);
        bundle3.putString(StubApp.getString2(728), k3.f814d);
        bundle3.putBoolean(StubApp.getString2(729), k3.f815e);
        bundle3.putBoolean(StubApp.getString2(730), k3.f816f);
        bundle.putBundle(StubApp.getString2(713), bundle3);
        bundle.putCharSequence(StubApp.getString2(731), this.f778h);
        if (this.f778h != null && this.f779i.booleanValue()) {
            bundle.putCharSequence(StubApp.getString2(732), this.f778h);
        }
        ArrayList arrayList = this.f775e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray(StubApp.getString2(733), A.a(arrayList));
        }
        ArrayList arrayList2 = this.f776f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray(StubApp.getString2(734), A.a(arrayList2));
        }
        Boolean bool = this.f779i;
        if (bool != null) {
            bundle.putBoolean(StubApp.getString2(735), bool.booleanValue());
        }
    }

    @Override // C.C
    public final void b(E e10) {
        this.f779i = Boolean.valueOf(f());
        Notification.MessagingStyle a3 = x.a(this.f777g.c());
        Iterator it = this.f775e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            A a9 = (A) it.next();
            K k3 = a9.f771c;
            Notification.MessagingStyle.Message b2 = z.b(a9.f769a, a9.f770b, k3 != null ? k3.c() : null);
            String str = a9.f773e;
            if (str != null) {
                y.a(b2, str, a9.f774f);
            }
            v.a(a3, b2);
        }
        Iterator it2 = this.f776f.iterator();
        while (it2.hasNext()) {
            A a10 = (A) it2.next();
            K k4 = a10.f771c;
            Notification.MessagingStyle.Message b10 = z.b(a10.f769a, a10.f770b, k4 == null ? null : k4.c());
            String str2 = a10.f773e;
            if (str2 != null) {
                y.a(b10, str2, a10.f774f);
            }
            w.a(a3, b10);
        }
        this.f779i.getClass();
        v.b(a3, this.f778h);
        x.b(a3, this.f779i.booleanValue());
        a3.setBuilder((Notification.Builder) e10.f786c);
    }

    @Override // C.C
    public final String c() {
        return StubApp.getString2(706);
    }

    @Override // C.C
    public final void d(Bundle bundle) {
        super.d(bundle);
        ArrayList arrayList = this.f775e;
        arrayList.clear();
        String string2 = StubApp.getString2(713);
        if (bundle.containsKey(string2)) {
            this.f777g = K.b(bundle.getBundle(string2));
        } else {
            String string = bundle.getString(StubApp.getString2(712));
            K k3 = new K();
            k3.f811a = string;
            k3.f812b = null;
            k3.f813c = null;
            k3.f814d = null;
            k3.f815e = false;
            k3.f816f = false;
            this.f777g = k3;
        }
        CharSequence charSequence = bundle.getCharSequence(StubApp.getString2(732));
        this.f778h = charSequence;
        if (charSequence == null) {
            this.f778h = bundle.getCharSequence(StubApp.getString2(731));
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(StubApp.getString2(733));
        if (parcelableArray != null) {
            arrayList.addAll(A.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray(StubApp.getString2(734));
        if (parcelableArray2 != null) {
            this.f776f.addAll(A.b(parcelableArray2));
        }
        String string22 = StubApp.getString2(735);
        if (bundle.containsKey(string22)) {
            this.f779i = Boolean.valueOf(bundle.getBoolean(string22));
        }
    }

    public final boolean f() {
        C0036m c0036m = this.f780a;
        if (c0036m != null && c0036m.f860a.getApplicationInfo().targetSdkVersion < 28 && this.f779i == null) {
            return this.f778h != null;
        }
        Boolean bool = this.f779i;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public B(K k3) {
        if (!TextUtils.isEmpty(k3.f811a)) {
            this.f777g = k3;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(704));
    }
}

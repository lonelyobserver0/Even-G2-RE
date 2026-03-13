package C;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0029f {

    /* renamed from: a, reason: collision with root package name */
    public final IconCompat f825a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f826b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f827c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f828d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f829e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f830f;

    /* renamed from: g, reason: collision with root package name */
    public int f831g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f832h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f833i;

    public C0029f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f828d = true;
        this.f832h = true;
        this.f825a = iconCompat;
        this.f826b = C0036m.c(charSequence);
        this.f827c = pendingIntent;
        this.f829e = bundle;
        this.f830f = null;
        this.f828d = true;
        this.f831g = 0;
        this.f832h = true;
        this.f833i = false;
    }

    public final C0030g a() {
        CharSequence[] charSequenceArr;
        if (this.f833i && this.f827c == null) {
            throw new NullPointerException(StubApp.getString2(798));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f830f;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                M m4 = (M) it.next();
                if (m4.f820c || (!((charSequenceArr = m4.f819b) == null || charSequenceArr.length == 0) || m4.f822e.isEmpty())) {
                    arrayList2.add(m4);
                } else {
                    arrayList.add(m4);
                }
            }
        }
        return new C0030g(this.f825a, this.f826b, this.f827c, this.f829e, arrayList2.isEmpty() ? null : (M[]) arrayList2.toArray(new M[arrayList2.size()]), arrayList.isEmpty() ? null : (M[]) arrayList.toArray(new M[arrayList.size()]), this.f828d, this.f831g, this.f832h, this.f833i);
    }
}

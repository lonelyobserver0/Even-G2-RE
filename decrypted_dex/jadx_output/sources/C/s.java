package C;

import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s extends C {

    /* renamed from: e, reason: collision with root package name */
    public int f885e;

    /* renamed from: f, reason: collision with root package name */
    public K f886f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f887g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f888h;

    /* renamed from: i, reason: collision with root package name */
    public PendingIntent f889i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f890k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f891l;

    /* renamed from: m, reason: collision with root package name */
    public IconCompat f892m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f893n;

    @Override // C.C
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt(StubApp.getString2(718), this.f885e);
        bundle.putBoolean(StubApp.getString2(802), this.j);
        K k3 = this.f886f;
        if (k3 != null) {
            bundle.putParcelable(StubApp.getString2(803), q.b(k3.c()));
        }
        IconCompat iconCompat = this.f892m;
        if (iconCompat != null) {
            bundle.putParcelable(StubApp.getString2(804), p.a(iconCompat.h(this.f780a.f860a)));
        }
        bundle.putCharSequence(StubApp.getString2(805), this.f893n);
        bundle.putParcelable(StubApp.getString2(806), this.f887g);
        bundle.putParcelable(StubApp.getString2(807), this.f888h);
        bundle.putParcelable(StubApp.getString2(808), this.f889i);
        Integer num = this.f890k;
        if (num != null) {
            bundle.putInt(StubApp.getString2(809), num.intValue());
        }
        Integer num2 = this.f891l;
        if (num2 != null) {
            bundle.putInt(StubApp.getString2(810), num2.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    @Override // C.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(C.E r7) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.s.b(C.E):void");
    }

    @Override // C.C
    public final String c() {
        return StubApp.getString2(709);
    }

    @Override // C.C
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f885e = bundle.getInt(StubApp.getString2(718));
        this.j = bundle.getBoolean(StubApp.getString2(802));
        String string2 = StubApp.getString2(803);
        if (bundle.containsKey(string2)) {
            this.f886f = K.a((Person) bundle.getParcelable(string2));
        } else {
            String string22 = StubApp.getString2(815);
            if (bundle.containsKey(string22)) {
                this.f886f = K.b(bundle.getBundle(string22));
            }
        }
        String string23 = StubApp.getString2(804);
        if (bundle.containsKey(string23)) {
            this.f892m = IconCompat.c((Icon) bundle.getParcelable(string23));
        } else {
            String string24 = StubApp.getString2(816);
            if (bundle.containsKey(string24)) {
                this.f892m = IconCompat.b(bundle.getBundle(string24));
            }
        }
        this.f893n = bundle.getCharSequence(StubApp.getString2(805));
        this.f887g = (PendingIntent) bundle.getParcelable(StubApp.getString2(806));
        this.f888h = (PendingIntent) bundle.getParcelable(StubApp.getString2(807));
        this.f889i = (PendingIntent) bundle.getParcelable(StubApp.getString2(808));
        String string25 = StubApp.getString2(809);
        this.f890k = bundle.containsKey(string25) ? Integer.valueOf(bundle.getInt(string25)) : null;
        String string26 = StubApp.getString2(810);
        this.f891l = bundle.containsKey(string26) ? Integer.valueOf(bundle.getInt(string26)) : null;
    }

    public final C0030g e(int i3, int i10, Integer num, int i11, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.f780a.f860a.getColor(i11));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f780a.f860a.getResources().getString(i10));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.f780a.f860a;
        PorterDuff.Mode mode = IconCompat.f9661k;
        context.getClass();
        C0030g a3 = new C0029f(IconCompat.e(context.getResources(), context.getPackageName(), i3), spannableStringBuilder, pendingIntent).a();
        a3.f834a.putBoolean(StubApp.getString2(738), true);
        return a3;
    }
}

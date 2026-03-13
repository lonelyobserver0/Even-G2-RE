package N;

import android.text.TextUtils;
import android.view.View;

/* renamed from: N.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0176w extends AbstractC0178y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4807e;

    public C0176w(int i3, Class cls, int i10, int i11, int i12) {
        this.f4807e = i12;
        this.f4809a = i3;
        this.f4812d = cls;
        this.f4811c = i10;
        this.f4810b = i11;
    }

    @Override // N.AbstractC0178y
    public final Object b(View view) {
        switch (this.f4807e) {
            case 0:
                return Boolean.valueOf(E.c(view));
            case 1:
                return E.a(view);
            case 2:
                return G.b(view);
            default:
                return Boolean.valueOf(E.b(view));
        }
    }

    @Override // N.AbstractC0178y
    public final void c(View view, Object obj) {
        switch (this.f4807e) {
            case 0:
                E.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                E.e(view, (CharSequence) obj);
                break;
            case 2:
                G.c(view, (CharSequence) obj);
                break;
            default:
                E.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // N.AbstractC0178y
    public final boolean e(Object obj, Object obj2) {
        switch (this.f4807e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}

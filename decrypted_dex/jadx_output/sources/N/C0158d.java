package N;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.stub.StubApp;
import java.util.Locale;
import p0.AbstractC1482f;

/* renamed from: N.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0158d implements InterfaceC0157c, InterfaceC0159e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4772a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f4773b;

    /* renamed from: c, reason: collision with root package name */
    public int f4774c;

    /* renamed from: d, reason: collision with root package name */
    public int f4775d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f4776e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f4777f;

    public /* synthetic */ C0158d() {
    }

    @Override // N.InterfaceC0159e
    public ClipData a() {
        return this.f4773b;
    }

    @Override // N.InterfaceC0157c
    public void b(Bundle bundle) {
        this.f4777f = bundle;
    }

    @Override // N.InterfaceC0157c
    public C0160f build() {
        return new C0160f(new C0158d(this));
    }

    @Override // N.InterfaceC0157c
    public void c(Uri uri) {
        this.f4776e = uri;
    }

    @Override // N.InterfaceC0157c
    public void d(int i3) {
        this.f4775d = i3;
    }

    @Override // N.InterfaceC0159e
    public int e() {
        return this.f4775d;
    }

    @Override // N.InterfaceC0159e
    public ContentInfo g() {
        return null;
    }

    @Override // N.InterfaceC0159e
    public int h() {
        return this.f4774c;
    }

    public String toString() {
        String str;
        switch (this.f4772a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(3632));
                sb2.append(this.f4773b.getDescription());
                sb2.append(StubApp.getString2(3633));
                int i3 = this.f4774c;
                sb2.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? String.valueOf(i3) : StubApp.getString2(3634) : StubApp.getString2(3635) : StubApp.getString2(3636) : StubApp.getString2(3637) : StubApp.getString2(3638) : StubApp.getString2(3639));
                sb2.append(StubApp.getString2(2527));
                int i10 = this.f4775d;
                sb2.append((i10 & 1) != 0 ? StubApp.getString2(3640) : String.valueOf(i10));
                Uri uri = this.f4776e;
                if (uri == null) {
                    str = "";
                } else {
                    str = StubApp.getString2(3641) + uri.toString().length() + StubApp.getString2(74);
                }
                sb2.append(str);
                return AbstractC1482f.k(sb2, this.f4777f != null ? StubApp.getString2(3642) : "", StubApp.getString2(265));
            default:
                return super.toString();
        }
    }

    public C0158d(C0158d c0158d) {
        ClipData clipData = c0158d.f4773b;
        clipData.getClass();
        this.f4773b = clipData;
        int i3 = c0158d.f4774c;
        if (i3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(StubApp.getString2(3631));
        }
        if (i3 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(StubApp.getString2(3630));
        }
        this.f4774c = i3;
        int i10 = c0158d.f4775d;
        if ((i10 & 1) == i10) {
            this.f4775d = i10;
            this.f4776e = c0158d.f4776e;
            this.f4777f = c0158d.f4777f;
        } else {
            throw new IllegalArgumentException(StubApp.getString2(3627) + Integer.toHexString(i10) + StubApp.getString2(3628) + Integer.toHexString(1) + StubApp.getString2(3629));
        }
    }
}

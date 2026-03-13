package l4;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final String f16331a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16332b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16333c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1164b0 f16335e;

    public Z(C1164b0 c1164b0, String str, boolean z2) {
        Objects.requireNonNull(c1164b0);
        this.f16335e = c1164b0;
        S3.D.e(str);
        this.f16331a = str;
        this.f16332b = z2;
    }

    public final boolean a() {
        if (!this.f16333c) {
            this.f16333c = true;
            this.f16334d = this.f16335e.o().getBoolean(this.f16331a, this.f16332b);
        }
        return this.f16334d;
    }

    public final void b(boolean z2) {
        SharedPreferences.Editor edit = this.f16335e.o().edit();
        edit.putBoolean(this.f16331a, z2);
        edit.apply();
        this.f16334d = z2;
    }
}

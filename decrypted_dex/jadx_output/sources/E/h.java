package E;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1708a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1709b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1710c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1708a = colorStateList;
        this.f1709b = configuration;
        this.f1710c = theme == null ? 0 : theme.hashCode();
    }
}

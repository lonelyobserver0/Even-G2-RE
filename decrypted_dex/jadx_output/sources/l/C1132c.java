package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.stub.StubApp;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1132c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f15648f;

    /* renamed from: a, reason: collision with root package name */
    public int f15649a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f15650b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f15651c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f15652d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f15653e;

    public C1132c(Context context, int i3) {
        super(context);
        this.f15649a = i3;
    }

    public final void a(Configuration configuration) {
        if (this.f15653e != null) {
            throw new IllegalStateException(StubApp.getString2(19198));
        }
        if (this.f15652d != null) {
            throw new IllegalStateException(StubApp.getString2(19197));
        }
        this.f15652d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f15650b == null) {
            this.f15650b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f15650b.setTo(theme);
            }
        }
        this.f15650b.applyStyle(this.f15649a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f15653e == null) {
            Configuration configuration = this.f15652d;
            if (configuration != null) {
                if (f15648f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f15648f = configuration2;
                }
                if (!configuration.equals(f15648f)) {
                    this.f15653e = createConfigurationContext(this.f15652d).getResources();
                }
            }
            this.f15653e = super.getResources();
        }
        return this.f15653e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!StubApp.getString2(18373).equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f15651c == null) {
            this.f15651c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f15651c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f15650b;
        if (theme != null) {
            return theme;
        }
        if (this.f15649a == 0) {
            this.f15649a = 2131821018;
        }
        b();
        return this.f15650b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        if (this.f15649a != i3) {
            this.f15649a = i3;
            b();
        }
    }
}

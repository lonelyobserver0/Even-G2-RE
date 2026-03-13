package Ya;

import Xa.AbstractActivityC0364d;
import androidx.lifecycle.C0446v;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements eb.b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0364d f8882a;

    /* renamed from: b, reason: collision with root package name */
    public final HiddenLifecycleReference f8883b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f8884c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8885d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f8886e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f8887f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f8888g;

    public d(AbstractActivityC0364d abstractActivityC0364d, C0446v c0446v) {
        new HashSet();
        this.f8888g = new HashSet();
        this.f8882a = abstractActivityC0364d;
        this.f8883b = new HiddenLifecycleReference(c0446v);
    }

    public final void a(PluginRegistry.ActivityResultListener activityResultListener) {
        this.f8885d.add(activityResultListener);
    }

    public final void b(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
        this.f8884c.add(requestPermissionsResultListener);
    }

    public final void c(PluginRegistry.ActivityResultListener activityResultListener) {
        this.f8885d.remove(activityResultListener);
    }
}

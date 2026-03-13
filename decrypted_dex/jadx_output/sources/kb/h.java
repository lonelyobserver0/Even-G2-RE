package kb;

import com.stub.StubApp;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    public e f15542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15543b;

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        e eVar;
        int i10 = 0;
        if (!this.f15543b || i3 != 240 || (eVar = this.f15542a) == null) {
            return false;
        }
        this.f15543b = false;
        if (iArr.length > 0 && iArr[0] == 0) {
            i10 = 1;
        }
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = (HashMap) eVar.f15529a;
        hashMap.put(StubApp.getString2(19162), valueOf);
        ((q4.k) eVar.f15530b).b(hashMap);
        return true;
    }
}

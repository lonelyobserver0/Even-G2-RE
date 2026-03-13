package io.flutter.plugin.text;

import Ya.d;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import eb.a;
import eb.b;
import gb.O;
import gb.P;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ProcessTextPlugin implements InterfaceC0825b, a, PluginRegistry.ActivityResultListener, O {
    private static final String TAG = StubApp.getString2(18815);
    private b activityBinding;
    private final PackageManager packageManager;
    private final P processTextChannel;
    private Map<Integer, MethodChannel.Result> requestsByCode = new HashMap();
    private Map<String, ResolveInfo> resolveInfosById;

    public ProcessTextPlugin(P p8) {
        this.processTextChannel = p8;
        this.packageManager = p8.f14298a;
        p8.f14299b = this;
    }

    private void cacheResolveInfos() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        this.resolveInfosById = new HashMap();
        int i3 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction(StubApp.getString2(18809)).setType(StubApp.getString2(625));
        if (i3 >= 33) {
            PackageManager packageManager = this.packageManager;
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(type, of);
        } else {
            queryIntentActivities = this.packageManager.queryIntentActivities(type, 0);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.packageManager).toString();
            this.resolveInfosById.put(str, resolveInfo);
        }
    }

    public void destroy() {
        this.processTextChannel.f14299b = null;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    @TargetApi(23)
    public boolean onActivityResult(int i3, int i10, Intent intent) {
        if (!this.requestsByCode.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        this.requestsByCode.remove(Integer.valueOf(i3)).success(i10 == -1 ? intent.getStringExtra(StubApp.getString2(18810)) : null);
        return true;
    }

    @Override // eb.a
    public void onAttachedToActivity(b bVar) {
        this.activityBinding = bVar;
        ((d) bVar).a(this);
    }

    @Override // db.InterfaceC0825b
    public void onAttachedToEngine(C0824a c0824a) {
    }

    @Override // eb.a
    public void onDetachedFromActivity() {
        ((d) this.activityBinding).c(this);
        this.activityBinding = null;
    }

    @Override // eb.a
    public void onDetachedFromActivityForConfigChanges() {
        ((d) this.activityBinding).c(this);
        this.activityBinding = null;
    }

    @Override // db.InterfaceC0825b
    public void onDetachedFromEngine(C0824a c0824a) {
    }

    @Override // eb.a
    public void onReattachedToActivityForConfigChanges(b bVar) {
        this.activityBinding = bVar;
        ((d) bVar).a(this);
    }

    @Override // gb.O
    public void processTextAction(String str, String str2, boolean z2, MethodChannel.Result result) {
        b bVar = this.activityBinding;
        String string2 = StubApp.getString2(435);
        if (bVar == null) {
            result.error(string2, StubApp.getString2(18811), null);
            return;
        }
        Map<String, ResolveInfo> map = this.resolveInfosById;
        if (map == null) {
            result.error(string2, StubApp.getString2(18812), null);
            return;
        }
        ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            result.error(string2, StubApp.getString2(18813), null);
            return;
        }
        int hashCode = result.hashCode();
        this.requestsByCode.put(Integer.valueOf(hashCode), result);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction(StubApp.getString2(18809));
        intent.setType(StubApp.getString2(625));
        intent.putExtra(StubApp.getString2(18810), str2);
        intent.putExtra(StubApp.getString2(18814), z2);
        ((d) this.activityBinding).f8882a.startActivityForResult(intent, hashCode);
    }

    @Override // gb.O
    public Map<String, String> queryTextActions() {
        if (this.resolveInfosById == null) {
            cacheResolveInfos();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.resolveInfosById.keySet()) {
            hashMap.put(str, this.resolveInfosById.get(str).loadLabel(this.packageManager).toString());
        }
        return hashMap;
    }
}

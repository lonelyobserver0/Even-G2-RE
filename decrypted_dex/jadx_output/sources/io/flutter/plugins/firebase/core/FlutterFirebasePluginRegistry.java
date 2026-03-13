package io.flutter.plugins.firebase.core;

import R4.h;
import androidx.annotation.Keep;
import hb.f;
import ib.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import q4.j;
import q4.k;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static j didReinitializeFirebaseCore() {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(2, kVar));
        return kVar.f20051a;
    }

    public static j getPluginConstantsForFirebaseApp(h hVar) {
        k kVar = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(hVar, kVar, 0));
        return kVar.f20051a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(k kVar) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                a4.f.b(it.next().getValue().didReinitializeFirebaseCore());
            }
            kVar.b(null);
        } catch (Exception e10) {
            kVar.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(h hVar, k kVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), a4.f.b(entry.getValue().getPluginConstantsForFirebaseApp(hVar)));
            }
            kVar.b(hashMap);
        } catch (Exception e10) {
            kVar.a(e10);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}

package a7;

import b3.C0502d;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f9295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, Map map, int i3) {
        super(2);
        this.f9293a = i3;
        this.f9294b = fVar;
        this.f9295c = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b7.a annotation;
        ArrayList arrayList;
        switch (this.f9293a) {
            case 0:
                Boolean bool = Boolean.FALSE;
                FeaturesetFeature selectedFeature = (FeaturesetFeature) obj;
                Intrinsics.checkNotNullParameter(selectedFeature, "selectedFeature");
                Intrinsics.checkNotNullParameter((InteractionContext) obj2, "<anonymous parameter 1>");
                JSONObject properties = selectedFeature.getProperties();
                f fVar = this.f9294b;
                String optString = properties.optString(fVar.h(), "");
                if (!Intrinsics.areEqual(optString, "") && (annotation = (b7.a) this.f9295c.get(optString)) != null) {
                    ArrayList arrayList2 = fVar.f9316q;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            throw com.mapbox.common.b.e(it);
                        }
                    }
                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                    LinkedHashMap linkedHashMap = fVar.f9305e;
                    String str = annotation.f10709a;
                    boolean containsKey = linkedHashMap.containsKey(str);
                    ArrayList arrayList3 = fVar.f9318s;
                    if (containsKey) {
                        annotation.f10712d = !annotation.f10712d;
                        linkedHashMap.put(str, annotation);
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C0502d c0502d = (C0502d) it2.next();
                            if (annotation.f10712d) {
                                c0502d.a(annotation);
                            } else {
                                c0502d.getClass();
                                Intrinsics.checkNotNullParameter(annotation, "annotation");
                            }
                        }
                    } else {
                        LinkedHashMap linkedHashMap2 = fVar.f9306f;
                        if (linkedHashMap2.containsKey(str)) {
                            annotation.f10712d = !annotation.f10712d;
                            linkedHashMap2.put(str, annotation);
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                C0502d c0502d2 = (C0502d) it3.next();
                                if (annotation.f10712d) {
                                    c0502d2.a(annotation);
                                } else {
                                    c0502d2.getClass();
                                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                                }
                            }
                        } else {
                            MapboxLogger.logE(StubApp.getString2(8509), StubApp.getString2(8507) + annotation + StubApp.getString2(8508));
                        }
                    }
                }
                return bool;
            case 1:
                FeaturesetFeature selectedFeature2 = (FeaturesetFeature) obj;
                Intrinsics.checkNotNullParameter(selectedFeature2, "selectedFeature");
                Intrinsics.checkNotNullParameter((InteractionContext) obj2, "<anonymous parameter 1>");
                String optString2 = selectedFeature2.getProperties().optString(this.f9294b.h(), "");
                if (Intrinsics.areEqual(optString2, "") || ((b7.a) this.f9295c.get(optString2)) == null) {
                    return Boolean.FALSE;
                }
                return false;
            default:
                Boolean bool2 = Boolean.FALSE;
                FeaturesetFeature selectedFeature3 = (FeaturesetFeature) obj;
                Intrinsics.checkNotNullParameter(selectedFeature3, "selectedFeature");
                Intrinsics.checkNotNullParameter((InteractionContext) obj2, "<anonymous parameter 1>");
                JSONObject properties2 = selectedFeature3.getProperties();
                f fVar2 = this.f9294b;
                String optString3 = properties2.optString(fVar2.h(), "");
                if (!Intrinsics.areEqual(optString3, "") && ((b7.a) this.f9295c.get(optString3)) != null && ((arrayList = fVar2.f9317r) == null || !arrayList.isEmpty())) {
                    Iterator it4 = arrayList.iterator();
                    if (it4.hasNext()) {
                        throw com.mapbox.common.b.e(it4);
                    }
                }
                return bool2;
        }
    }
}

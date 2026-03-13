package o3;

import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1457a implements Serializable {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"o3/a$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "flutter_ezw_utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C0005a extends TypeToken<Map<String, ? extends Object>> {
    }

    public String toJson() {
        String json = b.f18362a.toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public Map<String, Object> toMap() {
        Object fromJson = b.f18362a.fromJson(toJson(), new C0005a().getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return (Map) fromJson;
    }
}

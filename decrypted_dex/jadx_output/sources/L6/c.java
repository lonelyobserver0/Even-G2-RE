package L6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(level = DeprecationLevel.WARNING, message = "This enum class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "SourceDataLoadedType", imports = {}))
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"LL6/c;", "", "a", "b", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("metadata")
    public static final c f4262a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("tile")
    public static final c f4263b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f4264c;

    static {
        c cVar = new c(StubApp.getString2(3419), 0);
        f4262a = cVar;
        c cVar2 = new c(StubApp.getString2(3415), 1);
        f4263b = cVar2;
        f4264c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4264c.clone();
    }
}

package L6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(level = DeprecationLevel.WARNING, message = "This enum class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "StyleDataLoadedType", imports = {}))
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"LL6/d;", "", "a", "b", "c", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("style")
    public static final d f4265a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("sprite")
    public static final d f4266b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("sources")
    public static final d f4267c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f4268d;

    static {
        d dVar = new d(StubApp.getString2(3412), 0);
        f4265a = dVar;
        d dVar2 = new d(StubApp.getString2(3413), 1);
        f4266b = dVar2;
        d dVar3 = new d(StubApp.getString2(3420), 2);
        f4267c = dVar3;
        f4268d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4268d.clone();
    }
}

package L6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated(level = DeprecationLevel.WARNING, message = "This enum class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "RenderModeType", imports = {}))
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"LL6/b;", "", "a", "b", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("partial")
    public static final b f4259a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("full")
    public static final b f4260b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f4261c;

    static {
        b bVar = new b(StubApp.getString2(3417), 0);
        f4259a = bVar;
        b bVar2 = new b(StubApp.getString2(3418), 1);
        f4260b = bVar2;
        f4261c = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4261c.clone();
    }
}

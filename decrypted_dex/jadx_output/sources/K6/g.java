package K6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "StyleDataLoaded", imports = {}))
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LK6/g;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "LL6/d;", "c", "LL6/d;", "getType", "()LL6/d;", "type", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type")
    private final L6.d type;

    public g(long j, Long l9, L6.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.begin = j;
        this.end = l9;
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.begin == gVar.begin && Intrinsics.areEqual(this.end, gVar.end) && this.type == gVar.type;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l9 = this.end;
        return this.type.hashCode() + ((hashCode + (l9 == null ? 0 : l9.hashCode())) * 31);
    }

    public final String toString() {
        return StubApp.getString2(3276) + this.begin + StubApp.getString2(3263) + this.end + StubApp.getString2(2148) + this.type + ')';
    }
}

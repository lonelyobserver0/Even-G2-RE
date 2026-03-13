package K6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import i2.u;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "MapLoadingError", imports = {}))
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LK6/b;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "LL6/a;", "c", "LL6/a;", "getType", "()LL6/a;", "type", "", "d", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "e", "getSourceId", "sourceId", "LL6/e;", "f", "LL6/e;", "getTileId", "()LL6/e;", "tileId", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type")
    private final L6.a type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("source-id")
    private final String sourceId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tile-id")
    private final L6.e tileId;

    public b(long j, Long l9, L6.a type, String message, String str, L6.e eVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.begin = j;
        this.end = l9;
        this.type = type;
        this.message = message;
        this.sourceId = str;
        this.tileId = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.begin == bVar.begin && Intrinsics.areEqual(this.end, bVar.end) && this.type == bVar.type && Intrinsics.areEqual(this.message, bVar.message) && Intrinsics.areEqual(this.sourceId, bVar.sourceId) && Intrinsics.areEqual(this.tileId, bVar.tileId);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l9 = this.end;
        int d8 = u.d((this.type.hashCode() + ((hashCode + (l9 == null ? 0 : l9.hashCode())) * 31)) * 31, 31, this.message);
        String str = this.sourceId;
        int hashCode2 = (d8 + (str == null ? 0 : str.hashCode())) * 31;
        L6.e eVar = this.tileId;
        return hashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(3264) + this.begin + StubApp.getString2(3263) + this.end + StubApp.getString2(2148) + this.type + StubApp.getString2(2061) + this.message + StubApp.getString2(3265) + this.sourceId + StubApp.getString2(3266) + this.tileId + ')';
    }
}

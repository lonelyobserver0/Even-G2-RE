package K6;

import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import i2.u;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "SourceDataLoaded", imports = {}))
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LK6/e;", "", "", "a", "J", "getBegin", "()J", "begin", "b", "Ljava/lang/Long;", "getEnd", "()Ljava/lang/Long;", "end", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "LL6/c;", "d", "LL6/c;", "getType", "()LL6/c;", "type", "", "e", "Ljava/lang/Boolean;", "getLoaded", "()Ljava/lang/Boolean;", "loaded", "LL6/e;", "f", "LL6/e;", "getTileID", "()LL6/e;", "tileID", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("begin")
    private final long begin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("end")
    private final Long end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("id")
    private final String id;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type")
    private final L6.c type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loaded")
    private final Boolean loaded;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tile-id")
    private final L6.e tileID;

    public e(long j, Long l9, String id, L6.c type, Boolean bool, L6.e eVar) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.begin = j;
        this.end = l9;
        this.id = id;
        this.type = type;
        this.loaded = bool;
        this.tileID = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.begin == eVar.begin && Intrinsics.areEqual(this.end, eVar.end) && Intrinsics.areEqual(this.id, eVar.id) && this.type == eVar.type && Intrinsics.areEqual(this.loaded, eVar.loaded) && Intrinsics.areEqual(this.tileID, eVar.tileID);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l9 = this.end;
        int hashCode2 = (this.type.hashCode() + u.d((hashCode + (l9 == null ? 0 : l9.hashCode())) * 31, 31, this.id)) * 31;
        Boolean bool = this.loaded;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        L6.e eVar = this.tileID;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(3272) + this.begin + StubApp.getString2(3263) + this.end + StubApp.getString2(2296) + this.id + StubApp.getString2(2148) + this.type + StubApp.getString2(3273) + this.loaded + StubApp.getString2(3274) + this.tileID + ')';
    }
}
